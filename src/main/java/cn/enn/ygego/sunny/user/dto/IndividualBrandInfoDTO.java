package cn.enn.ygego.sunny.user.dto;

import java.util.Date;
import java.io.Serializable;

/**
 * DTO:IndividualBrandInfo
 * 
 * @author gencode
 * @date 2018-3-19
 */
public class IndividualBrandInfoDTO implements Serializable {
	
	private static final long serialVersionUID = -5180343356630558873L;
	
	private Long	individualBrandId; /* 个人品牌ID */
	private Long	memberId; /* 会员ID */
	private Integer	categoryId; /* 类目ID */
	private String	categoryNamePath; /* 类目名称路径 */
	private String	categoryIdPath; /* 类目ID路径 */
	private Integer	brandId; /* 品牌ID */
	private String	brandName; /* 品牌名称 */
	private String	brandDesc; /* 品牌描述 */
	private Date	createTime; /* 创建时间 */
	private Date	modTime; /* 修改时间 */
	private Long	createAcctId; /* 创建人账户ID */
	private String	createName; /* 创建人姓名 */

	// Constructor
	public IndividualBrandInfoDTO() {
	}

	/**
	 * full Constructor
	 */
	public IndividualBrandInfoDTO(Long individualBrandId, Long memberId, Integer categoryId, String categoryNamePath, String categoryIdPath, Integer brandId, String brandName, String brandDesc, Date createTime, Date modTime, Long createAcctId, String createName) {
		this.individualBrandId = individualBrandId;
		this.memberId = memberId;
		this.categoryId = categoryId;
		this.categoryNamePath = categoryNamePath;
		this.categoryIdPath = categoryIdPath;
		this.brandId = brandId;
		this.brandName = brandName;
		this.brandDesc = brandDesc;
		this.createTime = createTime;
		this.modTime = modTime;
		this.createAcctId = createAcctId;
		this.createName = createName;
	}

	public Long getIndividualBrandId() {
		return individualBrandId;
	}

	public void setIndividualBrandId(Long individualBrandId) {
		this.individualBrandId = individualBrandId;
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
	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
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
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getModTime() {
		return modTime;
	}

	public void setModTime(Date modTime) {
		this.modTime = modTime;
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
		return "IndividualBrandInfoDTO [" + "individualBrandId=" + individualBrandId + ", memberId=" + memberId + ", categoryId=" + categoryId + ", categoryNamePath=" + categoryNamePath + ", categoryIdPath=" + categoryIdPath + ", brandId=" + brandId + ", brandName=" + brandName + ", brandDesc=" + brandDesc + ", createTime=" + createTime + ", modTime=" + modTime + ", createAcctId=" + createAcctId + ", createName=" + createName +  "]";
	}
}
