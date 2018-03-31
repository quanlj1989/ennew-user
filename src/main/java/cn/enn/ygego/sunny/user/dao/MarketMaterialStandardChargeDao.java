package cn.enn.ygego.sunny.user.dao;

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
public interface MarketMaterialStandardChargeDao {

    List<MarketMaterialStandardCharge> selectAll();

    List<MarketMaterialStandardCharge> select(MarketMaterialStandardCharge record);

    Integer selectCount(MarketMaterialStandardCharge record);

    MarketMaterialStandardCharge selectByPrimaryKey(Long chargeId);

    Integer deleteByPrimaryKey(Long chargeId);

    Integer delete(MarketMaterialStandardCharge record);

    Integer insertSelective(MarketMaterialStandardCharge record);

    Integer updateByPrimaryKeySelective(MarketMaterialStandardCharge record);







}