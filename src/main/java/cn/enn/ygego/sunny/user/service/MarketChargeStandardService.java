package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.MarketChargeStandard;
import org.springframework.stereotype.Repository;

/**
 * ClassName: MarketChargeStandard
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public interface MarketChargeStandardService {

    public List<MarketChargeStandard> findAll();

    public List<MarketChargeStandard> findMarketChargeStandards(MarketChargeStandard record);

    public MarketChargeStandard getMarketChargeStandardByPrimaryKey(Long chargeStandardId);

    public Integer deleteByPrimaryKey(Long chargeStandardId);

    public Integer createMarketChargeStandard(MarketChargeStandard record);

    public Integer deleteMarketChargeStandard(MarketChargeStandard record);

    public Integer removeMarketChargeStandard(MarketChargeStandard record);

    public Integer updateMarketChargeStandardByPrimaryKeySelective(MarketChargeStandard record);









}