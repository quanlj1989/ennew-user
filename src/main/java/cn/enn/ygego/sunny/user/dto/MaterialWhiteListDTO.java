package cn.enn.ygego.sunny.user.dto;

import java.util.Date;
import java.io.Serializable;

/**
 * DTO:MaterialWhiteList
 * 
 * @author gencode
 * @date 2018-3-19
 */
public class MaterialWhiteListDTO implements Serializable {
	
	private static final long serialVersionUID = -4726632317233151840L;
	
	private Long	listId; /* 名单标识 */
	private Integer	categoryId; /* 类目ID */
	private String	categoryNamePath; /* 类目名称路径 */
	private String	categoryIdPath; /* 类目ID路径 */
	private Long	materialId; /* 物料ID */
	private String	materialName; /* 物料名称 */
	private String	attrIdSerial; /* 属性码序列 */
	private String	attrNameSerial; /* 属性名序列 */
	private Integer	listStatus; /* 名单状态 */
	private Long	buyerMemberId; /* 采购商会员ID */
	private String	buyerName; /* 采购商名称 */
	private Integer	buyerSettlementType; /* 采购方结算类型 */
	private Date	createTime; /* 创建时间 */
	private Long	createAcctId; /* 创建人账户ID */
	private String	createName; /* 创建人姓名 */

	// Constructor
	public MaterialWhiteListDTO() {
	}

	/**
	 * full Constructor
	 */
	public MaterialWhiteListDTO(Long listId, Integer categoryId, String categoryNamePath, String categoryIdPath, Long materialId, String materialName, String attrIdSerial, String attrNameSerial, Integer listStatus, Long buyerMemberId, String buyerName, Integer buyerSettlementType, Date createTime, Long createAcctId, String createName) {
		this.listId = listId;
		this.categoryId = categoryId;
		this.categoryNamePath = categoryNamePath;
		this.categoryIdPath = categoryIdPath;
		this.materialId = materialId;
		this.materialName = materialName;
		this.attrIdSerial = attrIdSerial;
		this.attrNameSerial = attrNameSerial;
		this.listStatus = listStatus;
		this.buyerMemberId = buyerMemberId;
		this.buyerName = buyerName;
		this.buyerSettlementType = buyerSettlementType;
		this.createTime = createTime;
		this.createAcctId = createAcctId;
		this.createName = createName;
	}

	public Long getListId() {
		return listId;
	}

	public void setListId(Long listId) {
		this.listId = listId;
	}
	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryNamePath() {
		return categoryNamePath;
	}

	public void setCategoryNamePath(String categoryNamePath) {
		this.categoryNamePath = categoryNamePath;
	}
	public String getCategoryIdPath() {
		return categoryIdPath;
	}

	public void setCategoryIdPath(String categoryIdPath) {
		this.categoryIdPath = categoryIdPath;
	}
	public Long getMaterialId() {
		return materialId;
	}

	public void setMaterialId(Long materialId) {
		this.materialId = materialId;
	}
	public String getMaterialName() {
		return materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}
	public String getAttrIdSerial() {
		return attrIdSerial;
	}

	public void setAttrIdSerial(String attrIdSerial) {
		this.attrIdSerial = attrIdSerial;
	}
	public String getAttrNameSerial() {
		return attrNameSerial;
	}

	public void setAttrNameSerial(String attrNameSerial) {
		this.attrNameSerial = attrNameSerial;
	}
	public Integer getListStatus() {
		return listStatus;
	}

	public void setListStatus(Integer listStatus) {
		this.listStatus = listStatus;
	}
	public Long getBuyerMemberId() {
		return buyerMemberId;
	}

	public void setBuyerMemberId(Long buyerMemberId) {
		this.buyerMemberId = buyerMemberId;
	}
	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}
	public Integer getBuyerSettlementType() {
		return buyerSettlementType;
	}

	public void setBuyerSettlementType(Integer buyerSettlementType) {
		this.buyerSettlementType = buyerSettlementType;
	}
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Long getCreateAcctId() {
		return createAcctId;
	}

	public void setCreateAcctId(Long createAcctId) {
		this.createAcctId = createAcctId;
	}
	public String getCreateName() {
		return createName;
	}

	public void setCreateName(String createName) {
		this.createName = createName;
	}
	@Override
	public String toString() {
		return "MaterialWhiteListDTO [" + "listId=" + listId + ", categoryId=" + categoryId + ", categoryNamePath=" + categoryNamePath + ", categoryIdPath=" + categoryIdPath + ", materialId=" + materialId + ", materialName=" + materialName + ", attrIdSerial=" + attrIdSerial + ", attrNameSerial=" + attrNameSerial + ", listStatus=" + listStatus + ", buyerMemberId=" + buyerMemberId + ", buyerName=" + buyerName + ", buyerSettlementType=" + buyerSettlementType + ", createTime=" + createTime + ", createAcctId=" + createAcctId + ", createName=" + createName +  "]";
	}
}
