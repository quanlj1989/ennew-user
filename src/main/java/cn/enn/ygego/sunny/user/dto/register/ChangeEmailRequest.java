package cn.enn.ygego.sunny.user.dto.register;

import java.io.Serializable;

/**
 * 更新邮件请求入参
 * Created by dongbb on 2018/3/24.
 */
public class ChangeEmailRequest implements Serializable {

    private Long acctId; //账号id
    private String email; //邮箱

    public Long getAcctId() {
        return acctId;
    }

    public void setAcctId(Long acctId) {
        this.acctId = acctId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
