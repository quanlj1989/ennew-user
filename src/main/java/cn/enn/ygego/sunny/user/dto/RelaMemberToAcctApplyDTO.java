package cn.enn.ygego.sunny.user.dto;

import java.util.Date;
import java.io.Serializable;

/**
 * DTO:RelaMemberToAcctApply
 * 
 * @author gencode
 * @date 2018-3-24
 */
public class RelaMemberToAcctApplyDTO implements Serializable {
	
	private static final long serialVersionUID = -9121719803930691779L;
	
	private Long	relaId; /* 关系ID */
	private Long	memberId; /* 企业会员ID */
	private Long	acctId; /* 账户ID */
	private Integer	memberType; /* 会员类型 */
	private Integer	status; /* 状态 */
	private String	applySpec; /* 申请说明 */
	private Long	approveAcctId; /* 审核人账户ID */
	private String	approveName; /* 审核人姓名 */
	private Date	auditTime; /* 审核时间 */

	// Constructor
	public RelaMemberToAcctApplyDTO() {
	}

	/**
	 * full Constructor
	 */
	public RelaMemberToAcctApplyDTO(Long relaId, Long memberId, Long acctId, Integer memberType, Integer status, String applySpec, Long approveAcctId, String approveName, Date auditTime) {
		this.relaId = relaId;
		this.memberId = memberId;
		this.acctId = acctId;
		this.memberType = memberType;
		this.status = status;
		this.applySpec = applySpec;
		this.approveAcctId = approveAcctId;
		this.approveName = approveName;
		this.auditTime = auditTime;
	}

	public Long getRelaId() {
		return relaId;
	}

	public void setRelaId(Long relaId) {
		this.relaId = relaId;
	}
	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}
	public Long getAcctId() {
		return acctId;
	}

	public void setAcctId(Long acctId) {
		this.acctId = acctId;
	}
	public Integer getMemberType() {
		return memberType;
	}

	public void setMemberType(Integer memberType) {
		this.memberType = memberType;
	}
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getApplySpec() {
		return applySpec;
	}

	public void setApplySpec(String applySpec) {
		this.applySpec = applySpec;
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
	public Date getAuditTime() {
		return auditTime;
	}

	public void setAuditTime(Date auditTime) {
		this.auditTime = auditTime;
	}

    @Override
    public String toString() {
        return "RelaMemberToAcctApplyDTO [relaId=" + relaId + ", memberId=" + memberId + ", acctId=" + acctId
                + ", memberType=" + memberType + ", status=" + status + ", applySpec=" + applySpec + ", approveAcctId="
                + approveAcctId + ", approveName=" + approveName + ", auditTime=" + auditTime + "]";
    }
	
	

    
}
