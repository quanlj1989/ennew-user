package cn.enn.ygego.sunny.user.dto;

import java.util.Date;
import java.io.Serializable;

/**
 * DTO:IndividualDomainPermit
 * 
 * @author gencode
 * @date 2018-3-19
 */
public class IndividualDomainPermitDTO implements Serializable {
	
	private static final long serialVersionUID = -8147835475170098202L;
	
	private Long	domainPermitId; /* 场准入ID */
	private Long	channelPermitId; /* 渠道准入ID */
	private Long	memberId; /* 会员ID */
	private Long	domainId; /* 场ID */
	private Integer	status; /* 状态 */
	private Date	createTime; /* 创建时间 */
	private Long	createAcctId; /* 创建人账户ID */
	private String	createName; /* 创建人姓名 */

	// Constructor
	public IndividualDomainPermitDTO() {
	}

	/**
	 * full Constructor
	 */
	public IndividualDomainPermitDTO(Long domainPermitId, Long channelPermitId, Long memberId, Long domainId, Integer status, Date createTime, Long createAcctId, String createName) {
		this.domainPermitId = domainPermitId;
		this.channelPermitId = channelPermitId;
		this.memberId = memberId;
		this.domainId = domainId;
		this.status = status;
		this.createTime = createTime;
		this.createAcctId = createAcctId;
		this.createName = createName;
	}

	public Long getDomainPermitId() {
		return domainPermitId;
	}

	public void setDomainPermitId(Long domainPermitId) {
		this.domainPermitId = domainPermitId;
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
	public Long getDomainId() {
		return domainId;
	}

	public void setDomainId(Long domainId) {
		this.domainId = domainId;
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
		return "IndividualDomainPermitDTO [" + "domainPermitId=" + domainPermitId + ", channelPermitId=" + channelPermitId + ", memberId=" + memberId + ", domainId=" + domainId + ", status=" + status + ", createTime=" + createTime + ", createAcctId=" + createAcctId + ", createName=" + createName +  "]";
	}
}
