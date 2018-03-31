package cn.enn.ygego.sunny.user.model;

import java.util.Date;
import java.io.Serializable;

/**
 * ClassName: MarketCateCertApply
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
*/
public class MarketCateCertApply implements Serializable {
	
	private Long	certApplyDetailId;		 /* 资质申请明细ID */ 
	private Long	applyId;		 /* 申请ID */ 
	private Integer	certType;		 /* 资质类型 */ 
	private Integer	limitType;		 /* 期限类型 */ 
	private Date	certValidStartDate;		 /* 证件有效开始日期 */ 
	private Date	certValidEndDate;		 /* 证件有效截止日期 */ 

	// Constructor
	public MarketCateCertApply() {
	}

	/**
	 * full Constructor
	 */
	public MarketCateCertApply(Long certApplyDetailId, Long applyId, Integer certType, Integer limitType, Date certValidStartDate, Date certValidEndDate) {
		this.certApplyDetailId = certApplyDetailId;
		this.applyId = applyId;
		this.certType = certType;
		this.limitType = limitType;
		this.certValidStartDate = certValidStartDate;
		this.certValidEndDate = certValidEndDate;
	}

	public Long getCertApplyDetailId() {
		return certApplyDetailId;
	}

	public void setCertApplyDetailId(Long certApplyDetailId) {
		this.certApplyDetailId = certApplyDetailId;
	}

	public Long getApplyId() {
		return applyId;
	}

	public void setApplyId(Long applyId) {
		this.applyId = applyId;
	}

	public Integer getCertType() {
		return certType;
	}

	public void setCertType(Integer certType) {
		this.certType = certType;
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
		return "MarketCateCertApply [" + "certApplyDetailId=" + certApplyDetailId + ", applyId=" + applyId + ", certType=" + certType + ", limitType=" + limitType + ", certValidStartDate=" + certValidStartDate + ", certValidEndDate=" + certValidEndDate +  "]";
	}
}
