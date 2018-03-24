package cn.enn.ygego.sunny.user.dto;

import java.util.Date;
import java.io.Serializable;

/**
 * DTO:IndividualServiceApply
 * 
 * @author gencode
 * @date 2018-3-19
 */
public class IndividualServiceApplyDTO implements Serializable {
	
	private static final long serialVersionUID = -5759562190665358390L;
	
	private Long	serviceApplyId; /* 服务申请ID */
	private Long	memberId; /* 会员ID */
	private Integer	serviceType; /* 服务类型 */
	private Integer	status; /* 状态 */
	private Date	createTime; /* 创建时间 */
	private Long	createMemberId; /* 创建人会员ID */
	private Long	createAcctId; /* 创建人账户ID */
	private String	createName; /* 创建人姓名 */
	private Date	auditTime; /* 审核时间 */
	private String	approveDesc; /* 审核结果描述 */
	private Long	approveAcctId; /* 审核人账户ID */
	private Long	approveMemberId; /* 审核人会员ID */
	private String	approveName; /* 审核人姓名 */

	// Constructor
	public IndividualServiceApplyDTO() {
	}

	/**
	 * full Constructor
	 */
	public IndividualServiceApplyDTO(Long serviceApplyId, Long memberId, Integer serviceType, Integer status, Date createTime, Long createMemberId, Long createAcctId, String createName, Date auditTime, String approveDesc, Long approveAcctId, Long approveMemberId, String approveName) {
		this.serviceApplyId = serviceApplyId;
		this.memberId = memberId;
		this.serviceType = serviceType;
		this.status = status;
		this.createTime = createTime;
		this.createMemberId = createMemberId;
		this.createAcctId = createAcctId;
		this.createName = createName;
		this.auditTime = auditTime;
		this.approveDesc = approveDesc;
		this.approveAcctId = approveAcctId;
		this.approveMemberId = approveMemberId;
		this.approveName = approveName;
	}

	public Long getServiceApplyId() {
		return serviceApplyId;
	}

	public void setServiceApplyId(Long serviceApplyId) {
		this.serviceApplyId = serviceApplyId;
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
		return "IndividualServiceApplyDTO [" + "serviceApplyId=" + serviceApplyId + ", memberId=" + memberId + ", serviceType=" + serviceType + ", status=" + status + ", createTime=" + createTime + ", createMemberId=" + createMemberId + ", createAcctId=" + createAcctId + ", createName=" + createName + ", auditTime=" + auditTime + ", approveDesc=" + approveDesc + ", approveAcctId=" + approveAcctId + ", approveMemberId=" + approveMemberId + ", approveName=" + approveName +  "]";
	}
}
