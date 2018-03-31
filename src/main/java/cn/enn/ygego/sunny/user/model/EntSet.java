package cn.enn.ygego.sunny.user.model;

import java.util.Date;
import java.io.Serializable;

/**
 * entity:EntSet
 * 
 * @author gencode
 */
public class EntSet implements Serializable {
	
	private static final long serialVersionUID = -4739365886750221952L;
	
	private Long	setId;		 /* 设置ID */ 
	private Long	memberId;		 /* 会员ID */ 
	private String	blackWhiteListSet;		 /* 黑白名单设置 */ 
	private String	agreementPriceId;		 /* 协议价设置 */ 
	private Integer	cateMateId;		 /* 类目物料设置 */ 
	private Long	pareMemberId;		 /* 父级会员ID */ 
	private Integer	applyType;		 /* 申请类型 */ 
	private Integer	status;		 /* 状态 */ 
	private Date	createTime;		 /* 创建时间 */ 
	private Long	createAcctId;		 /* 创建人账户ID */ 
	private String	createName;		 /* 创建人姓名 */ 

	// Constructor
	public EntSet() {
	}

	/**
	 * full Constructor
	 */
	public EntSet(Long setId, Long memberId, String blackWhiteListSet, String agreementPriceId, Integer cateMateId, Long pareMemberId, Integer applyType, Integer status, Date createTime, Long createAcctId, String createName) {
		this.setId = setId;
		this.memberId = memberId;
		this.blackWhiteListSet = blackWhiteListSet;
		this.agreementPriceId = agreementPriceId;
		this.cateMateId = cateMateId;
		this.pareMemberId = pareMemberId;
		this.applyType = applyType;
		this.status = status;
		this.createTime = createTime;
		this.createAcctId = createAcctId;
		this.createName = createName;
	}

	public Long getSetId() {
		return setId;
	}

	public void setSetId(Long setId) {
		this.setId = setId;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public String getBlackWhiteListSet() {
		return blackWhiteListSet;
	}

	public void setBlackWhiteListSet(String blackWhiteListSet) {
		this.blackWhiteListSet = blackWhiteListSet;
	}

	public String getAgreementPriceId() {
		return agreementPriceId;
	}

	public void setAgreementPriceId(String agreementPriceId) {
		this.agreementPriceId = agreementPriceId;
	}

	public Integer getCateMateId() {
		return cateMateId;
	}

	public void setCateMateId(Integer cateMateId) {
		this.cateMateId = cateMateId;
	}

	public Long getPareMemberId() {
		return pareMemberId;
	}

	public void setPareMemberId(Long pareMemberId) {
		this.pareMemberId = pareMemberId;
	}

	public Integer getApplyType() {
		return applyType;
	}

	public void setApplyType(Integer applyType) {
		this.applyType = applyType;
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
		return "EntSet [" + "setId=" + setId+ ", memberId=" + memberId+ ", blackWhiteListSet=" + blackWhiteListSet+ ", agreementPriceId=" + agreementPriceId+ ", cateMateId=" + cateMateId+ ", pareMemberId=" + pareMemberId+ ", applyType=" + applyType+ ", status=" + status+ ", createTime=" + createTime+ ", createAcctId=" + createAcctId+ ", createName=" + createName+  "]";
	}
}
