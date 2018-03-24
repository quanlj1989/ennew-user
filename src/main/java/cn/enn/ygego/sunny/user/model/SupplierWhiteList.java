package cn.enn.ygego.sunny.user.model;

import java.util.Date;
import java.io.Serializable;

/**
 * entity:SupplierWhiteList
 * 
 * @author gencode
 */
public class SupplierWhiteList implements Serializable {
	
	private static final long serialVersionUID = 7032009664084022717L;
	
	private Long	supplierListId;		 /* 供应商名单标识 */ 
	private Long	listId;		 /* 名单标识 */ 
	private Integer	supplierMemberId;		 /* 供应商会员ID */ 
	private String	supplierName;		 /* 供应商名称 */ 
	private Integer	listStatus;		 /* 名单状态 */ 
	private Date	createTime;		 /* 创建时间 */ 
	private Long	createAcctId;		 /* 创建人账户ID */ 
	private String	createName;		 /* 创建人姓名 */ 

	// Constructor
	public SupplierWhiteList() {
	}

	/**
	 * full Constructor
	 */
	public SupplierWhiteList(Long supplierListId, Long listId, Integer supplierMemberId, String supplierName, Integer listStatus, Date createTime, Long createAcctId, String createName) {
		this.supplierListId = supplierListId;
		this.listId = listId;
		this.supplierMemberId = supplierMemberId;
		this.supplierName = supplierName;
		this.listStatus = listStatus;
		this.createTime = createTime;
		this.createAcctId = createAcctId;
		this.createName = createName;
	}

	public Long getSupplierListId() {
		return supplierListId;
	}

	public void setSupplierListId(Long supplierListId) {
		this.supplierListId = supplierListId;
	}

	public Long getListId() {
		return listId;
	}

	public void setListId(Long listId) {
		this.listId = listId;
	}

	public Integer getSupplierMemberId() {
		return supplierMemberId;
	}

	public void setSupplierMemberId(Integer supplierMemberId) {
		this.supplierMemberId = supplierMemberId;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public Integer getListStatus() {
		return listStatus;
	}

	public void setListStatus(Integer listStatus) {
		this.listStatus = listStatus;
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
		return "SupplierWhiteList [" + "supplierListId=" + supplierListId+ ", listId=" + listId+ ", supplierMemberId=" + supplierMemberId+ ", supplierName=" + supplierName+ ", listStatus=" + listStatus+ ", createTime=" + createTime+ ", createAcctId=" + createAcctId+ ", createName=" + createName+  "]";
	}
}
