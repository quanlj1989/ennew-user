package cn.enn.ygego.sunny.user.dto;

import java.util.Date;
import java.io.Serializable;

/**
 * DTO:EntBrandAuthApply
 * 
 * @author gencode
 * @date 2018-3-30
 */
public class EntBrandAuthApplyDTO implements Serializable {
	
	private static final long serialVersionUID = 8900010151861745422L;
	
	private Long	brandApplyId; /* 品牌申请ID */
	private Long	memberId; /* 会员ID */
	private Integer	categoryId; /* 类目ID */
	private String	categoryNamePath; /* 类目名称路径 */
	private String	categoryIdPath; /* 类目ID路径 */
	private String	brandName; /* 品牌名称 */
	private Integer	brandId; /* 品牌ID */
	private Integer	status; /* 状态 */
	private Date	createTime; /* 创建时间 */
	private Long	createAcctId; /* 创建人账户ID */
	private Long	createMemberId; /* 创建人会员ID */
	private String	createName; /* 创建人姓名 */
	private Date	auditTime; /* 审核时间 */
	private String	approveDesc; /* 审核结果描述 */
	private Long	approveAcctId; /* 审核人账户ID */
	private Long	approveMemberId; /* 审核人会员ID */
	private String	approveName; /* 审核人姓名 */

	// Constructor
	public EntBrandAuthApplyDTO() {
	}

	/**
	 * full Constructor
	 */
	public EntBrandAuthApplyDTO(Long brandApplyId, Long memberId, Integer categoryId, String categoryNamePath, String categoryIdPath, String brandName, Integer brandId, Integer status, Date createTime, Long createAcctId, Long createMemberId, String createName, Date auditTime, String approveDesc, Long approveAcctId, Long approveMemberId, String approveName) {
		this.brandApplyId = brandApplyId;
		this.memberId = memberId;
		this.categoryId = categoryId;
		this.categoryNamePath = categoryNamePath;
		this.categoryIdPath = categoryIdPath;
		this.brandName = brandName;
		this.brandId = brandId;
		this.status = status;
		this.createTime = createTime;
		this.createAcctId = createAcctId;
		this.createMemberId = createMemberId;
		this.createName = createName;
		this.auditTime = auditTime;
		this.approveDesc = approveDesc;
		this.approveAcctId = approveAcctId;
		this.approveMemberId = approveMemberId;
		this.approveName = approveName;
	}

	public Long getBrandApplyId() {
		return brandApplyId;
	}

	public void setBrandApplyId(Long brandApplyId) {
		this.brandApplyId = brandApplyId;
	}
	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}
	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryNamePath() {
		return categoryNamePath;
	}

	public void setCategoryNamePath(String categoryNamePath) {
		this.categoryNamePath = categoryNamePath;
	}
	public String getCategoryIdPath() {
		return categoryIdPath;
	}

	public void setCategoryIdPath(String categoryIdPath) {
		this.categoryIdPath = categoryIdPath;
	}
	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
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
	public Long getCreateMemberId() {
		return createMemberId;
	}

	public void setCreateMemberId(Long createMemberId) {
		this.createMemberId = createMemberId;
	}
	public String getCreateName() {
		return createName;
	}

	public void setCreateName(String createName) {
		this.createName = createName;
	}
	public Date getAuditTime() {
		return auditTime;
	}

	public void setAuditTime(Date auditTime) {
		this.auditTime = auditTime;
	}
	public String getApproveDesc() {
		return approveDesc;
	}

	public void setApproveDesc(String approveDesc) {
		this.approveDesc = approveDesc;
	}
	public Long getApproveAcctId() {
		return approveAcctId;
	}

	public void setApproveAcctId(Long approveAcctId) {
		this.approveAcctId = approveAcctId;
	}
	public Long getApproveMemberId() {
		return approveMemberId;
	}

	public void setApproveMemberId(Long approveMemberId) {
		this.approveMemberId = approveMemberId;
	}
	public String getApproveName() {
		return approveName;
	}

	public void setApproveName(String approveName) {
		this.approveName = approveName;
	}
	@Override
	public String toString() {
		return "EntBrandAuthApplyDTO [" + "brandApplyId=" + brandApplyId + ", memberId=" + memberId + ", categoryId=" + categoryId + ", categoryNamePath=" + categoryNamePath + ", categoryIdPath=" + categoryIdPath + ", brandName=" + brandName + ", brandId=" + brandId + ", status=" + status + ", createTime=" + createTime + ", createAcctId=" + createAcctId + ", createMemberId=" + createMemberId + ", createName=" + createName + ", auditTime=" + auditTime + ", approveDesc=" + approveDesc + ", approveAcctId=" + approveAcctId + ", approveMemberId=" + approveMemberId + ", approveName=" + approveName +  "]";
	}
}
