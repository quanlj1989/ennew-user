package cn.enn.ygego.sunny.user.model;

import java.util.Date;
import java.io.Serializable;

/**
 * ClassName: MarketChargeStandard
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
*/
public class MarketChargeStandard implements Serializable {
	
	private Long	chargeStandardId;		 /* 收费标准ID */ 
	private Long	marketId;		 /* 超市ID */ 
	private Long	materialId;		 /* 物料ID */ 
	private String	materialName;		 /* 物料名称 */ 
	private String	attrNameSerial;		 /* 属性名序列 */ 
	private String	inStorageCharge;		 /* 入库费 */ 
	private String	outStorageCharge;		 /* 出库费 */ 
	private Date	createTime;		 /* 创建时间 */ 
	private Long	createMemberId;		 /* 创建人会员ID */ 
	private Long	createAcctId;		 /* 创建人账户ID */ 
	private String	createName;		 /* 创建人姓名 */ 

	// Constructor
	public MarketChargeStandard() {
	}

	/**
	 * full Constructor
	 */
	public MarketChargeStandard(Long chargeStandardId, Long marketId, Long materialId, String materialName, String attrNameSerial, String inStorageCharge, String outStorageCharge, Date createTime, Long createMemberId, Long createAcctId, String createName) {
		this.chargeStandardId = chargeStandardId;
		this.marketId = marketId;
		this.materialId = materialId;
		this.materialName = materialName;
		this.attrNameSerial = attrNameSerial;
		this.inStorageCharge = inStorageCharge;
		this.outStorageCharge = outStorageCharge;
		this.createTime = createTime;
		this.createMemberId = createMemberId;
		this.createAcctId = createAcctId;
		this.createName = createName;
	}

	public Long getChargeStandardId() {
		return chargeStandardId;
	}

	public void setChargeStandardId(Long chargeStandardId) {
		this.chargeStandardId = chargeStandardId;
	}

	public Long getMarketId() {
		return marketId;
	}

	public void setMarketId(Long marketId) {
		this.marketId = marketId;
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

	public String getAttrNameSerial() {
		return attrNameSerial;
	}

	public void setAttrNameSerial(String attrNameSerial) {
		this.attrNameSerial = attrNameSerial;
	}

	public String getInStorageCharge() {
		return inStorageCharge;
	}

	public void setInStorageCharge(String inStorageCharge) {
		this.inStorageCharge = inStorageCharge;
	}

	public String getOutStorageCharge() {
		return outStorageCharge;
	}

	public void setOutStorageCharge(String outStorageCharge) {
		this.outStorageCharge = outStorageCharge;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getCreateMemberId() {
		return createMemberId;
	}

	public void setCreateMemberId(Long createMemberId) {
		this.createMemberId = createMemberId;
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
		return "MarketChargeStandard [" + "chargeStandardId=" + chargeStandardId + ", marketId=" + marketId + ", materialId=" + materialId + ", materialName=" + materialName + ", attrNameSerial=" + attrNameSerial + ", inStorageCharge=" + inStorageCharge + ", outStorageCharge=" + outStorageCharge + ", createTime=" + createTime + ", createMemberId=" + createMemberId + ", createAcctId=" + createAcctId + ", createName=" + createName +  "]";
	}
}
