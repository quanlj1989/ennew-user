/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */
package cn.enn.ygego.sunny.user.dto.supermarket;

import java.util.Date;

/**
 * 超市入驻供应商描述类
 * ClassName: EnterSupplierVO	
 * Description 
 * Author zhangjiaqi
 * Date 2018-03-31 10:35 
 * History: 
 * <author>          <time>          <version>          <desc>
 * zhangjiaqi    2018-03-31 10:35      0.0.1             TODO
 */

public class EnterSupplierVO {

    // 供应商id
    private Long supplierId;
    // 供应商名称
    private String supplierName;
    // 提交时间
    private Date applyDate;
    // 入驻时间
    private Date enterDate;
    // 寄售商品数
    private Integer consignGoodsNum;
    // 联营商品数
    private Integer joinGoodsNum;
    // 本月销售额/万元
    private Integer sales;

    public EnterSupplierVO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public EnterSupplierVO(Long supplierId, String supplierName, Date applyDate, Date enterDate,
            Integer consignGoodsNum, Integer joinGoodsNum, Integer sales) {
        super();
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.applyDate = applyDate;
        this.enterDate = enterDate;
        this.consignGoodsNum = consignGoodsNum;
        this.joinGoodsNum = joinGoodsNum;
        this.sales = sales;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public Date getEnterDate() {
        return enterDate;
    }

    public void setEnterDate(Date enterDate) {
        this.enterDate = enterDate;
    }

    public Integer getConsignGoodsNum() {
        return consignGoodsNum;
    }

    public void setConsignGoodsNum(Integer consignGoodsNum) {
        this.consignGoodsNum = consignGoodsNum;
    }

    public Integer getJoinGoodsNum() {
        return joinGoodsNum;
    }

    public void setJoinGoodsNum(Integer joinGoodsNum) {
        this.joinGoodsNum = joinGoodsNum;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    @Override
    public String toString() {
        return "EnterSupplierVO [supplierId=" + supplierId + ", supplierName=" + supplierName + ", applyDate="
                + applyDate + ", enterDate=" + enterDate + ", consignGoodsNum=" + consignGoodsNum + ", joinGoodsNum="
                + joinGoodsNum + ", sales=" + sales + "]";
    }

}
