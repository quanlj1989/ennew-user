package cn.enn.ygego.sunny.user.dto;

import java.util.Date;
import java.io.Serializable;

/**
 * DTO:BusiUserInfo
 * 
 * @author gencode
 * @date 2018-3-29
 */
public class BusiUserInfoDTO implements Serializable {
	
	private static final long serialVersionUID = -3228835844844979714L;
	
	private Long	userId; /* 用户ID */
	private Long	acctId; /* 账户ID */
	private String	openId; /* 唯一标识 */
	private String	mobilePhone;
	private String	email;
	private String	realName;
	private Long	configId; /* 配置ID */
	private Date	createTime; /* 创建时间 */

	// Constructor
	public BusiUserInfoDTO() {
	}

	/**
	 * full Constructor
	 */
	public BusiUserInfoDTO(Long userId, Long acctId, String openId, String mobilePhone, String email, String realName, Long configId, Date createTime) {
		this.userId = userId;
		this.acctId = acctId;
		this.openId = openId;
		this.mobilePhone = mobilePhone;
		this.email = email;
		this.realName = realName;
		this.configId = configId;
		this.createTime = createTime;
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
	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}
	public Long getConfigId() {
		return configId;
	}

	public void setConfigId(Long configId) {
		this.configId = configId;
	}
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "BusiUserInfoDTO [" + "userId=" + userId + ", acctId=" + acctId + ", openId=" + openId + ", mobilePhone=" + mobilePhone + ", email=" + email + ", realName=" + realName + ", configId=" + configId + ", createTime=" + createTime +  "]";
	}
}
