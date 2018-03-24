package cn.enn.ygego.sunny.user.model;

import java.io.Serializable;

/**
 * entity:InspectFactoryApplyAttach
 * 
 * @author gencode
 */
public class InspectFactoryApplyAttach implements Serializable {
	
	private static final long serialVersionUID = 1306545490243393330L;
	
	private Long	attaId;		 /* 附件标识 */ 
	private Long	applyItemId;		 /* 申请项目标识 */ 
	private String	fileUrl;		 /* 文件路径 */ 
	private Integer	fileType;		 /* 文件类型 */ 

	// Constructor
	public InspectFactoryApplyAttach() {
	}

	/**
	 * full Constructor
	 */
	public InspectFactoryApplyAttach(Long attaId, Long applyItemId, String fileUrl, Integer fileType) {
		this.attaId = attaId;
		this.applyItemId = applyItemId;
		this.fileUrl = fileUrl;
		this.fileType = fileType;
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

	@Override
	public String toString() {
		return "InspectFactoryApplyAttach [" + "attaId=" + attaId+ ", applyItemId=" + applyItemId+ ", fileUrl=" + fileUrl+ ", fileType=" + fileType+  "]";
	}
}
