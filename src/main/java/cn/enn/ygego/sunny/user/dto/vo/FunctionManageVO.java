/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */

package cn.enn.ygego.sunny.user.dto.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * entity:FunctionManage
 * 
 * @author gencode
 */
public class FunctionManageVO implements Serializable {

	private static final long serialVersionUID = -9060855026677813416L;

	private Long	functionId;		 /* 功能标识 */
	private Long	appId;		 /* 应用标识 */
	private String	functionCode;		 /* 功能编码 */
	private String	functionTitle;		 /* 功能名称 */
	private Integer	isLastLevel;		 /* 是否末级 */
	private Long	parentApplicationId;		 /* 父级功能标识 */
	private List<OperLoginVO> operLoginVOS=new ArrayList<>();//操作列表

	// Constructor
	public FunctionManageVO() {
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

	public List<OperLoginVO> getOperLoginVOS() {
		return operLoginVOS;
	}

	public void setOperLoginVOS(List<OperLoginVO> operLoginVOS) {
		this.operLoginVOS = operLoginVOS;
	}
}
