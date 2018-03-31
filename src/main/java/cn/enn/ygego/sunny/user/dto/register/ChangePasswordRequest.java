package cn.enn.ygego.sunny.user.dto.register;

import java.io.Serializable;

/**
 *  更改密码请求入参
 * Created by dongbb on 2018/3/23.
 */
public class ChangePasswordRequest implements Serializable {

    private Long acctId; //账户id
    private String oldPassword; //原密码
    private String newPassword; //新密码

    public Long getAcctId() {
        return acctId;
    }

    public void setAcctId(Long acctId) {
        this.acctId = acctId;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
}
