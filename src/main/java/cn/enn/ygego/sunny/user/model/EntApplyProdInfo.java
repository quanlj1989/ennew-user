package cn.enn.ygego.sunny.user.model;

import java.io.Serializable;

/**
 * entity:EntApplyProdInfo
 * 
 * @author gencode
 */
public class EntApplyProdInfo implements Serializable {
	
	private static final long serialVersionUID = 6393545996973188233L;
	
	private Long	applyProdId;		 /* 申请产品ID */ 
	private Long	applyId;		 /* 申请ID */ 
	private Integer	categoryId;		 /* 类目ID */ 
	private Long	producerMemberId;		 /* 生产商会员ID */ 
	private String	producerName;		 /* 生产商名称 */ 
	private String	attrNameSerial;		 /* 属性名序列 */ 
	private Long	materialId;		 /* 物料ID */ 
	private Long	brandId;		 /* 品牌ID */ 
	private String	brandName;		 /* 品牌名称 */ 

	// Constructor
	public EntApplyProdInfo() {
	}

	/**
	 * full Constructor
	 */
	public EntApplyProdInfo(Long applyProdId, Long applyId, Integer categoryId, Long producerMemberId, String producerName, String attrNameSerial, Long materialId, Long brandId, String brandName) {
		this.applyProdId = applyProdId;
		this.applyId = applyId;
		this.categoryId = categoryId;
		this.producerMemberId = producerMemberId;
		this.producerName = producerName;
		this.attrNameSerial = attrNameSerial;
		this.materialId = materialId;
		this.brandId = brandId;
		this.brandName = brandName;
	}

	public Long getApplyProdId() {
		return applyProdId;
	}

	public void setApplyProdId(Long applyProdId) {
		this.applyProdId = applyProdId;
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

	public String getAttrNameSerial() {
		return attrNameSerial;
	}

	public void setAttrNameSerial(String attrNameSerial) {
		this.attrNameSerial = attrNameSerial;
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

	@Override
	public String toString() {
		return "EntApplyProdInfo [" + "applyProdId=" + applyProdId+ ", applyId=" + applyId+ ", categoryId=" + categoryId+ ", producerMemberId=" + producerMemberId+ ", producerName=" + producerName+ ", attrNameSerial=" + attrNameSerial+ ", materialId=" + materialId+ ", brandId=" + brandId+ ", brandName=" + brandName+  "]";
	}
}
