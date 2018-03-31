/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */
package cn.enn.ygego.sunny.user.dto.supermarket;

import cn.enn.ygego.sunny.user.dto.vo.PageVO;

/**
 * 入驻申请后的超市查询描述类
 * ClassName: SupermarketEnterPageVO	
 * Description 
 * Author zhangjiaqi
 * Date 2018-03-30 14:56 
 * History: 
 * <author>          <time>          <version>          <desc>
 * zhangjiaqi    2018-03-30 14:56      0.0.1             TODO
 */

public class SupermarketEnterPageVO extends PageVO {

    // 超市名称
    private String supermarketName;
    // 超市编码
    private String supermarketCode;
    // 状态
    private Integer status;

    public SupermarketEnterPageVO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public SupermarketEnterPageVO(Integer pageSize, Integer pageNum, Integer startRow) {
        super(pageSize, pageNum, startRow);
        // TODO Auto-generated constructor stub
    }

    public SupermarketEnterPageVO(String supermarketName, String supermarketCode, Integer status) {
        super();
        this.supermarketName = supermarketName;
        this.supermarketCode = supermarketCode;
        this.status = status;
    }

    public String getSupermarketName() {
        return supermarketName;
    }

    public void setSupermarketName(String supermarketName) {
        this.supermarketName = supermarketName;
    }

    public String getSupermarketCode() {
        return supermarketCode;
    }

    public void setSupermarketCode(String supermarketCode) {
        this.supermarketCode = supermarketCode;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SupermarketEnterPageVO [supermarketName=" + supermarketName + ", supermarketCode=" + supermarketCode
                + ", status=" + status + "]";
    }

}
