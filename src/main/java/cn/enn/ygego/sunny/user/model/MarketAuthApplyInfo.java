package cn.enn.ygego.sunny.user.model;

import java.util.Date;
import java.io.Serializable;

/**
 * ClassName: MarketAuthApplyInfo
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
*/
public class MarketAuthApplyInfo implements Serializable {
	
	private Long	authApplyId;		 /* 授权申请ID */ 
	private Long	memberId;		 /* 会员ID */ 
	private Long	marketApplyId;		 /* 超市申请ID */ 
	private String	authFileNo;		 /* 授权书编号 */ 
	private Long	producerMemberId;		 /* 生产商会员ID */ 
	private String	producerName;		 /* 生产商名称 */ 
	private Integer	limitType;		 /* 期限类型 */ 
	private Date	certValidStartDate;		 /* 证件有效开始日期 */ 
	private Date	certValidEndDate;		 /* 证件有效截止日期 */ 
	private Integer	status;		 /* 状态 */ 
	private Date	createTime;		 /* 创建时间 */ 
	private Long	createAcctId;		 /* 创建人账户ID */ 
	private String	createName;		 /* 创建人姓名 */ 

	// Constructor
	public MarketAuthApplyInfo() {
	}

	/**
	 * full Constructor
	 */
	public MarketAuthApplyInfo(Long authApplyId, Long memberId, Long marketApplyId, String authFileNo, Long producerMemberId, String producerName, Integer limitType, Date certValidStartDate, Date certValidEndDate, Integer status, Date createTime, Long createAcctId, String createName) {
		this.authApplyId = authApplyId;
		this.memberId = memberId;
		this.marketApplyId = marketApplyId;
		this.authFileNo = authFileNo;
		this.producerMemberId = producerMemberId;
		this.producerName = producerName;
		this.limitType = limitType;
		this.certValidStartDate = certValidStartDate;
		this.certValidEndDate = certValidEndDate;
		this.status = status;
		this.createTime = createTime;
		this.createAcctId = createAcctId;
		this.createName = createName;
	}

	public Long getAuthApplyId() {
		return authApplyId;
	}

	public void setAuthApplyId(Long authApplyId) {
		this.authApplyId = authApplyId;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public Long getMarketApplyId() {
		return marketApplyId;
	}

	public void setMarketApplyId(Long marketApplyId) {
		this.marketApplyId = marketApplyId;
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

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
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

	@Override
	public String toString() {
		return "MarketAuthApplyInfo [" + "authApplyId=" + authApplyId + ", memberId=" + memberId + ", marketApplyId=" + marketApplyId + ", authFileNo=" + authFileNo + ", producerMemberId=" + producerMemberId + ", producerName=" + producerName + ", limitType=" + limitType + ", certValidStartDate=" + certValidStartDate + ", certValidEndDate=" + certValidEndDate + ", status=" + status + ", createTime=" + createTime + ", createAcctId=" + createAcctId + ", createName=" + createName +  "]";
	}
}
