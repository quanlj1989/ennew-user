package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.MarketStockAlertSet;
import org.springframework.stereotype.Repository;

/**
 * ClassName: MarketStockAlertSet
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public interface MarketStockAlertSetService {

    public List<MarketStockAlertSet> findAll();

    public List<MarketStockAlertSet> findMarketStockAlertSets(MarketStockAlertSet record);

    public MarketStockAlertSet getMarketStockAlertSetByPrimaryKey(Long alertSetId);

    public Integer deleteByPrimaryKey(Long alertSetId);

    public Integer createMarketStockAlertSet(MarketStockAlertSet record);

    public Integer deleteMarketStockAlertSet(MarketStockAlertSet record);

    public Integer removeMarketStockAlertSet(MarketStockAlertSet record);

    public Integer updateMarketStockAlertSetByPrimaryKeySelective(MarketStockAlertSet record);









}