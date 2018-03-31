package cn.enn.ygego.sunny.user.dto;

import java.util.Date;
import java.io.Serializable;

/**
 * DTO:EntCertApplyDetail
 * 
 * @author gencode
 * @date 2018-3-30
 */
public class EntCertApplyDetailDTO implements Serializable {
	
	private static final long serialVersionUID = -3545183664622503436L;
	
	private Long	certApplyDetailId; /* 资质申请明细ID */
	private Long	certApplyId; /* 资质申请ID */
	private Long	memberId; /* 会员ID */
	private Integer	authenType; /* 认证类型 */
	private Integer	certType; /* 资质类型 */
	private String	certName; /* 资质名称 */
	private String	certNo; /* 资质号码 */
	private Date	certValidDate; /* 资质有效期 */
	private Integer	sortNum; /* 排序编号 */
	private Date	createTime; /* 创建时间 */

	// Constructor
	public EntCertApplyDetailDTO() {
	}

	/**
	 * full Constructor
	 */
	public EntCertApplyDetailDTO(Long certApplyDetailId, Long certApplyId, Long memberId, Integer authenType, Integer certType, String certName, String certNo, Date certValidDate, Integer sortNum, Date createTime) {
		this.certApplyDetailId = certApplyDetailId;
		this.certApplyId = certApplyId;
		this.memberId = memberId;
		this.authenType = authenType;
		this.certType = certType;
		this.certName = certName;
		this.certNo = certNo;
		this.certValidDate = certValidDate;
		this.sortNum = sortNum;
		this.createTime = createTime;
	}

	public Long getCertApplyDetailId() {
		return certApplyDetailId;
	}

	public void setCertApplyDetailId(Long certApplyDetailId) {
		this.certApplyDetailId = certApplyDetailId;
	}
	public Long getCertApplyId() {
		return certApplyId;
	}

	public void setCertApplyId(Long certApplyId) {
		this.certApplyId = certApplyId;
	}
	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}
	public Integer getAuthenType() {
		return authenType;
	}

	public void setAuthenType(Integer authenType) {
		this.authenType = authenType;
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
		return "EntCertApplyDetailDTO [" + "certApplyDetailId=" + certApplyDetailId + ", certApplyId=" + certApplyId + ", memberId=" + memberId + ", authenType=" + authenType + ", certType=" + certType + ", certName=" + certName + ", certNo=" + certNo + ", certValidDate=" + certValidDate + ", sortNum=" + sortNum + ", createTime=" + createTime +  "]";
	}
}
