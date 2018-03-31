package cn.enn.ygego.sunny.user.service;

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
public interface MarketBuyerDiscountSupplierService {

    public List<MarketBuyerDiscountSupplier> findAll();

    public List<MarketBuyerDiscountSupplier> findMarketBuyerDiscountSuppliers(MarketBuyerDiscountSupplier record);

    public MarketBuyerDiscountSupplier getMarketBuyerDiscountSupplierByPrimaryKey(Long discountId);

    public Integer deleteByPrimaryKey(Long discountId);

    public Integer createMarketBuyerDiscountSupplier(MarketBuyerDiscountSupplier record);

    public Integer deleteMarketBuyerDiscountSupplier(MarketBuyerDiscountSupplier record);

    public Integer removeMarketBuyerDiscountSupplier(MarketBuyerDiscountSupplier record);

    public Integer updateMarketBuyerDiscountSupplierByPrimaryKeySelective(MarketBuyerDiscountSupplier record);









}