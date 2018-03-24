package cn.enn.ygego.sunny.user.model;

import java.util.Date;
import java.io.Serializable;

/**
 * entity:Apps
 * 
 * @author gencode
 */
public class Apps implements Serializable {
	
	private static final long serialVersionUID = 3009586752875562707L;
	
	private Long	appId;		 /* 应用标识 */ 
	private String	appCode;		 /* 应用编码 */ 
	private String	appName;		 /* 应用名称 */ 
	private Integer	appSource;		 /* 应用来源 */ 
	private String	ipAddr;		 /* IP地址 */ 
	private String	appDesc;		 /* 应用描述 */ 
	private Integer	appType;		 /* 应用类型 */ 
	private Integer	appStatus;		 /* 应用状态 */ 
	private Integer	recordStatus;		 /* 记录状态 */ 
	private Date	createTime;		 /* 创建时间 */ 
	private Date	updateTime;		 /* 更新时间 */ 

	// Constructor
	public Apps() {
	}

	/**
	 * full Constructor
	 */
	public Apps(Long appId, String appCode, String appName, Integer appSource, String ipAddr, String appDesc, Integer appType, Integer appStatus, Integer recordStatus, Date createTime, Date updateTime) {
		this.appId = appId;
		this.appCode = appCode;
		this.appName = appName;
		this.appSource = appSource;
		this.ipAddr = ipAddr;
		this.appDesc = appDesc;
		this.appType = appType;
		this.appStatus = appStatus;
		this.recordStatus = recordStatus;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	public Long getAppId() {
		return appId;
	}

	public void setAppId(Long appId) {
		this.appId = appId;
	}

	public String getAppCode() {
		return appCode;
	}

	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public Integer getAppSource() {
		return appSource;
	}

	public void setAppSource(Integer appSource) {
		this.appSource = appSource;
	}

	public String getIpAddr() {
		return ipAddr;
	}

	public void setIpAddr(String ipAddr) {
		this.ipAddr = ipAddr;
	}

	public String getAppDesc() {
		return appDesc;
	}

	public void setAppDesc(String appDesc) {
		this.appDesc = appDesc;
	}

	public Integer getAppType() {
		return appType;
	}

	public void setAppType(Integer appType) {
		this.appType = appType;
	}

	public Integer getAppStatus() {
		return appStatus;
	}

	public void setAppStatus(Integer appStatus) {
		this.appStatus = appStatus;
	}

	public Integer getRecordStatus() {
		return recordStatus;
	}

	public void setRecordStatus(Integer recordStatus) {
		this.recordStatus = recordStatus;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "Apps [" + "appId=" + appId+ ", appCode=" + appCode+ ", appName=" + appName+ ", appSource=" + appSource+ ", ipAddr=" + ipAddr+ ", appDesc=" + appDesc+ ", appType=" + appType+ ", appStatus=" + appStatus+ ", recordStatus=" + recordStatus+ ", createTime=" + createTime+ ", updateTime=" + updateTime+  "]";
	}
}
