/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */

package cn.enn.ygego.sunny.user.dto.vo;

import cn.enn.ygego.sunny.user.dto.ChannelManageDTO;

import java.io.Serializable;
import java.util.Date;

/**
 * DTO:ChannelManage
 * 
 * @author gencode
 * @date 2018-3-26
 */
public class ChannelManRequestVO extends ChannelManageDTO implements Serializable {

	private static final long serialVersionUID = 8877726588419034128L;

	private Long	roleId; /* 角色标识 */
	private String	roleTitle; /* 角色名称 */
	// Constructor
	public ChannelManRequestVO() {
	}

	public String getRoleTitle() {
		return roleTitle;
	}

	public void setRoleTitle(String roleTitle) {
		this.roleTitle = roleTitle;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
}
