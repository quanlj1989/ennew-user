/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */

package cn.enn.ygego.sunny.user.dto.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * DTO:OperManage
 * 
 * @author gencode
 * @date 2018-3-19
 */
public class OperLoginVO implements Serializable {

	private static final long serialVersionUID = 758329476498675534L;

	private Long	operId; /* 操作标识 */
	private String	operTitle; /* 操作名称 */
	private Long	functionId; /* 功能标识 */
	// Constructor
	public OperLoginVO() {
	}

	public Long getFunctionId() {
		return functionId;
	}

	public void setFunctionId(Long functionId) {
		this.functionId = functionId;
	}

	public Long getOperId() {
		return operId;
	}

	public void setOperId(Long operId) {
		this.operId = operId;
	}

	public String getOperTitle() {
		return operTitle;
	}

	public void setOperTitle(String operTitle) {
		this.operTitle = operTitle;
	}
}
