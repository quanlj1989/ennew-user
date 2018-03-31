/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */

package cn.enn.ygego.sunny.user.dto.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * entity:MemberInfo
 * 
 * @author gencode
 */
public class AuthRoleTreeVO implements Serializable {

	private static final long serialVersionUID = -3747143457958411155L;

	private Long	memberId;		 /* 会员ID */
	private Integer	memberType;		 /* 会员类型 */
	private Integer	status;		 /* 状态 */
	private String	entName;		 /* 企业名称 */
	private List<AppListVO> appListVOList=new ArrayList<>();//企业应用列表
	// Constructor
	public AuthRoleTreeVO() {
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

	public String getEntName() {
		return entName;
	}

	public void setEntName(String entName) {
		this.entName = entName;
	}

	public List<AppListVO> getAppListVOList() {
		return appListVOList;
	}

	public void setAppListVOList(List<AppListVO> appListVOList) {
		this.appListVOList = appListVOList;
	}
}
