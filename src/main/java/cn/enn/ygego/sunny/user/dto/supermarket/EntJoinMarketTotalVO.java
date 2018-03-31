/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */
package cn.enn.ygego.sunny.user.dto.supermarket;

import java.util.List;

/**
 * ClassName: EntJoinMarketTotalVO	
 * Description 
 * Author zhangjiaqi
 * Date 2018-03-30 15:55 
 * History: 
 * <author>          <time>          <version>          <desc>
 * zhangjiaqi    2018-03-30 15:55      0.0.1             TODO
 */

public class EntJoinMarketTotalVO {

    // 超市总数
    private Integer total;
    // 企业入驻超市描述类
    private List<EntJoinMarketVO> entJoinMarket;

    public EntJoinMarketTotalVO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public EntJoinMarketTotalVO(Integer total, List<EntJoinMarketVO> entJoinMarket) {
        super();
        this.total = total;
        this.entJoinMarket = entJoinMarket;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<EntJoinMarketVO> getEntJoinMarket() {
        return entJoinMarket;
    }

    public void setEntJoinMarket(List<EntJoinMarketVO> entJoinMarket) {
        this.entJoinMarket = entJoinMarket;
    }

    @Override
    public String toString() {
        return "EntJoinMarketTotalVO [total=" + total + ", entJoinMarket=" + entJoinMarket + "]";
    }

}
