package cn.enn.ygego.sunny.user.model;

import java.util.Date;
import java.io.Serializable;

/**
 * entity:OperAuthLoginLog
 * 
 * @author gencode
 */
public class OperAuthLoginLog implements Serializable {
	
	private static final long serialVersionUID = -4549450366196782948L;
	
	private Long	logId;		 /* 日志标识 */ 
	private String	logCode;		 /* 日志编码 */ 
	private Integer	logType;		 /* 日志类型 */ 
	private Long	operPersonId;		 /* 操作人标识 */ 
	private String	operPersonName;		 /* 操作人姓名 */ 
	private Long	appId;		 /* 应用标识 */ 
	private String	appName;		 /* 应用名称 */ 
	private Long	operId;		 /* 操作标识 */ 
	private String	operTitle;		 /* 操作名称 */ 
	private String	ipAddr;		 /* IP地址 */ 
	private Integer	operResult;		 /* 操作结果 */ 
	private String	logContent;		 /* 日志内容 */ 
	private Date	recordTime;		 /* 记录时间 */ 
	private Integer	loginType;		 /* 登录类型 */ 

	// Constructor
	public OperAuthLoginLog() {
	}

	/**
	 * full Constructor
	 */
	public OperAuthLoginLog(Long logId, String logCode, Integer logType, Long operPersonId, String operPersonName, Long appId, String appName, Long operId, String operTitle, String ipAddr, Integer operResult, String logContent, Date recordTime, Integer loginType) {
		this.logId = logId;
		this.logCode = logCode;
		this.logType = logType;
		this.operPersonId = operPersonId;
		this.operPersonName = operPersonName;
		this.appId = appId;
		this.appName = appName;
		this.operId = operId;
		this.operTitle = operTitle;
		this.ipAddr = ipAddr;
		this.operResult = operResult;
		this.logContent = logContent;
		this.recordTime = recordTime;
		this.loginType = loginType;
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

	public Integer getLogType() {
		return logType;
	}

	public void setLogType(Integer logType) {
		this.logType = logType;
	}

	public Long getOperPersonId() {
		return operPersonId;
	}

	public void setOperPersonId(Long operPersonId) {
		this.operPersonId = operPersonId;
	}

	public String getOperPersonName() {
		return operPersonName;
	}

	public void setOperPersonName(String operPersonName) {
		this.operPersonName = operPersonName;
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

	public Long getOperId() {
		return operId;
	}

	public void setOperId(Long operId) {
		this.operId = operId;
	}

	public String getOperTitle() {
		return operTitle;
	}

	public void setOperTitle(String operTitle) {
		this.operTitle = operTitle;
	}

	public String getIpAddr() {
		return ipAddr;
	}

	public void setIpAddr(String ipAddr) {
		this.ipAddr = ipAddr;
	}

	public Integer getOperResult() {
		return operResult;
	}

	public void setOperResult(Integer operResult) {
		this.operResult = operResult;
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

	public Integer getLoginType() {
		return loginType;
	}

	public void setLoginType(Integer loginType) {
		this.loginType = loginType;
	}

	@Override
	public String toString() {
		return "OperAuthLoginLog [" + "logId=" + logId+ ", logCode=" + logCode+ ", logType=" + logType+ ", operPersonId=" + operPersonId+ ", operPersonName=" + operPersonName+ ", appId=" + appId+ ", appName=" + appName+ ", operId=" + operId+ ", operTitle=" + operTitle+ ", ipAddr=" + ipAddr+ ", operResult=" + operResult+ ", logContent=" + logContent+ ", recordTime=" + recordTime+ ", loginType=" + loginType+  "]";
	}
}
