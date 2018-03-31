package cn.enn.ygego.sunny.user.dto.register;

import java.io.Serializable;

/**
 * 用户注册请求入参
 * Created by dongbb on 2018/3/22.
 */
public class UserRegisterRequest implements Serializable {

    private String username; //用户名
    private String password; //密码
    private String email; //电子邮件
    private String mobilePhone;//手机号
    private String validCode; //手机校验码
    private Integer smsType; //短信类型

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getValidCode() {
        return validCode;
    }

    public void setValidCode(String validCode) {
        this.validCode = validCode;
    }

    public Integer getSmsType() {
        return smsType;
    }

    public void setSmsType(Integer smsType) {
        this.smsType = smsType;
    }
}
