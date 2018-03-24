package cn.enn.ygego.sunny.user.model;

import java.util.Date;
import java.io.Serializable;

/**
 * entity:IndividualService
 * 
 * @author gencode
 */
public class IndividualService implements Serializable {
	
	private static final long serialVersionUID = -6902670139164479501L;
	
	private Long	serviceId;		 /* 服务ID */ 
	private Long	memberId;		 /* 会员ID */ 
	private Integer	serviceType;		 /* 服务类型 */ 
	private Integer	status;		 /* 状态 */ 
	private Date	createTime;		 /* 创建时间 */ 
	private Long	createAcctId;		 /* 创建人账户ID */ 
	private String	createName;		 /* 创建人姓名 */ 
	private Date	auditTime;		 /* 审核时间 */ 
	private String	approveDesc;		 /* 审核结果描述 */ 
	private Long	approveAcctId;		 /* 审核人账户ID */ 
	private Long	approveMemberId;		 /* 审核人会员ID */ 
	private String	approveName;		 /* 审核人姓名 */ 

	// Constructor
	public IndividualService() {
	}

	/**
	 * full Constructor
	 */
	public IndividualService(Long serviceId, Long memberId, Integer serviceType, Integer status, Date createTime, Long createAcctId, String createName, Date auditTime, String approveDesc, Long approveAcctId, Long approveMemberId, String approveName) {
		this.serviceId = serviceId;
		this.memberId = memberId;
		this.serviceType = serviceType;
		this.status = status;
		this.createTime = createTime;
		this.createAcctId = createAcctId;
		this.createName = createName;
		this.auditTime = auditTime;
		this.approveDesc = approveDesc;
		this.approveAcctId = approveAcctId;
		this.approveMemberId = approveMemberId;
		this.approveName = approveName;
	}

	public Long getServiceId() {
		return serviceId;
	}

	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public Integer getServiceType() {
		return serviceType;
	}

	public void setServiceType(Integer serviceType) {
		this.serviceType = serviceType;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
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

	public Date getAuditTime() {
		return auditTime;
	}

	public void setAuditTime(Date auditTime) {
		this.auditTime = auditTime;
	}

	public String getApproveDesc() {
		return approveDesc;
	}

	public void setApproveDesc(String approveDesc) {
		this.approveDesc = approveDesc;
	}

	public Long getApproveAcctId() {
		return approveAcctId;
	}

	public void setApproveAcctId(Long approveAcctId) {
		this.approveAcctId = approveAcctId;
	}

	public Long getApproveMemberId() {
		return approveMemberId;
	}

	public void setApproveMemberId(Long approveMemberId) {
		this.approveMemberId = approveMemberId;
	}

	public String getApproveName() {
		return approveName;
	}

	public void setApproveName(String approveName) {
		this.approveName = approveName;
	}

	@Override
	public String toString() {
		return "IndividualService [" + "serviceId=" + serviceId+ ", memberId=" + memberId+ ", serviceType=" + serviceType+ ", status=" + status+ ", createTime=" + createTime+ ", createAcctId=" + createAcctId+ ", createName=" + createName+ ", auditTime=" + auditTime+ ", approveDesc=" + approveDesc+ ", approveAcctId=" + approveAcctId+ ", approveMemberId=" + approveMemberId+ ", approveName=" + approveName+  "]";
	}
}
