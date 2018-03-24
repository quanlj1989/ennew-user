package cn.enn.ygego.sunny.user.model;

import java.util.Date;
import java.io.Serializable;

/**
 * entity:EntTaxRate
 * 
 * @author gencode
 */
public class EntTaxRate implements Serializable {
	
	private static final long serialVersionUID = 1729046615746325279L;
	
	private Long	taxRateId;		 /* 发票税率ID */ 
	private Long	memberId;		 /* 会员ID */ 
	private Integer	invoiceType;		 /* 发票类型 */ 
	private Integer	taxRate;		 /* 发票税率 */ 
	private Integer	invoiceMethod;		 /* 发票方式 */ 
	private Date	createTime;		 /* 创建时间 */ 
	private Long	createMemberId;		 /* 创建人会员ID */ 
	private Long	createAcctId;		 /* 创建人账户ID */ 
	private String	createName;		 /* 创建人姓名 */ 

	// Constructor
	public EntTaxRate() {
	}

	/**
	 * full Constructor
	 */
	public EntTaxRate(Long taxRateId, Long memberId, Integer invoiceType, Integer taxRate, Integer invoiceMethod, Date createTime, Long createMemberId, Long createAcctId, String createName) {
		this.taxRateId = taxRateId;
		this.memberId = memberId;
		this.invoiceType = invoiceType;
		this.taxRate = taxRate;
		this.invoiceMethod = invoiceMethod;
		this.createTime = createTime;
		this.createMemberId = createMemberId;
		this.createAcctId = createAcctId;
		this.createName = createName;
	}

	public Long getTaxRateId() {
		return taxRateId;
	}

	public void setTaxRateId(Long taxRateId) {
		this.taxRateId = taxRateId;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public Integer getInvoiceType() {
		return invoiceType;
	}

	public void setInvoiceType(Integer invoiceType) {
		this.invoiceType = invoiceType;
	}

	public Integer getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(Integer taxRate) {
		this.taxRate = taxRate;
	}

	public Integer getInvoiceMethod() {
		return invoiceMethod;
	}

	public void setInvoiceMethod(Integer invoiceMethod) {
		this.invoiceMethod = invoiceMethod;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getCreateMemberId() {
		return createMemberId;
	}

	public void setCreateMemberId(Long createMemberId) {
		this.createMemberId = createMemberId;
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
		return "EntTaxRate [" + "taxRateId=" + taxRateId+ ", memberId=" + memberId+ ", invoiceType=" + invoiceType+ ", taxRate=" + taxRate+ ", invoiceMethod=" + invoiceMethod+ ", createTime=" + createTime+ ", createMemberId=" + createMemberId+ ", createAcctId=" + createAcctId+ ", createName=" + createName+  "]";
	}
}
