package cn.enn.ygego.sunny.user.dto;

import java.util.Date;
import java.io.Serializable;

/**
 * DTO:IndividualBrandApply
 * 
 * @author gencode
 * @date 2018-3-19
 */
public class IndividualBrandApplyDTO implements Serializable {
	
	private static final long serialVersionUID = 8474206125245029477L;
	
	private Integer	brandApplyId; /* 品牌申请ID */
	private Long	memberId; /* 会员ID */
	private Integer	categoryId; /* 类目ID */
	private String	categoryNamePath; /* 类目名称路径 */
	private String	categoryIdPath; /* 类目ID路径 */
	private String	brandName; /* 品牌名称 */
	private String	brandDesc; /* 品牌描述 */
	private Integer	status; /* 状态 */
	private Date	createTime; /* 创建时间 */
	private Long	createMemberId; /* 创建人会员ID */
	private Long	createAcctId; /* 创建人账户ID */
	private String	createName; /* 创建人姓名 */
	private Date	auditTime; /* 审核时间 */
	private String	approveDesc; /* 审核结果描述 */
	private Long	approveAcctId; /* 审核人账户ID */
	private Long	approveMemberId; /* 审核人会员ID */
	private String	approveName; /* 审核人姓名 */

	// Constructor
	public IndividualBrandApplyDTO() {
	}

	/**
	 * full Constructor
	 */
	public IndividualBrandApplyDTO(Integer brandApplyId, Long memberId, Integer categoryId, String categoryNamePath, String categoryIdPath, String brandName, String brandDesc, Integer status, Date createTime, Long createMemberId, Long createAcctId, String createName, Date auditTime, String approveDesc, Long approveAcctId, Long approveMemberId, String approveName) {
		this.brandApplyId = brandApplyId;
		this.memberId = memberId;
		this.categoryId = categoryId;
		this.categoryNamePath = categoryNamePath;
		this.categoryIdPath = categoryIdPath;
		this.brandName = brandName;
		this.brandDesc = brandDesc;
		this.status = status;
		this.createTime = createTime;
		this.createMemberId = createMemberId;
		this.createAcctId = createAcctId;
		this.createName = createName;
		this.auditTime = auditTime;
		this.approveDesc = approveDesc;
		this.approveAcctId = approveAcctId;
		this.approveMemberId = approveMemberId;
		this.approveName = approveName;
	}

	public Integer getBrandApplyId() {
		return brandApplyId;
	}

	public void setBrandApplyId(Integer brandApplyId) {
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
	public String getBrandDesc() {
		return brandDesc;
	}

	public void setBrandDesc(String brandDesc) {
		this.brandDesc = brandDesc;
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
		return "IndividualBrandApplyDTO [" + "brandApplyId=" + brandApplyId + ", memberId=" + memberId + ", categoryId=" + categoryId + ", categoryNamePath=" + categoryNamePath + ", categoryIdPath=" + categoryIdPath + ", brandName=" + brandName + ", brandDesc=" + brandDesc + ", status=" + status + ", createTime=" + createTime + ", createMemberId=" + createMemberId + ", createAcctId=" + createAcctId + ", createName=" + createName + ", auditTime=" + auditTime + ", approveDesc=" + approveDesc + ", approveAcctId=" + approveAcctId + ", approveMemberId=" + approveMemberId + ", approveName=" + approveName +  "]";
	}
}
