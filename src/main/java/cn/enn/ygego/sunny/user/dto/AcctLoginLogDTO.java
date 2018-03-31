package cn.enn.ygego.sunny.user.dto;

import java.util.Date;
import java.io.Serializable;

/**
 * DTO:AcctLoginLog
 * 
 * @author gencode
 * @date 2018-3-28
 */
public class AcctLoginLogDTO implements Serializable {
	
	private static final long serialVersionUID = 3478431020251706898L;
	
	private Long	logId; /* 日志标识 */
	private String	logCode; /* 日志编码 */
	private Date	loginTime; /* 登录时间 */
	private String	ipAddr; /* IP地址 */
	private Integer	loginType; /* 登录类型 */
	private Integer	loginResult; /* 登录结果 */
	private String	loginDetail; /* 登录详情 */
	private Long	operMemberId; /* 操作人会员ID */
	private Long	operAcctId; /* 操作人账户ID */
	private String	operPersonName; /* 操作人姓名 */
	private Long	superMemberId; /* 超级会员ID */
	private Long	superAcctId; /* 超级账户ID */
	private String	superAcctName; /* 超级账户名 */

	// Constructor
	public AcctLoginLogDTO() {
	}

	/**
	 * full Constructor
	 */
	public AcctLoginLogDTO(Long logId, String logCode, Date loginTime, String ipAddr, Integer loginType, Integer loginResult, String loginDetail, Long operMemberId, Long operAcctId, String operPersonName, Long superMemberId, Long superAcctId, String superAcctName) {
		this.logId = logId;
		this.logCode = logCode;
		this.loginTime = loginTime;
		this.ipAddr = ipAddr;
		this.loginType = loginType;
		this.loginResult = loginResult;
		this.loginDetail = loginDetail;
		this.operMemberId = operMemberId;
		this.operAcctId = operAcctId;
		this.operPersonName = operPersonName;
		this.superMemberId = superMemberId;
		this.superAcctId = superAcctId;
		this.superAcctName = superAcctName;
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
	public Date getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}
	public String getIpAddr() {
		return ipAddr;
	}

	public void setIpAddr(String ipAddr) {
		this.ipAddr = ipAddr;
	}
	public Integer getLoginType() {
		return loginType;
	}

	public void setLoginType(Integer loginType) {
		this.loginType = loginType;
	}
	public Integer getLoginResult() {
		return loginResult;
	}

	public void setLoginResult(Integer loginResult) {
		this.loginResult = loginResult;
	}
	public String getLoginDetail() {
		return loginDetail;
	}

	public void setLoginDetail(String loginDetail) {
		this.loginDetail = loginDetail;
	}
	public Long getOperMemberId() {
		return operMemberId;
	}

	public void setOperMemberId(Long operMemberId) {
		this.operMemberId = operMemberId;
	}
	public Long getOperAcctId() {
		return operAcctId;
	}

	public void setOperAcctId(Long operAcctId) {
		this.operAcctId = operAcctId;
	}
	public String getOperPersonName() {
		return operPersonName;
	}

	public void setOperPersonName(String operPersonName) {
		this.operPersonName = operPersonName;
	}
	public Long getSuperMemberId() {
		return superMemberId;
	}

	public void setSuperMemberId(Long superMemberId) {
		this.superMemberId = superMemberId;
	}
	public Long getSuperAcctId() {
		return superAcctId;
	}

	public void setSuperAcctId(Long superAcctId) {
		this.superAcctId = superAcctId;
	}
	public String getSuperAcctName() {
		return superAcctName;
	}

	public void setSuperAcctName(String superAcctName) {
		this.superAcctName = superAcctName;
	}
	@Override
	public String toString() {
		return "AcctLoginLogDTO [" + "logId=" + logId + ", logCode=" + logCode + ", loginTime=" + loginTime + ", ipAddr=" + ipAddr + ", loginType=" + loginType + ", loginResult=" + loginResult + ", loginDetail=" + loginDetail + ", operMemberId=" + operMemberId + ", operAcctId=" + operAcctId + ", operPersonName=" + operPersonName + ", superMemberId=" + superMemberId + ", superAcctId=" + superAcctId + ", superAcctName=" + superAcctName +  "]";
	}
}
