package cn.enn.ygego.sunny.user.dto.vo;

import java.io.Serializable;

public class EmployeeQueryVO implements Serializable {

	private static final long serialVersionUID = 3191206592055605637L;

	private Long personMemberId;  /* 个人用户ID */
	
	private Long	relaId; /* 关系ID */
	private Long	memberId; /* 企业会员ID */
	private Long	acctId; /* 账户ID */
	private Integer	status; /* 状态 */
	private Integer authState;      /* 个人认证状态 */
	
	private String  acctName; /* 账户名称 */
    private String  acctCode; /* 账户编码 */
    private String  name; /* 姓名 */
    private Integer genderType; /* 性别 */
    private String  mobileNum; /* 手机号 */
    private String  email; /* 电子邮件 */
    
    private Integer pageSize;
    private Integer pageNum;
    private Integer startRow;
    
    
	public Long getPersonMemberId() {
        return personMemberId;
    }
    public void setPersonMemberId(Long personMemberId) {
        this.personMemberId = personMemberId;
    }
    public Integer getAuthState() {
        return authState;
    }
    public void setAuthState(Integer authState) {
        this.authState = authState;
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
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
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
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	public Integer getStartRow() {
		return startRow;
	}
	public void setStartRow(Integer startRow) {
		this.startRow = startRow;
	}
	@Override
	public String toString() {
		return "EmployeeQueryVO [relaId=" + relaId + ", memberId=" + memberId + ", acctId=" + acctId + ", status="
				+ status + ", acctName=" + acctName + ", acctCode=" + acctCode + ", name=" + name + ", genderType="
				+ genderType + ", mobileNum=" + mobileNum + ", email=" + email + ", pageSize=" + pageSize + ", pageNum="
				+ pageNum + ", startRow=" + startRow + "]";
	}
    
}
