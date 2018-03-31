package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.MarketInfo;
import org.springframework.stereotype.Repository;

/**
 * ClassName: MarketInfo
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public interface MarketInfoService {

    public List<MarketInfo> findAll();

    public List<MarketInfo> findMarketInfos(MarketInfo record);

    public MarketInfo getMarketInfoByPrimaryKey(Long marketId);

    public Integer deleteByPrimaryKey(Long marketId);

    public Integer createMarketInfo(MarketInfo record);

    public Integer deleteMarketInfo(MarketInfo record);

    public Integer removeMarketInfo(MarketInfo record);

    public Integer updateMarketInfoByPrimaryKeySelective(MarketInfo record);









}