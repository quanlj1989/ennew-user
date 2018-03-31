package cn.enn.ygego.sunny.user.dto;

import java.util.Date;
import java.io.Serializable;

/**
 * DTO:ProdInfo
 * 
 * @author gencode
 * @date 2018-3-28
 */
public class ProdInfoDTO implements Serializable {
	
	private static final long serialVersionUID = 7987332643554099649L;
	
	private Long	prodId; /* 产品ID */
	private Long	materialId; /* 物料ID */
	private Long	brandId; /* 品牌ID */
	private Long	producerMemberId; /* 生产商会员ID */
	private String	producerName; /* 生产商名称 */
	private Integer	qualityTraceType; /* 质量追溯类型 */
	private Date	createTime; /* 创建时间 */
	private Long	createAcctId; /* 创建人账户ID */

	// Constructor
	public ProdInfoDTO() {
	}

	/**
	 * full Constructor
	 */
	public ProdInfoDTO(Long prodId, Long materialId, Long brandId, Long producerMemberId, String producerName, Integer qualityTraceType, Date createTime, Long createAcctId) {
		this.prodId = prodId;
		this.materialId = materialId;
		this.brandId = brandId;
		this.producerMemberId = producerMemberId;
		this.producerName = producerName;
		this.qualityTraceType = qualityTraceType;
		this.createTime = createTime;
		this.createAcctId = createAcctId;
	}

	public Long getProdId() {
		return prodId;
	}

	public void setProdId(Long prodId) {
		this.prodId = prodId;
	}
	public Long getMaterialId() {
		return materialId;
	}

	public void setMaterialId(Long materialId) {
		this.materialId = materialId;
	}
	public Long getBrandId() {
		return brandId;
	}

	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}
	public Long getProducerMemberId() {
		return producerMemberId;
	}

	public void setProducerMemberId(Long producerMemberId) {
		this.producerMemberId = producerMemberId;
	}
	public String getProducerName() {
		return producerName;
	}

	public void setProducerName(String producerName) {
		this.producerName = producerName;
	}
	public Integer getQualityTraceType() {
		return qualityTraceType;
	}

	public void setQualityTraceType(Integer qualityTraceType) {
		this.qualityTraceType = qualityTraceType;
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
	@Override
	public String toString() {
		return "ProdInfoDTO [" + "prodId=" + prodId + ", materialId=" + materialId + ", brandId=" + brandId + ", producerMemberId=" + producerMemberId + ", producerName=" + producerName + ", qualityTraceType=" + qualityTraceType + ", createTime=" + createTime + ", createAcctId=" + createAcctId +  "]";
	}
}
