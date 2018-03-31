package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.MarketMaterialStandardCharge;
import org.springframework.stereotype.Repository;

/**
 * ClassName: MarketMaterialStandardCharge
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public interface MarketMaterialStandardChargeService {

    public List<MarketMaterialStandardCharge> findAll();

    public List<MarketMaterialStandardCharge> findMarketMaterialStandardCharges(MarketMaterialStandardCharge record);

    public MarketMaterialStandardCharge getMarketMaterialStandardChargeByPrimaryKey(Long chargeId);

    public Integer deleteByPrimaryKey(Long chargeId);

    public Integer createMarketMaterialStandardCharge(MarketMaterialStandardCharge record);

    public Integer deleteMarketMaterialStandardCharge(MarketMaterialStandardCharge record);

    public Integer removeMarketMaterialStandardCharge(MarketMaterialStandardCharge record);

    public Integer updateMarketMaterialStandardChargeByPrimaryKeySelective(MarketMaterialStandardCharge record);









}