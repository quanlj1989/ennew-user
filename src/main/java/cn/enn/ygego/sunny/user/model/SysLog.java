package cn.enn.ygego.sunny.user.model;

import java.util.Date;
import java.io.Serializable;

/**
 * entity:SysLog
 * 
 * @author gencode
 */
public class SysLog implements Serializable {
	
	private static final long serialVersionUID = 8044630080457346826L;
	
	private Long	logId;		 /* 日志标识 */ 
	private String	logCode;		 /* 日志编码 */ 
	private Integer	recordType;		 /* 记录类型 */ 
	private Long	appId;		 /* 应用标识 */ 
	private String	appName;		 /* 应用名称 */ 
	private String	affiModule;		 /* 所属模块 */ 
	private String	logContent;		 /* 日志内容 */ 
	private Date	recordTime;		 /* 记录时间 */ 

	// Constructor
	public SysLog() {
	}

	/**
	 * full Constructor
	 */
	public SysLog(Long logId, String logCode, Integer recordType, Long appId, String appName, String affiModule, String logContent, Date recordTime) {
		this.logId = logId;
		this.logCode = logCode;
		this.recordType = recordType;
		this.appId = appId;
		this.appName = appName;
		this.affiModule = affiModule;
		this.logContent = logContent;
		this.recordTime = recordTime;
	}

	public Long getLogId() {
		return logId;
	}

	public void setLogId(Long logId) {
		this.logId = logId;
	}

	public String getLogCode() {
		return logCode;
	}

	public void setLogCode(String logCode) {
		this.logCode = logCode;
	}

	public Integer getRecordType() {
		return recordType;
	}

	public void setRecordType(Integer recordType) {
		this.recordType = recordType;
	}

	public Long getAppId() {
		return appId;
	}

	public void setAppId(Long appId) {
		this.appId = appId;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAffiModule() {
		return affiModule;
	}

	public void setAffiModule(String affiModule) {
		this.affiModule = affiModule;
	}

	public String getLogContent() {
		return logContent;
	}

	public void setLogContent(String logContent) {
		this.logContent = logContent;
	}

	public Date getRecordTime() {
		return recordTime;
	}

	public void setRecordTime(Date recordTime) {
		this.recordTime = recordTime;
	}

	@Override
	public String toString() {
		return "SysLog [" + "logId=" + logId+ ", logCode=" + logCode+ ", recordType=" + recordType+ ", appId=" + appId+ ", appName=" + appName+ ", affiModule=" + affiModule+ ", logContent=" + logContent+ ", recordTime=" + recordTime+  "]";
	}
}
