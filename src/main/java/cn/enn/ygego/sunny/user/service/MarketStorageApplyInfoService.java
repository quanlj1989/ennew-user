package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.MarketStorageApplyInfo;
import org.springframework.stereotype.Repository;

/**
 * ClassName: MarketStorageApplyInfo
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public interface MarketStorageApplyInfoService {

    public List<MarketStorageApplyInfo> findAll();

    public List<MarketStorageApplyInfo> findMarketStorageApplyInfos(MarketStorageApplyInfo record);

    public MarketStorageApplyInfo getMarketStorageApplyInfoByPrimaryKey(Long storageApplyId);

    public Integer deleteByPrimaryKey(Long storageApplyId);

    public Integer createMarketStorageApplyInfo(MarketStorageApplyInfo record);

    public Integer deleteMarketStorageApplyInfo(MarketStorageApplyInfo record);

    public Integer removeMarketStorageApplyInfo(MarketStorageApplyInfo record);

    public Integer updateMarketStorageApplyInfoByPrimaryKeySelective(MarketStorageApplyInfo record);









}