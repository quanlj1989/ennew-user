package cn.enn.ygego.sunny.user.dto;

import java.io.Serializable;

/**
 * DTO:RelaChannelToRole
 * 
 * @author gencode
 * @date 2018-3-26
 */
public class RelaChannelToRoleDTO implements Serializable {
	
	private static final long serialVersionUID = 6430899712804977864L;
	
	private Long	relaId; /* 关系ID */
	private Long	channelId; /* 渠道ID */
	private Long	roleId; /* 角色标识 */

	// Constructor
	public RelaChannelToRoleDTO() {
	}

	/**
	 * full Constructor
	 */
	public RelaChannelToRoleDTO(Long relaId, Long channelId, Long roleId) {
		this.relaId = relaId;
		this.channelId = channelId;
		this.roleId = roleId;
	}

	public Long getRelaId() {
		return relaId;
	}

	public void setRelaId(Long relaId) {
		this.relaId = relaId;
	}
	public Long getChannelId() {
		return channelId;
	}

	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}
	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	@Override
	public String toString() {
		return "RelaChannelToRoleDTO [" + "relaId=" + relaId + ", channelId=" + channelId + ", roleId=" + roleId +  "]";
	}
}
