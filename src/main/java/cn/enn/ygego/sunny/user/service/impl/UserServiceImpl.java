package cn.enn.ygego.sunny.user.service.impl;

import cn.enn.ygego.sunny.core.exception.BusinessException;
import cn.enn.ygego.sunny.user.common.DeleteStatusEnum;
import cn.enn.ygego.sunny.user.common.MemberTypeEnum;
import cn.enn.ygego.sunny.user.common.UserStatusEnum;
import cn.enn.ygego.sunny.user.dao.BusiAcctInfoDao;
import cn.enn.ygego.sunny.user.dao.BusiUserInfoDao;
import cn.enn.ygego.sunny.user.dao.MemberInfoDao;
import cn.enn.ygego.sunny.user.dao.RelaMemberToAcctDao;
import cn.enn.ygego.sunny.user.dto.login.LoginRequest;
import cn.enn.ygego.sunny.user.dto.login.LoginResponse;
import cn.enn.ygego.sunny.user.dto.register.SendSmsRequest;
import cn.enn.ygego.sunny.user.dto.register.UpdateEmailRequest;
import cn.enn.ygego.sunny.user.dto.register.UpdatePasswordRequest;
import cn.enn.ygego.sunny.user.dto.register.UserRegisterRequest;
import cn.enn.ygego.sunny.user.model.BusiAcctInfo;
import cn.enn.ygego.sunny.user.model.MemberInfo;
import cn.enn.ygego.sunny.user.model.RelaMemberToAcct;
import cn.enn.ygego.sunny.user.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Random;

/**
 * Created by dongbb on 2018/3/22.
 */
@Service("registerService")
public class UserServiceImpl implements UserService {

    @Autowired
    private BusiAcctInfoDao busiAcctInfoDao;

    @Autowired
    private BusiUserInfoDao busiUserInfoDao;

    @Autowired
    private MemberInfoDao memberInfoDao;

    @Autowired
    private RelaMemberToAcctDao relaMemberToAcctDao;

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
        //@未确定 密码是否需要加密
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
        relaMemberToAcctDao.insert(relaMemberToAcct);

        //（@未确定）调用权限接口，把数据推送过去
    }

    /**
     * 用户登录（平台账号登录非第三方）
     *
     * @param request
     */
    @Override
    public LoginResponse login(LoginRequest request) {

        BusiAcctInfo busiAcctInfo = busiAcctInfoDao.loginAcctInfo(request.getUsername(), request.getPassword());
        if (busiAcctInfo == null) {
            throw new BusinessException("用户名或密码不正确！");
        }
        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setAccountId(busiAcctInfo.getAcctId());
        loginResponse.setAccountName(busiAcctInfo.getAcctName());
        loginResponse.setMobileNum(busiAcctInfo.getMobileNum());

        //查询该账户所对应的会员信息
        MemberInfo memberInfo = memberInfoDao.findPersonMember(busiAcctInfo.getAcctId());
        loginResponse.setMemberId(memberInfo.getMemberId());
        return loginResponse;
    }

    /**
     * 更新密码
     *
     * @param request
     * @throws Exception
     */
    @Override
    public void updatePassword(UpdatePasswordRequest request) {
        //判断原始密码是否正确
        BusiAcctInfo busiAcct = busiAcctInfoDao.getByPrimaryKey(request.getAcctId());
        if (busiAcct == null || !busiAcct.getPassword().equals(request.getOldPassword())) {
            throw new BusinessException("原密码输入不正确！");
        }
        //更新密码
        int result = busiAcctInfoDao.updatePassword(request.getAcctId(), request.getNewPassword());
        if (result != 1) {
            throw new BusinessException("更新密码失败！");
        }
    }

    /**
     * 更新邮箱
     * @param request
     */
    @Override
    public void updateEmail(UpdateEmailRequest request) {
        int result = busiAcctInfoDao.updateEmail(request.getAcctId(), request.getEmail());
        if (result != 1) {
            throw new BusinessException("更新邮箱失败！");
        }
    }

    /**
     * 发送短信
     * @param request
     */
    @Override
    public void sendSms(SendSmsRequest request) {
        //生成随机4位数字
        int random = new Random().nextInt(10000);
        //(@未确定)获取该手机号的发送短息次数，是否超过设置次数
        //(@未确定)调用发送短信外部服务，
    }

    /**
     * 校验用户名是否可以注册
     * @param username 用户名
     * @return  true：可以注册  false：不可以注册
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
     * @param mobilePhone 手机号
     * @return  true：可以注册  false：不可以注册
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
     * @param email 邮箱
     * @return  true：可以注册  false：不可以注册
     */
    @Override
    public boolean checkEmail(String email) {
        if (busiAcctInfoDao.findByEmail(email) == 0) {
            return true;
        }
        return false;
    }

}
