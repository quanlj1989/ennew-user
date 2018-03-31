package cn.enn.ygego.sunny.user.model;

import java.io.Serializable;

/**
 * entity:RelaChannelToRole
 * 
 * @author gencode
 */
public class RelaChannelToRole implements Serializable {
	
	private static final long serialVersionUID = -8823988970810440385L;
	
	private Long	relaId;		 /* 关系ID */ 
	private Long	channelId;		 /* 渠道ID */ 
	private Long	roleId;		 /* 角色标识 */ 

	// Constructor
	public RelaChannelToRole() {
	}

	/**
	 * full Constructor
	 */
	public RelaChannelToRole(Long relaId, Long channelId, Long roleId) {
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
		return "RelaChannelToRole [" + "relaId=" + relaId+ ", channelId=" + channelId+ ", roleId=" + roleId+  "]";
	}
}
