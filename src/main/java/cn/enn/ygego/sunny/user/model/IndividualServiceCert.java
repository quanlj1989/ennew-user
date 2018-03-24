package cn.enn.ygego.sunny.user.model;

import java.util.Date;
import java.io.Serializable;

/**
 * entity:IndividualServiceCert
 * 
 * @author gencode
 */
public class IndividualServiceCert implements Serializable {
	
	private static final long serialVersionUID = 6328537371606986641L;
	
	private Long	serviceCertId;		 /* 服务资质ID */ 
	private Long	serviceId;		 /* 服务ID */ 
	private String	certUrl;		 /* 资质地址 */ 
	private Integer	certType;		 /* 资质类型 */ 
	private String	certName;		 /* 资质名称 */ 
	private String	certNo;		 /* 资质号码 */ 
	private Date	certValidDate;		 /* 资质有效期 */ 

	// Constructor
	public IndividualServiceCert() {
	}

	/**
	 * full Constructor
	 */
	public IndividualServiceCert(Long serviceCertId, Long serviceId, String certUrl, Integer certType, String certName, String certNo, Date certValidDate) {
		this.serviceCertId = serviceCertId;
		this.serviceId = serviceId;
		this.certUrl = certUrl;
		this.certType = certType;
		this.certName = certName;
		this.certNo = certNo;
		this.certValidDate = certValidDate;
	}

	public Long getServiceCertId() {
		return serviceCertId;
	}

	public void setServiceCertId(Long serviceCertId) {
		this.serviceCertId = serviceCertId;
	}

	public Long getServiceId() {
		return serviceId;
	}

	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
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
		return "IndividualServiceCert [" + "serviceCertId=" + serviceCertId+ ", serviceId=" + serviceId+ ", certUrl=" + certUrl+ ", certType=" + certType+ ", certName=" + certName+ ", certNo=" + certNo+ ", certValidDate=" + certValidDate+  "]";
	}
}
