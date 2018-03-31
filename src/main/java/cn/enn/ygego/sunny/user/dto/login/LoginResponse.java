package cn.enn.ygego.sunny.user.dto.login;

import cn.enn.ygego.sunny.user.model.MemberInfo;

import java.io.Serializable;
import java.util.List;

/**
 * 登陆成功返回的响应信息
 * Created by dongbb on 2018/3/20.
 */
public class LoginResponse implements Serializable {

    private Long accountId; //账号id
    private Long memberId;	//个人会员ID
    private String accountName; //账号姓名
    private String mobilePhone; //手机号
    private String realName; //真实姓名

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
}
