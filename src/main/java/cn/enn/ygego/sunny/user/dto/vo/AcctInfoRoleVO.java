/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */

package cn.enn.ygego.sunny.user.dto.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * DTO:AcctInfo
 * 
 * @author gencode
 * @date 2018-3-19
 */
public class AcctInfoRoleVO implements Serializable {

	private static final long serialVersionUID = -4258859396674180156L;

	private Long	acctId; /* 账户标识 */
	private Long	entId; /* 企业标识 */
	private String	loginSource; /* 登录来源 */
	private String	acctName; /* 账户名称 */
	private String	password; /* 账户密码 */
	private String	acctCode; /* 账户编码 */
	private Integer	acctState; /* 账户状态 */
	private String	name; /* 姓名 */
	private String	dept; /* 部门 */
	private String	mobileNum; /* 手机号 */
	private String	email; /* 电子邮件 */
	private Date	registerTime; /* 注册时间 */
	private Date	updateTime; /* 更新时间 */
	private Date	lastLoginTime; /* 最后登录时间 */
	private Integer	isDelete; /* 是否删除 */
	private String	roleTitle; /* 角色名称  多个角色空格分开*/
	// Constructor
	public AcctInfoRoleVO() {
	}

	/**
	 * full Constructor
	 */
	public AcctInfoRoleVO(Long acctId, Long entId, String loginSource, String acctName, String password, String acctCode, Integer acctState, String name, String dept, String mobileNum, String email, Date registerTime, Date updateTime, Date lastLoginTime, Integer isDelete) {
		this.acctId = acctId;
		this.entId = entId;
		this.loginSource = loginSource;
		this.acctName = acctName;
		this.password = password;
		this.acctCode = acctCode;
		this.acctState = acctState;
		this.name = name;
		this.dept = dept;
		this.mobileNum = mobileNum;
		this.email = email;
		this.registerTime = registerTime;
		this.updateTime = updateTime;
		this.lastLoginTime = lastLoginTime;
		this.isDelete = isDelete;
	}

	public String getRoleTitle() {
		return roleTitle;
	}

	public void setRoleTitle(String roleTitle) {
		this.roleTitle = roleTitle;
	}

	public Long getAcctId() {
		return acctId;
	}

	public void setAcctId(Long acctId) {
		this.acctId = acctId;
	}
	public Long getEntId() {
		return entId;
	}

	public void setEntId(Long entId) {
		this.entId = entId;
	}
	public String getLoginSource() {
		return loginSource;
	}

	public void setLoginSource(String loginSource) {
		this.loginSource = loginSource;
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
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
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
		return "AcctInfoDTO [" + "acctId=" + acctId + ", entId=" + entId + ", loginSource=" + loginSource + ", acctName=" + acctName + ", password=" + password + ", acctCode=" + acctCode + ", acctState=" + acctState + ", name=" + name + ", dept=" + dept + ", mobileNum=" + mobileNum + ", email=" + email + ", registerTime=" + registerTime + ", updateTime=" + updateTime + ", lastLoginTime=" + lastLoginTime + ", isDelete=" + isDelete +  "]";
	}
}
