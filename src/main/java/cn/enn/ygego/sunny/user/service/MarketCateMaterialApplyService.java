package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.MarketCateMaterialApply;
import org.springframework.stereotype.Repository;

/**
 * ClassName: MarketCateMaterialApply
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public interface MarketCateMaterialApplyService {

    public List<MarketCateMaterialApply> findAll();

    public List<MarketCateMaterialApply> findMarketCateMaterialApplys(MarketCateMaterialApply record);

    public MarketCateMaterialApply getMarketCateMaterialApplyByPrimaryKey(Long applyId);

    public Integer deleteByPrimaryKey(Long applyId);

    public Integer createMarketCateMaterialApply(MarketCateMaterialApply record);

    public Integer deleteMarketCateMaterialApply(MarketCateMaterialApply record);

    public Integer removeMarketCateMaterialApply(MarketCateMaterialApply record);

    public Integer updateMarketCateMaterialApplyByPrimaryKeySelective(MarketCateMaterialApply record);









}