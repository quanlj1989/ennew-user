package cn.enn.ygego.sunny.user.service.impl;

import cn.enn.ygego.sunny.core.exception.BusinessException;
import cn.enn.ygego.sunny.user.common.DeleteStatusEnum;
import cn.enn.ygego.sunny.user.common.MemberTypeEnum;
import cn.enn.ygego.sunny.user.common.UserStatusEnum;
import cn.enn.ygego.sunny.user.dao.BusiAcctInfoDao;
import cn.enn.ygego.sunny.user.dao.MemberInfoDao;
import cn.enn.ygego.sunny.user.dao.RelaMemberToAcctDao;
import cn.enn.ygego.sunny.user.dto.company.CompanyAuthInfo;
import cn.enn.ygego.sunny.user.dto.login.LoginResponse;
import cn.enn.ygego.sunny.user.dto.register.*;
import cn.enn.ygego.sunny.user.model.BusiAcctInfo;
import cn.enn.ygego.sunny.user.model.MemberInfo;
import cn.enn.ygego.sunny.user.model.RelaMemberToAcct;
import cn.enn.ygego.sunny.user.model.ThirdLoginConfig;
import cn.enn.ygego.sunny.user.service.*;
import cn.enn.ygego.sunny.user.util.HttpClientUtil;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by dongbb on 2018/3/22.
 */
@Service("registerService")
public class UserServiceImpl implements UserService {

    @Autowired
    private BusiAcctInfoDao busiAcctInfoDao;

    @Autowired
    private MemberInfoDao memberInfoDao;

    @Autowired
    private RelaMemberToAcctDao relaMemberToAcctDao;

    @Autowired
    private ThirdLoginConfigService thirdLoginConfigService;

    /**
     * 注册用户
     */
    @Override
    public void registerUser(UserRegisterRequest request) {

        if (busiAcctInfoDao.findByAcctName(request.getUsername()) > 0) {
            throw new BusinessException("该用户名已注册！");
        }
        if (busiAcctInfoDao.findByPhone(request.getMobilePhone()) > 0) {
            throw new BusinessException("该手机号已注册！");
        }
        if (busiAcctInfoDao.findByEmail(request.getEmail()) > 0) {
            throw new BusinessException("该邮箱已注册！");
        }
        //保存业务账户信息表
        BusiAcctInfo busiAcctInfo = new BusiAcctInfo();
        busiAcctInfo.setAcctName(request.getUsername());
        //@未开发 密码是否需要加密
        busiAcctInfo.setPassword(request.getPassword());
        busiAcctInfo.setEmail(request.getEmail());
        busiAcctInfo.setMobileNum(request.getMobilePhone());
        busiAcctInfo.setRegisterTime(new Date());
        busiAcctInfo.setUpdateTime(new Date());
        busiAcctInfo.setIsDelete(Integer.parseInt(DeleteStatusEnum.NO_DELETE.getStatusCode()));
        busiAcctInfoDao.insert(busiAcctInfo);

        //保存会员信息表
        MemberInfo memberInfo = new MemberInfo();
        memberInfo.setStatus(Integer.parseInt(UserStatusEnum.ENABLED.getStatusCode()));
        memberInfo.setMemberType(Integer.parseInt(MemberTypeEnum.PERSON.getStatusCode()));
        memberInfo.setYgegoCoin(0);//设置阳光币（初始为0）
        memberInfoDao.insert(memberInfo);

        //保存会员与账号关系表
        RelaMemberToAcct relaMemberToAcct = new RelaMemberToAcct();
        relaMemberToAcct.setAcctId(busiAcctInfo.getAcctId());
        relaMemberToAcct.setMemberId(memberInfo.getMemberId());
        relaMemberToAcct.setMemberType(Integer.parseInt(MemberTypeEnum.PERSON.getStatusCode()));
        relaMemberToAcctDao.insert(relaMemberToAcct);

        //（@未开发）调用权限接口，把数据推送过去
    }

    /**
     * 用户登录（平台用户）
     *
     * @param username 用户名，手机号或邮箱
     * @param password 登陆密码
     * @return
     */
    @Override
    public LoginResponse login(String username, String password) {

        BusiAcctInfo busiAcctInfo = busiAcctInfoDao.loginAcctInfo(username, password);
        if (busiAcctInfo == null) {
            throw new BusinessException("用户名或密码不正确！");
        }
        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setAccountId(busiAcctInfo.getAcctId());
        loginResponse.setAccountName(busiAcctInfo.getAcctName());
        loginResponse.setMobilePhone(busiAcctInfo.getMobileNum());

        //查询该账户所对应的会员信息
        MemberInfo memberInfo = memberInfoDao.findPersonMember(busiAcctInfo.getAcctId());
        loginResponse.setMemberId(memberInfo.getMemberId());
        return loginResponse;
    }

    /**
     * 更新密码
     *
     * @param acctId      账号id
     * @param oldPassword 原密码
     * @param newPassword 新密码
     */
    @Override
    public void changePassword(Long acctId, String oldPassword, String newPassword) {
        //判断原始密码是否正确
        BusiAcctInfo busiAcct = busiAcctInfoDao.getByPrimaryKey(acctId);
        if (busiAcct == null || !busiAcct.getPassword().equals(oldPassword)) {
            throw new BusinessException("原密码输入不正确！");
        }
        //更新密码
        int result = busiAcctInfoDao.updatePassword(acctId, newPassword);
        if (result != 1) {
            throw new BusinessException("更新密码失败！");
        }
    }

    /**
     * 更新邮箱
     *
     * @param acctId   账号id
     * @param newEmail 新邮箱
     */
    @Override
    public void changeEmail(Long acctId, String newEmail) {
        int result = busiAcctInfoDao.updateEmail(acctId, newEmail);
        if (result != 1) {
            throw new BusinessException("更新邮箱失败！");
        }
    }

    /**
     * 绑定新手机号（修改手机）
     *
     * @param acctId   账号id
     * @param newPhone 新手机号
     * @return
     */
    @Override
    public boolean changePhone(Long acctId, String newPhone) {
        int result = busiAcctInfoDao.updatePhone(acctId, newPhone);
        if (result == 1) {
            return true;
        }
        return false;
    }

    /**
     * 发送短信验证码
     *
     * @param mobilePhone 手机号
     * @param smsType     短信类型
     * @return
     */
    @Override
    public SendSmsResponse sendSms(String mobilePhone, Integer smsType) {
        SendSmsResponse sendSmsResponse = new SendSmsResponse();
        //(@未开发)获取该手机号当天发送短息次数，是否超过设置次数（redis）
        //生成随机4位数字
        String validCode = String.format("%04d", new Random().nextInt(10000));
        //(@未开发)根据短信类型获取短信模板
        //(@未开发)调用发送短信外部服务
        //(@未开发)保存手机号以及发送类型对应的验证码（redis）

        sendSmsResponse.setValidCode(validCode);
        sendSmsResponse.setMobilePhone(mobilePhone);
        sendSmsResponse.setSmsType(smsType);
        return sendSmsResponse;
    }

    /**
     * 校验用户名是否可以注册
     *
     * @param username 用户名
     * @return true：可以注册  false：不可以注册
     */
    @Override
    public boolean checkUsername(String username) {
        if (busiAcctInfoDao.findByAcctName(username) == 0) {
            return true;
        }
        return false;
    }

    /**
     * 校验手机号是否可以注册
     *
     * @param mobilePhone 手机号
     * @return true：可以注册  false：不可以注册
     */
    @Override
    public boolean checkMobilePhone(String mobilePhone) {
        if (busiAcctInfoDao.findByPhone(mobilePhone) == 0) {
            return true;
        }
        return false;
    }

    /**
     * 校验邮箱是否可以注册
     *
     * @param email 邮箱
     * @return true：可以注册  false：不可以注册
     */
    @Override
    public boolean checkEmail(String email) {
        if (busiAcctInfoDao.findByEmail(email) == 0) {
            return true;
        }
        return false;
    }

    /**
     * 根据acctId查询所对应的企业信息以及企业对应的认证信息
     *
     * @param acctId 账号id
     * @return
     */
    @Override
    public List<CompanyAuthInfo> findCompanyMember(Long acctId) {
        return memberInfoDao.findCompanyMember(acctId);
    }

    /**
     * 校验验证码是否正确
     *
     * @param mobilePhone 手机号
     * @param validCode   校验码
     * @param smsType     短信类型
     * @return
     */
    @Override
    public boolean checkValidCode(String mobilePhone, String validCode, Integer smsType) {
        //(@未开发)根据手机号以及验证类型获取对应的验证码
        String checkCode = validCode;
        if (checkCode.equals(validCode)) {
            return true;
        }
        return false;
    }

    /**
     * 重置密码（找回密码）
     *
     * @return
     */
    @Override
    public boolean resetPassword(Long acctId, String newPassword) {
        //更新密码
        int result = busiAcctInfoDao.updatePassword(acctId, newPassword);
        if (result == 1) {
            return true;
        }
        return false;
    }

    /**
     * 设置默认企业
     *
     * @return
     */
    @Override
    public boolean setDefaultCompany(Long acctId, Long companyMemberId) {
        //清空之前设置的默认企业
        relaMemberToAcctDao.cleanDefaultCompany(acctId);
        //设置默认企业
        int result = relaMemberToAcctDao.setDefaultCompany(acctId, companyMemberId);
        if (result == 1) {
            return true;
        }
        return false;
    }

    /**
     * 获取第三方登陆跳转uri
     *
     * @param configId 配置id
     * @return
     */
    @Override
    public String getThirdLoginUri(Long configId) {
        //获取第三方登陆配置信息
        ThirdLoginConfig thirdLoginConfig = thirdLoginConfigService.getThirdLoginConfigByPrimaryKey(configId);
        if (thirdLoginConfig == null) {
            throw new BusinessException("获取第三方登陆信息失败！");
        }

        //设置参数
        Map<String, String> param = new HashMap<>();
        param.put("appid", thirdLoginConfig.getAppId());
        param.put("appsecret", thirdLoginConfig.getAppSecretKey());

        //获取 access_token
        String resultJson = HttpClientUtil.doPost(thirdLoginConfig.getGetTokenUri(), param);
        JSONObject jsonObject = JSONObject.parseObject(resultJson);
        String accessToken = jsonObject.getString("access_token");

        //拼接请求第三方登陆url
        StringBuffer thirdLoginUri = new StringBuffer();
        thirdLoginUri.append(thirdLoginConfig.getLoginUri()).append("?access_token=").append(accessToken)
                .append("&redirect_uri=").append(thirdLoginConfig.getRedirectUri());
        return thirdLoginUri.toString();
    }
}
