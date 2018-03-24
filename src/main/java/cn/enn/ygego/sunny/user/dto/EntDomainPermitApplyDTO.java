package cn.enn.ygego.sunny.user.dto;

import java.util.Date;
import java.io.Serializable;

/**
 * DTO:EntDomainPermitApply
 * 
 * @author gencode
 * @date 2018-3-19
 */
public class EntDomainPermitApplyDTO implements Serializable {
	
	private static final long serialVersionUID = -2595316380565562699L;
	
	private Long	domainApplyId; /* 场申请ID */
	private Long	channelApplyId; /* 渠道申请ID */
	private Long	memberId; /* 会员ID */
	private Long	domainId; /* 场ID */
	private Date	createTime; /* 创建时间 */
	private Long	createAcctId; /* 创建人账户ID */
	private String	createName; /* 创建人姓名 */

	// Constructor
	public EntDomainPermitApplyDTO() {
	}

	/**
	 * full Constructor
	 */
	public EntDomainPermitApplyDTO(Long domainApplyId, Long channelApplyId, Long memberId, Long domainId, Date createTime, Long createAcctId, String createName) {
		this.domainApplyId = domainApplyId;
		this.channelApplyId = channelApplyId;
		this.memberId = memberId;
		this.domainId = domainId;
		this.createTime = createTime;
		this.createAcctId = createAcctId;
		this.createName = createName;
	}

	public Long getDomainApplyId() {
		return domainApplyId;
	}

	public void setDomainApplyId(Long domainApplyId) {
		this.domainApplyId = domainApplyId;
	}
	public Long getChannelApplyId() {
		return channelApplyId;
	}

	public void setChannelApplyId(Long channelApplyId) {
		this.channelApplyId = channelApplyId;
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
		return "EntDomainPermitApplyDTO [" + "domainApplyId=" + domainApplyId + ", channelApplyId=" + channelApplyId + ", memberId=" + memberId + ", domainId=" + domainId + ", createTime=" + createTime + ", createAcctId=" + createAcctId + ", createName=" + createName +  "]";
	}
}
