package cn.enn.ygego.sunny.user.dto;

import java.util.Date;
import java.io.Serializable;

/**
 * DTO:BusiUserInfo
 * 
 * @author gencode
 * @date 2018-3-19
 */
public class BusiUserInfoDTO implements Serializable {
	
	private static final long serialVersionUID = 7780474082178949971L;
	
	private Long	userId; /* 用户ID */
	private Long	acctId; /* 账户ID */
	private String	userTitle; /* 用户名称 */
	private Integer	userType; /* 用户类型 */
	private Integer	status; /* 状态 */
	private Date	createTime; /* 创建时间 */
	private Date	modTime; /* 修改时间 */
	private Integer	isDelete; /* 是否删除 */

	// Constructor
	public BusiUserInfoDTO() {
	}

	/**
	 * full Constructor
	 */
	public BusiUserInfoDTO(Long userId, Long acctId, String userTitle, Integer userType, Integer status, Date createTime, Date modTime, Integer isDelete) {
		this.userId = userId;
		this.acctId = acctId;
		this.userTitle = userTitle;
		this.userType = userType;
		this.status = status;
		this.createTime = createTime;
		this.modTime = modTime;
		this.isDelete = isDelete;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getAcctId() {
		return acctId;
	}

	public void setAcctId(Long acctId) {
		this.acctId = acctId;
	}
	public String getUserTitle() {
		return userTitle;
	}

	public void setUserTitle(String userTitle) {
		this.userTitle = userTitle;
	}
	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getModTime() {
		return modTime;
	}

	public void setModTime(Date modTime) {
		this.modTime = modTime;
	}
	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}
	@Override
	public String toString() {
		return "BusiUserInfoDTO [" + "userId=" + userId + ", acctId=" + acctId + ", userTitle=" + userTitle + ", userType=" + userType + ", status=" + status + ", createTime=" + createTime + ", modTime=" + modTime + ", isDelete=" + isDelete +  "]";
	}
}
