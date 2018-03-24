package cn.enn.ygego.sunny.user.dto;

import java.util.Date;
import java.io.Serializable;

/**
 * DTO:EntBrandAuthApplyCert
 * 
 * @author gencode
 * @date 2018-3-19
 */
public class EntBrandAuthApplyCertDTO implements Serializable {
	
	private static final long serialVersionUID = 3451901104979901719L;
	
	private Long	brandApplyCertId; /* 品牌申请资质ID */
	private Long	brandApplyId; /* 品牌申请ID */
	private String	certUrl; /* 资质地址 */
	private Integer	certType; /* 资质类型 */
	private String	certName; /* 资质名称 */
	private String	certNo; /* 资质号码 */
	private Date	certValidDate; /* 资质有效期 */
	private Integer	sortNum; /* 排序编号 */
	private Date	createTime; /* 创建时间 */

	// Constructor
	public EntBrandAuthApplyCertDTO() {
	}

	/**
	 * full Constructor
	 */
	public EntBrandAuthApplyCertDTO(Long brandApplyCertId, Long brandApplyId, String certUrl, Integer certType, String certName, String certNo, Date certValidDate, Integer sortNum, Date createTime) {
		this.brandApplyCertId = brandApplyCertId;
		this.brandApplyId = brandApplyId;
		this.certUrl = certUrl;
		this.certType = certType;
		this.certName = certName;
		this.certNo = certNo;
		this.certValidDate = certValidDate;
		this.sortNum = sortNum;
		this.createTime = createTime;
	}

	public Long getBrandApplyCertId() {
		return brandApplyCertId;
	}

	public void setBrandApplyCertId(Long brandApplyCertId) {
		this.brandApplyCertId = brandApplyCertId;
	}
	public Long getBrandApplyId() {
		return brandApplyId;
	}

	public void setBrandApplyId(Long brandApplyId) {
		this.brandApplyId = brandApplyId;
	}
	public String getCertUrl() {
		return certUrl;
	}

	public void setCertUrl(String certUrl) {
		this.certUrl = certUrl;
	}
	public Integer getCertType() {
		return certType;
	}

	public void setCertType(Integer certType) {
		this.certType = certType;
	}
	public String getCertName() {
		return certName;
	}

	public void setCertName(String certName) {
		this.certName = certName;
	}
	public String getCertNo() {
		return certNo;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public Date getCertValidDate() {
		return certValidDate;
	}

	public void setCertValidDate(Date certValidDate) {
		this.certValidDate = certValidDate;
	}
	public Integer getSortNum() {
		return sortNum;
	}

	public void setSortNum(Integer sortNum) {
		this.sortNum = sortNum;
	}
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "EntBrandAuthApplyCertDTO [" + "brandApplyCertId=" + brandApplyCertId + ", brandApplyId=" + brandApplyId + ", certUrl=" + certUrl + ", certType=" + certType + ", certName=" + certName + ", certNo=" + certNo + ", certValidDate=" + certValidDate + ", sortNum=" + sortNum + ", createTime=" + createTime +  "]";
	}
}
