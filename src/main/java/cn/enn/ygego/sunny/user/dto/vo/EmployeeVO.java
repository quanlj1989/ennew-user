package cn.enn.ygego.sunny.user.dto.vo;

import java.io.Serializable;
import java.util.Date;

public class EmployeeVO implements Serializable {

    private static final long serialVersionUID = -8833426004818814262L;
    
    private Long	memberId;        /* 企业会员ID */
	private String	entName;		 /* 企业名称 */ 
	private String	custCode;		 /* 客户编码 */ 
	private Integer	entType;		 /* 企业类型 */ 
    
    private Long    personMemberId;  /* 个人用户ID */
	private Long	acctId; /* 账户ID */
	private Long	relaId; /* 关系ID */
	private Integer	memberType; /* 会员类型 */
	
	private Integer	status; /* 状态 */
	private String	applySpec; /* 申请说明 */
	private Long	approveAcctId; /* 审核人账户ID */
	private String	approveName; /* 审核人姓名 */
	private Date	auditTime; /* 审核时间 */
    
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
    
    public String getEntName() {
		return entName;
	}
	public void setEntName(String entName) {
		this.entName = entName;
	}
	public String getCustCode() {
		return custCode;
	}
	public void setCustCode(String custCode) {
		this.custCode = custCode;
	}
	public Integer getEntType() {
		return entType;
	}
	public void setEntType(Integer entType) {
		this.entType = entType;
	}
	public Long getRelaId() {
		return relaId;
	}
	public void setRelaId(Long relaId) {
		this.relaId = relaId;
	}
	public Long getMemberId() {
		return memberId;
	}
	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}
	public Long getAcctId() {
		return acctId;
	}
	public void setAcctId(Long acctId) {
		this.acctId = acctId;
	}
	public Integer getMemberType() {
		return memberType;
	}
	public void setMemberType(Integer memberType) {
		this.memberType = memberType;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getApplySpec() {
		return applySpec;
	}
	public void setApplySpec(String applySpec) {
		this.applySpec = applySpec;
	}
	public Long getApproveAcctId() {
		return approveAcctId;
	}
	public void setApproveAcctId(Long approveAcctId) {
		this.approveAcctId = approveAcctId;
	}
	public String getApproveName() {
		return approveName;
	}
	public void setApproveName(String approveName) {
		this.approveName = approveName;
	}
	public Date getAuditTime() {
		return auditTime;
	}
	public void setAuditTime(Date auditTime) {
		this.auditTime = auditTime;
	}
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
