package cn.enn.ygego.sunny.user.dto;

import java.util.Date;
import java.io.Serializable;

/**
 * DTO:IndividualChannelPermit
 * 
 * @author gencode
 * @date 2018-3-19
 */
public class IndividualChannelPermitDTO implements Serializable {
	
	private static final long serialVersionUID = 7208936466502111882L;
	
	private Long	channelPermitId; /* 渠道准入ID */
	private Long	memberId; /* 会员ID */
	private Long	channelId; /* 渠道ID */
	private Integer	status; /* 状态 */
	private Date	createTime; /* 创建时间 */
	private Long	createAcctId; /* 创建人账户ID */
	private String	createName; /* 创建人姓名 */

	// Constructor
	public IndividualChannelPermitDTO() {
	}

	/**
	 * full Constructor
	 */
	public IndividualChannelPermitDTO(Long channelPermitId, Long memberId, Long channelId, Integer status, Date createTime, Long createAcctId, String createName) {
		this.channelPermitId = channelPermitId;
		this.memberId = memberId;
		this.channelId = channelId;
		this.status = status;
		this.createTime = createTime;
		this.createAcctId = createAcctId;
		this.createName = createName;
	}

	public Long getChannelPermitId() {
		return channelPermitId;
	}

	public void setChannelPermitId(Long channelPermitId) {
		this.channelPermitId = channelPermitId;
	}
	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}
	public Long getChannelId() {
		return channelId;
	}

	public void setChannelId(Long channelId) {
		this.channelId = channelId;
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
		return "IndividualChannelPermitDTO [" + "channelPermitId=" + channelPermitId + ", memberId=" + memberId + ", channelId=" + channelId + ", status=" + status + ", createTime=" + createTime + ", createAcctId=" + createAcctId + ", createName=" + createName +  "]";
	}
}
