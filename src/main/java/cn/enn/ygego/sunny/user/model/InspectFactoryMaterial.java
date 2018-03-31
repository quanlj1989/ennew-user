package cn.enn.ygego.sunny.user.model;

import java.io.Serializable;

/**
 * entity:InspectFactoryMaterial
 * 
 * @author gencode
 */
public class InspectFactoryMaterial implements Serializable {
	
	private static final long serialVersionUID = -8814374493872862218L;
	
	private Long	inspectMaterialId;		 /* 验厂物料ID */ 
	private Long	applyId;		 /* 申请标识 */ 
	private Long	brandId;		 /* 品牌ID */ 
	private String	dictBrand;		 /* 品牌 */ 
	private Long	materialId;		 /* 物料ID */ 
	private String	materialCode;		 /* 物料编码 */ 
	private String	materialName;		 /* 物料名称 */ 

	// Constructor
	public InspectFactoryMaterial() {
	}

	/**
	 * full Constructor
	 */
	public InspectFactoryMaterial(Long inspectMaterialId, Long applyId, Long brandId, String dictBrand, Long materialId, String materialCode, String materialName) {
		this.inspectMaterialId = inspectMaterialId;
		this.applyId = applyId;
		this.brandId = brandId;
		this.dictBrand = dictBrand;
		this.materialId = materialId;
		this.materialCode = materialCode;
		this.materialName = materialName;
	}

	public Long getInspectMaterialId() {
		return inspectMaterialId;
	}

	public void setInspectMaterialId(Long inspectMaterialId) {
		this.inspectMaterialId = inspectMaterialId;
	}

	public Long getApplyId() {
		return applyId;
	}

	public void setApplyId(Long applyId) {
		this.applyId = applyId;
	}

	public Long getBrandId() {
		return brandId;
	}

	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}

	public String getDictBrand() {
		return dictBrand;
	}

	public void setDictBrand(String dictBrand) {
		this.dictBrand = dictBrand;
	}

	public Long getMaterialId() {
		return materialId;
	}

	public void setMaterialId(Long materialId) {
		this.materialId = materialId;
	}

	public String getMaterialCode() {
		return materialCode;
	}

	public void setMaterialCode(String materialCode) {
		this.materialCode = materialCode;
	}

	public String getMaterialName() {
		return materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

	@Override
	public String toString() {
		return "InspectFactoryMaterial [" + "inspectMaterialId=" + inspectMaterialId+ ", applyId=" + applyId+ ", brandId=" + brandId+ ", dictBrand=" + dictBrand+ ", materialId=" + materialId+ ", materialCode=" + materialCode+ ", materialName=" + materialName+  "]";
	}
}
