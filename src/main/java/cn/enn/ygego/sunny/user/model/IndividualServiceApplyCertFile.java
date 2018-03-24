package cn.enn.ygego.sunny.user.model;

import java.util.Date;
import java.io.Serializable;

/**
 * entity:IndividualServiceApplyCertFile
 * 
 * @author gencode
 */
public class IndividualServiceApplyCertFile implements Serializable {
	
	private static final long serialVersionUID = -7526153898149127116L;
	
	private Long	certApplyFileId;		 /* 资质申请文件ID */ 
	private Long	serviceApplyCertId;		 /* 服务申请资质ID */ 
	private Integer	certFileType;		 /* 资质文件类型 */ 
	private Long	fileSize;		 /* 文件大小 */ 
	private String	fileUrl;		 /* 文件地址 */ 
	private Date	createTime;		 /* 创建时间 */ 

	// Constructor
	public IndividualServiceApplyCertFile() {
	}

	/**
	 * full Constructor
	 */
	public IndividualServiceApplyCertFile(Long certApplyFileId, Long serviceApplyCertId, Integer certFileType, Long fileSize, String fileUrl, Date createTime) {
		this.certApplyFileId = certApplyFileId;
		this.serviceApplyCertId = serviceApplyCertId;
		this.certFileType = certFileType;
		this.fileSize = fileSize;
		this.fileUrl = fileUrl;
		this.createTime = createTime;
	}

	public Long getCertApplyFileId() {
		return certApplyFileId;
	}

	public void setCertApplyFileId(Long certApplyFileId) {
		this.certApplyFileId = certApplyFileId;
	}

	public Long getServiceApplyCertId() {
		return serviceApplyCertId;
	}

	public void setServiceApplyCertId(Long serviceApplyCertId) {
		this.serviceApplyCertId = serviceApplyCertId;
	}

	public Integer getCertFileType() {
		return certFileType;
	}

	public void setCertFileType(Integer certFileType) {
		this.certFileType = certFileType;
	}

	public Long getFileSize() {
		return fileSize;
	}

	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}

	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "IndividualServiceApplyCertFile [" + "certApplyFileId=" + certApplyFileId+ ", serviceApplyCertId=" + serviceApplyCertId+ ", certFileType=" + certFileType+ ", fileSize=" + fileSize+ ", fileUrl=" + fileUrl+ ", createTime=" + createTime+  "]";
	}
}
