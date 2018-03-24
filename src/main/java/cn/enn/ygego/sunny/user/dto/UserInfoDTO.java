package cn.enn.ygego.sunny.user.dto;

import java.util.Date;
import java.io.Serializable;

/**
 * DTO:UserInfo
 * 
 * @author gencode
 * @date 2018-3-19
 */
public class UserInfoDTO implements Serializable {
	
	private static final long serialVersionUID = -2769674446470590741L;
	
	private Long	userId; /* 用户标识 */
	private Long	acctId; /* 账户标识 */
	private String	userTitle; /* 用户名称 */
	private Integer	userType; /* 用户类型 */
	private Date	createTime; /* 创建时间 */
	private Integer	isDelete; /* 是否删除 */

	// Constructor
	public UserInfoDTO() {
	}

	/**
	 * full Constructor
	 */
	public UserInfoDTO(Long userId, Long acctId, String userTitle, Integer userType, Date createTime, Integer isDelete) {
		this.userId = userId;
		this.acctId = acctId;
		this.userTitle = userTitle;
		this.userType = userType;
		this.createTime = createTime;
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
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}
	@Override
	public String toString() {
		return "UserInfoDTO [" + "userId=" + userId + ", acctId=" + acctId + ", userTitle=" + userTitle + ", userType=" + userType + ", createTime=" + createTime + ", isDelete=" + isDelete +  "]";
	}
}
