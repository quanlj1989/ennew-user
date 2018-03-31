package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.MarketDiscountMaterial;
import org.springframework.stereotype.Repository;

/**
 * ClassName: MarketDiscountMaterial
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public interface MarketDiscountMaterialService {

    public List<MarketDiscountMaterial> findAll();

    public List<MarketDiscountMaterial> findMarketDiscountMaterials(MarketDiscountMaterial record);

    public MarketDiscountMaterial getMarketDiscountMaterialByPrimaryKey(Long chargeId);

    public Integer deleteByPrimaryKey(Long chargeId);

    public Integer createMarketDiscountMaterial(MarketDiscountMaterial record);

    public Integer deleteMarketDiscountMaterial(MarketDiscountMaterial record);

    public Integer removeMarketDiscountMaterial(MarketDiscountMaterial record);

    public Integer updateMarketDiscountMaterialByPrimaryKeySelective(MarketDiscountMaterial record);









}