/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */
package cn.enn.ygego.sunny.user.dto.supermarket;

/**
 * 申请入驻 - 超市类目详情描述类
 * ClassName: SupermarketTypeVO	
 * Description 
 * Author zhangjiaqi
 * Date 2018-03-30 19:11 
 * History: 
 * <author>          <time>          <version>          <desc>
 * zhangjiaqi    2018-03-30 19:11      0.0.1             TODO
 */

public class SupermarketCategoryVO {

    // 一级类目
    private String firstCategory;
    // 二级类目
    private String secondCategory;
    // 三级类目
    private String thirdCategory;

    public SupermarketCategoryVO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public SupermarketCategoryVO(String firstCategory, String secondCategory, String thirdCategory) {
        super();
        this.firstCategory = firstCategory;
        this.secondCategory = secondCategory;
        this.thirdCategory = thirdCategory;
    }

    public String getFirstCategory() {
        return firstCategory;
    }

    public void setFirstCategory(String firstCategory) {
        this.firstCategory = firstCategory;
    }

    public String getSecondCategory() {
        return secondCategory;
    }

    public void setSecondCategory(String secondCategory) {
        this.secondCategory = secondCategory;
    }

    public String getThirdCategory() {
        return thirdCategory;
    }

    public void setThirdCategory(String thirdCategory) {
        this.thirdCategory = thirdCategory;
    }

    @Override
    public String toString() {
        return "SupermarketCategoryVO [firstCategory=" + firstCategory + ", secondCategory=" + secondCategory
                + ", thirdCategory=" + thirdCategory + "]";
    }

}
