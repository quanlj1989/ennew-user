package cn.enn.ygego.sunny.user.model;

import java.util.Date;
import java.io.Serializable;

/**
 * ClassName: MarketCateStandardCharge
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
*/
public class MarketCateStandardCharge implements Serializable {
	
	private Long	chargeId;		 /* 费率ID */ 
	private Long	marketId;		 /* 超市ID */ 
	private Long	categoryId;		 /* 类目ID */ 
	private String	categoryName;		 /* 类目名称 */ 
	private String	categoryNamePath;		 /* 类目名称路径 */ 
	private String	categoryIdPath;		 /* 类目ID路径 */ 
	private Integer	standardPremiumRates;		 /* 标准费率 */ 
	private Integer	status;		 /* 状态 */ 
	private String	memo;		 /* 备注 */ 
	private Date	createTime;		 /* 创建时间 */ 
	private Long	createMemberId;		 /* 创建人会员ID */ 
	private Long	createAcctId;		 /* 创建人账户ID */ 
	private String	createName;		 /* 创建人姓名 */ 
	private Date	modTime;		 /* 修改时间 */ 

	// Constructor
	public MarketCateStandardCharge() {
	}

	/**
	 * full Constructor
	 */
	public MarketCateStandardCharge(Long chargeId, Long marketId, Long categoryId, String categoryName, String categoryNamePath, String categoryIdPath, Integer standardPremiumRates, Integer status, String memo, Date createTime, Long createMemberId, Long createAcctId, String createName, Date modTime) {
		this.chargeId = chargeId;
		this.marketId = marketId;
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.categoryNamePath = categoryNamePath;
		this.categoryIdPath = categoryIdPath;
		this.standardPremiumRates = standardPremiumRates;
		this.status = status;
		this.memo = memo;
		this.createTime = createTime;
		this.createMemberId = createMemberId;
		this.createAcctId = createAcctId;
		this.createName = createName;
		this.modTime = modTime;
	}

	public Long getChargeId() {
		return chargeId;
	}

	public void setChargeId(Long chargeId) {
		this.chargeId = chargeId;
	}

	public Long getMarketId() {
		return marketId;
	}

	public void setMarketId(Long marketId) {
		this.marketId = marketId;
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

	public Integer getStandardPremiumRates() {
		return standardPremiumRates;
	}

	public void setStandardPremiumRates(Integer standardPremiumRates) {
		this.standardPremiumRates = standardPremiumRates;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
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
		return "MarketCateStandardCharge [" + "chargeId=" + chargeId + ", marketId=" + marketId + ", categoryId=" + categoryId + ", categoryName=" + categoryName + ", categoryNamePath=" + categoryNamePath + ", categoryIdPath=" + categoryIdPath + ", standardPremiumRates=" + standardPremiumRates + ", status=" + status + ", memo=" + memo + ", createTime=" + createTime + ", createMemberId=" + createMemberId + ", createAcctId=" + createAcctId + ", createName=" + createName + ", modTime=" + modTime +  "]";
	}
}
