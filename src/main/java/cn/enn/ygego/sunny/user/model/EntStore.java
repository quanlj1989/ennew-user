package cn.enn.ygego.sunny.user.model;

import java.io.Serializable;

/**
 * entity:EntStore
 * 
 * @author gencode
 */
public class EntStore implements Serializable {
	
	private static final long serialVersionUID = 1614603172835057915L;
	
	private Long	storeId;		 /* 店铺ID */ 
	private Long	memberId;		 /* 会员ID */ 
	private String	headBanner;		 /* 头部banner */ 

	// Constructor
	public EntStore() {
	}

	/**
	 * full Constructor
	 */
	public EntStore(Long storeId, Long memberId, String headBanner) {
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
		return "EntStore [" + "storeId=" + storeId+ ", memberId=" + memberId+ ", headBanner=" + headBanner+  "]";
	}
}
