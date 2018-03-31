package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.MarketCateCertApply;
import org.springframework.stereotype.Repository;

/**
 * ClassName: MarketCateCertApply
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public interface MarketCateCertApplyService {

    public List<MarketCateCertApply> findAll();

    public List<MarketCateCertApply> findMarketCateCertApplys(MarketCateCertApply record);

    public MarketCateCertApply getMarketCateCertApplyByPrimaryKey(Long certApplyDetailId);

    public Integer deleteByPrimaryKey(Long certApplyDetailId);

    public Integer createMarketCateCertApply(MarketCateCertApply record);

    public Integer deleteMarketCateCertApply(MarketCateCertApply record);

    public Integer removeMarketCateCertApply(MarketCateCertApply record);

    public Integer updateMarketCateCertApplyByPrimaryKeySelective(MarketCateCertApply record);









}