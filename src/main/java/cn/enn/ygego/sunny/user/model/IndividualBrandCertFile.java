package cn.enn.ygego.sunny.user.model;

import java.io.Serializable;

/**
 * entity:IndividualBrandCertFile
 * 
 * @author gencode
 */
public class IndividualBrandCertFile implements Serializable {
	
	private static final long serialVersionUID = 2179318608226013915L;
	
	private Long	certApplyFileId;		 /* 资质文件ID */ 
	private Long	brandCertId;		 /* 品牌资质ID */ 
	private Integer	certFileType;		 /* 资质文件类型 */ 
	private Long	fileSize;		 /* 文件大小 */ 
	private String	fileUrl;		 /* 文件地址 */ 

	// Constructor
	public IndividualBrandCertFile() {
	}

	/**
	 * full Constructor
	 */
	public IndividualBrandCertFile(Long certApplyFileId, Long brandCertId, Integer certFileType, Long fileSize, String fileUrl) {
		this.certApplyFileId = certApplyFileId;
		this.brandCertId = brandCertId;
		this.certFileType = certFileType;
		this.fileSize = fileSize;
		this.fileUrl = fileUrl;
	}

	public Long getCertApplyFileId() {
		return certApplyFileId;
	}

	public void setCertApplyFileId(Long certApplyFileId) {
		this.certApplyFileId = certApplyFileId;
	}

	public Long getBrandCertId() {
		return brandCertId;
	}

	public void setBrandCertId(Long brandCertId) {
		this.brandCertId = brandCertId;
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

	@Override
	public String toString() {
		return "IndividualBrandCertFile [" + "certApplyFileId=" + certApplyFileId+ ", brandCertId=" + brandCertId+ ", certFileType=" + certFileType+ ", fileSize=" + fileSize+ ", fileUrl=" + fileUrl+  "]";
	}
}
