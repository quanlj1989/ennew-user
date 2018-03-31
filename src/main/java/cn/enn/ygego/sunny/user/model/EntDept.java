package cn.enn.ygego.sunny.user.model;

import java.util.Date;
import java.io.Serializable;

/**
 * entity:EntDept
 * 
 * @author gencode
 */
public class EntDept implements Serializable {
	
	private static final long serialVersionUID = -6901756791281524844L;
	
	private Long	deptId;		 /* 部门ID */ 
	private Long	memberId;		 /* 会员ID */ 
	private Long	pareDeptId;		 /* 父级部门ID */ 
	private String	deptName;		 /* 部门名称 */ 
	private String	memo;		 /* 备注 */ 
	private Date	createTime;		 /* 创建时间 */ 
	private Long	createMemberId;		 /* 创建人会员ID */ 
	private Long	createAcctId;		 /* 创建人账户ID */ 
	private String	createName;		 /* 创建人姓名 */ 

	// Constructor
	public EntDept() {
	}

	/**
	 * full Constructor
	 */
	public EntDept(Long deptId, Long memberId, Long pareDeptId, String deptName, String memo, Date createTime, Long createMemberId, Long createAcctId, String createName) {
		this.deptId = deptId;
		this.memberId = memberId;
		this.pareDeptId = pareDeptId;
		this.deptName = deptName;
		this.memo = memo;
		this.createTime = createTime;
		this.createMemberId = createMemberId;
		this.createAcctId = createAcctId;
		this.createName = createName;
	}

	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public Long getPareDeptId() {
		return pareDeptId;
	}

	public void setPareDeptId(Long pareDeptId) {
		this.pareDeptId = pareDeptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
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
		return "EntDept [" + "deptId=" + deptId+ ", memberId=" + memberId+ ", pareDeptId=" + pareDeptId+ ", deptName=" + deptName+ ", memo=" + memo+ ", createTime=" + createTime+ ", createMemberId=" + createMemberId+ ", createAcctId=" + createAcctId+ ", createName=" + createName+  "]";
	}
}
