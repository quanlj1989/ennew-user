package cn.enn.ygego.sunny.user.dto.vo;

import java.io.Serializable;
import java.util.List;

/**
 * ClassName: EntQueryVO
 * Description:
 * Author: en3
 * Date: 2018/3/28 15:16
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class EntQueryVO implements Serializable{

    private static final long serialVersionUID = 6037496288292823536L;

    private List<Integer> categoryIds; /* 类目ID */
    private Long	memberId; /* 会员ID */
    private String EntName;
    private Integer pageSize;
    private Integer pageNum;
    private Integer startRow;
    private String entType;

    public List<Integer> getCategoryIds() {
        return categoryIds;
    }

    public void setCategoryIds(List<Integer> categoryIds) {
        this.categoryIds = categoryIds;
    }

    public String getEntName() {
        return EntName;
    }

    public void setEntName(String entName) {
        EntName = entName;
    }

    public String getEntType() {
        return entType;
    }

    public void setEntType(String entType) {
        this.entType = entType;
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

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }
}
