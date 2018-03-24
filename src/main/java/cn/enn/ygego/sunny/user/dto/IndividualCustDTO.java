package cn.enn.ygego.sunny.user.dto;

import java.util.Date;
import java.util.List;

import cn.enn.ygego.sunny.user.model.IndividualCertFile;

import java.io.Serializable;

/**
 * DTO:IndividualCust
 * 
 * @author gencode
 * @date 2018-3-19
 */
public class IndividualCustDTO implements Serializable {
	
	private static final long serialVersionUID = -5552109070398241235L;
	
	private Long	memberId; /* 会员ID */
	private String	name; /* 姓名 */
	private Integer	certType; /* 证件类型 */
	private String	certCode; /* 证件号码 */
	private Integer	status; /* 状态 */
	private Date	authTime; /* 认证时间 */
	private Date	createTime; /* 创建时间 */
	private Date	modTime; /* 修改时间 */
	private Long	createMemberId; /* 创建人会员ID */
	private Long	createAcctId; /* 创建人账户ID */
	private String	createName; /* 创建人姓名 */

	private Long   certInfoId; /* 资质信息ID */
    private String  certNo; /* 资质号码 */
    private String  certName; /* 资质名称 */
    
    private List<IndividualCertFile> individualCertFileList; /* 资质证明材料 */
	
	// Constructor
	public IndividualCustDTO() {
	}

	/**
	 * full Constructor
	 */
	public IndividualCustDTO(Long memberId, String name, Integer certType, String certCode, Integer status, Date authTime, Date createTime, Date modTime, Long createMemberId, Long createAcctId, String createName) {
		this.memberId = memberId;
		this.name = name;
		this.certType = certType;
		this.certCode = certCode;
		this.status = status;
		this.authTime = authTime;
		this.createTime = createTime;
		this.modTime = modTime;
		this.createMemberId = createMemberId;
		this.createAcctId = createAcctId;
		this.createName = createName;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Integer getCertType() {
		return certType;
	}

	public void setCertType(Integer certType) {
		this.certType = certType;
	}
	public String getCertCode() {
		return certCode;
	}

	public void setCertCode(String certCode) {
		this.certCode = certCode;
	}
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getAuthTime() {
		return authTime;
	}

	public void setAuthTime(Date authTime) {
		this.authTime = authTime;
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
	public Long getCreateMemberId() {
		return createMemberId;
	}

	public void setCreateMemberId(Long createMemberId) {
		this.createMemberId = createMemberId;
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
	
	public Long getCertInfoId() {
        return certInfoId;
    }

    public void setCertInfoId(Long certInfoId) {
        this.certInfoId = certInfoId;
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

    public List<IndividualCertFile> getIndividualCertFileList() {
        return individualCertFileList;
    }

    public void setIndividualCertFileList(List<IndividualCertFile> individualCertFileList) {
        this.individualCertFileList = individualCertFileList;
    }

    @Override
	public String toString() {
		return "IndividualCustDTO [" + "memberId=" + memberId + ", name=" + name + ", certType=" + certType + ", certCode=" + certCode + ", status=" + status + ", authTime=" + authTime + ", createTime=" + createTime + ", modTime=" + modTime + ", createMemberId=" + createMemberId + ", createAcctId=" + createAcctId + ", createName=" + createName +  "]";
	}
}
