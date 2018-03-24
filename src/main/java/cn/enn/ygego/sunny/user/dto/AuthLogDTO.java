package cn.enn.ygego.sunny.user.dto;

import java.util.Date;
import java.io.Serializable;

/**
 * DTO:AuthLog
 * 
 * @author gencode
 * @date 2018-3-19
 */
public class AuthLogDTO implements Serializable {
	
	private static final long serialVersionUID = 7843789635952393991L;
	
	private Long	logId; /* 日志标识 */
	private String	logCode; /* 日志编码 */
	private Long	appId; /* 应用标识 */
	private String	appName; /* 应用名称 */
	private Long	serviceId; /* 服务标识 */
	private String	serviceCode; /* 服务编码 */
	private String	serviceName; /* 服务名称 */
	private Long	functionId; /* 功能标识 */
	private String	functionTitle; /* 功能名称 */
	private Long	operId; /* 操作标识 */
	private String	operTitle; /* 操作名称 */
	private Integer	authType; /* 鉴权类型 */
	private Integer	authenticationResult; /* 鉴权结果 */
	private String	acctCode; /* 账户编码 */
	private Long	operPersonId; /* 操作人标识 */
	private String	operPersonName; /* 操作人姓名 */
	private String	logContent; /* 日志内容 */
	private Date	createTime; /* 创建时间 */

	// Constructor
	public AuthLogDTO() {
	}

	/**
	 * full Constructor
	 */
	public AuthLogDTO(Long logId, String logCode, Long appId, String appName, Long serviceId, String serviceCode, String serviceName, Long functionId, String functionTitle, Long operId, String operTitle, Integer authType, Integer authenticationResult, String acctCode, Long operPersonId, String operPersonName, String logContent, Date createTime) {
		this.logId = logId;
		this.logCode = logCode;
		this.appId = appId;
		this.appName = appName;
		this.serviceId = serviceId;
		this.serviceCode = serviceCode;
		this.serviceName = serviceName;
		this.functionId = functionId;
		this.functionTitle = functionTitle;
		this.operId = operId;
		this.operTitle = operTitle;
		this.authType = authType;
		this.authenticationResult = authenticationResult;
		this.acctCode = acctCode;
		this.operPersonId = operPersonId;
		this.operPersonName = operPersonName;
		this.logContent = logContent;
		this.createTime = createTime;
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
	public Long getServiceId() {
		return serviceId;
	}

	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}
	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public Long getFunctionId() {
		return functionId;
	}

	public void setFunctionId(Long functionId) {
		this.functionId = functionId;
	}
	public String getFunctionTitle() {
		return functionTitle;
	}

	public void setFunctionTitle(String functionTitle) {
		this.functionTitle = functionTitle;
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
	public Integer getAuthType() {
		return authType;
	}

	public void setAuthType(Integer authType) {
		this.authType = authType;
	}
	public Integer getAuthenticationResult() {
		return authenticationResult;
	}

	public void setAuthenticationResult(Integer authenticationResult) {
		this.authenticationResult = authenticationResult;
	}
	public String getAcctCode() {
		return acctCode;
	}

	public void setAcctCode(String acctCode) {
		this.acctCode = acctCode;
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
	public String getLogContent() {
		return logContent;
	}

	public void setLogContent(String logContent) {
		this.logContent = logContent;
	}
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "AuthLogDTO [" + "logId=" + logId + ", logCode=" + logCode + ", appId=" + appId + ", appName=" + appName + ", serviceId=" + serviceId + ", serviceCode=" + serviceCode + ", serviceName=" + serviceName + ", functionId=" + functionId + ", functionTitle=" + functionTitle + ", operId=" + operId + ", operTitle=" + operTitle + ", authType=" + authType + ", authenticationResult=" + authenticationResult + ", acctCode=" + acctCode + ", operPersonId=" + operPersonId + ", operPersonName=" + operPersonName + ", logContent=" + logContent + ", createTime=" + createTime +  "]";
	}
}
