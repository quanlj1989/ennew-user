package cn.enn.ygego.sunny.user.dto;

import java.util.Date;
import java.io.Serializable;

/**
 * DTO:RoleInfo
 * 
 * @author gencode
 * @date 2018-3-19
 */
public class RoleInfoDTO implements Serializable {
	
	private static final long serialVersionUID = -3174040318996406861L;
	
	private Long	roleId; /* 角色标识 */
	private Long	appId; /* 应用标识 */
	private Long	entId; /* 企业标识 */
	private String	roleCode; /* 角色编码 */
	private String	roleTitle; /* 角色名称 */
	private Integer	roleState; /* 角色状态 */
	private String	roleDesc; /* 角色描述 */
	private Integer	isDelete; /* 是否删除 */
	private Date	createTime; /* 创建时间 */
	private Date	updateTime; /* 更新时间 */

	// Constructor
	public RoleInfoDTO() {
	}

	/**
	 * full Constructor
	 */
	public RoleInfoDTO(Long roleId, Long appId, Long entId, String roleCode, String roleTitle, Integer roleState, String roleDesc, Integer isDelete, Date createTime, Date updateTime) {
		this.roleId = roleId;
		this.appId = appId;
		this.entId = entId;
		this.roleCode = roleCode;
		this.roleTitle = roleTitle;
		this.roleState = roleState;
		this.roleDesc = roleDesc;
		this.isDelete = isDelete;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public Long getAppId() {
		return appId;
	}

	public void setAppId(Long appId) {
		this.appId = appId;
	}
	public Long getEntId() {
		return entId;
	}

	public void setEntId(Long entId) {
		this.entId = entId;
	}
	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
	public String getRoleTitle() {
		return roleTitle;
	}

	public void setRoleTitle(String roleTitle) {
		this.roleTitle = roleTitle;
	}
	public Integer getRoleState() {
		return roleState;
	}

	public void setRoleState(Integer roleState) {
		this.roleState = roleState;
	}
	public String getRoleDesc() {
		return roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}
	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	@Override
	public String toString() {
		return "RoleInfoDTO [" + "roleId=" + roleId + ", appId=" + appId + ", entId=" + entId + ", roleCode=" + roleCode + ", roleTitle=" + roleTitle + ", roleState=" + roleState + ", roleDesc=" + roleDesc + ", isDelete=" + isDelete + ", createTime=" + createTime + ", updateTime=" + updateTime +  "]";
	}
}
