package cn.enn.ygego.sunny.user.model;

import java.util.Date;
import java.io.Serializable;

/**
 * entity:ChannelManage
 * 
 * @author gencode
 */
public class ChannelManage implements Serializable {
	
	private static final long serialVersionUID = -3393102684229348839L;
	
	private Long	channelId;		 /* 渠道ID */ 
	private Long	appId;		 /* 应用标识 */ 
	private String	channelCode;		 /* 渠道号 */ 
	private String	channelName;		 /* 渠道名称 */ 
	private Integer	isIndepDomain;		 /* 是否独立域名 */ 
	private String	channelDomain;		 /* 渠道域名 */ 
	private Integer	permitOutsideEnt;		 /* 采购是否需要准入 */ 
	private Date	createTime;		 /* 创建时间 */ 
	private Long	createMemberId;		 /* 创建人会员ID */ 
	private Long	createAcctId;		 /* 创建人账户ID */ 
	private String	createName;		 /* 创建人姓名 */ 

	// Constructor
	public ChannelManage() {
	}

	/**
	 * full Constructor
	 */
	public ChannelManage(Long channelId, Long appId, String channelCode, String channelName, Integer isIndepDomain, String channelDomain, Integer permitOutsideEnt, Date createTime, Long createMemberId, Long createAcctId, String createName) {
		this.channelId = channelId;
		this.appId = appId;
		this.channelCode = channelCode;
		this.channelName = channelName;
		this.isIndepDomain = isIndepDomain;
		this.channelDomain = channelDomain;
		this.permitOutsideEnt = permitOutsideEnt;
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

	public Long getAppId() {
		return appId;
	}

	public void setAppId(Long appId) {
		this.appId = appId;
	}

	public String getChannelCode() {
		return channelCode;
	}

	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public Integer getIsIndepDomain() {
		return isIndepDomain;
	}

	public void setIsIndepDomain(Integer isIndepDomain) {
		this.isIndepDomain = isIndepDomain;
	}

	public String getChannelDomain() {
		return channelDomain;
	}

	public void setChannelDomain(String channelDomain) {
		this.channelDomain = channelDomain;
	}

	public Integer getPermitOutsideEnt() {
		return permitOutsideEnt;
	}

	public void setPermitOutsideEnt(Integer permitOutsideEnt) {
		this.permitOutsideEnt = permitOutsideEnt;
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
		return "ChannelManage [" + "channelId=" + channelId+ ", appId=" + appId+ ", channelCode=" + channelCode+ ", channelName=" + channelName+ ", isIndepDomain=" + isIndepDomain+ ", channelDomain=" + channelDomain+ ", permitOutsideEnt=" + permitOutsideEnt+ ", createTime=" + createTime+ ", createMemberId=" + createMemberId+ ", createAcctId=" + createAcctId+ ", createName=" + createName+  "]";
	}
}
