package cn.enn.ygego.sunny.user.service;

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
public interface MarketBuyerDiscountMaterialService {

    public List<MarketBuyerDiscountMaterial> findAll();

    public List<MarketBuyerDiscountMaterial> findMarketBuyerDiscountMaterials(MarketBuyerDiscountMaterial record);

    public MarketBuyerDiscountMaterial getMarketBuyerDiscountMaterialByPrimaryKey(Long discountId);

    public Integer deleteByPrimaryKey(Long discountId);

    public Integer createMarketBuyerDiscountMaterial(MarketBuyerDiscountMaterial record);

    public Integer deleteMarketBuyerDiscountMaterial(MarketBuyerDiscountMaterial record);

    public Integer removeMarketBuyerDiscountMaterial(MarketBuyerDiscountMaterial record);

    public Integer updateMarketBuyerDiscountMaterialByPrimaryKeySelective(MarketBuyerDiscountMaterial record);









}