package cn.enn.ygego.sunny.user.model;

import java.io.Serializable;

/**
 * entity:MemberInfo
 * 
 * @author gencode
 */
public class MemberInfo implements Serializable {
	
	private static final long serialVersionUID = -3747143457958411155L;
	
	private Long	memberId;		 /* 会员ID */ 
	private Integer	memberType;		 /* 会员类型 */ 
	private Integer	status;		 /* 状态 */
	private Integer	ygegoCoin ;	  /* 阳光币 */

	// Constructor
	public MemberInfo() {
	}

	public MemberInfo(Long memberId, Integer memberType, Integer status, Integer ygegoCoin) {
		this.memberId = memberId;
		this.memberType = memberType;
		this.status = status;
		this.ygegoCoin = ygegoCoin;
	}

	@Override
	public String toString() {
		return "MemberInfo{" +
				"memberId=" + memberId +
				", memberType=" + memberType +
				", status=" + status +
				", ygegoCoin=" + ygegoCoin +
				'}';
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
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

	public Integer getYgegoCoin() {
		return ygegoCoin;
	}

	public void setYgegoCoin(Integer ygegoCoin) {
		this.ygegoCoin = ygegoCoin;
	}
}
