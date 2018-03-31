package cn.enn.ygego.sunny.user.model;

import java.util.Date;
import java.io.Serializable;

/**
 * ClassName: MarketDiscountMaterial
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
*/
public class MarketDiscountMaterial implements Serializable {
	
	private Long	chargeId;		 /* 费率ID */ 
	private Long	marketId;		 /* 超市ID */ 
	private Long	categoryId;		 /* 类目ID */ 
	private String	categoryName;		 /* 类目名称 */ 
	private String	categoryNamePath;		 /* 类目名称路径 */ 
	private String	categoryIdPath;		 /* 类目ID路径 */ 
	private Long	materialId;		 /* 物料ID */ 
	private String	materialName;		 /* 物料名称 */ 
	private String	materialCode;		 /* 物料编码 */ 
	private String	attrNameSerial;		 /* 属性名序列 */ 
	private Integer	standardPremiumRates;		 /* 标准费率 */ 
	private Integer	discountNum;		 /* 优惠折扣 */ 
	private Integer	actualCharge;		 /* 实际费率 */ 
	private Integer	status;		 /* 状态 */ 
	private String	memo;		 /* 备注 */ 
	private Date	createTime;		 /* 创建时间 */ 
	private Long	createMemberId;		 /* 创建人会员ID */ 
	private Long	createAcctId;		 /* 创建人账户ID */ 
	private String	createName;		 /* 创建人姓名 */ 
	private Date	modTime;		 /* 修改时间 */ 

	// Constructor
	public MarketDiscountMaterial() {
	}

	/**
	 * full Constructor
	 */
	public MarketDiscountMaterial(Long chargeId, Long marketId, Long categoryId, String categoryName, String categoryNamePath, String categoryIdPath, Long materialId, String materialName, String materialCode, String attrNameSerial, Integer standardPremiumRates, Integer discountNum, Integer actualCharge, Integer status, String memo, Date createTime, Long createMemberId, Long createAcctId, String createName, Date modTime) {
		this.chargeId = chargeId;
		this.marketId = marketId;
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.categoryNamePath = categoryNamePath;
		this.categoryIdPath = categoryIdPath;
		this.materialId = materialId;
		this.materialName = materialName;
		this.materialCode = materialCode;
		this.attrNameSerial = attrNameSerial;
		this.standardPremiumRates = standardPremiumRates;
		this.discountNum = discountNum;
		this.actualCharge = actualCharge;
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

	public Long getMaterialId() {
		return materialId;
	}

	public void setMaterialId(Long materialId) {
		this.materialId = materialId;
	}

	public String getMaterialName() {
		return materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

	public String getMaterialCode() {
		return materialCode;
	}

	public void setMaterialCode(String materialCode) {
		this.materialCode = materialCode;
	}

	public String getAttrNameSerial() {
		return attrNameSerial;
	}

	public void setAttrNameSerial(String attrNameSerial) {
		this.attrNameSerial = attrNameSerial;
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
		return "MarketDiscountMaterial [" + "chargeId=" + chargeId + ", marketId=" + marketId + ", categoryId=" + categoryId + ", categoryName=" + categoryName + ", categoryNamePath=" + categoryNamePath + ", categoryIdPath=" + categoryIdPath + ", materialId=" + materialId + ", materialName=" + materialName + ", materialCode=" + materialCode + ", attrNameSerial=" + attrNameSerial + ", standardPremiumRates=" + standardPremiumRates + ", discountNum=" + discountNum + ", actualCharge=" + actualCharge + ", status=" + status + ", memo=" + memo + ", createTime=" + createTime + ", createMemberId=" + createMemberId + ", createAcctId=" + createAcctId + ", createName=" + createName + ", modTime=" + modTime +  "]";
	}
}
