package cn.enn.ygego.sunny.user.model;

import java.util.Date;
import java.io.Serializable;

/**
 * entity:EntJoinMarket
 * 
 * @author gencode
 */
public class EntJoinMarket implements Serializable {
	
	private static final long serialVersionUID = 7240522379001109240L;
	
	private Long	joinId;		 /* 入驻ID */ 
	private Long	memberId;		 /* 会员ID */ 
	private Long	marketId;		 /* 超市ID */ 
	private String	marketName;		 /* 超市名称 */ 
	private Integer	status;		 /* 状态 */ 
	private Date	createTime;		 /* 创建时间 */ 
	private Long	createAcctId;		 /* 创建人账户ID */ 
	private String	createName;		 /* 创建人姓名 */ 

	// Constructor
	public EntJoinMarket() {
	}

	/**
	 * full Constructor
	 */
	public EntJoinMarket(Long joinId, Long memberId, Long marketId, String marketName, Integer status, Date createTime, Long createAcctId, String createName) {
		this.joinId = joinId;
		this.memberId = memberId;
		this.marketId = marketId;
		this.marketName = marketName;
		this.status = status;
		this.createTime = createTime;
		this.createAcctId = createAcctId;
		this.createName = createName;
	}

	public Long getJoinId() {
		return joinId;
	}

	public void setJoinId(Long joinId) {
		this.joinId = joinId;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public Long getMarketId() {
		return marketId;
	}

	public void setMarketId(Long marketId) {
		this.marketId = marketId;
	}

	public String getMarketName() {
		return marketName;
	}

	public void setMarketName(String marketName) {
		this.marketName = marketName;
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
		return "EntJoinMarket [" + "joinId=" + joinId+ ", memberId=" + memberId+ ", marketId=" + marketId+ ", marketName=" + marketName+ ", status=" + status+ ", createTime=" + createTime+ ", createAcctId=" + createAcctId+ ", createName=" + createName+  "]";
	}
}
