package cn.enn.ygego.sunny.user.dto;

import java.util.Date;
import java.io.Serializable;

/**
 * DTO:BusiAcctInfo
 * 
 * @author gencode
 * @date 2018-3-19
 */
public class BusiAcctInfoDTO implements Serializable {
	
	private static final long serialVersionUID = -1558019768087105812L;
	
	private Long	acctId; /* 账户ID */
	private Long	channelId; /* 渠道ID */
	private String	acctName; /* 账户名称 */
	private String	password; /* 账户密码 */
	private String	acctCode; /* 账户编码 */
	private Integer	acctState; /* 账户状态 */
	private String	logoUrl; /* LOGO_URL */
	private String	name; /* 姓名 */
	private Integer	genderType; /* 性别 */
	private Long	deptId; /* 部门ID */
	private String	mobileNum; /* 手机号 */
	private String	email; /* 电子邮件 */
	private Long	areaId; /* 地区ID */
	private String	areaIdFullPath; /* 地区ID路径 */
	private String	areaNameFullPath; /* 地区名称路径 */
	private String	contactAddr; /* 联系地址 */
	private String	postCode; /* 邮编 */
	private String	insensitiveAcctName; /* 脱敏账户名 */
	private String	insensitivePhone; /* 脱敏手机号 */
	private String	insensitiveEmail; /* 脱敏邮箱 */
	private Date	registerTime; /* 注册时间 */
	private Date	updateTime; /* 更新时间 */
	private Date	lastLoginTime; /* 最后登录时间 */
	private Integer	isDelete; /* 是否删除 */

	// Constructor
	public BusiAcctInfoDTO() {
	}

	/**
	 * full Constructor
	 */
	public BusiAcctInfoDTO(Long acctId, Long channelId, String acctName, String password, String acctCode, Integer acctState, String logoUrl, String name, Integer genderType, Long deptId, String mobileNum, String email, Long areaId, String areaIdFullPath, String areaNameFullPath, String contactAddr, String postCode, String insensitiveAcctName, String insensitivePhone, String insensitiveEmail, Date registerTime, Date updateTime, Date lastLoginTime, Integer isDelete) {
		this.acctId = acctId;
		this.channelId = channelId;
		this.acctName = acctName;
		this.password = password;
		this.acctCode = acctCode;
		this.acctState = acctState;
		this.logoUrl = logoUrl;
		this.name = name;
		this.genderType = genderType;
		this.deptId = deptId;
		this.mobileNum = mobileNum;
		this.email = email;
		this.areaId = areaId;
		this.areaIdFullPath = areaIdFullPath;
		this.areaNameFullPath = areaNameFullPath;
		this.contactAddr = contactAddr;
		this.postCode = postCode;
		this.insensitiveAcctName = insensitiveAcctName;
		this.insensitivePhone = insensitivePhone;
		this.insensitiveEmail = insensitiveEmail;
		this.registerTime = registerTime;
		this.updateTime = updateTime;
		this.lastLoginTime = lastLoginTime;
		this.isDelete = isDelete;
	}

	public Long getAcctId() {
		return acctId;
	}

	public void setAcctId(Long acctId) {
		this.acctId = acctId;
	}
	public Long getChannelId() {
		return channelId;
	}

	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}
	public String getAcctName() {
		return acctName;
	}

	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public String getAcctCode() {
		return acctCode;
	}

	public void setAcctCode(String acctCode) {
		this.acctCode = acctCode;
	}
	public Integer getAcctState() {
		return acctState;
	}

	public void setAcctState(Integer acctState) {
		this.acctState = acctState;
	}
	public String getLogoUrl() {
		return logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
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
	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
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
	public Long getAreaId() {
		return areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}
	public String getAreaIdFullPath() {
		return areaIdFullPath;
	}

	public void setAreaIdFullPath(String areaIdFullPath) {
		this.areaIdFullPath = areaIdFullPath;
	}
	public String getAreaNameFullPath() {
		return areaNameFullPath;
	}

	public void setAreaNameFullPath(String areaNameFullPath) {
		this.areaNameFullPath = areaNameFullPath;
	}
	public String getContactAddr() {
		return contactAddr;
	}

	public void setContactAddr(String contactAddr) {
		this.contactAddr = contactAddr;
	}
	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getInsensitiveAcctName() {
		return insensitiveAcctName;
	}

	public void setInsensitiveAcctName(String insensitiveAcctName) {
		this.insensitiveAcctName = insensitiveAcctName;
	}
	public String getInsensitivePhone() {
		return insensitivePhone;
	}

	public void setInsensitivePhone(String insensitivePhone) {
		this.insensitivePhone = insensitivePhone;
	}
	public String getInsensitiveEmail() {
		return insensitiveEmail;
	}

	public void setInsensitiveEmail(String insensitiveEmail) {
		this.insensitiveEmail = insensitiveEmail;
	}
	public Date getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}
	@Override
	public String toString() {
		return "BusiAcctInfoDTO [" + "acctId=" + acctId + ", channelId=" + channelId + ", acctName=" + acctName + ", password=" + password + ", acctCode=" + acctCode + ", acctState=" + acctState + ", logoUrl=" + logoUrl + ", name=" + name + ", genderType=" + genderType + ", deptId=" + deptId + ", mobileNum=" + mobileNum + ", email=" + email + ", areaId=" + areaId + ", areaIdFullPath=" + areaIdFullPath + ", areaNameFullPath=" + areaNameFullPath + ", contactAddr=" + contactAddr + ", postCode=" + postCode + ", insensitiveAcctName=" + insensitiveAcctName + ", insensitivePhone=" + insensitivePhone + ", insensitiveEmail=" + insensitiveEmail + ", registerTime=" + registerTime + ", updateTime=" + updateTime + ", lastLoginTime=" + lastLoginTime + ", isDelete=" + isDelete +  "]";
	}
}
