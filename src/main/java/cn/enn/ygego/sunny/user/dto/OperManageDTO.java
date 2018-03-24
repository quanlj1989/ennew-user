package cn.enn.ygego.sunny.user.dto;

import java.util.Date;
import java.io.Serializable;

/**
 * DTO:OperManage
 * 
 * @author gencode
 * @date 2018-3-19
 */
public class OperManageDTO implements Serializable {
	
	private static final long serialVersionUID = 758329476498675534L;
	
	private Long	operId; /* 操作标识 */
	private Long	functionId; /* 功能标识 */
	private Long	appId; /* 应用标识 */
	private String	operCode; /* 操作编码 */
	private String	operTitle; /* 操作名称 */
	private Integer	operState; /* 操作状态 */
	private String	operDesc; /* 操作描述 */
	private Date	createTime; /* 创建时间 */
	private Date	updateTime; /* 更新时间 */
	private Integer	isDelete; /* 是否删除 */

	// Constructor
	public OperManageDTO() {
	}

	/**
	 * full Constructor
	 */
	public OperManageDTO(Long operId, Long functionId, Long appId, String operCode, String operTitle, Integer operState, String operDesc, Date createTime, Date updateTime, Integer isDelete) {
		this.operId = operId;
		this.functionId = functionId;
		this.appId = appId;
		this.operCode = operCode;
		this.operTitle = operTitle;
		this.operState = operState;
		this.operDesc = operDesc;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.isDelete = isDelete;
	}

	public Long getOperId() {
		return operId;
	}

	public void setOperId(Long operId) {
		this.operId = operId;
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
	public String getOperCode() {
		return operCode;
	}

	public void setOperCode(String operCode) {
		this.operCode = operCode;
	}
	public String getOperTitle() {
		return operTitle;
	}

	public void setOperTitle(String operTitle) {
		this.operTitle = operTitle;
	}
	public Integer getOperState() {
		return operState;
	}

	public void setOperState(Integer operState) {
		this.operState = operState;
	}
	public String getOperDesc() {
		return operDesc;
	}

	public void setOperDesc(String operDesc) {
		this.operDesc = operDesc;
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
		return "OperManageDTO [" + "operId=" + operId + ", functionId=" + functionId + ", appId=" + appId + ", operCode=" + operCode + ", operTitle=" + operTitle + ", operState=" + operState + ", operDesc=" + operDesc + ", createTime=" + createTime + ", updateTime=" + updateTime + ", isDelete=" + isDelete +  "]";
	}
}
