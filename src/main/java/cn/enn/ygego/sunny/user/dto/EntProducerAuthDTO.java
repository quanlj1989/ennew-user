package cn.enn.ygego.sunny.user.dto;

import java.util.Date;
import java.io.Serializable;

/**
 * DTO:EntProducerAuth
 * 
 * @author gencode
 * @date 2018-3-30
 */
public class EntProducerAuthDTO implements Serializable {
	
	private static final long serialVersionUID = 3419244339241819277L;
	
	private Long	authId; /* 授权ID */
	private Long	memberId; /* 会员ID */
	private Long	producerMemberId; /* 生产商会员ID */
	private String	producerName; /* 生产商名称 */
	private String	authFileNo; /* 授权书编号 */
	private Long	createAcctId; /* 创建人账户ID */
	private Date	createTime; /* 创建时间 */

	// Constructor
	public EntProducerAuthDTO() {
	}

	/**
	 * full Constructor
	 */
	public EntProducerAuthDTO(Long authId, Long memberId, Long producerMemberId, String producerName, String authFileNo, Long createAcctId, Date createTime) {
		this.authId = authId;
		this.memberId = memberId;
		this.producerMemberId = producerMemberId;
		this.producerName = producerName;
		this.authFileNo = authFileNo;
		this.createAcctId = createAcctId;
		this.createTime = createTime;
	}

	public Long getAuthId() {
		return authId;
	}

	public void setAuthId(Long authId) {
		this.authId = authId;
	}
	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}
	public Long getProducerMemberId() {
		return producerMemberId;
	}

	public void setProducerMemberId(Long producerMemberId) {
		this.producerMemberId = producerMemberId;
	}
	public String getProducerName() {
		return producerName;
	}

	public void setProducerName(String producerName) {
		this.producerName = producerName;
	}
	public String getAuthFileNo() {
		return authFileNo;
	}

	public void setAuthFileNo(String authFileNo) {
		this.authFileNo = authFileNo;
	}
	public Long getCreateAcctId() {
		return createAcctId;
	}

	public void setCreateAcctId(Long createAcctId) {
		this.createAcctId = createAcctId;
	}
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "EntProducerAuthDTO [" + "authId=" + authId + ", memberId=" + memberId + ", producerMemberId=" + producerMemberId + ", producerName=" + producerName + ", authFileNo=" + authFileNo + ", createAcctId=" + createAcctId + ", createTime=" + createTime +  "]";
	}
}
