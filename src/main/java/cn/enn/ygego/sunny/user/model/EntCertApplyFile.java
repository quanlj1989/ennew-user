package cn.enn.ygego.sunny.user.model;

import java.util.Date;
import java.io.Serializable;

/**
 * entity:EntCertApplyFile
 * 
 * @author gencode
 */
public class EntCertApplyFile implements Serializable {
	
	private static final long serialVersionUID = -5160171920802714746L;
	
	private Long	certApplyFileId;		 /* 资质申请文件ID */ 
	private Long	certApplyDetailId;		 /* 资质申请明细ID */ 
	private Integer	certFileType;		 /* 资质文件类型 */ 
	private Long	fileSize;		 /* 文件大小 */ 
	private String	fileUrl;		 /* 文件地址 */ 
	private Date	createTime;		 /* 创建时间 */ 

	// Constructor
	public EntCertApplyFile() {
	}

	/**
	 * full Constructor
	 */
	public EntCertApplyFile(Long certApplyFileId, Long certApplyDetailId, Integer certFileType, Long fileSize, String fileUrl, Date createTime) {
		this.certApplyFileId = certApplyFileId;
		this.certApplyDetailId = certApplyDetailId;
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

	public Long getCertApplyDetailId() {
		return certApplyDetailId;
	}

	public void setCertApplyDetailId(Long certApplyDetailId) {
		this.certApplyDetailId = certApplyDetailId;
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
		return "EntCertApplyFile [" + "certApplyFileId=" + certApplyFileId+ ", certApplyDetailId=" + certApplyDetailId+ ", certFileType=" + certFileType+ ", fileSize=" + fileSize+ ", fileUrl=" + fileUrl+ ", createTime=" + createTime+  "]";
	}
}
