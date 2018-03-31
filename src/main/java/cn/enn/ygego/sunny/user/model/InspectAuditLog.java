package cn.enn.ygego.sunny.user.model;

import java.util.Date;
import java.io.Serializable;

/**
 * entity:InspectAuditLog
 * 
 * @author gencode
 */
public class InspectAuditLog implements Serializable {
	
	private static final long serialVersionUID = 1025667203195373232L;
	
	private Long	logId;		 /* 日志ID */ 
	private Long	applyId;		 /* 申请标识 */ 
	private Integer	applyStatus;		 /* 申请状态 */ 
	private String	logDesc;		 /* 日志描述 */ 
	private Date	createTime;		 /* 创建时间 */ 

	// Constructor
	public InspectAuditLog() {
	}

	/**
	 * full Constructor
	 */
	public InspectAuditLog(Long logId, Long applyId, Integer applyStatus, String logDesc, Date createTime) {
		this.logId = logId;
		this.applyId = applyId;
		this.applyStatus = applyStatus;
		this.logDesc = logDesc;
		this.createTime = createTime;
	}

	public Long getLogId() {
		return logId;
	}

	public void setLogId(Long logId) {
		this.logId = logId;
	}

	public Long getApplyId() {
		return applyId;
	}

	public void setApplyId(Long applyId) {
		this.applyId = applyId;
	}

	public Integer getApplyStatus() {
		return applyStatus;
	}

	public void setApplyStatus(Integer applyStatus) {
		this.applyStatus = applyStatus;
	}

	public String getLogDesc() {
		return logDesc;
	}

	public void setLogDesc(String logDesc) {
		this.logDesc = logDesc;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "InspectAuditLog [" + "logId=" + logId+ ", applyId=" + applyId+ ", applyStatus=" + applyStatus+ ", logDesc=" + logDesc+ ", createTime=" + createTime+  "]";
	}
}
