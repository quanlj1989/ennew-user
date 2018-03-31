package cn.enn.ygego.sunny.user.dto;

import java.util.Date;
import java.io.Serializable;

/**
 * DTO:EntAuthTypeApply
 * 
 * @author gencode
 * @date 2018-3-30
 */
public class EntAuthTypeApplyDTO implements Serializable {
	
	private static final long serialVersionUID = 7898043927498156011L;
	
	private Long	authApplyId; /* 认证申请ID */
	private Long	memberId; /* 会员ID */
	private Integer	authenType; /* 认证类型 */
	private Integer	authState; /* 认证状态 */
	private String	approveDesc; /* 审核结果描述 */
	private Long	createAcctId; /* 创建人账户ID */
	private String	createName; /* 创建人姓名 */
	private Date	createTime; /* 创建时间 */

	// Constructor
	public EntAuthTypeApplyDTO() {
	}

	/**
	 * full Constructor
	 */
	public EntAuthTypeApplyDTO(Long authApplyId, Long memberId, Integer authenType, Integer authState, String approveDesc, Long createAcctId, String createName, Date createTime) {
		this.authApplyId = authApplyId;
		this.memberId = memberId;
		this.authenType = authenType;
		this.authState = authState;
		this.approveDesc = approveDesc;
		this.createAcctId = createAcctId;
		this.createName = createName;
		this.createTime = createTime;
	}

	public Long getAuthApplyId() {
		return authApplyId;
	}

	public void setAuthApplyId(Long authApplyId) {
		this.authApplyId = authApplyId;
	}
	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}
	public Integer getAuthenType() {
		return authenType;
	}

	public void setAuthenType(Integer authenType) {
		this.authenType = authenType;
	}
	public Integer getAuthState() {
		return authState;
	}

	public void setAuthState(Integer authState) {
		this.authState = authState;
	}
	public String getApproveDesc() {
		return approveDesc;
	}

	public void setApproveDesc(String approveDesc) {
		this.approveDesc = approveDesc;
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
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "EntAuthTypeApplyDTO [" + "authApplyId=" + authApplyId + ", memberId=" + memberId + ", authenType=" + authenType + ", authState=" + authState + ", approveDesc=" + approveDesc + ", createAcctId=" + createAcctId + ", createName=" + createName + ", createTime=" + createTime +  "]";
	}
}
