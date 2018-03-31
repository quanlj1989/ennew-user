package cn.enn.ygego.sunny.user.dto;

import java.io.Serializable;

/**
 * DTO:InspectFactoryMaterial
 * 
 * @author gencode
 * @date 2018-3-30
 */
public class InspectFactoryMaterialDTO implements Serializable {
	
	private static final long serialVersionUID = -7857906270664161191L;
	
	private Long	inspectMaterialId; /* 验厂物料ID */
	private Long	applyId; /* 申请标识 */
	private Long	brandId; /* 品牌ID */
	private String	dictBrand; /* 品牌 */
	private Long	materialId; /* 物料ID */
	private String	materialCode; /* 物料编码 */
	private String	materialName; /* 物料名称 */

	// Constructor
	public InspectFactoryMaterialDTO() {
	}

	/**
	 * full Constructor
	 */
	public InspectFactoryMaterialDTO(Long inspectMaterialId, Long applyId, Long brandId, String dictBrand, Long materialId, String materialCode, String materialName) {
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
		return "InspectFactoryMaterialDTO [" + "inspectMaterialId=" + inspectMaterialId + ", applyId=" + applyId + ", brandId=" + brandId + ", dictBrand=" + dictBrand + ", materialId=" + materialId + ", materialCode=" + materialCode + ", materialName=" + materialName +  "]";
	}
}
