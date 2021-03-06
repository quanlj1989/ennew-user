package cn.enn.ygego.sunny.user.dto;

import java.util.Date;
import java.io.Serializable;

/**
 * DTO:AcctRoleRela
 * 
 * @author gencode
 * @date 2018-3-19
 */
public class AcctRoleRelaDTO implements Serializable {
	
	private static final long serialVersionUID = 5938763716755537815L;
	
	private Long	relaId; /* 关系标识 */
	private Long	acctId; /* 账户标识 */
	private Long	roleId; /* 角色标识 */
	private Date	createTime; /* 创建时间 */
	private Integer	relaState; /* 关系状态 */
	private Integer	isDelete; /* 是否删除 */

	// Constructor
	public AcctRoleRelaDTO() {
	}

	/**
	 * full Constructor
	 */
	public AcctRoleRelaDTO(Long relaId, Long acctId, Long roleId, Date createTime, Integer relaState, Integer isDelete) {
		this.relaId = relaId;
		this.acctId = acctId;
		this.roleId = roleId;
		this.createTime = createTime;
		this.relaState = relaState;
		this.isDelete = isDelete;
	}

	public Long getRelaId() {
		return relaId;
	}

	public void setRelaId(Long relaId) {
		this.relaId = relaId;
	}
	public Long getAcctId() {
		return acctId;
	}

	public void setAcctId(Long acctId) {
		this.acctId = acctId;
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
	@Override
	public String toString() {
		return "AcctRoleRelaDTO [" + "relaId=" + relaId + ", acctId=" + acctId + ", roleId=" + roleId + ", createTime=" + createTime + ", relaState=" + relaState + ", isDelete=" + isDelete +  "]";
	}
}
