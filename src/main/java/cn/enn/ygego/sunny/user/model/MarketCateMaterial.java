package cn.enn.ygego.sunny.user.model;

import java.util.Date;
import java.io.Serializable;

/**
 * ClassName: MarketCateMaterial
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
*/
public class MarketCateMaterial implements Serializable {
	
	private Long	cateMaterialId;		 /* 类目物料ID */ 
	private Long	marketId;		 /* 超市ID */ 
	private Long	memberId;		 /* 会员ID */ 
	private Integer	applyType;		 /* 申请类型 */ 
	private String	categoryNamePath;		 /* 类目名称路径 */ 
	private String	categoryIdPath;		 /* 类目ID路径 */ 
	private Integer	categoryId;		 /* 类目ID */ 
	private Long	materialId;		 /* 物料ID */ 
	private Long	brandId;		 /* 品牌ID */ 
	private String	brandName;		 /* 品牌名称 */ 
	private Long	producerMemberId;		 /* 生产商会员ID */ 
	private String	producerName;		 /* 生产商名称 */ 
	private String	materialCode;		 /* 物料编码 */ 
	private String	attrNameSerial;		 /* 属性名序列 */ 
	private Date	createTime;		 /* 创建时间 */ 
	private Long	createAcctId;		 /* 创建人账户ID */ 
	private String	createName;		 /* 创建人姓名 */ 

	// Constructor
	public MarketCateMaterial() {
	}

	/**
	 * full Constructor
	 */
	public MarketCateMaterial(Long cateMaterialId, Long marketId, Long memberId, Integer applyType, String categoryNamePath, String categoryIdPath, Integer categoryId, Long materialId, Long brandId, String brandName, Long producerMemberId, String producerName, String materialCode, String attrNameSerial, Date createTime, Long createAcctId, String createName) {
		this.cateMaterialId = cateMaterialId;
		this.marketId = marketId;
		this.memberId = memberId;
		this.applyType = applyType;
		this.categoryNamePath = categoryNamePath;
		this.categoryIdPath = categoryIdPath;
		this.categoryId = categoryId;
		this.materialId = materialId;
		this.brandId = brandId;
		this.brandName = brandName;
		this.producerMemberId = producerMemberId;
		this.producerName = producerName;
		this.materialCode = materialCode;
		this.attrNameSerial = attrNameSerial;
		this.createTime = createTime;
		this.createAcctId = createAcctId;
		this.createName = createName;
	}

	public Long getCateMaterialId() {
		return cateMaterialId;
	}

	public void setCateMaterialId(Long cateMaterialId) {
		this.cateMaterialId = cateMaterialId;
	}

	public Long getMarketId() {
		return marketId;
	}

	public void setMarketId(Long marketId) {
		this.marketId = marketId;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public Integer getApplyType() {
		return applyType;
	}

	public void setApplyType(Integer applyType) {
		this.applyType = applyType;
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

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public Long getMaterialId() {
		return materialId;
	}

	public void setMaterialId(Long materialId) {
		this.materialId = materialId;
	}

	public Long getBrandId() {
		return brandId;
	}

	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Long getProducerMemberId() {
		return producerMemberId;
	}

	public void setProducerMemberId(Long producerMemberId) {
		this.producerMemberId = producerMemberId;
	}

	public String getProducerName() {
		return producerName;
	}

	public void setProducerName(String producerName) {
		this.producerName = producerName;
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
		return "MarketCateMaterial [" + "cateMaterialId=" + cateMaterialId + ", marketId=" + marketId + ", memberId=" + memberId + ", applyType=" + applyType + ", categoryNamePath=" + categoryNamePath + ", categoryIdPath=" + categoryIdPath + ", categoryId=" + categoryId + ", materialId=" + materialId + ", brandId=" + brandId + ", brandName=" + brandName + ", producerMemberId=" + producerMemberId + ", producerName=" + producerName + ", materialCode=" + materialCode + ", attrNameSerial=" + attrNameSerial + ", createTime=" + createTime + ", createAcctId=" + createAcctId + ", createName=" + createName +  "]";
	}
}
