package cn.enn.ygego.sunny.user.dto.vo;

import cn.enn.ygego.sunny.user.dto.ReceiveAddressDTO;

import java.io.Serializable;

/**
 * ClassName: BaseQueryVO
 * Description:
 * Author: en3
 * Date: 2018/3/21 17:19
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class BaseQueryVO implements Serializable {

    private static final long serialVersionUID = 4872046679596451292L;
    private Integer pageSize;
    private Integer pageNum;
    private Integer startRow;
    private Long	memberId; /* 会员ID */

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
