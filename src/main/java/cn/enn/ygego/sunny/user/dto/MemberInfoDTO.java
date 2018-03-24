package cn.enn.ygego.sunny.user.dto;

import java.io.Serializable;

/**
 * DTO:MemberInfo
 * 
 * @author gencode
 * @date 2018-3-19
 */
public class MemberInfoDTO implements Serializable {
	
	private static final long serialVersionUID = 8337626773364332711L;
	
	private Long	memberId; /* 会员ID */
	private Integer	memberType; /* 会员类型 */
	private Integer	status; /* 状态 */

	// Constructor
	public MemberInfoDTO() {
	}

	/**
	 * full Constructor
	 */
	public MemberInfoDTO(Long memberId, Integer memberType, Integer status) {
		this.memberId = memberId;
		this.memberType = memberType;
		this.status = status;
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
	@Override
	public String toString() {
		return "MemberInfoDTO [" + "memberId=" + memberId + ", memberType=" + memberType + ", status=" + status +  "]";
	}
}
