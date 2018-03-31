package cn.enn.ygego.sunny.user.dto;

import java.util.Date;
import java.io.Serializable;

/**
 * DTO:EntCateCertInfo
 * 
 * @author gencode
 * @date 2018-3-30
 */
public class EntCateCertInfoDTO implements Serializable {
	
	private static final long serialVersionUID = -4802778993995834277L;
	
	private Long	certInfoId; /* 资质信息ID */
	private Long	memberId; /* 会员ID */
	private String	categoryNamePath; /* 类目名称路径 */
	private String	categoryIdPath; /* 类目ID路径 */
	private Integer	categoryId; /* 类目ID */
	private Integer	certType; /* 资质类型 */
	private Integer	limitType; /* 期限类型 */
	private Date	certValidStartDate; /* 证件有效开始日期 */
	private Date	certValidEndDate; /* 证件有效截止日期 */
	private Date	createTime; /* 创建时间 */
	private Long	createAcctId; /* 创建人账户ID */
	private String	createName; /* 创建人姓名 */

	// Constructor
	public EntCateCertInfoDTO() {
	}

	/**
	 * full Constructor
	 */
	public EntCateCertInfoDTO(Long certInfoId, Long memberId, String categoryNamePath, String categoryIdPath, Integer categoryId, Integer certType, Integer limitType, Date certValidStartDate, Date certValidEndDate, Date createTime, Long createAcctId, String createName) {
		this.certInfoId = certInfoId;
		this.memberId = memberId;
		this.categoryNamePath = categoryNamePath;
		this.categoryIdPath = categoryIdPath;
		this.categoryId = categoryId;
		this.certType = certType;
		this.limitType = limitType;
		this.certValidStartDate = certValidStartDate;
		this.certValidEndDate = certValidEndDate;
		this.createTime = createTime;
		this.createAcctId = createAcctId;
		this.createName = createName;
	}

	public Long getCertInfoId() {
		return certInfoId;
	}

	public void setCertInfoId(Long certInfoId) {
		this.certInfoId = certInfoId;
	}
	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
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
		return "EntCateCertInfoDTO [" + "certInfoId=" + certInfoId + ", memberId=" + memberId + ", categoryNamePath=" + categoryNamePath + ", categoryIdPath=" + categoryIdPath + ", categoryId=" + categoryId + ", certType=" + certType + ", limitType=" + limitType + ", certValidStartDate=" + certValidStartDate + ", certValidEndDate=" + certValidEndDate + ", createTime=" + createTime + ", createAcctId=" + createAcctId + ", createName=" + createName +  "]";
	}
}
