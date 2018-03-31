package cn.enn.ygego.sunny.user.dto.vo;

import java.util.Date;

import cn.enn.ygego.sunny.user.dto.RelaMemberToAcctApplyDTO;

public class EmployeeVO extends RelaMemberToAcctApplyDTO {

    private static final long serialVersionUID = -8833426004818814262L;
    
    private Integer authState;      /* 个人认证状态 */
    private String  acctName; /* 账户名称 */
    private String  acctCode; /* 账户编码 */
    private String  name; /* 姓名 */
    private Integer genderType; /* 性别 */
    private String  mobileNum; /* 手机号 */
    private String  email; /* 电子邮件 */
    private Date    registerTime; /* 注册时间 */
    
    private String  certName; /* 证件姓名 */
    private Integer certType; /* 证件类型 */
    private String  certCode; /* 证件号码 */
    
    private Long personMemberId;  /* 个人用户ID */
    
    public Long getPersonMemberId() {
        return personMemberId;
    }
    public void setPersonMemberId(Long personMemberId) {
        this.personMemberId = personMemberId;
    }
    public String getCertName() {
        return certName;
    }
    public void setCertName(String certName) {
        this.certName = certName;
    }
    public Integer getCertType() {
        return certType;
    }
    public void setCertType(Integer certType) {
        this.certType = certType;
    }
    public String getCertCode() {
        return certCode;
    }
    public void setCertCode(String certCode) {
        this.certCode = certCode;
    }
    public Integer getAuthState() {
        return authState;
    }
    public void setAuthState(Integer authState) {
        this.authState = authState;
    }
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
        return "EmployeeVO [authState=" + authState + ", acctName=" + acctName + ", acctCode=" + acctCode + ", name="
                + name + ", genderType=" + genderType + ", mobileNum=" + mobileNum + ", email=" + email
                + ", registerTime=" + registerTime + ", certName=" + certName + ", certType=" + certType + ", certCode="
                + certCode + "]";
    }
   
}
