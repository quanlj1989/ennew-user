package cn.enn.ygego.sunny.user.model;

import java.util.Date;
import java.io.Serializable;

/**
 * entity:InspectFactoryApplyInfo
 * 
 * @author gencode
 */
public class InspectFactoryApplyInfo implements Serializable {
	
	private static final long serialVersionUID = -72961707540285987L;
	
	private Long	applyId;		 /* 申请标识 */ 
	private Integer	categoryId;		 /* 类目ID */ 
	private String	gcPictureUrl;		 /* 类目图片路径 */ 
	private String	categoryName;		 /* 类目名称 */ 
	private Long	typeId;		 /* 类型标识 */ 
	private String	entName;		 /* 企业名称 */ 
	private Integer	applyStatus;		 /* 申请状态 */ 
	private Integer	isApproachExpire;		 /* 是否临期 */ 
	private String	inspFactLevel;		 /* 验厂级别 */ 
	private Date	expireTime;		 /* 过期时间 */ 
	private String	rejectReason;		 /* 驳回原因 */ 
	private Long	createMemberId;		 /* 创建人会员ID */ 
	private Long	createAcctId;		 /* 创建人账户ID */ 
	private String	createName;		 /* 创建人姓名 */ 
	private Long	approveAcctId;		 /* 审核人账户ID */ 
	private String	approveName;		 /* 审核人姓名 */ 
	private Long	approveMemberId;		 /* 审核人会员ID */ 
	private Date	createTime;		 /* 创建时间 */ 
	private Date	auditTime;		 /* 审核时间 */ 

	// Constructor
	public InspectFactoryApplyInfo() {
	}

	/**
	 * full Constructor
	 */
	public InspectFactoryApplyInfo(Long applyId, Integer categoryId, String gcPictureUrl, String categoryName, Long typeId, String entName, Integer applyStatus, Integer isApproachExpire, String inspFactLevel, Date expireTime, String rejectReason, Long createMemberId, Long createAcctId, String createName, Long approveAcctId, String approveName, Long approveMemberId, Date createTime, Date auditTime) {
		this.applyId = applyId;
		this.categoryId = categoryId;
		this.gcPictureUrl = gcPictureUrl;
		this.categoryName = categoryName;
		this.typeId = typeId;
		this.entName = entName;
		this.applyStatus = applyStatus;
		this.isApproachExpire = isApproachExpire;
		this.inspFactLevel = inspFactLevel;
		this.expireTime = expireTime;
		this.rejectReason = rejectReason;
		this.createMemberId = createMemberId;
		this.createAcctId = createAcctId;
		this.createName = createName;
		this.approveAcctId = approveAcctId;
		this.approveName = approveName;
		this.approveMemberId = approveMemberId;
		this.createTime = createTime;
		this.auditTime = auditTime;
	}

	public Long getApplyId() {
		return applyId;
	}

	public void setApplyId(Long applyId) {
		this.applyId = applyId;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getGcPictureUrl() {
		return gcPictureUrl;
	}

	public void setGcPictureUrl(String gcPictureUrl) {
		this.gcPictureUrl = gcPictureUrl;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Long getTypeId() {
		return typeId;
	}

	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}

	public String getEntName() {
		return entName;
	}

	public void setEntName(String entName) {
		this.entName = entName;
	}

	public Integer getApplyStatus() {
		return applyStatus;
	}

	public void setApplyStatus(Integer applyStatus) {
		this.applyStatus = applyStatus;
	}

	public Integer getIsApproachExpire() {
		return isApproachExpire;
	}

	public void setIsApproachExpire(Integer isApproachExpire) {
		this.isApproachExpire = isApproachExpire;
	}

	public String getInspFactLevel() {
		return inspFactLevel;
	}

	public void setInspFactLevel(String inspFactLevel) {
		this.inspFactLevel = inspFactLevel;
	}

	public Date getExpireTime() {
		return expireTime;
	}

	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

	public String getRejectReason() {
		return rejectReason;
	}

	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
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

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getAuditTime() {
		return auditTime;
	}

	public void setAuditTime(Date auditTime) {
		this.auditTime = auditTime;
	}

	@Override
	public String toString() {
		return "InspectFactoryApplyInfo [" + "applyId=" + applyId+ ", categoryId=" + categoryId+ ", gcPictureUrl=" + gcPictureUrl+ ", categoryName=" + categoryName+ ", typeId=" + typeId+ ", entName=" + entName+ ", applyStatus=" + applyStatus+ ", isApproachExpire=" + isApproachExpire+ ", inspFactLevel=" + inspFactLevel+ ", expireTime=" + expireTime+ ", rejectReason=" + rejectReason+ ", createMemberId=" + createMemberId+ ", createAcctId=" + createAcctId+ ", createName=" + createName+ ", approveAcctId=" + approveAcctId+ ", approveName=" + approveName+ ", approveMemberId=" + approveMemberId+ ", createTime=" + createTime+ ", auditTime=" + auditTime+  "]";
	}
}
