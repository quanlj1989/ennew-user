package cn.enn.ygego.sunny.user.dao;

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
public interface MarketCateStandardChargeDao {

    List<MarketCateStandardCharge> selectAll();

    List<MarketCateStandardCharge> select(MarketCateStandardCharge record);

    Integer selectCount(MarketCateStandardCharge record);

    MarketCateStandardCharge selectByPrimaryKey(Long chargeId);

    Integer deleteByPrimaryKey(Long chargeId);

    Integer delete(MarketCateStandardCharge record);

    Integer insertSelective(MarketCateStandardCharge record);

    Integer updateByPrimaryKeySelective(MarketCateStandardCharge record);







}