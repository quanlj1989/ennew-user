package cn.enn.ygego.sunny.user.dto;

import java.util.Date;
import java.util.List;
import java.io.Serializable;

/**
 * DTO:IndividualCertInfo
 * 
 * @author gencode
 * @date 2018-3-19
 */
public class IndividualCertInfoDTO implements Serializable {
	
	private static final long serialVersionUID = 4061392809318805949L;
	
	private Long	certInfoId; /* 资质信息ID */
	private Long	memberId; /* 会员ID */
	private Integer	status; /* 状态 */
	private Integer	certType; /* 资质类型 */
	private String	certNo; /* 资质号码 */
	private String	certName; /* 资质名称 */
	private Date	createTime; /* 创建时间 */
	private Date	modTime; /* 修改时间 */
	private Long	createAcctId; /* 创建人账户ID */
	private String	createName; /* 创建人姓名 */
	
	private List<IndividualCertFileDTO> individualCertFileList; /* 资质证明材料 */

	// Constructor
	public IndividualCertInfoDTO() {
	}

	/**
	 * full Constructor
	 */
	public IndividualCertInfoDTO(Long certInfoId, Long memberId, Integer status, Integer certType, String certNo, String certName, Date createTime, Date modTime, Long createAcctId, String createName) {
		this.certInfoId = certInfoId;
		this.memberId = memberId;
		this.status = status;
		this.certType = certType;
		this.certNo = certNo;
		this.certName = certName;
		this.createTime = createTime;
		this.modTime = modTime;
		this.createAcctId = createAcctId;
		this.createName = createName;
	}

	public Long getCertInfoId() {
		return certInfoId;
	}

	public void setCertInfoId(Long certInfoId) {
		this.certInfoId = certInfoId;
	}
	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getCertType() {
		return certType;
	}

	public void setCertType(Integer certType) {
		this.certType = certType;
	}
	public String getCertNo() {
		return certNo;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getCertName() {
		return certName;
	}

	public void setCertName(String certName) {
		this.certName = certName;
	}
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getModTime() {
		return modTime;
	}

	public void setModTime(Date modTime) {
		this.modTime = modTime;
	}
	public Long getCreateAcctId() {
		return createAcctId;
	}

	public void setCreateAcctId(Long createAcctId) {
		this.createAcctId = createAcctId;
	}
	public String getCreateName() {
		return createName;
	}

	public void setCreateName(String createName) {
		this.createName = createName;
	}
	
	public List<IndividualCertFileDTO> getIndividualCertFileList() {
        return individualCertFileList;
    }

    public void setIndividualCertFileList(List<IndividualCertFileDTO> individualCertFileList) {
        this.individualCertFileList = individualCertFileList;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    @Override
	public String toString() {
		return "IndividualCertInfoDTO [" + "certInfoId=" + certInfoId + ", memberId=" + memberId + ", status=" + status + ", certType=" + certType + ", certNo=" + certNo + ", certName=" + certName + ", createTime=" + createTime + ", modTime=" + modTime + ", createAcctId=" + createAcctId + ", createName=" + createName +  "]";
	}
}
