package cn.enn.ygego.sunny.user.model;

import java.io.Serializable;

/**
 * entity:RelaMemberToAcct
 * 
 * @author gencode
 */
public class RelaMemberToAcct implements Serializable {
	
	private static final long serialVersionUID = 2386388434873042337L;
	
	private Long	relaId;		 /* 关系ID */ 
	private Long	memberId;		 /* 会员ID */ 
	private Long	acctId;		 /* 账户ID */ 
	private Integer	memberType;		 /* 会员类型 */
	private Integer isDefaultEnt;  /* 是否默认企业 0：否 1：是 */

	// Constructor
	public RelaMemberToAcct() {
	}

	/**
	 * full Constructor
	 */
	public RelaMemberToAcct(Long relaId, Long memberId, Long acctId, Integer memberType) {
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

	public Integer getIsDefaultEnt() {
		return isDefaultEnt;
	}

	public void setIsDefaultEnt(Integer isDefaultEnt) {
		this.isDefaultEnt = isDefaultEnt;
	}

	@Override
	public String toString() {
		return "RelaMemberToAcct [" + "relaId=" + relaId+ ", memberId=" + memberId+ ", acctId=" + acctId+ ", memberType=" + memberType+  "]";
	}
}
