package cn.enn.ygego.sunny.user.dto;

import java.io.Serializable;

/**
 * DTO:EntStore
 * 
 * @author gencode
 * @date 2018-3-30
 */
public class EntStoreDTO implements Serializable {
	
	private static final long serialVersionUID = -6027749116558086165L;
	
	private Long	storeId; /* 店铺ID */
	private Long	memberId; /* 会员ID */
	private String	headBanner; /* 头部banner */

	// Constructor
	public EntStoreDTO() {
	}

	/**
	 * full Constructor
	 */
	public EntStoreDTO(Long storeId, Long memberId, String headBanner) {
		this.storeId = storeId;
		this.memberId = memberId;
		this.headBanner = headBanner;
	}

	public Long getStoreId() {
		return storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}
	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}
	public String getHeadBanner() {
		return headBanner;
	}

	public void setHeadBanner(String headBanner) {
		this.headBanner = headBanner;
	}
	@Override
	public String toString() {
		return "EntStoreDTO [" + "storeId=" + storeId + ", memberId=" + memberId + ", headBanner=" + headBanner +  "]";
	}
}
