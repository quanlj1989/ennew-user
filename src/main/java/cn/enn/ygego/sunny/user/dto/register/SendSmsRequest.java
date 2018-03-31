package cn.enn.ygego.sunny.user.dto.register;

import java.io.Serializable;

/**
 * 发送短信请求参数
 * Created by dongbb on 2018/3/24.
 */
public class SendSmsRequest implements Serializable {

    private String mobilePhone;//手机号
    private Integer smsType; //短信类型（SmsTypeEnum）

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public Integer getSmsType() {
        return smsType;
    }

    public void setSmsType(Integer smsType) {
        this.smsType = smsType;
    }
}
