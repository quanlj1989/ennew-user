package cn.enn.ygego.sunny.user.dto;

import java.io.Serializable;

/**
 * DTO:RelaMemberToAcct
 * 
 * @author gencode
 * @date 2018-3-24
 */
public class RelaMemberToAcctDTO implements Serializable {
	
	private static final long serialVersionUID = 1568690372612455830L;
	
	private Long	relaId; /* 关系ID */
	private Long	memberId; /* 会员ID */
	private Long	acctId; /* 账户ID */
	private Integer	memberType; /* 会员类型 */

	// Constructor
	public RelaMemberToAcctDTO() {
	}

	/**
	 * full Constructor
	 */
	public RelaMemberToAcctDTO(Long relaId, Long memberId, Long acctId, Integer memberType) {
		this.relaId = relaId;
		this.memberId = memberId;
		this.acctId = acctId;
		this.memberType = memberType;
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
	@Override
	public String toString() {
		return "RelaMemberToAcctDTO [" + "relaId=" + relaId + ", memberId=" + memberId + ", acctId=" + acctId + ", memberType=" + memberType +  "]";
	}
}
