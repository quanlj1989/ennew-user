package cn.enn.ygego.sunny.user.dto;

import java.util.Date;
import java.io.Serializable;

/**
 * DTO:SellerProd
 * 
 * @author gencode
 * @date 2018-3-28
 */
public class SellerProdDTO implements Serializable {
	
	private static final long serialVersionUID = -8876628432924612306L;
	
	private Long	sellerProdId; /* 商家产品ID */
	private Long	prodId; /* 产品ID */
	private Long	supplierMemberId; /* 供应商会员ID */
	private Long	producerMemberId; /* 生产商会员ID */
	private String	prodName; /* 产品名称 */
	private Long	materialId; /* 物料ID */
	private Long	brandId; /* 品牌ID */
	private Integer	status; /* 状态 */
	private Date	createTime; /* 创建时间 */
	private Long	createAcctId; /* 创建人账户ID */

	// Constructor
	public SellerProdDTO() {
	}

	/**
	 * full Constructor
	 */
	public SellerProdDTO(Long sellerProdId, Long prodId, Long supplierMemberId, Long producerMemberId, String prodName, Long materialId, Long brandId, Integer status, Date createTime, Long createAcctId) {
		this.sellerProdId = sellerProdId;
		this.prodId = prodId;
		this.supplierMemberId = supplierMemberId;
		this.producerMemberId = producerMemberId;
		this.prodName = prodName;
		this.materialId = materialId;
		this.brandId = brandId;
		this.status = status;
		this.createTime = createTime;
		this.createAcctId = createAcctId;
	}

	public Long getSellerProdId() {
		return sellerProdId;
	}

	public void setSellerProdId(Long sellerProdId) {
		this.sellerProdId = sellerProdId;
	}
	public Long getProdId() {
		return prodId;
	}

	public void setProdId(Long prodId) {
		this.prodId = prodId;
	}
	public Long getSupplierMemberId() {
		return supplierMemberId;
	}

	public void setSupplierMemberId(Long supplierMemberId) {
		this.supplierMemberId = supplierMemberId;
	}
	public Long getProducerMemberId() {
		return producerMemberId;
	}

	public void setProducerMemberId(Long producerMemberId) {
		this.producerMemberId = producerMemberId;
	}
	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
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
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
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
		return "SellerProdDTO [" + "sellerProdId=" + sellerProdId + ", prodId=" + prodId + ", supplierMemberId=" + supplierMemberId + ", producerMemberId=" + producerMemberId + ", prodName=" + prodName + ", materialId=" + materialId + ", brandId=" + brandId + ", status=" + status + ", createTime=" + createTime + ", createAcctId=" + createAcctId +  "]";
	}
}
