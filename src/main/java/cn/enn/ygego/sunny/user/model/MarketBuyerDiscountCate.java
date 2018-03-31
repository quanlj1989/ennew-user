package cn.enn.ygego.sunny.user.model;

import java.util.Date;
import java.io.Serializable;

/**
 * ClassName: MarketBuyerDiscountCate
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
*/
public class MarketBuyerDiscountCate implements Serializable {
	
	private Long	discountId;		 /* 折扣ID */ 
	private Long	discountBuyerId;		 /* 优惠采购商ID */ 
	private Long	categoryId;		 /* 类目ID */ 
	private String	categoryName;		 /* 类目名称 */ 
	private String	categoryNamePath;		 /* 类目名称路径 */ 
	private String	categoryIdPath;		 /* 类目ID路径 */ 
	private Date	effDate;		 /* 生效日期 */ 
	private Date	expDate;		 /* 失效日期 */ 
	private Integer	standardPremiumRates;		 /* 标准费率 */ 
	private Integer	discountNum;		 /* 优惠折扣 */ 
	private Integer	actualCharge;		 /* 实际费率 */ 
	private Integer	status;		 /* 状态 */ 
	private Date	createTime;		 /* 创建时间 */ 
	private Long	createMemberId;		 /* 创建人会员ID */ 
	private Long	createAcctId;		 /* 创建人账户ID */ 
	private String	createName;		 /* 创建人姓名 */ 
	private Date	modTime;		 /* 修改时间 */ 

	// Constructor
	public MarketBuyerDiscountCate() {
	}

	/**
	 * full Constructor
	 */
	public MarketBuyerDiscountCate(Long discountId, Long discountBuyerId, Long categoryId, String categoryName, String categoryNamePath, String categoryIdPath, Date effDate, Date expDate, Integer standardPremiumRates, Integer discountNum, Integer actualCharge, Integer status, Date createTime, Long createMemberId, Long createAcctId, String createName, Date modTime) {
		this.discountId = discountId;
		this.discountBuyerId = discountBuyerId;
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.categoryNamePath = categoryNamePath;
		this.categoryIdPath = categoryIdPath;
		this.effDate = effDate;
		this.expDate = expDate;
		this.standardPremiumRates = standardPremiumRates;
		this.discountNum = discountNum;
		this.actualCharge = actualCharge;
		this.status = status;
		this.createTime = createTime;
		this.createMemberId = createMemberId;
		this.createAcctId = createAcctId;
		this.createName = createName;
		this.modTime = modTime;
	}

	public Long getDiscountId() {
		return discountId;
	}

	public void setDiscountId(Long discountId) {
		this.discountId = discountId;
	}

	public Long getDiscountBuyerId() {
		return discountBuyerId;
	}

	public void setDiscountBuyerId(Long discountBuyerId) {
		this.discountBuyerId = discountBuyerId;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
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

	public Date getEffDate() {
		return effDate;
	}

	public void setEffDate(Date effDate) {
		this.effDate = effDate;
	}

	public Date getExpDate() {
		return expDate;
	}

	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}

	public Integer getStandardPremiumRates() {
		return standardPremiumRates;
	}

	public void setStandardPremiumRates(Integer standardPremiumRates) {
		this.standardPremiumRates = standardPremiumRates;
	}

	public Integer getDiscountNum() {
		return discountNum;
	}

	public void setDiscountNum(Integer discountNum) {
		this.discountNum = discountNum;
	}

	public Integer getActualCharge() {
		return actualCharge;
	}

	public void setActualCharge(Integer actualCharge) {
		this.actualCharge = actualCharge;
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

	public Date getModTime() {
		return modTime;
	}

	public void setModTime(Date modTime) {
		this.modTime = modTime;
	}

	@Override
	public String toString() {
		return "MarketBuyerDiscountCate [" + "discountId=" + discountId + ", discountBuyerId=" + discountBuyerId + ", categoryId=" + categoryId + ", categoryName=" + categoryName + ", categoryNamePath=" + categoryNamePath + ", categoryIdPath=" + categoryIdPath + ", effDate=" + effDate + ", expDate=" + expDate + ", standardPremiumRates=" + standardPremiumRates + ", discountNum=" + discountNum + ", actualCharge=" + actualCharge + ", status=" + status + ", createTime=" + createTime + ", createMemberId=" + createMemberId + ", createAcctId=" + createAcctId + ", createName=" + createName + ", modTime=" + modTime +  "]";
	}
}
