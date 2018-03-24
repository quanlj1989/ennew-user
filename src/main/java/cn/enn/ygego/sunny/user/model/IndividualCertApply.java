package cn.enn.ygego.sunny.user.model;

import java.util.Date;
import java.io.Serializable;

/**
 * entity:IndividualCertApply
 * 
 * @author gencode
 */
public class IndividualCertApply implements Serializable {
	
	private static final long serialVersionUID = 5779545811181796657L;
	
	private Long	certApplyId;		 /* 资质申请ID */ 
	private Long	memberId;		 /* 会员ID */ 
	private Integer	applyType;		 /* 申请类型 */ 
	private String	name;		 /* 姓名 */ 
	private Integer	certType;		 /* 证件类型 */ 
	private String	certCode;		 /* 证件号码 */ 
	private Integer	status;		 /* 状态 */ 
	private Date	applyTime;		 /* 申请时间 */ 
	private Date	createTime;		 /* 创建时间 */ 
	private Long	createMemberId;		 /* 创建人会员ID */ 
	private Long	createAcctId;		 /* 创建人账户ID */ 
	private String	createName;		 /* 创建人姓名 */ 
	private Long	approveAcctId;		 /* 审核人账户ID */ 
	private String	approveName;		 /* 审核人姓名 */ 
	private Long	approveMemberId;		 /* 审核人会员ID */ 
	private Date	auditTime;		 /* 审核时间 */ 
	private String	approveDesc;		 /* 审核结果描述 */ 

	// Constructor
	public IndividualCertApply() {
	}

	/**
	 * full Constructor
	 */
	public IndividualCertApply(Long certApplyId, Long memberId, Integer applyType, String name, Integer certType, String certCode, Integer status, Date applyTime, Date createTime, Long createMemberId, Long createAcctId, String createName, Long approveAcctId, String approveName, Long approveMemberId, Date auditTime, String approveDesc) {
		this.certApplyId = certApplyId;
		this.memberId = memberId;
		this.applyType = applyType;
		this.name = name;
		this.certType = certType;
		this.certCode = certCode;
		this.status = status;
		this.applyTime = applyTime;
		this.createTime = createTime;
		this.createMemberId = createMemberId;
		this.createAcctId = createAcctId;
		this.createName = createName;
		this.approveAcctId = approveAcctId;
		this.approveName = approveName;
		this.approveMemberId = approveMemberId;
		this.auditTime = auditTime;
		this.approveDesc = approveDesc;
	}

	public Long getCertApplyId() {
		return certApplyId;
	}

	public void setCertApplyId(Long certApplyId) {
		this.certApplyId = certApplyId;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public Integer getApplyType() {
		return applyType;
	}

	public void setApplyType(Integer applyType) {
		this.applyType = applyType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCertType() {
		return certType;
	}

	public void setCertType(Integer certType) {
		this.certType = certType;
	}

	public String getCertCode() {
		return certCode;
	}

	public void setCertCode(String certCode) {
		this.certCode = certCode;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getApplyTime() {
		return applyTime;
	}

	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
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

	public Long getApproveAcctId() {
		return approveAcctId;
	}

	public void setApproveAcctId(Long approveAcctId) {
		this.approveAcctId = approveAcctId;
	}

	public String getApproveName() {
		return approveName;
	}

	public void setApproveName(String approveName) {
		this.approveName = approveName;
	}

	public Long getApproveMemberId() {
		return approveMemberId;
	}

	public void setApproveMemberId(Long approveMemberId) {
		this.approveMemberId = approveMemberId;
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

	@Override
	public String toString() {
		return "IndividualCertApply [" + "certApplyId=" + certApplyId+ ", memberId=" + memberId+ ", applyType=" + applyType+ ", name=" + name+ ", certType=" + certType+ ", certCode=" + certCode+ ", status=" + status+ ", applyTime=" + applyTime+ ", createTime=" + createTime+ ", createMemberId=" + createMemberId+ ", createAcctId=" + createAcctId+ ", createName=" + createName+ ", approveAcctId=" + approveAcctId+ ", approveName=" + approveName+ ", approveMemberId=" + approveMemberId+ ", auditTime=" + auditTime+ ", approveDesc=" + approveDesc+  "]";
	}
}
