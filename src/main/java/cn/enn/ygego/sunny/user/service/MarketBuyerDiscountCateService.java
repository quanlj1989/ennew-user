package cn.enn.ygego.sunny.user.service;

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
public interface MarketBuyerDiscountCateService {

    public List<MarketBuyerDiscountCate> findAll();

    public List<MarketBuyerDiscountCate> findMarketBuyerDiscountCates(MarketBuyerDiscountCate record);

    public MarketBuyerDiscountCate getMarketBuyerDiscountCateByPrimaryKey(Long discountId);

    public Integer deleteByPrimaryKey(Long discountId);

    public Integer createMarketBuyerDiscountCate(MarketBuyerDiscountCate record);

    public Integer deleteMarketBuyerDiscountCate(MarketBuyerDiscountCate record);

    public Integer removeMarketBuyerDiscountCate(MarketBuyerDiscountCate record);

    public Integer updateMarketBuyerDiscountCateByPrimaryKeySelective(MarketBuyerDiscountCate record);









}