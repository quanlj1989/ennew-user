package cn.enn.ygego.sunny.user.model;

import java.util.Date;
import java.io.Serializable;

/**
 * entity:EntProdApply
 * 
 * @author gencode
 */
public class EntProdApply implements Serializable {
	
	private static final long serialVersionUID = -1737807117252238138L;
	
	private Long	applyId;		 /* 申请ID */ 
	private Long	memberId;		 /* 会员ID */ 
	private Integer	status;		 /* 状态 */ 
	private String	approveDesc;		 /* 审核结果描述 */ 
	private Date	createTime;		 /* 创建时间 */ 
	private Long	createAcctId;		 /* 创建人账户ID */ 
	private String	createName;		 /* 创建人姓名 */ 

	// Constructor
	public EntProdApply() {
	}

	/**
	 * full Constructor
	 */
	public EntProdApply(Long applyId, Long memberId, Integer status, String approveDesc, Date createTime, Long createAcctId, String createName) {
		this.applyId = applyId;
		this.memberId = memberId;
		this.status = status;
		this.approveDesc = approveDesc;
		this.createTime = createTime;
		this.createAcctId = createAcctId;
		this.createName = createName;
	}

	public Long getApplyId() {
		return applyId;
	}

	public void setApplyId(Long applyId) {
		this.applyId = applyId;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getApproveDesc() {
		return approveDesc;
	}

	public void setApproveDesc(String approveDesc) {
		this.approveDesc = approveDesc;
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

	@Override
	public String toString() {
		return "EntProdApply [" + "applyId=" + applyId+ ", memberId=" + memberId+ ", status=" + status+ ", approveDesc=" + approveDesc+ ", createTime=" + createTime+ ", createAcctId=" + createAcctId+ ", createName=" + createName+  "]";
	}
}
