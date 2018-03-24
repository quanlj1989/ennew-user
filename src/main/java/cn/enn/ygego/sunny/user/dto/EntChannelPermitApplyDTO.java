package cn.enn.ygego.sunny.user.dto;

import java.util.Date;
import java.io.Serializable;

/**
 * DTO:EntChannelPermitApply
 * 
 * @author gencode
 * @date 2018-3-19
 */
public class EntChannelPermitApplyDTO implements Serializable {
	
	private static final long serialVersionUID = 1639173429399834121L;
	
	private Long	channelApplyId; /* 渠道申请ID */
	private Long	certApplyId; /* 资质申请ID */
	private Long	memberId; /* 会员ID */
	private Long	channelId; /* 渠道ID */
	private Integer	status; /* 状态 */
	private Date	createTime; /* 创建时间 */
	private Long	createAcctId; /* 创建人账户ID */
	private String	createName; /* 创建人姓名 */

	// Constructor
	public EntChannelPermitApplyDTO() {
	}

	/**
	 * full Constructor
	 */
	public EntChannelPermitApplyDTO(Long channelApplyId, Long certApplyId, Long memberId, Long channelId, Integer status, Date createTime, Long createAcctId, String createName) {
		this.channelApplyId = channelApplyId;
		this.certApplyId = certApplyId;
		this.memberId = memberId;
		this.channelId = channelId;
		this.status = status;
		this.createTime = createTime;
		this.createAcctId = createAcctId;
		this.createName = createName;
	}

	public Long getChannelApplyId() {
		return channelApplyId;
	}

	public void setChannelApplyId(Long channelApplyId) {
		this.channelApplyId = channelApplyId;
	}
	public Long getCertApplyId() {
		return certApplyId;
	}

	public void setCertApplyId(Long certApplyId) {
		this.certApplyId = certApplyId;
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
		return "EntChannelPermitApplyDTO [" + "channelApplyId=" + channelApplyId + ", certApplyId=" + certApplyId + ", memberId=" + memberId + ", channelId=" + channelId + ", status=" + status + ", createTime=" + createTime + ", createAcctId=" + createAcctId + ", createName=" + createName +  "]";
	}
}
