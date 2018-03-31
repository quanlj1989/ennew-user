/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */
package cn.enn.ygego.sunny.user.dto.vo;

import java.io.Serializable;

/**
 * 分页
 * ClassName: PageVO	
 * Description 
 * Author zhangjiaqi
 * Date 2018-03-24 17:00 
 * History: 
 * <author>          <time>          <version>          <desc>
 * zhangjiaqi    2018-03-24 17:00      0.0.1             TODO
 */

public class PageVO implements Serializable {

    private Integer pageSize;
    private Integer pageNum;
    private Integer startRow;

    public PageVO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public PageVO(Integer pageSize, Integer pageNum, Integer startRow) {
        super();
        this.pageSize = pageSize;
        this.pageNum = pageNum;
        this.startRow = startRow;
    }

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

    @Override
    public String toString() {
        return "PageVO [pageSize=" + pageSize + ", pageNum=" + pageNum + ", startRow=" + startRow + "]";
    }

}
