package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.MarketAuthInfo;
import org.springframework.stereotype.Repository;

/**
 * ClassName: MarketAuthInfo
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public interface MarketAuthInfoService {

    public List<MarketAuthInfo> findAll();

    public List<MarketAuthInfo> findMarketAuthInfos(MarketAuthInfo record);

    public MarketAuthInfo getMarketAuthInfoByPrimaryKey(Long authId);

    public Integer deleteByPrimaryKey(Long authId);

    public Integer createMarketAuthInfo(MarketAuthInfo record);

    public Integer deleteMarketAuthInfo(MarketAuthInfo record);

    public Integer removeMarketAuthInfo(MarketAuthInfo record);

    public Integer updateMarketAuthInfoByPrimaryKeySelective(MarketAuthInfo record);









}