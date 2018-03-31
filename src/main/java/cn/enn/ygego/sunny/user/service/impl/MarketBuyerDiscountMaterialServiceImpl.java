package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.MarketBuyerDiscountMaterialService;
import cn.enn.ygego.sunny.user.dao.MarketBuyerDiscountMaterialDao;
import cn.enn.ygego.sunny.user.model.MarketBuyerDiscountMaterial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: MarketBuyerDiscountMaterial
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@Service("marketBuyerDiscountMaterialService")
public class MarketBuyerDiscountMaterialServiceImpl implements MarketBuyerDiscountMaterialService{

    @Autowired
    private MarketBuyerDiscountMaterialDao marketBuyerDiscountMaterialDao;

    public List<MarketBuyerDiscountMaterial> findAll(){
       return  marketBuyerDiscountMaterialDao.selectAll();
    }

    public List<MarketBuyerDiscountMaterial> findMarketBuyerDiscountMaterials(MarketBuyerDiscountMaterial record){
       return  marketBuyerDiscountMaterialDao.select(record);
    }

    public MarketBuyerDiscountMaterial getMarketBuyerDiscountMaterialByPrimaryKey(Long discountId){
        return marketBuyerDiscountMaterialDao.selectByPrimaryKey(discountId);
    }

    public Integer deleteByPrimaryKey(Long discountId){
        return marketBuyerDiscountMaterialDao.deleteByPrimaryKey(discountId);
    }

    public Integer createMarketBuyerDiscountMaterial(MarketBuyerDiscountMaterial record){
        return marketBuyerDiscountMaterialDao.insertSelective(record);

    }

    public Integer deleteMarketBuyerDiscountMaterial(MarketBuyerDiscountMaterial record){
        return marketBuyerDiscountMaterialDao.delete(record);
    }

    public Integer removeMarketBuyerDiscountMaterial(MarketBuyerDiscountMaterial record){
        return marketBuyerDiscountMaterialDao.updateByPrimaryKeySelective(record);
    }

    public Integer updateMarketBuyerDiscountMaterialByPrimaryKeySelective(MarketBuyerDiscountMaterial record){
        return marketBuyerDiscountMaterialDao.updateByPrimaryKeySelective(record);
    }









}