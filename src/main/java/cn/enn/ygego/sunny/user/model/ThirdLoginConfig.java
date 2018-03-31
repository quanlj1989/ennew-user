package cn.enn.ygego.sunny.user.model;

import java.util.Date;
import java.io.Serializable;

/**
 * entity:ThirdLoginConfig
 * 
 * @author gencode
 */
public class ThirdLoginConfig implements Serializable {
	
	private static final long serialVersionUID = 3628165385853938373L;
	
	private Long	configId;		 /* 配置ID */ 
	private String	companyName;		 /* 公司名称 */ 
	private String	companyShortName;		 /* 公司简称 */ 
	private String	companyIconUri;		 /* 公司图标 */ 
	private String	redirectUri;		 /* 跳转路径 */ 
	private String	appId;		 /* 应用标识 */ 
	private String	appSecretKey;		 /* 应用秘钥 */ 
	private String	loginUri;		 /* 登录路径 */ 
	private String	getTokenUri;		 /* 获取token路径 */ 
	private Integer	status;		 /* 状态 */ 
	private Integer	sortNum;		 /* 排序 */
	private Date	createTime;		 /* 创建时间 */ 
	private Long	createMemberId;		 /* 创建人会员ID */ 
	private Long	createAcctId;		 /* 创建人账户ID */ 
	private String	createName;		 /* 创建人姓名 */ 

	// Constructor
	public ThirdLoginConfig() {
	}

	/**
	 * full Constructor
	 */
	public ThirdLoginConfig(Long configId, String companyName, String companyShortName, String companyIconUri, String redirectUri, String appId, String appSecretKey, String loginUri, String getTokenUri, Integer status, Integer sortNum, Date createTime, Long createMemberId, Long createAcctId, String createName) {
		this.configId = configId;
		this.companyName = companyName;
		this.companyShortName = companyShortName;
		this.companyIconUri = companyIconUri;
		this.redirectUri = redirectUri;
		this.appId = appId;
		this.appSecretKey = appSecretKey;
		this.loginUri = loginUri;
		this.getTokenUri = getTokenUri;
		this.status = status;
		this.sortNum = sortNum;
		this.createTime = createTime;
		this.createMemberId = createMemberId;
		this.createAcctId = createAcctId;
		this.createName = createName;
	}

	public Long getConfigId() {
		return configId;
	}

	public void setConfigId(Long configId) {
		this.configId = configId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyShortName() {
		return companyShortName;
	}

	public void setCompanyShortName(String companyShortName) {
		this.companyShortName = companyShortName;
	}

	public String getCompanyIconUri() {
		return companyIconUri;
	}

	public void setCompanyIconUri(String companyIconUri) {
		this.companyIconUri = companyIconUri;
	}

	public String getRedirectUri() {
		return redirectUri;
	}

	public void setRedirectUri(String redirectUri) {
		this.redirectUri = redirectUri;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getAppSecretKey() {
		return appSecretKey;
	}

	public void setAppSecretKey(String appSecretKey) {
		this.appSecretKey = appSecretKey;
	}

	public String getLoginUri() {
		return loginUri;
	}

	public void setLoginUri(String loginUri) {
		this.loginUri = loginUri;
	}

	public String getGetTokenUri() {
		return getTokenUri;
	}

	public void setGetTokenUri(String getTokenUri) {
		this.getTokenUri = getTokenUri;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getSortNum() {
		return sortNum;
	}

	public void setSortNum(Integer sortNum) {
		this.sortNum = sortNum;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getCreateMemberId() {
		return createMemberId;
	}

	public void setCreateMemberId(Long createMemberId) {
		this.createMemberId = createMemberId;
	}

	public Long getCreateAcctId() {
		return createAcctId;
	}

	public void setCreateAcctId(Long createAcctId) {
		this.createAcctId = createAcctId;
	}

	public String getCreateName() {
		return createName;
	}

	public void setCreateName(String createName) {
		this.createName = createName;
	}

	@Override
	public String toString() {
		return "ThirdLoginConfig [" + "configId=" + configId+ ", companyName=" + companyName+ ", companyShortName=" + companyShortName+ ", companyIconUri=" + companyIconUri+ ", redirectUri=" + redirectUri+ ", appId=" + appId+ ", appSecretKey=" + appSecretKey+ ", loginUri=" + loginUri+ ", getTokenUri=" + getTokenUri+ ", status=" + status+ ", sortNum=" + sortNum+ ", createTime=" + createTime+ ", createMemberId=" + createMemberId+ ", createAcctId=" + createAcctId+ ", createName=" + createName+  "]";
	}
}
