package cn.enn.ygego.sunny.user.dto;

import java.util.Date;
import java.math.BigDecimal;
import java.io.Serializable;

/**
 * DTO:EntPaySet
 * 
 * @author gencode
 * @date 2018-3-30
 */
public class EntPaySetDTO implements Serializable {
	
	private static final long serialVersionUID = 7920670306772097602L;
	
	private Long	paySetId; /* 付款设置标识 */
	private Long	memberId; /* 会员ID */
	private Integer	payNodeType; /* 付款节点类型 */
	private String	payNodeName; /* 付款节点名称 */
	private BigDecimal	payRatio; /* 付款比例 */
	private Integer	payoffDays; /* 账期 */
	private Date	createTime; /* 创建时间 */
	private Long	createAcctId; /* 创建人账户ID */
	private String	createName; /* 创建人姓名 */

	// Constructor
	public EntPaySetDTO() {
	}

	/**
	 * full Constructor
	 */
	public EntPaySetDTO(Long paySetId, Long memberId, Integer payNodeType, String payNodeName, BigDecimal payRatio, Integer payoffDays, Date createTime, Long createAcctId, String createName) {
		this.paySetId = paySetId;
		this.memberId = memberId;
		this.payNodeType = payNodeType;
		this.payNodeName = payNodeName;
		this.payRatio = payRatio;
		this.payoffDays = payoffDays;
		this.createTime = createTime;
		this.createAcctId = createAcctId;
		this.createName = createName;
	}

	public Long getPaySetId() {
		return paySetId;
	}

	public void setPaySetId(Long paySetId) {
		this.paySetId = paySetId;
	}
	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}
	public Integer getPayNodeType() {
		return payNodeType;
	}

	public void setPayNodeType(Integer payNodeType) {
		this.payNodeType = payNodeType;
	}
	public String getPayNodeName() {
		return payNodeName;
	}

	public void setPayNodeName(String payNodeName) {
		this.payNodeName = payNodeName;
	}
	public BigDecimal getPayRatio() {
		return payRatio;
	}

	public void setPayRatio(BigDecimal payRatio) {
		this.payRatio = payRatio;
	}
	public Integer getPayoffDays() {
		return payoffDays;
	}

	public void setPayoffDays(Integer payoffDays) {
		this.payoffDays = payoffDays;
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
		return "EntPaySetDTO [" + "paySetId=" + paySetId + ", memberId=" + memberId + ", payNodeType=" + payNodeType + ", payNodeName=" + payNodeName + ", payRatio=" + payRatio + ", payoffDays=" + payoffDays + ", createTime=" + createTime + ", createAcctId=" + createAcctId + ", createName=" + createName +  "]";
	}
}
