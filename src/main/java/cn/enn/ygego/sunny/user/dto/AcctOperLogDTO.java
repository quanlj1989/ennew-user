package cn.enn.ygego.sunny.user.dto;

import java.util.Date;
import java.io.Serializable;

/**
 * DTO:AcctOperLog
 * 
 * @author gencode
 * @date 2018-3-28
 */
public class AcctOperLogDTO implements Serializable {
	
	private static final long serialVersionUID = 599368560224412701L;
	
	private Long	logId; /* 日志标识 */
	private String	logCode; /* 日志编码 */
	private String	ipAddr; /* IP地址 */
	private Integer	operType; /* 操作类型 */
	private Integer	operResult; /* 操作结果 */
	private String	operDetail; /* 操作详情 */
	private Date	operTime; /* 操作时间 */
	private Long	operMemberId; /* 操作人会员ID */
	private Long	operAcctId; /* 操作人账户ID */
	private String	operPersonName; /* 操作人姓名 */
	private Long	superMemberId; /* 超级会员ID */
	private Long	superAcctId; /* 超级账户ID */
	private String	superAcctName; /* 超级账户名 */

	// Constructor
	public AcctOperLogDTO() {
	}

	/**
	 * full Constructor
	 */
	public AcctOperLogDTO(Long logId, String logCode, String ipAddr, Integer operType, Integer operResult, String operDetail, Date operTime, Long operMemberId, Long operAcctId, String operPersonName, Long superMemberId, Long superAcctId, String superAcctName) {
		this.logId = logId;
		this.logCode = logCode;
		this.ipAddr = ipAddr;
		this.operType = operType;
		this.operResult = operResult;
		this.operDetail = operDetail;
		this.operTime = operTime;
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
	public String getIpAddr() {
		return ipAddr;
	}

	public void setIpAddr(String ipAddr) {
		this.ipAddr = ipAddr;
	}
	public Integer getOperType() {
		return operType;
	}

	public void setOperType(Integer operType) {
		this.operType = operType;
	}
	public Integer getOperResult() {
		return operResult;
	}

	public void setOperResult(Integer operResult) {
		this.operResult = operResult;
	}
	public String getOperDetail() {
		return operDetail;
	}

	public void setOperDetail(String operDetail) {
		this.operDetail = operDetail;
	}
	public Date getOperTime() {
		return operTime;
	}

	public void setOperTime(Date operTime) {
		this.operTime = operTime;
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
		return "AcctOperLogDTO [" + "logId=" + logId + ", logCode=" + logCode + ", ipAddr=" + ipAddr + ", operType=" + operType + ", operResult=" + operResult + ", operDetail=" + operDetail + ", operTime=" + operTime + ", operMemberId=" + operMemberId + ", operAcctId=" + operAcctId + ", operPersonName=" + operPersonName + ", superMemberId=" + superMemberId + ", superAcctId=" + superAcctId + ", superAcctName=" + superAcctName +  "]";
	}
}
