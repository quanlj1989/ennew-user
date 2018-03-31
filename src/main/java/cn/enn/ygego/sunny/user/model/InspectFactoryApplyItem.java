package cn.enn.ygego.sunny.user.model;

import java.io.Serializable;

/**
 * entity:InspectFactoryApplyItem
 * 
 * @author gencode
 */
public class InspectFactoryApplyItem implements Serializable {
	
	private static final long serialVersionUID = 930512946510602423L;
	
	private Long	applyItemId;		 /* 申请项目标识 */ 
	private Long	inspectMaterialId;		 /* 验厂物料ID */ 
	private Integer	projectId;		 /* 项目标识 */ 
	private String	projectName;		 /* 项目名称 */ 
	private String	certNum;		 /* 证书编号 */ 
	private Integer	parentItmeId;		 /* 父级项目标识 */ 
	private String	parentItemName;		 /* 父级项目名称 */ 
	private Integer	maxCount;		 /* 最大张数 */ 

	// Constructor
	public InspectFactoryApplyItem() {
	}

	/**
	 * full Constructor
	 */
	public InspectFactoryApplyItem(Long applyItemId, Long inspectMaterialId, Integer projectId, String projectName, String certNum, Integer parentItmeId, String parentItemName, Integer maxCount) {
		this.applyItemId = applyItemId;
		this.inspectMaterialId = inspectMaterialId;
		this.projectId = projectId;
		this.projectName = projectName;
		this.certNum = certNum;
		this.parentItmeId = parentItmeId;
		this.parentItemName = parentItemName;
		this.maxCount = maxCount;
	}

	public Long getApplyItemId() {
		return applyItemId;
	}

	public void setApplyItemId(Long applyItemId) {
		this.applyItemId = applyItemId;
	}

	public Long getInspectMaterialId() {
		return inspectMaterialId;
	}

	public void setInspectMaterialId(Long inspectMaterialId) {
		this.inspectMaterialId = inspectMaterialId;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getCertNum() {
		return certNum;
	}

	public void setCertNum(String certNum) {
		this.certNum = certNum;
	}

	public Integer getParentItmeId() {
		return parentItmeId;
	}

	public void setParentItmeId(Integer parentItmeId) {
		this.parentItmeId = parentItmeId;
	}

	public String getParentItemName() {
		return parentItemName;
	}

	public void setParentItemName(String parentItemName) {
		this.parentItemName = parentItemName;
	}

	public Integer getMaxCount() {
		return maxCount;
	}

	public void setMaxCount(Integer maxCount) {
		this.maxCount = maxCount;
	}

	@Override
	public String toString() {
		return "InspectFactoryApplyItem [" + "applyItemId=" + applyItemId+ ", inspectMaterialId=" + inspectMaterialId+ ", projectId=" + projectId+ ", projectName=" + projectName+ ", certNum=" + certNum+ ", parentItmeId=" + parentItmeId+ ", parentItemName=" + parentItemName+ ", maxCount=" + maxCount+  "]";
	}
}
