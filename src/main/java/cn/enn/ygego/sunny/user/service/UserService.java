package cn.enn.ygego.sunny.user.service;

import cn.enn.ygego.sunny.user.dto.login.LoginRequest;
import cn.enn.ygego.sunny.user.dto.login.LoginResponse;
import cn.enn.ygego.sunny.user.dto.register.SendSmsRequest;
import cn.enn.ygego.sunny.user.dto.register.UpdateEmailRequest;
import cn.enn.ygego.sunny.user.dto.register.UpdatePasswordRequest;
import cn.enn.ygego.sunny.user.dto.register.UserRegisterRequest;

/**
 * Created by dongbb on 2018/3/22.
 */
public interface UserService {

    /**
     * 用户注册服务
     * @param request
     */
    void registerUser(UserRegisterRequest request);

    /**
     * 用户登录（平台用户）
     */
    LoginResponse login(LoginRequest request);

    /**
     * 更新密码
     * @param request
     * @throws Exception
     */
    void updatePassword(UpdatePasswordRequest request);

    /**
     * 更新邮箱
     * @param request
     * @throws Exception
     */
    void updateEmail(UpdateEmailRequest request);

    /**
     * 发送短信验证码
     * @param request
     */
    void sendSms(SendSmsRequest request);

    /**
     * 校验用户名是否可以注册
     * @param username 用户名
     * @return  true：可以注册  false：不可以注册
     */
    boolean checkUsername(String username);

    /**
     * 校验手机号是否可以注册
     * @param mobilePhone 手机号
     * @return  true：可以注册  false：不可以注册
     */
    boolean checkMobilePhone(String mobilePhone);

    /**
     * 校验邮箱是否可以注册
     * @param email 邮箱
     * @return  true：可以注册  false：不可以注册
     */
    boolean checkEmail(String email);

}
