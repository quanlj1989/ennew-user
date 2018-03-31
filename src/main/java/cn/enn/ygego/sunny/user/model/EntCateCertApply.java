package cn.enn.ygego.sunny.user.model;

import java.util.Date;
import java.io.Serializable;

/**
 * entity:EntCateCertApply
 * 
 * @author gencode
 */
public class EntCateCertApply implements Serializable {
	
	private static final long serialVersionUID = 7079054525429160533L;
	
	private Long	certApplyDetailId;		 /* 资质申请明细ID */ 
	private Long	applyId;		 /* 申请ID */ 
	private String	categoryNamePath;		 /* 类目名称路径 */ 
	private String	categoryIdPath;		 /* 类目ID路径 */ 
	private Integer	categoryId;		 /* 类目ID */ 
	private Integer	certType;		 /* 资质类型 */ 
	private Integer	limitType;		 /* 期限类型 */ 
	private Date	certValidStartDate;		 /* 证件有效开始日期 */ 
	private Date	certValidEndDate;		 /* 证件有效截止日期 */ 

	// Constructor
	public EntCateCertApply() {
	}

	/**
	 * full Constructor
	 */
	public EntCateCertApply(Long certApplyDetailId, Long applyId, String categoryNamePath, String categoryIdPath, Integer categoryId, Integer certType, Integer limitType, Date certValidStartDate, Date certValidEndDate) {
		this.certApplyDetailId = certApplyDetailId;
		this.applyId = applyId;
		this.categoryNamePath = categoryNamePath;
		this.categoryIdPath = categoryIdPath;
		this.categoryId = categoryId;
		this.certType = certType;
		this.limitType = limitType;
		this.certValidStartDate = certValidStartDate;
		this.certValidEndDate = certValidEndDate;
	}

	public Long getCertApplyDetailId() {
		return certApplyDetailId;
	}

	public void setCertApplyDetailId(Long certApplyDetailId) {
		this.certApplyDetailId = certApplyDetailId;
	}

	public Long getApplyId() {
		return applyId;
	}

	public void setApplyId(Long applyId) {
		this.applyId = applyId;
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

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public Integer getCertType() {
		return certType;
	}

	public void setCertType(Integer certType) {
		this.certType = certType;
	}

	public Integer getLimitType() {
		return limitType;
	}

	public void setLimitType(Integer limitType) {
		this.limitType = limitType;
	}

	public Date getCertValidStartDate() {
		return certValidStartDate;
	}

	public void setCertValidStartDate(Date certValidStartDate) {
		this.certValidStartDate = certValidStartDate;
	}

	public Date getCertValidEndDate() {
		return certValidEndDate;
	}

	public void setCertValidEndDate(Date certValidEndDate) {
		this.certValidEndDate = certValidEndDate;
	}

	@Override
	public String toString() {
		return "EntCateCertApply [" + "certApplyDetailId=" + certApplyDetailId+ ", applyId=" + applyId+ ", categoryNamePath=" + categoryNamePath+ ", categoryIdPath=" + categoryIdPath+ ", categoryId=" + categoryId+ ", certType=" + certType+ ", limitType=" + limitType+ ", certValidStartDate=" + certValidStartDate+ ", certValidEndDate=" + certValidEndDate+  "]";
	}
}
