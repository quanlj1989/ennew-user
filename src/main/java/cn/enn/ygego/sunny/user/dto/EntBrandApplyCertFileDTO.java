package cn.enn.ygego.sunny.user.dto;

import java.util.Date;
import java.io.Serializable;

/**
 * DTO:EntBrandApplyCertFile
 * 
 * @author gencode
 * @date 2018-3-30
 */
public class EntBrandApplyCertFileDTO implements Serializable {
	
	private static final long serialVersionUID = 4411175437601353400L;
	
	private Long	certApplyFileId; /* 资质申请文件ID */
	private Long	brandApplyCertId; /* 品牌申请资质ID */
	private Integer	certFileType; /* 资质文件类型 */
	private Long	fileSize; /* 文件大小 */
	private String	fileUrl; /* 文件地址 */
	private Date	createTime; /* 创建时间 */

	// Constructor
	public EntBrandApplyCertFileDTO() {
	}

	/**
	 * full Constructor
	 */
	public EntBrandApplyCertFileDTO(Long certApplyFileId, Long brandApplyCertId, Integer certFileType, Long fileSize, String fileUrl, Date createTime) {
		this.certApplyFileId = certApplyFileId;
		this.brandApplyCertId = brandApplyCertId;
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
	public Long getBrandApplyCertId() {
		return brandApplyCertId;
	}

	public void setBrandApplyCertId(Long brandApplyCertId) {
		this.brandApplyCertId = brandApplyCertId;
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
		return "EntBrandApplyCertFileDTO [" + "certApplyFileId=" + certApplyFileId + ", brandApplyCertId=" + brandApplyCertId + ", certFileType=" + certFileType + ", fileSize=" + fileSize + ", fileUrl=" + fileUrl + ", createTime=" + createTime +  "]";
	}
}
