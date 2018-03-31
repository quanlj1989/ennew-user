package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.MarketStorageInfo;
import org.springframework.stereotype.Repository;

/**
 * ClassName: MarketStorageInfo
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public interface MarketStorageInfoService {

    public List<MarketStorageInfo> findAll();

    public List<MarketStorageInfo> findMarketStorageInfos(MarketStorageInfo record);

    public MarketStorageInfo getMarketStorageInfoByPrimaryKey(Long storageId);

    public Integer deleteByPrimaryKey(Long storageId);

    public Integer createMarketStorageInfo(MarketStorageInfo record);

    public Integer deleteMarketStorageInfo(MarketStorageInfo record);

    public Integer removeMarketStorageInfo(MarketStorageInfo record);

    public Integer updateMarketStorageInfoByPrimaryKeySelective(MarketStorageInfo record);









}