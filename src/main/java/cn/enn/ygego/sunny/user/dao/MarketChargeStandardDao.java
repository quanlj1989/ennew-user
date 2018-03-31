package cn.enn.ygego.sunny.user.dao;

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
public interface MarketChargeStandardDao {

    List<MarketChargeStandard> selectAll();

    List<MarketChargeStandard> select(MarketChargeStandard record);

    Integer selectCount(MarketChargeStandard record);

    MarketChargeStandard selectByPrimaryKey(Long chargeStandardId);

    Integer deleteByPrimaryKey(Long chargeStandardId);

    Integer delete(MarketChargeStandard record);

    Integer insertSelective(MarketChargeStandard record);

    Integer updateByPrimaryKeySelective(MarketChargeStandard record);







}