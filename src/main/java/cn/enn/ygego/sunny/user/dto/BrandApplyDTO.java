package cn.enn.ygego.sunny.user.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * DTO:DictBrand
 * 
 * @author zx.dev
 * @date 2018-3-14
 */
public class BrandApplyDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long applyId; /* 申请ID */
	private Integer status; /* 状态 */
	private String brandName; /* 品牌名称 */
	private String brandEnName; /* 品牌英文名称 */
	private String brandAlias; /* 品牌别名 */
	private String companyName; /* 公司名称 */
	private Integer country; /* 国家 */
	private String brandLogo; /* 品牌logo */
	private String brandDesc; /* 品牌描述 */
	private Date createTime; /* 创建时间 */
	private Long createAcctId; /* 创建人账户ID */
	private Date approveTime; /* 审批时间 */
	private Long approveAcctId; /* 审批人账户ID */
	private String approveDesc; /* 审批描述 */

	public Long getApplyId() {
		return applyId;
	}

	public void setApplyId(Long applyId) {
		this.applyId = applyId;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getBrandEnName() {
		return brandEnName;
	}

	public void setBrandEnName(String brandEnName) {
		this.brandEnName = brandEnName;
	}

	public String getBrandAlias() {
		return brandAlias;
	}

	public void setBrandAlias(String brandAlias) {
		this.brandAlias = brandAlias;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Integer getCountry() {
		return country;
	}

	public void setCountry(Integer country) {
		this.country = country;
	}

	public String getBrandLogo() {
		return brandLogo;
	}

	public void setBrandLogo(String brandLogo) {
		this.brandLogo = brandLogo;
	}

	public String getBrandDesc() {
		return brandDesc;
	}

	public void setBrandDesc(String brandDesc) {
		this.brandDesc = brandDesc;
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

	public Date getApproveTime() {
		return approveTime;
	}

	public void setApproveTime(Date approveTime) {
		this.approveTime = approveTime;
	}

	public Long getApproveAcctId() {
		return approveAcctId;
	}

	public void setApproveAcctId(Long approveAcctId) {
		this.approveAcctId = approveAcctId;
	}

	public String getApproveDesc() {
		return approveDesc;
	}

	public void setApproveDesc(String approveDesc) {
		this.approveDesc = approveDesc;
	}

}
