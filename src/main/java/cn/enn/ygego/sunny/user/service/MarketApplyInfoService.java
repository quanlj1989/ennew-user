package cn.enn.ygego.sunny.user.service;

import cn.enn.ygego.sunny.user.model.MarketApplyInfo;

import java.util.List;

/**
 * ClassName: MarketApplyInfo
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public interface MarketApplyInfoService {

    public List<MarketApplyInfo> findAll();

    public List<MarketApplyInfo> findMarketApplyInfos(MarketApplyInfo record);

    public MarketApplyInfo getMarketApplyInfoByPrimaryKey(Long marketApplyId);

    public Integer deleteByPrimaryKey(Long marketApplyId);

    public Integer createMarketApplyInfo(MarketApplyInfo record);

    public Integer deleteMarketApplyInfo(MarketApplyInfo record);

    public Integer removeMarketApplyInfo(MarketApplyInfo record);

    public Integer updateMarketApplyInfoByPrimaryKeySelective(MarketApplyInfo record);









}