package cn.enn.ygego.sunny.user.model;

import java.util.Date;
import java.io.Serializable;

/**
 * entity:FunctionManage
 * 
 * @author gencode
 */
public class FunctionManage implements Serializable {
	
	private static final long serialVersionUID = -9060855026677813416L;
	
	private Long	functionId;		 /* 功能标识 */ 
	private Long	appId;		 /* 应用标识 */ 
	private String	functionCode;		 /* 功能编码 */ 
	private String	functionTitle;		 /* 功能名称 */ 
	private Integer	functionState;		 /* 功能状态 */ 
	private String	functionDesc;		 /* 功能描述 */ 
	private Integer	operStatistics;		 /* 操作统计 */ 
	private String	idFullPath;		 /* 标识全路径 */ 
	private String	titleFullPath;		 /* 名称全路径 */ 
	private Integer	isLastLevel;		 /* 是否末级 */ 
	private Long	parentApplicationId;		 /* 父级功能标识 */ 
	private Date	createTime;		 /* 创建时间 */ 
	private Date	updateTime;		 /* 更新时间 */ 
	private Integer	isDelete;		 /* 是否删除 */ 

	// Constructor
	public FunctionManage() {
	}

	/**
	 * full Constructor
	 */
	public FunctionManage(Long functionId, Long appId, String functionCode, String functionTitle, Integer functionState, String functionDesc, Integer operStatistics, String idFullPath, String titleFullPath, Integer isLastLevel, Long parentApplicationId, Date createTime, Date updateTime, Integer isDelete) {
		this.functionId = functionId;
		this.appId = appId;
		this.functionCode = functionCode;
		this.functionTitle = functionTitle;
		this.functionState = functionState;
		this.functionDesc = functionDesc;
		this.operStatistics = operStatistics;
		this.idFullPath = idFullPath;
		this.titleFullPath = titleFullPath;
		this.isLastLevel = isLastLevel;
		this.parentApplicationId = parentApplicationId;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.isDelete = isDelete;
	}

	public Long getFunctionId() {
		return functionId;
	}

	public void setFunctionId(Long functionId) {
		this.functionId = functionId;
	}

	public Long getAppId() {
		return appId;
	}

	public void setAppId(Long appId) {
		this.appId = appId;
	}

	public String getFunctionCode() {
		return functionCode;
	}

	public void setFunctionCode(String functionCode) {
		this.functionCode = functionCode;
	}

	public String getFunctionTitle() {
		return functionTitle;
	}

	public void setFunctionTitle(String functionTitle) {
		this.functionTitle = functionTitle;
	}

	public Integer getFunctionState() {
		return functionState;
	}

	public void setFunctionState(Integer functionState) {
		this.functionState = functionState;
	}

	public String getFunctionDesc() {
		return functionDesc;
	}

	public void setFunctionDesc(String functionDesc) {
		this.functionDesc = functionDesc;
	}

	public Integer getOperStatistics() {
		return operStatistics;
	}

	public void setOperStatistics(Integer operStatistics) {
		this.operStatistics = operStatistics;
	}

	public String getIdFullPath() {
		return idFullPath;
	}

	public void setIdFullPath(String idFullPath) {
		this.idFullPath = idFullPath;
	}

	public String getTitleFullPath() {
		return titleFullPath;
	}

	public void setTitleFullPath(String titleFullPath) {
		this.titleFullPath = titleFullPath;
	}

	public Integer getIsLastLevel() {
		return isLastLevel;
	}

	public void setIsLastLevel(Integer isLastLevel) {
		this.isLastLevel = isLastLevel;
	}

	public Long getParentApplicationId() {
		return parentApplicationId;
	}

	public void setParentApplicationId(Long parentApplicationId) {
		this.parentApplicationId = parentApplicationId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	@Override
	public String toString() {
		return "FunctionManage [" + "functionId=" + functionId+ ", appId=" + appId+ ", functionCode=" + functionCode+ ", functionTitle=" + functionTitle+ ", functionState=" + functionState+ ", functionDesc=" + functionDesc+ ", operStatistics=" + operStatistics+ ", idFullPath=" + idFullPath+ ", titleFullPath=" + titleFullPath+ ", isLastLevel=" + isLastLevel+ ", parentApplicationId=" + parentApplicationId+ ", createTime=" + createTime+ ", updateTime=" + updateTime+ ", isDelete=" + isDelete+  "]";
	}
}
