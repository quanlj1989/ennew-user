package cn.enn.ygego.sunny.user.dto;

import java.io.Serializable;

/**
 * DTO:InspectFactoryApplyAttach
 * 
 * @author gencode
 * @date 2018-3-30
 */
public class InspectFactoryApplyAttachDTO implements Serializable {
	
	private static final long serialVersionUID = -88171736562725735L;
	
	private Long	attaId; /* 附件标识 */
	private Long	applyItemId; /* 申请项目标识 */
	private String	fileUrl; /* 文件路径 */
	private Integer	fileType; /* 文件类型 */
	private String	memo; /* 备注 */

	// Constructor
	public InspectFactoryApplyAttachDTO() {
	}

	/**
	 * full Constructor
	 */
	public InspectFactoryApplyAttachDTO(Long attaId, Long applyItemId, String fileUrl, Integer fileType, String memo) {
		this.attaId = attaId;
		this.applyItemId = applyItemId;
		this.fileUrl = fileUrl;
		this.fileType = fileType;
		this.memo = memo;
	}

	public Long getAttaId() {
		return attaId;
	}

	public void setAttaId(Long attaId) {
		this.attaId = attaId;
	}
	public Long getApplyItemId() {
		return applyItemId;
	}

	public void setApplyItemId(Long applyItemId) {
		this.applyItemId = applyItemId;
	}
	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}
	public Integer getFileType() {
		return fileType;
	}

	public void setFileType(Integer fileType) {
		this.fileType = fileType;
	}
	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	@Override
	public String toString() {
		return "InspectFactoryApplyAttachDTO [" + "attaId=" + attaId + ", applyItemId=" + applyItemId + ", fileUrl=" + fileUrl + ", fileType=" + fileType + ", memo=" + memo +  "]";
	}
}
