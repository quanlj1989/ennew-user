package cn.enn.ygego.sunny.user.model;

import java.util.Date;
import java.io.Serializable;

/**
 * entity:EntBrandInfo
 * 
 * @author gencode
 */
public class EntBrandInfo implements Serializable {
	
	private static final long serialVersionUID = -2821828286046082328L;
	
	private Long	entBrandId;		 /* 企业品牌ID */ 
	private Long	memberId;		 /* 会员ID */ 
	private Integer	categoryId;		 /* 类目ID */ 
	private String	categoryNamePath;		 /* 类目名称路径 */ 
	private String	categoryIdPath;		 /* 类目ID路径 */ 
	private Integer	brandId;		 /* 品牌ID */ 
	private String	brandName;		 /* 品牌名称 */ 
	private Integer	status;		 /* 状态 */ 
	private Date	createTime;		 /* 创建时间 */ 
	private Long	createAcctId;		 /* 创建人账户ID */ 
	private String	createName;		 /* 创建人姓名 */ 

	// Constructor
	public EntBrandInfo() {
	}

	/**
	 * full Constructor
	 */
	public EntBrandInfo(Long entBrandId, Long memberId, Integer categoryId, String categoryNamePath, String categoryIdPath, Integer brandId, String brandName, Integer status, Date createTime, Long createAcctId, String createName) {
		this.entBrandId = entBrandId;
		this.memberId = memberId;
		this.categoryId = categoryId;
		this.categoryNamePath = categoryNamePath;
		this.categoryIdPath = categoryIdPath;
		this.brandId = brandId;
		this.brandName = brandName;
		this.status = status;
		this.createTime = createTime;
		this.createAcctId = createAcctId;
		this.createName = createName;
	}

	public Long getEntBrandId() {
		return entBrandId;
	}

	public void setEntBrandId(Long entBrandId) {
		this.entBrandId = entBrandId;
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
		return "EntBrandInfo [" + "entBrandId=" + entBrandId+ ", memberId=" + memberId+ ", categoryId=" + categoryId+ ", categoryNamePath=" + categoryNamePath+ ", categoryIdPath=" + categoryIdPath+ ", brandId=" + brandId+ ", brandName=" + brandName+ ", status=" + status+ ", createTime=" + createTime+ ", createAcctId=" + createAcctId+ ", createName=" + createName+  "]";
	}
}
