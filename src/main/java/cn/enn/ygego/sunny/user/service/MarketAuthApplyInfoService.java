package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.MarketAuthApplyInfo;
import org.springframework.stereotype.Repository;

/**
 * ClassName: MarketAuthApplyInfo
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public interface MarketAuthApplyInfoService {

    public List<MarketAuthApplyInfo> findAll();

    public List<MarketAuthApplyInfo> findMarketAuthApplyInfos(MarketAuthApplyInfo record);

    public MarketAuthApplyInfo getMarketAuthApplyInfoByPrimaryKey(Long authApplyId);

    public Integer deleteByPrimaryKey(Long authApplyId);

    public Integer createMarketAuthApplyInfo(MarketAuthApplyInfo record);

    public Integer deleteMarketAuthApplyInfo(MarketAuthApplyInfo record);

    public Integer removeMarketAuthApplyInfo(MarketAuthApplyInfo record);

    public Integer updateMarketAuthApplyInfoByPrimaryKeySelective(MarketAuthApplyInfo record);









}