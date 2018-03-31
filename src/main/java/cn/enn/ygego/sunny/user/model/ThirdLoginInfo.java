package cn.enn.ygego.sunny.user.model;

import java.util.Date;
import java.io.Serializable;

/**
 * entity:ThirdLoginInfo
 * 
 * @author gencode
 */
public class ThirdLoginInfo implements Serializable {
	
	private static final long serialVersionUID = -7947768371646723628L;
	
	private String	loginId;		 /* 登录ID */ 
	private Long	acctId;		 /* 账户ID */ 
	private Long	configId;		 /* 配置ID */ 
	private String	name;		 /* 姓名 */ 
	private String	mobileNum;		 /* 手机号 */ 
	private String	email;		 /* 电子邮件 */ 
	private Date	createTime;		 /* 创建时间 */ 

	// Constructor
	public ThirdLoginInfo() {
	}

	/**
	 * full Constructor
	 */
	public ThirdLoginInfo(String loginId, Long acctId, Long configId, String name, String mobileNum, String email, Date createTime) {
		this.loginId = loginId;
		this.acctId = acctId;
		this.configId = configId;
		this.name = name;
		this.mobileNum = mobileNum;
		this.email = email;
		this.createTime = createTime;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public Long getAcctId() {
		return acctId;
	}

	public void setAcctId(Long acctId) {
		this.acctId = acctId;
	}

	public Long getConfigId() {
		return configId;
	}

	public void setConfigId(Long configId) {
		this.configId = configId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "ThirdLoginInfo [" + "loginId=" + loginId+ ", acctId=" + acctId+ ", configId=" + configId+ ", name=" + name+ ", mobileNum=" + mobileNum+ ", email=" + email+ ", createTime=" + createTime+  "]";
	}
}
