package cn.enn.ygego.sunny.user.dto.factory;

import java.io.Serializable;
/**
 * 
 * ClassName: CategoryQueryDTO	
 * Description 验厂类目列表查询(带分页)对象
 * Author zhengyang
 * Date 2018年3月30日 下午7:02:46 
 */
public class CategoryQueryVO implements Serializable {
	private static final long serialVersionUID = 557872437045730564L;
	/** 分页条数 */
	private Integer pageSize;
	/** 页码 */
	private Integer pageNum;
	/** 开始条数 */
	private Integer startRow;
	/** 类目id */
	private String categoryId;
	/** 申请状态 */
	private String applystatus;
	/** 创建人id */
	private String createMemberId;

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getStartRow() {
		return startRow;
	}

	public void setStartRow(Integer startRow) {
		this.startRow = startRow;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getApplystatus() {
		return applystatus;
	}

	public void setApplystatus(String applystatus) {
		this.applystatus = applystatus;
	}

	public String getCreateMemberId() {
		return createMemberId;
	}

	public void setCreateMemberId(String createMemberId) {
		this.createMemberId = createMemberId;
	}

	@Override
	public String toString() {
		return "CategoryQueryVO [pageSize=" + pageSize + ", pageNum=" + pageNum
				+ ", startRow=" + startRow + ", categoryId=" + categoryId
				+ ", applystatus=" + applystatus + ", createMemberId="
				+ createMemberId + "]";
	}
}
