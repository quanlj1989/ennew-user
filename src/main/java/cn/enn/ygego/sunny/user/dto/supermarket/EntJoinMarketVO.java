/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */
package cn.enn.ygego.sunny.user.dto.supermarket;

/**
 * 企业入驻超市描述类
 * ClassName: EntJoinMarketVO	
 * Description 
 * Author zhangjiaqi
 * Date 2018-03-30 15:09 
 * History: 
 * <author>          <time>          <version>          <desc>
 * zhangjiaqi    2018-03-30 15:09      0.0.1             TODO
 */

public class EntJoinMarketVO {

    // 入驻id
    private Long joinId;
    // 超市编码
    private String marketCode;
    // 超市名称
    private String marketName;
    // 状态
    private Integer status;

    public EntJoinMarketVO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public EntJoinMarketVO(Long joinId, String marketCode, String marketName, Integer status) {
        super();
        this.joinId = joinId;
        this.marketCode = marketCode;
        this.marketName = marketName;
        this.status = status;
    }

    public Long getJoinId() {
        return joinId;
    }

    public void setJoinId(Long joinId) {
        this.joinId = joinId;
    }

    public String getMarketCode() {
        return marketCode;
    }

    public void setMarketCode(String marketCode) {
        this.marketCode = marketCode;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "EntJoinMarketVO [joinId=" + joinId + ", marketCode=" + marketCode + ", marketName=" + marketName
                + ", status=" + status + "]";
    }

}
