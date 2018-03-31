package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import cn.enn.ygego.sunny.user.model.MarketBuyerDiscountMaterial;
import org.springframework.stereotype.Repository;


/**
 * ClassName: MarketBuyerDiscountMaterial
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public interface MarketBuyerDiscountMaterialDao {

    List<MarketBuyerDiscountMaterial> selectAll();

    List<MarketBuyerDiscountMaterial> select(MarketBuyerDiscountMaterial record);

    Integer selectCount(MarketBuyerDiscountMaterial record);

    MarketBuyerDiscountMaterial selectByPrimaryKey(Long discountId);

    Integer deleteByPrimaryKey(Long discountId);

    Integer delete(MarketBuyerDiscountMaterial record);

    Integer insertSelective(MarketBuyerDiscountMaterial record);

    Integer updateByPrimaryKeySelective(MarketBuyerDiscountMaterial record);







}