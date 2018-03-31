package cn.enn.ygego.sunny.user.service;

import cn.enn.ygego.sunny.user.dto.company.CompanyAuthInfo;
import cn.enn.ygego.sunny.user.dto.login.LoginResponse;
import cn.enn.ygego.sunny.user.dto.register.*;
import org.apache.ibatis.annotations.Param;
import org.apache.zookeeper.Login;

import java.util.List;

/**
 * Created by dongbb on 2018/3/22.
 */
public interface UserService {

    /**
     * 用户注册服务
     *
     * @param request
     */
    void registerUser(UserRegisterRequest request);

    /**
     * 用户登录（平台用户）
     *
     * @param username 用户名，手机号或邮箱
     * @param password 登陆密码
     * @return
     */
    LoginResponse login(String username, String password);

    /**
     * 更新密码
     *
     * @param acctId      账号id
     * @param oldPassword 原密码
     * @param newPassword 新密码
     */
    void changePassword(Long acctId, String oldPassword, String newPassword);

    /**
     * 更新邮箱
     *
     * @param acctId   账号id
     * @param newEmail 新邮箱
     */
    void changeEmail(Long acctId, String newEmail);


    /**
     * 绑定新手机（修改手机号）
     *
     * @throws Exception
     */
    boolean changePhone(Long acctId, String newPhone);

    /**
     * 发送短信验证码
     *
     * @param mobilePhone 手机号
     * @param smsType     短信类型
     * @return
     */
    SendSmsResponse sendSms(String mobilePhone, Integer smsType);

    /**
     * 校验用户名是否可以注册
     *
     * @param username 用户名
     * @return true：可以注册  false：不可以注册
     */
    boolean checkUsername(String username);

    /**
     * 校验手机号是否可以注册
     *
     * @param mobilePhone 手机号
     * @return true：可以注册  false：不可以注册
     */
    boolean checkMobilePhone(String mobilePhone);

    /**
     * 校验邮箱是否可以注册
     *
     * @param email 邮箱
     * @return true：可以注册  false：不可以注册
     */
    boolean checkEmail(String email);


    /**
     * 根据acctId查询所对应的企业信息以及企业对应的认证信息
     *
     * @param acctId 账号id
     * @return
     */
    List<CompanyAuthInfo> findCompanyMember(Long acctId);


    /**
     * 校验验证码是否正确
     *
     * @param mobilePhone 手机号
     * @param validCode   校验码
     * @param smsType     短信类型
     * @return
     */
    boolean checkValidCode(String mobilePhone, String validCode, Integer smsType);

    /**
     * 重置密码（找回密码）
     *
     * @param acctId      账号id
     * @param newPassword 新密码
     * @return
     */
    boolean resetPassword(Long acctId, String newPassword);

    /**
     * 设置默认企业
     * @return
     */
    boolean setDefaultCompany(@Param("acctId") Long acctId, @Param("companyMemberId") Long companyMemberId);

    /**
     * 获取第三方登陆跳转uri
     * @param config 配置id
     * @return
     */
    String getThirdLoginUri(@Param("configId") Long config);
}
