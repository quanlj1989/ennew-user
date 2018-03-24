package cn.enn.ygego.sunny.user.model;

import java.util.Date;
import java.io.Serializable;

/**
 * entity:RoleOperPrivRela
 * 
 * @author gencode
 */
public class RoleOperPrivRela implements Serializable {
	
	private static final long serialVersionUID = 4981547890196229556L;
	
	private Long	relaId;		 /* 关系标识 */ 
	private Long	operId;		 /* 操作标识 */ 
	private Long	roleId;		 /* 角色标识 */ 
	private Date	createTime;		 /* 创建时间 */ 
	private Date	updateTime;		 /* 更新时间 */ 
	private Integer	relaState;		 /* 关系状态 */ 
	private Integer	isDelete;		 /* 是否删除 */ 
	private String	operPersonName;		 /* 操作人姓名 */ 
	private Long	operPersonId;		 /* 操作人标识 */ 

	// Constructor
	public RoleOperPrivRela() {
	}

	/**
	 * full Constructor
	 */
	public RoleOperPrivRela(Long relaId, Long operId, Long roleId, Date createTime, Date updateTime, Integer relaState, Integer isDelete, String operPersonName, Long operPersonId) {
		this.relaId = relaId;
		this.operId = operId;
		this.roleId = roleId;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.relaState = relaState;
		this.isDelete = isDelete;
		this.operPersonName = operPersonName;
		this.operPersonId = operPersonId;
	}

	public Long getRelaId() {
		return relaId;
	}

	public void setRelaId(Long relaId) {
		this.relaId = relaId;
	}

	public Long getOperId() {
		return operId;
	}

	public void setOperId(Long operId) {
		this.operId = operId;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
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

	public Integer getRelaState() {
		return relaState;
	}

	public void setRelaState(Integer relaState) {
		this.relaState = relaState;
	}

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getOperPersonName() {
		return operPersonName;
	}

	public void setOperPersonName(String operPersonName) {
		this.operPersonName = operPersonName;
	}

	public Long getOperPersonId() {
		return operPersonId;
	}

	public void setOperPersonId(Long operPersonId) {
		this.operPersonId = operPersonId;
	}

	@Override
	public String toString() {
		return "RoleOperPrivRela [" + "relaId=" + relaId+ ", operId=" + operId+ ", roleId=" + roleId+ ", createTime=" + createTime+ ", updateTime=" + updateTime+ ", relaState=" + relaState+ ", isDelete=" + isDelete+ ", operPersonName=" + operPersonName+ ", operPersonId=" + operPersonId+  "]";
	}
}
