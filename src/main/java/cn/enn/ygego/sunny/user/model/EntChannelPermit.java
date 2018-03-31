package cn.enn.ygego.sunny.user.model;

import java.util.Date;
import java.io.Serializable;

/**
 * entity:EntChannelPermit
 * 
 * @author gencode
 */
public class EntChannelPermit implements Serializable {
	
	private static final long serialVersionUID = -1492416666463480285L;
	
	private Long	channelPermitId;		 /* 渠道准入ID */ 
	private Long	memberId;		 /* 会员ID */ 
	private Long	channelId;		 /* 渠道ID */ 
	private Long	sapServiceId;		 /* SAP服务ID */ 
	private Long	clearingMemberId;		 /* 结算商会员ID */ 
	private Integer	supplierSet;		 /* 供应商设置 */ 
	private Integer	blackWhiteListSet;		 /* 黑白名单设置 */ 
	private Integer	agreementPriceId;		 /* 协议价设置 */ 
	private Integer	cateMateId;		 /* 类目物料设置 */ 
	private Integer	authenType;		 /* 认证类型 */ 
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
	public EntChannelPermit(Long channelPermitId, Long memberId, Long channelId, Long sapServiceId, Long clearingMemberId, Integer supplierSet, Integer blackWhiteListSet, Integer agreementPriceId, Integer cateMateId, Integer authenType, Integer status, Date createTime, Long createAcctId, String createName) {
		this.channelPermitId = channelPermitId;
		this.memberId = memberId;
		this.channelId = channelId;
		this.sapServiceId = sapServiceId;
		this.clearingMemberId = clearingMemberId;
		this.supplierSet = supplierSet;
		this.blackWhiteListSet = blackWhiteListSet;
		this.agreementPriceId = agreementPriceId;
		this.cateMateId = cateMateId;
		this.authenType = authenType;
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

	public Long getSapServiceId() {
		return sapServiceId;
	}

	public void setSapServiceId(Long sapServiceId) {
		this.sapServiceId = sapServiceId;
	}

	public Long getClearingMemberId() {
		return clearingMemberId;
	}

	public void setClearingMemberId(Long clearingMemberId) {
		this.clearingMemberId = clearingMemberId;
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

	public Integer getCateMateId() {
		return cateMateId;
	}

	public void setCateMateId(Integer cateMateId) {
		this.cateMateId = cateMateId;
	}

	public Integer getAuthenType() {
		return authenType;
	}

	public void setAuthenType(Integer authenType) {
		this.authenType = authenType;
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
		return "EntChannelPermit [" + "channelPermitId=" + channelPermitId+ ", memberId=" + memberId+ ", channelId=" + channelId+ ", sapServiceId=" + sapServiceId+ ", clearingMemberId=" + clearingMemberId+ ", supplierSet=" + supplierSet+ ", blackWhiteListSet=" + blackWhiteListSet+ ", agreementPriceId=" + agreementPriceId+ ", cateMateId=" + cateMateId+ ", authenType=" + authenType+ ", status=" + status+ ", createTime=" + createTime+ ", createAcctId=" + createAcctId+ ", createName=" + createName+  "]";
	}
}
