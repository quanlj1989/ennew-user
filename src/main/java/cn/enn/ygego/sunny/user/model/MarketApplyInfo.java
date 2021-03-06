package cn.enn.ygego.sunny.user.model;

import java.util.Date;
import java.io.Serializable;

/**
 * ClassName: MarketApplyInfo
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
*/
public class MarketApplyInfo implements Serializable {
	
	private Long	marketApplyId;		 /* 超市申请ID */ 
	private Long	memberId;		 /* 会员ID */ 
	private Long	marketId;		 /* 超市ID */ 
	private String	marketCode;		 /* 超市编码 */ 
	private String	marketName;		 /* 超市名称 */ 
	private String	serviceType;		 /* 服务类型 */ 
	private Long	areaId;		 /* 地区ID */ 
	private String	areaIdFullPath;		 /* 地区ID路径 */ 
	private String	areaNameFullPath;		 /* 地区名称路径 */ 
	private String	addressDetail;		 /* 详细地址 */ 
	private String	contact;		 /* 联系人 */ 
	private String	contactTel;		 /* 联系电话 */ 
	private String	email;		 /* 电子邮件 */ 
	private String	chargeType;		 /* 收费类型 */ 
	private String	inviteCode;		 /* 邀请码 */ 
	private Integer	status;		 /* 状态 */ 
	private String	approveDesc;		 /* 审核结果描述 */ 
	private Date	createTime;		 /* 创建时间 */ 
	private Long	createAcctId;		 /* 创建人账户ID */ 
	private String	createName;		 /* 创建人姓名 */ 
	private Long	approveAcctId;		 /* 审核人账户ID */ 
	private String	approveName;		 /* 审核人姓名 */ 
	private Long	approveMemberId;		 /* 审核人会员ID */ 
	private Date	auditTime;		 /* 审核时间 */ 

	// Constructor
	public MarketApplyInfo() {
	}

	/**
	 * full Constructor
	 */
	public MarketApplyInfo(Long marketApplyId, Long memberId, Long marketId, String marketCode, String marketName, String serviceType, Long areaId, String areaIdFullPath, String areaNameFullPath, String addressDetail, String contact, String contactTel, String email, String chargeType, String inviteCode, Integer status, String approveDesc, Date createTime, Long createAcctId, String createName, Long approveAcctId, String approveName, Long approveMemberId, Date auditTime) {
		this.marketApplyId = marketApplyId;
		this.memberId = memberId;
		this.marketId = marketId;
		this.marketCode = marketCode;
		this.marketName = marketName;
		this.serviceType = serviceType;
		this.areaId = areaId;
		this.areaIdFullPath = areaIdFullPath;
		this.areaNameFullPath = areaNameFullPath;
		this.addressDetail = addressDetail;
		this.contact = contact;
		this.contactTel = contactTel;
		this.email = email;
		this.chargeType = chargeType;
		this.inviteCode = inviteCode;
		this.status = status;
		this.approveDesc = approveDesc;
		this.createTime = createTime;
		this.createAcctId = createAcctId;
		this.createName = createName;
		this.approveAcctId = approveAcctId;
		this.approveName = approveName;
		this.approveMemberId = approveMemberId;
		this.auditTime = auditTime;
	}

	public Long getMarketApplyId() {
		return marketApplyId;
	}

	public void setMarketApplyId(Long marketApplyId) {
		this.marketApplyId = marketApplyId;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public Long getMarketId() {
		return marketId;
	}

	public void setMarketId(Long marketId) {
		this.marketId = marketId;
	}

	public String getMarketCode() {
		return marketCode;
	}

	public void setMarketCode(String marketCode) {
		this.marketCode = marketCode;
	}

	public String getMarketName() {
		return marketName;
	}

	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public Long getAreaId() {
		return areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}

	public String getAreaIdFullPath() {
		return areaIdFullPath;
	}

	public void setAreaIdFullPath(String areaIdFullPath) {
		this.areaIdFullPath = areaIdFullPath;
	}

	public String getAreaNameFullPath() {
		return areaNameFullPath;
	}

	public void setAreaNameFullPath(String areaNameFullPath) {
		this.areaNameFullPath = areaNameFullPath;
	}

	public String getAddressDetail() {
		return addressDetail;
	}

	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getContactTel() {
		return contactTel;
	}

	public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getChargeType() {
		return chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}

	public String getInviteCode() {
		return inviteCode;
	}

	public void setInviteCode(String inviteCode) {
		this.inviteCode = inviteCode;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getApproveDesc() {
		return approveDesc;
	}

	public void setApproveDesc(String approveDesc) {
		this.approveDesc = approveDesc;
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

	public Long getApproveAcctId() {
		return approveAcctId;
	}

	public void setApproveAcctId(Long approveAcctId) {
		this.approveAcctId = approveAcctId;
	}

	public String getApproveName() {
		return approveName;
	}

	public void setApproveName(String approveName) {
		this.approveName = approveName;
	}

	public Long getApproveMemberId() {
		return approveMemberId;
	}

	public void setApproveMemberId(Long approveMemberId) {
		this.approveMemberId = approveMemberId;
	}

	public Date getAuditTime() {
		return auditTime;
	}

	public void setAuditTime(Date auditTime) {
		this.auditTime = auditTime;
	}

	@Override
	public String toString() {
		return "MarketApplyInfo [" + "marketApplyId=" + marketApplyId + ", memberId=" + memberId + ", marketId=" + marketId + ", marketCode=" + marketCode + ", marketName=" + marketName + ", serviceType=" + serviceType + ", areaId=" + areaId + ", areaIdFullPath=" + areaIdFullPath + ", areaNameFullPath=" + areaNameFullPath + ", addressDetail=" + addressDetail + ", contact=" + contact + ", contactTel=" + contactTel + ", email=" + email + ", chargeType=" + chargeType + ", inviteCode=" + inviteCode + ", status=" + status + ", approveDesc=" + approveDesc + ", createTime=" + createTime + ", createAcctId=" + createAcctId + ", createName=" + createName + ", approveAcctId=" + approveAcctId + ", approveName=" + approveName + ", approveMemberId=" + approveMemberId + ", auditTime=" + auditTime +  "]";
	}
}
