package cn.enn.ygego.sunny.user.model;

import java.util.Date;
import java.io.Serializable;

/**
 * ClassName: MarketAuthInfo
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
*/
public class MarketAuthInfo implements Serializable {
	
	private Long	authId;		 /* 授权ID */ 
	private Long	memberId;		 /* 会员ID */ 
	private String	authFileNo;		 /* 授权书编号 */ 
	private Long	producerMemberId;		 /* 生产商会员ID */ 
	private String	producerName;		 /* 生产商名称 */ 
	private Integer	limitType;		 /* 期限类型 */ 
	private Date	certValidStartDate;		 /* 证件有效开始日期 */ 
	private Date	certValidEndDate;		 /* 证件有效截止日期 */ 

	// Constructor
	public MarketAuthInfo() {
	}

	/**
	 * full Constructor
	 */
	public MarketAuthInfo(Long authId, Long memberId, String authFileNo, Long producerMemberId, String producerName, Integer limitType, Date certValidStartDate, Date certValidEndDate) {
		this.authId = authId;
		this.memberId = memberId;
		this.authFileNo = authFileNo;
		this.producerMemberId = producerMemberId;
		this.producerName = producerName;
		this.limitType = limitType;
		this.certValidStartDate = certValidStartDate;
		this.certValidEndDate = certValidEndDate;
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

	public String getAuthFileNo() {
		return authFileNo;
	}

	public void setAuthFileNo(String authFileNo) {
		this.authFileNo = authFileNo;
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

	public Integer getLimitType() {
		return limitType;
	}

	public void setLimitType(Integer limitType) {
		this.limitType = limitType;
	}

	public Date getCertValidStartDate() {
		return certValidStartDate;
	}

	public void setCertValidStartDate(Date certValidStartDate) {
		this.certValidStartDate = certValidStartDate;
	}

	public Date getCertValidEndDate() {
		return certValidEndDate;
	}

	public void setCertValidEndDate(Date certValidEndDate) {
		this.certValidEndDate = certValidEndDate;
	}

	@Override
	public String toString() {
		return "MarketAuthInfo [" + "authId=" + authId + ", memberId=" + memberId + ", authFileNo=" + authFileNo + ", producerMemberId=" + producerMemberId + ", producerName=" + producerName + ", limitType=" + limitType + ", certValidStartDate=" + certValidStartDate + ", certValidEndDate=" + certValidEndDate +  "]";
	}
}
