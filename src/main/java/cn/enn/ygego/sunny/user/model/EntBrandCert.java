package cn.enn.ygego.sunny.user.model;

import java.util.Date;
import java.io.Serializable;

/**
 * entity:EntBrandCert
 * 
 * @author gencode
 */
public class EntBrandCert implements Serializable {
	
	private static final long serialVersionUID = -45699003488266502L;
	
	private Long	brandCertId;		 /* 品牌资质ID */ 
	private Long	entBrandId;		 /* 企业品牌ID */ 
	private String	certUrl;		 /* 资质地址 */ 
	private Integer	certType;		 /* 资质类型 */ 
	private String	certName;		 /* 资质名称 */ 
	private String	certNo;		 /* 资质号码 */ 
	private Date	certValidDate;		 /* 资质有效期 */ 

	// Constructor
	public EntBrandCert() {
	}

	/**
	 * full Constructor
	 */
	public EntBrandCert(Long brandCertId, Long entBrandId, String certUrl, Integer certType, String certName, String certNo, Date certValidDate) {
		this.brandCertId = brandCertId;
		this.entBrandId = entBrandId;
		this.certUrl = certUrl;
		this.certType = certType;
		this.certName = certName;
		this.certNo = certNo;
		this.certValidDate = certValidDate;
	}

	public Long getBrandCertId() {
		return brandCertId;
	}

	public void setBrandCertId(Long brandCertId) {
		this.brandCertId = brandCertId;
	}

	public Long getEntBrandId() {
		return entBrandId;
	}

	public void setEntBrandId(Long entBrandId) {
		this.entBrandId = entBrandId;
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

	@Override
	public String toString() {
		return "EntBrandCert [" + "brandCertId=" + brandCertId+ ", entBrandId=" + entBrandId+ ", certUrl=" + certUrl+ ", certType=" + certType+ ", certName=" + certName+ ", certNo=" + certNo+ ", certValidDate=" + certValidDate+  "]";
	}
}
