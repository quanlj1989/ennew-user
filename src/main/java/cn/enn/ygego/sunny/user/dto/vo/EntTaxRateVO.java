/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */

package cn.enn.ygego.sunny.user.dto.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * ClassName: EntTaxRatePaySetVO
 * Description:
 * Author: liangchao
 * Date: 2018/3/23 20:19
 * History:
 * <author>          <time>          <version>          <desc>
 * liangc           修改时间           0.0.1              描述
 */
public class EntTaxRateVO implements Serializable {

    private static final long serialVersionUID = 1729046615746325279L;

    private Integer pageSize;   /* 每页显示条目 */
    private Integer pageNum;    /* 当前页码 */
    private Integer startRow;   /* 开始行 */

    private Long	memberId; /* 会员ID */
    private Integer	invoiceType; /* 发票类型 */
    private Integer	invoiceMethod; /* 发票方式 */
//    private Integer	startTaxRate; /* 发票税率开始区间 */
//    private Integer	endTaxRate; /* 发票税率开始区间 */

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

    public Integer getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(Integer invoiceType) {
        this.invoiceType = invoiceType;
    }

    public Integer getInvoiceMethod() {
        return invoiceMethod;
    }

    public void setInvoiceMethod(Integer invoiceMethod) {
        this.invoiceMethod = invoiceMethod;
    }
}
