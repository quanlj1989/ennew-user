package cn.enn.ygego.sunny.user.model;

import java.io.Serializable;

/**
 * entity:EntApplyProducerAuth
 * 
 * @author gencode
 */
public class EntApplyProducerAuth implements Serializable {
	
	private static final long serialVersionUID = 5118594117328435960L;
	
	private Long	authApplyId;		 /* 授权申请ID */ 
	private Long	applyId;		 /* 申请ID */ 
	private Long	producerMemberId;		 /* 生产商会员ID */ 
	private String	producerName;		 /* 生产商名称 */ 
	private String	authFileNo;		 /* 授权书编号 */ 

	// Constructor
	public EntApplyProducerAuth() {
	}

	/**
	 * full Constructor
	 */
	public EntApplyProducerAuth(Long authApplyId, Long applyId, Long producerMemberId, String producerName, String authFileNo) {
		this.authApplyId = authApplyId;
		this.applyId = applyId;
		this.producerMemberId = producerMemberId;
		this.producerName = producerName;
		this.authFileNo = authFileNo;
	}

	public Long getAuthApplyId() {
		return authApplyId;
	}

	public void setAuthApplyId(Long authApplyId) {
		this.authApplyId = authApplyId;
	}

	public Long getApplyId() {
		return applyId;
	}

	public void setApplyId(Long applyId) {
		this.applyId = applyId;
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

	@Override
	public String toString() {
		return "EntApplyProducerAuth [" + "authApplyId=" + authApplyId+ ", applyId=" + applyId+ ", producerMemberId=" + producerMemberId+ ", producerName=" + producerName+ ", authFileNo=" + authFileNo+  "]";
	}
}
