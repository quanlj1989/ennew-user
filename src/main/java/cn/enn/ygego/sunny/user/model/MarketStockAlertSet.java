package cn.enn.ygego.sunny.user.model;

import java.util.Date;
import java.math.BigDecimal;
import java.io.Serializable;

/**
 * ClassName: MarketStockAlertSet
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
*/
public class MarketStockAlertSet implements Serializable {
	
	private Long	alertSetId;		 /* 预警设置ID */ 
	private Long	joinId;		 /* 入驻ID */ 
	private Long	memberId;		 /* 会员ID */ 
	private Long	storageId;		 /* 仓库ID */ 
	private String	materialCode;		 /* 物料编码 */ 
	private String	materialName;		 /* 物料名称 */ 
	private String	attrNameSerial;		 /* 属性名序列 */ 
	private BigDecimal	stock;		 /* 库存 */ 
	private Integer	unitId;		 /* 单位ID */ 
	private String	unitName;		 /* 单位名称 */ 
	private Date	createTime;		 /* 创建时间 */ 
	private Long	createAcctId;		 /* 创建人账户ID */ 
	private String	createName;		 /* 创建人姓名 */ 

	// Constructor
	public MarketStockAlertSet() {
	}

	/**
	 * full Constructor
	 */
	public MarketStockAlertSet(Long alertSetId, Long joinId, Long memberId, Long storageId, String materialCode, String materialName, String attrNameSerial, BigDecimal stock, Integer unitId, String unitName, Date createTime, Long createAcctId, String createName) {
		this.alertSetId = alertSetId;
		this.joinId = joinId;
		this.memberId = memberId;
		this.storageId = storageId;
		this.materialCode = materialCode;
		this.materialName = materialName;
		this.attrNameSerial = attrNameSerial;
		this.stock = stock;
		this.unitId = unitId;
		this.unitName = unitName;
		this.createTime = createTime;
		this.createAcctId = createAcctId;
		this.createName = createName;
	}

	public Long getAlertSetId() {
		return alertSetId;
	}

	public void setAlertSetId(Long alertSetId) {
		this.alertSetId = alertSetId;
	}

	public Long getJoinId() {
		return joinId;
	}

	public void setJoinId(Long joinId) {
		this.joinId = joinId;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public Long getStorageId() {
		return storageId;
	}

	public void setStorageId(Long storageId) {
		this.storageId = storageId;
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

	public String getAttrNameSerial() {
		return attrNameSerial;
	}

	public void setAttrNameSerial(String attrNameSerial) {
		this.attrNameSerial = attrNameSerial;
	}

	public BigDecimal getStock() {
		return stock;
	}

	public void setStock(BigDecimal stock) {
		this.stock = stock;
	}

	public Integer getUnitId() {
		return unitId;
	}

	public void setUnitId(Integer unitId) {
		this.unitId = unitId;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
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
		return "MarketStockAlertSet [" + "alertSetId=" + alertSetId + ", joinId=" + joinId + ", memberId=" + memberId + ", storageId=" + storageId + ", materialCode=" + materialCode + ", materialName=" + materialName + ", attrNameSerial=" + attrNameSerial + ", stock=" + stock + ", unitId=" + unitId + ", unitName=" + unitName + ", createTime=" + createTime + ", createAcctId=" + createAcctId + ", createName=" + createName +  "]";
	}
}
