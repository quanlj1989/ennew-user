package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import cn.enn.ygego.sunny.user.model.MarketBuyerDiscountCate;
import org.springframework.stereotype.Repository;


/**
 * ClassName: MarketBuyerDiscountCate
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public interface MarketBuyerDiscountCateDao {

    List<MarketBuyerDiscountCate> selectAll();

    List<MarketBuyerDiscountCate> select(MarketBuyerDiscountCate record);

    Integer selectCount(MarketBuyerDiscountCate record);

    MarketBuyerDiscountCate selectByPrimaryKey(Long discountId);

    Integer deleteByPrimaryKey(Long discountId);

    Integer delete(MarketBuyerDiscountCate record);

    Integer insertSelective(MarketBuyerDiscountCate record);

    Integer updateByPrimaryKeySelective(MarketBuyerDiscountCate record);







}