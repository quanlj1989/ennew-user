package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.MarketCateMaterial;
import org.springframework.stereotype.Repository;

/**
 * ClassName: MarketCateMaterial
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public interface MarketCateMaterialService {

    public List<MarketCateMaterial> findAll();

    public List<MarketCateMaterial> findMarketCateMaterials(MarketCateMaterial record);

    public MarketCateMaterial getMarketCateMaterialByPrimaryKey(Long cateMaterialId);

    public Integer deleteByPrimaryKey(Long cateMaterialId);

    public Integer createMarketCateMaterial(MarketCateMaterial record);

    public Integer deleteMarketCateMaterial(MarketCateMaterial record);

    public Integer removeMarketCateMaterial(MarketCateMaterial record);

    public Integer updateMarketCateMaterialByPrimaryKeySelective(MarketCateMaterial record);









}