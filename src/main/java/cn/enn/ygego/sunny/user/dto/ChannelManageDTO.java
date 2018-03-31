package cn.enn.ygego.sunny.user.dto;

import java.util.Date;
import java.io.Serializable;

/**
 * DTO:ChannelManage
 * 
 * @author gencode
 * @date 2018-3-30
 */
public class ChannelManageDTO implements Serializable {
	
	private static final long serialVersionUID = 4284499914158558362L;
	
	private Long	channelId; /* 渠道ID */
	private String	channelName; /* 渠道名称 */
	private String	channelLogoUrl; /* 渠道Logo地址 */
	private String	channelColour; /* 渠道色调 */
	private Long	channelOperMemberId; /* 渠道运营会员ID */
	private Long	channelOperAcctId; /* 渠道运营账号ID */
	private String	channelOperAcctName; /* 渠道运营账户名称 */
	private Long	roleId; /* 角色ID */
	private Integer	openMarketChannel; /* 是否开通超市渠道 */
	private Date	createTime; /* 创建时间 */
	private Long	createMemberId; /* 创建人会员ID */
	private Long	createAcctId; /* 创建人账户ID */
	private String	createName; /* 创建人姓名 */

	// Constructor
	public ChannelManageDTO() {
	}

	/**
	 * full Constructor
	 */
	public ChannelManageDTO(Long channelId, String channelName, String channelLogoUrl, String channelColour, Long channelOperMemberId, Long channelOperAcctId, String channelOperAcctName, Long roleId, Integer openMarketChannel, Date createTime, Long createMemberId, Long createAcctId, String createName) {
		this.channelId = channelId;
		this.channelName = channelName;
		this.channelLogoUrl = channelLogoUrl;
		this.channelColour = channelColour;
		this.channelOperMemberId = channelOperMemberId;
		this.channelOperAcctId = channelOperAcctId;
		this.channelOperAcctName = channelOperAcctName;
		this.roleId = roleId;
		this.openMarketChannel = openMarketChannel;
		this.createTime = createTime;
		this.createMemberId = createMemberId;
		this.createAcctId = createAcctId;
		this.createName = createName;
	}

	public Long getChannelId() {
		return channelId;
	}

	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}
	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public String getChannelLogoUrl() {
		return channelLogoUrl;
	}

	public void setChannelLogoUrl(String channelLogoUrl) {
		this.channelLogoUrl = channelLogoUrl;
	}
	public String getChannelColour() {
		return channelColour;
	}

	public void setChannelColour(String channelColour) {
		this.channelColour = channelColour;
	}
	public Long getChannelOperMemberId() {
		return channelOperMemberId;
	}

	public void setChannelOperMemberId(Long channelOperMemberId) {
		this.channelOperMemberId = channelOperMemberId;
	}
	public Long getChannelOperAcctId() {
		return channelOperAcctId;
	}

	public void setChannelOperAcctId(Long channelOperAcctId) {
		this.channelOperAcctId = channelOperAcctId;
	}
	public String getChannelOperAcctName() {
		return channelOperAcctName;
	}

	public void setChannelOperAcctName(String channelOperAcctName) {
		this.channelOperAcctName = channelOperAcctName;
	}
	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public Integer getOpenMarketChannel() {
		return openMarketChannel;
	}

	public void setOpenMarketChannel(Integer openMarketChannel) {
		this.openMarketChannel = openMarketChannel;
	}
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Long getCreateMemberId() {
		return createMemberId;
	}

	public void setCreateMemberId(Long createMemberId) {
		this.createMemberId = createMemberId;
	}
	public Long getCreateAcctId() {
		return createAcctId;
	}

	public void setCreateAcctId(Long createAcctId) {
		this.createAcctId = createAcctId;
	}
	public String getCreateName() {
		return createName;
	}

	public void setCreateName(String createName) {
		this.createName = createName;
	}
	@Override
	public String toString() {
		return "ChannelManageDTO [" + "channelId=" + channelId + ", channelName=" + channelName + ", channelLogoUrl=" + channelLogoUrl + ", channelColour=" + channelColour + ", channelOperMemberId=" + channelOperMemberId + ", channelOperAcctId=" + channelOperAcctId + ", channelOperAcctName=" + channelOperAcctName + ", roleId=" + roleId + ", openMarketChannel=" + openMarketChannel + ", createTime=" + createTime + ", createMemberId=" + createMemberId + ", createAcctId=" + createAcctId + ", createName=" + createName +  "]";
	}
}
