/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */
package cn.enn.ygego.sunny.user.dto.supermarket;

import java.util.List;

/**
 * ClassName: SupermarketDetailsVO	
 * Description 
 * Author zhangjiaqi
 * Date 2018-03-30 19:36 
 * History: 
 * <author>          <time>          <version>          <desc>
 * zhangjiaqi    2018-03-30 19:36      0.0.1             TODO
 */

public class SupermarketDetailsVO {

    // 超市名称
    private String supermarketName;
    // 超市详情
    private SupermarketInfoVO supermarketInfo;
    // 超市类目
    private List<SupermarketCategoryVO> supermarketCategorys;

    public SupermarketDetailsVO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public SupermarketDetailsVO(String supermarketName, SupermarketInfoVO supermarketInfo,
            List<SupermarketCategoryVO> supermarketCategorys) {
        super();
        this.supermarketName = supermarketName;
        this.supermarketInfo = supermarketInfo;
        this.supermarketCategorys = supermarketCategorys;
    }

    public String getSupermarketName() {
        return supermarketName;
    }

    public void setSupermarketName(String supermarketName) {
        this.supermarketName = supermarketName;
    }

    public SupermarketInfoVO getSupermarketInfo() {
        return supermarketInfo;
    }

    public void setSupermarketInfo(SupermarketInfoVO supermarketInfo) {
        this.supermarketInfo = supermarketInfo;
    }

    public List<SupermarketCategoryVO> getSupermarketCategorys() {
        return supermarketCategorys;
    }

    public void setSupermarketCategorys(List<SupermarketCategoryVO> supermarketCategorys) {
        this.supermarketCategorys = supermarketCategorys;
    }

    @Override
    public String toString() {
        return "SupermarketDetailsVO [supermarketName=" + supermarketName + ", supermarketInfo=" + supermarketInfo
                + ", supermarketCategorys=" + supermarketCategorys + "]";
    }

}
