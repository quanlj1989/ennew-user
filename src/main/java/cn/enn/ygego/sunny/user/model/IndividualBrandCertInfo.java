package cn.enn.ygego.sunny.user.model;

import java.util.Date;
import java.io.Serializable;

/**
 * entity:IndividualBrandCertInfo
 * 
 * @author gencode
 */
public class IndividualBrandCertInfo implements Serializable {
	
	private static final long serialVersionUID = 4153807744621914236L;
	
	private Long	brandCertId;		 /* 品牌资质ID */ 
	private Long	individualBrandId;		 /* 个人品牌ID */ 
	private String	certUrl;		 /* 资质地址 */ 
	private Integer	certType;		 /* 资质类型 */ 
	private String	certName;		 /* 资质名称 */ 
	private String	certNo;		 /* 资质号码 */ 
	private Date	certValidDate;		 /* 资质有效期 */ 

	// Constructor
	public IndividualBrandCertInfo() {
	}

	/**
	 * full Constructor
	 */
	public IndividualBrandCertInfo(Long brandCertId, Long individualBrandId, String certUrl, Integer certType, String certName, String certNo, Date certValidDate) {
		this.brandCertId = brandCertId;
		this.individualBrandId = individualBrandId;
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

	public Long getIndividualBrandId() {
		return individualBrandId;
	}

	public void setIndividualBrandId(Long individualBrandId) {
		this.individualBrandId = individualBrandId;
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
		return "IndividualBrandCertInfo [" + "brandCertId=" + brandCertId+ ", individualBrandId=" + individualBrandId+ ", certUrl=" + certUrl+ ", certType=" + certType+ ", certName=" + certName+ ", certNo=" + certNo+ ", certValidDate=" + certValidDate+  "]";
	}
}
