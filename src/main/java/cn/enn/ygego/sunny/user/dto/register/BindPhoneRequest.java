package cn.enn.ygego.sunny.user.dto.register;

import java.io.Serializable;

/**
 * 绑定新手机号入参
 * Created by dongbb on 2018/3/27.
 */
public class BindPhoneRequest implements Serializable {

    private Long acctId; //账号id
    private String oldPhone; //旧手机号
    private String oldVaildCode; //旧手机号验证码
    private String newPhone; //新手机号
    private String newValidCode;//新手机号验证码
    private Integer smsType; //短信类型（SmsTypeEnum）

    public Long getAcctId() {
        return acctId;
    }

    public void setAcctId(Long acctId) {
        this.acctId = acctId;
    }

    public String getOldPhone() {
        return oldPhone;
    }

    public void setOldPhone(String oldPhone) {
        this.oldPhone = oldPhone;
    }

    public String getOldVaildCode() {
        return oldVaildCode;
    }

    public void setOldVaildCode(String oldVaildCode) {
        this.oldVaildCode = oldVaildCode;
    }

    public String getNewPhone() {
        return newPhone;
    }

    public void setNewPhone(String newPhone) {
        this.newPhone = newPhone;
    }

    public String getNewValidCode() {
        return newValidCode;
    }

    public void setNewValidCode(String newValidCode) {
        this.newValidCode = newValidCode;
    }

    public Integer getSmsType() {
        return smsType;
    }

    public void setSmsType(Integer smsType) {
        this.smsType = smsType;
    }
}
