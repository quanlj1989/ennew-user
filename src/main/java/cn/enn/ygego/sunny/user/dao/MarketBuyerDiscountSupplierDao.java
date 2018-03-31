package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import cn.enn.ygego.sunny.user.model.MarketBuyerDiscountSupplier;
import org.springframework.stereotype.Repository;


/**
 * ClassName: MarketBuyerDiscountSupplier
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public interface MarketBuyerDiscountSupplierDao {

    List<MarketBuyerDiscountSupplier> selectAll();

    List<MarketBuyerDiscountSupplier> select(MarketBuyerDiscountSupplier record);

    Integer selectCount(MarketBuyerDiscountSupplier record);

    MarketBuyerDiscountSupplier selectByPrimaryKey(Long discountId);

    Integer deleteByPrimaryKey(Long discountId);

    Integer delete(MarketBuyerDiscountSupplier record);

    Integer insertSelective(MarketBuyerDiscountSupplier record);

    Integer updateByPrimaryKeySelective(MarketBuyerDiscountSupplier record);







}