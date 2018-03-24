package cn.enn.ygego.sunny.user.model;

import java.util.Date;
import java.io.Serializable;

/**
 * entity:IndividualServiceApplyCert
 * 
 * @author gencode
 */
public class IndividualServiceApplyCert implements Serializable {
	
	private static final long serialVersionUID = 1880585965227716578L;
	
	private Long	serviceApplyCertId;		 /* 服务申请资质ID */ 
	private Long	serviceApplyId;		 /* 服务申请ID */ 
	private String	certUrl;		 /* 资质地址 */ 
	private Integer	certType;		 /* 资质类型 */ 
	private String	certName;		 /* 资质名称 */ 
	private String	certNo;		 /* 资质号码 */ 
	private String	certValidDate;		 /* 资质有效期 */ 
	private Integer	sortNum;		 /* 排序编号 */ 
	private Date	createTime;		 /* 创建时间 */ 

	// Constructor
	public IndividualServiceApplyCert() {
	}

	/**
	 * full Constructor
	 */
	public IndividualServiceApplyCert(Long serviceApplyCertId, Long serviceApplyId, String certUrl, Integer certType, String certName, String certNo, String certValidDate, Integer sortNum, Date createTime) {
		this.serviceApplyCertId = serviceApplyCertId;
		this.serviceApplyId = serviceApplyId;
		this.certUrl = certUrl;
		this.certType = certType;
		this.certName = certName;
		this.certNo = certNo;
		this.certValidDate = certValidDate;
		this.sortNum = sortNum;
		this.createTime = createTime;
	}

	public Long getServiceApplyCertId() {
		return serviceApplyCertId;
	}

	public void setServiceApplyCertId(Long serviceApplyCertId) {
		this.serviceApplyCertId = serviceApplyCertId;
	}

	public Long getServiceApplyId() {
		return serviceApplyId;
	}

	public void setServiceApplyId(Long serviceApplyId) {
		this.serviceApplyId = serviceApplyId;
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

	public String getCertValidDate() {
		return certValidDate;
	}

	public void setCertValidDate(String certValidDate) {
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
		return "IndividualServiceApplyCert [" + "serviceApplyCertId=" + serviceApplyCertId+ ", serviceApplyId=" + serviceApplyId+ ", certUrl=" + certUrl+ ", certType=" + certType+ ", certName=" + certName+ ", certNo=" + certNo+ ", certValidDate=" + certValidDate+ ", sortNum=" + sortNum+ ", createTime=" + createTime+  "]";
	}
}
