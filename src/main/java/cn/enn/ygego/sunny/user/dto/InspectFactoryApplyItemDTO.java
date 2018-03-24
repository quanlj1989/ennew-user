package cn.enn.ygego.sunny.user.dto;

import java.io.Serializable;

/**
 * DTO:InspectFactoryApplyItem
 * 
 * @author gencode
 * @date 2018-3-19
 */
public class InspectFactoryApplyItemDTO implements Serializable {
	
	private static final long serialVersionUID = -7873975191295043449L;
	
	private Long	applyItemId; /* 申请项目标识 */
	private Long	applyId; /* 申请标识 */
	private Integer	itemId; /* 项目标识 */
	private String	itemName; /* 项目名称 */
	private String	certNum; /* 证书编号 */
	private Integer	parentItmeId; /* 父级项目标识 */
	private String	parentItemName; /* 父级项目名称 */

	// Constructor
	public InspectFactoryApplyItemDTO() {
	}

	/**
	 * full Constructor
	 */
	public InspectFactoryApplyItemDTO(Long applyItemId, Long applyId, Integer itemId, String itemName, String certNum, Integer parentItmeId, String parentItemName) {
		this.applyItemId = applyItemId;
		this.applyId = applyId;
		this.itemId = itemId;
		this.itemName = itemName;
		this.certNum = certNum;
		this.parentItmeId = parentItmeId;
		this.parentItemName = parentItemName;
	}

	public Long getApplyItemId() {
		return applyItemId;
	}

	public void setApplyItemId(Long applyItemId) {
		this.applyItemId = applyItemId;
	}
	public Long getApplyId() {
		return applyId;
	}

	public void setApplyId(Long applyId) {
		this.applyId = applyId;
	}
	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
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
	@Override
	public String toString() {
		return "InspectFactoryApplyItemDTO [" + "applyItemId=" + applyItemId + ", applyId=" + applyId + ", itemId=" + itemId + ", itemName=" + itemName + ", certNum=" + certNum + ", parentItmeId=" + parentItmeId + ", parentItemName=" + parentItemName +  "]";
	}
}