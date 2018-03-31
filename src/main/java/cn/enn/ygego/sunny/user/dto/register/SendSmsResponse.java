package cn.enn.ygego.sunny.user.dto.register;

/**
 * 发送短信请求参数
 * Created by dongbb on 2018/3/24.
 */
public class SendSmsResponse {

    private String mobilePhone;//手机号
    private Integer smsType; //短信类型（SmsTypeEnum）
    private String validCode; //验证码

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

    public String getValidCode() {
        return validCode;
    }

    public void setValidCode(String validCode) {
        this.validCode = validCode;
    }
}
