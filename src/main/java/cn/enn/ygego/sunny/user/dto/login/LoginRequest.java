package cn.enn.ygego.sunny.user.dto.login;

/**
 * 登陆请求
 * Created by dongbb on 2018/3/20.
 */
public class LoginRequest {

    private String username; //用户名
    private String password; //密码
    private Integer loginType; //登录类型

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

    public Integer getLoginType() {
        return loginType;
    }

    public void setLoginType(Integer loginType) {
        this.loginType = loginType;
    }
}
