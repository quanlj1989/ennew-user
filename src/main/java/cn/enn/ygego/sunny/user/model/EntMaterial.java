package cn.enn.ygego.sunny.user.model;

import java.io.Serializable;

/**
 * entity:EntMaterial
 * 
 * @author gencode
 */
public class EntMaterial implements Serializable {
	
	private static final long serialVersionUID = 1918871854394715697L;
	
	private Long	entMaterialId;		 /* 企业物料ID */ 
	private Long	entCateId;		 /* 企业类目ID */ 
	private Long	memberId;		 /* 会员ID */ 
	private Long	materialId;		 /* 物料ID */ 
	private Long	categoryId;		 /* 类目ID */ 
	private String	materialName;		 /* 物料名称 */ 
	private String	attrNameSerial;		 /* 属性名序列 */ 

	// Constructor
	public EntMaterial() {
	}

	/**
	 * full Constructor
	 */
	public EntMaterial(Long entMaterialId, Long entCateId, Long memberId, Long materialId, Long categoryId, String materialName, String attrNameSerial) {
		this.entMaterialId = entMaterialId;
		this.entCateId = entCateId;
		this.memberId = memberId;
		this.materialId = materialId;
		this.categoryId = categoryId;
		this.materialName = materialName;
		this.attrNameSerial = attrNameSerial;
	}

	public Long getEntMaterialId() {
		return entMaterialId;
	}

	public void setEntMaterialId(Long entMaterialId) {
		this.entMaterialId = entMaterialId;
	}

	public Long getEntCateId() {
		return entCateId;
	}

	public void setEntCateId(Long entCateId) {
		this.entCateId = entCateId;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public Long getMaterialId() {
		return materialId;
	}

	public void setMaterialId(Long materialId) {
		this.materialId = materialId;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getMaterialName() {
		return materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

	public String getAttrNameSerial() {
		return attrNameSerial;
	}

	public void setAttrNameSerial(String attrNameSerial) {
		this.attrNameSerial = attrNameSerial;
	}

	@Override
	public String toString() {
		return "EntMaterial [" + "entMaterialId=" + entMaterialId+ ", entCateId=" + entCateId+ ", memberId=" + memberId+ ", materialId=" + materialId+ ", categoryId=" + categoryId+ ", materialName=" + materialName+ ", attrNameSerial=" + attrNameSerial+  "]";
	}
}
