package cn.enn.ygego.sunny.user.dto.vo;

import java.util.Date;

import cn.enn.ygego.sunny.user.dto.RelaMemberToAcctApplyDTO;

public class EmpolyeeVO extends RelaMemberToAcctApplyDTO {

    private static final long serialVersionUID = -8833426004818814262L;
    
    private String  acctName; /* 账户名称 */
    private String  acctCode; /* 账户编码 */
    private String  name; /* 姓名 */
    private Integer genderType; /* 性别 */
    private String  mobileNum; /* 手机号 */
    private String  email; /* 电子邮件 */
    private Date    registerTime; /* 注册时间 */
    
    public String getAcctName() {
        return acctName;
    }
    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }
    public String getAcctCode() {
        return acctCode;
    }
    public void setAcctCode(String acctCode) {
        this.acctCode = acctCode;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getGenderType() {
        return genderType;
    }
    public void setGenderType(Integer genderType) {
        this.genderType = genderType;
    }
    public String getMobileNum() {
        return mobileNum;
    }
    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Date getRegisterTime() {
        return registerTime;
    }
    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }
    @Override
    public String toString() {
        
        return super.toString() + "EmpolyeeVO [acctName=" + acctName + ", acctCode=" + acctCode + ", name=" + name + ", genderType="
                + genderType + ", mobileNum=" + mobileNum + ", email=" + email + ", registerTime=" + registerTime + "]";
    }
    
}
