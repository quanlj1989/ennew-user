package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.MarketCateStandardCharge;
import org.springframework.stereotype.Repository;

/**
 * ClassName: MarketCateStandardCharge
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public interface MarketCateStandardChargeService {

    public List<MarketCateStandardCharge> findAll();

    public List<MarketCateStandardCharge> findMarketCateStandardCharges(MarketCateStandardCharge record);

    public MarketCateStandardCharge getMarketCateStandardChargeByPrimaryKey(Long chargeId);

    public Integer deleteByPrimaryKey(Long chargeId);

    public Integer createMarketCateStandardCharge(MarketCateStandardCharge record);

    public Integer deleteMarketCateStandardCharge(MarketCateStandardCharge record);

    public Integer removeMarketCateStandardCharge(MarketCateStandardCharge record);

    public Integer updateMarketCateStandardChargeByPrimaryKeySelective(MarketCateStandardCharge record);









}