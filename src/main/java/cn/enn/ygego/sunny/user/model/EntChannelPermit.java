package cn.enn.ygego.sunny.user.model;

import java.util.Date;
import java.io.Serializable;

/**
 * entity:EntChannelPermit
 * 
 * @author gencode
 */
public class EntChannelPermit implements Serializable {
	
	private static final long serialVersionUID = -6217443980118016926L;
	
	private Long	channelPermitId;		 /* 渠道准入ID */ 
	private Long	memberId;		 /* 会员ID */ 
	private Long	channelId;		 /* 渠道ID */ 
	private Integer	supplierSet;		 /* 供应商设置 */ 
	private Integer	blackWhiteListSet;		 /* 黑白名单设置 */ 
	private Integer	agreementPriceId;		 /* 协议价设置 */ 
	private Integer	status;		 /* 状态 */ 
	private Date	createTime;		 /* 创建时间 */ 
	private Long	createAcctId;		 /* 创建人账户ID */ 
	private String	createName;		 /* 创建人姓名 */ 

	// Constructor
	public EntChannelPermit() {
	}

	/**
	 * full Constructor
	 */
	public EntChannelPermit(Long channelPermitId, Long memberId, Long channelId, Integer supplierSet, Integer blackWhiteListSet, Integer agreementPriceId, Integer status, Date createTime, Long createAcctId, String createName) {
		this.channelPermitId = channelPermitId;
		this.memberId = memberId;
		this.channelId = channelId;
		this.supplierSet = supplierSet;
		this.blackWhiteListSet = blackWhiteListSet;
		this.agreementPriceId = agreementPriceId;
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

	public Integer getSupplierSet() {
		return supplierSet;
	}

	public void setSupplierSet(Integer supplierSet) {
		this.supplierSet = supplierSet;
	}

	public Integer getBlackWhiteListSet() {
		return blackWhiteListSet;
	}

	public void setBlackWhiteListSet(Integer blackWhiteListSet) {
		this.blackWhiteListSet = blackWhiteListSet;
	}

	public Integer getAgreementPriceId() {
		return agreementPriceId;
	}

	public void setAgreementPriceId(Integer agreementPriceId) {
		this.agreementPriceId = agreementPriceId;
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
		return "EntChannelPermit [" + "channelPermitId=" + channelPermitId+ ", memberId=" + memberId+ ", channelId=" + channelId+ ", supplierSet=" + supplierSet+ ", blackWhiteListSet=" + blackWhiteListSet+ ", agreementPriceId=" + agreementPriceId+ ", status=" + status+ ", createTime=" + createTime+ ", createAcctId=" + createAcctId+ ", createName=" + createName+  "]";
	}
}
