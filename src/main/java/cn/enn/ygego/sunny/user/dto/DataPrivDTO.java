package cn.enn.ygego.sunny.user.dto;

import java.util.Date;
import java.io.Serializable;

/**
 * DTO:DataPriv
 * 
 * @author gencode
 * @date 2018-3-19
 */
public class DataPrivDTO implements Serializable {
	
	private static final long serialVersionUID = -4039225795953569806L;
	
	private Long	privId; /* 权限标识 */
	private Long	relaId; /* 关系标识 */
	private Integer	privType; /* 权限类型 */
	private Long	linkDataId; /* 数据链路标识 */
	private Long	functionId; /* 功能标识 */
	private Long	operId; /* 操作标识 */
	private String	privCode; /* 权限编号 */
	private String	privTitle; /* 权限名称 */
	private String	dataLink; /* 数据链路 */
	private Integer	contentType; /* 内容类型 */
	private String	privContent; /* 权限内容 */
	private String	valueRange; /* 值集范围 */
	private String	dataPriTitle; /* 数据主键名称 */
	private String	dataRange; /* 数据范围 */
	private Date	createTime; /* 创建时间 */
	private Date	updateTime; /* 更新时间 */
	private Integer	isDelete; /* 是否删除 */

	// Constructor
	public DataPrivDTO() {
	}

	/**
	 * full Constructor
	 */
	public DataPrivDTO(Long privId, Long relaId, Integer privType, Long linkDataId, Long functionId, Long operId, String privCode, String privTitle, String dataLink, Integer contentType, String privContent, String valueRange, String dataPriTitle, String dataRange, Date createTime, Date updateTime, Integer isDelete) {
		this.privId = privId;
		this.relaId = relaId;
		this.privType = privType;
		this.linkDataId = linkDataId;
		this.functionId = functionId;
		this.operId = operId;
		this.privCode = privCode;
		this.privTitle = privTitle;
		this.dataLink = dataLink;
		this.contentType = contentType;
		this.privContent = privContent;
		this.valueRange = valueRange;
		this.dataPriTitle = dataPriTitle;
		this.dataRange = dataRange;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.isDelete = isDelete;
	}

	public Long getPrivId() {
		return privId;
	}

	public void setPrivId(Long privId) {
		this.privId = privId;
	}
	public Long getRelaId() {
		return relaId;
	}

	public void setRelaId(Long relaId) {
		this.relaId = relaId;
	}
	public Integer getPrivType() {
		return privType;
	}

	public void setPrivType(Integer privType) {
		this.privType = privType;
	}
	public Long getLinkDataId() {
		return linkDataId;
	}

	public void setLinkDataId(Long linkDataId) {
		this.linkDataId = linkDataId;
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
	public String getPrivCode() {
		return privCode;
	}

	public void setPrivCode(String privCode) {
		this.privCode = privCode;
	}
	public String getPrivTitle() {
		return privTitle;
	}

	public void setPrivTitle(String privTitle) {
		this.privTitle = privTitle;
	}
	public String getDataLink() {
		return dataLink;
	}

	public void setDataLink(String dataLink) {
		this.dataLink = dataLink;
	}
	public Integer getContentType() {
		return contentType;
	}

	public void setContentType(Integer contentType) {
		this.contentType = contentType;
	}
	public String getPrivContent() {
		return privContent;
	}

	public void setPrivContent(String privContent) {
		this.privContent = privContent;
	}
	public String getValueRange() {
		return valueRange;
	}

	public void setValueRange(String valueRange) {
		this.valueRange = valueRange;
	}
	public String getDataPriTitle() {
		return dataPriTitle;
	}

	public void setDataPriTitle(String dataPriTitle) {
		this.dataPriTitle = dataPriTitle;
	}
	public String getDataRange() {
		return dataRange;
	}

	public void setDataRange(String dataRange) {
		this.dataRange = dataRange;
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
		return "DataPrivDTO [" + "privId=" + privId + ", relaId=" + relaId + ", privType=" + privType + ", linkDataId=" + linkDataId + ", functionId=" + functionId + ", operId=" + operId + ", privCode=" + privCode + ", privTitle=" + privTitle + ", dataLink=" + dataLink + ", contentType=" + contentType + ", privContent=" + privContent + ", valueRange=" + valueRange + ", dataPriTitle=" + dataPriTitle + ", dataRange=" + dataRange + ", createTime=" + createTime + ", updateTime=" + updateTime + ", isDelete=" + isDelete +  "]";
	}
}
