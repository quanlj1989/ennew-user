package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.MarketDiscountMaterialService;
import cn.enn.ygego.sunny.user.dao.MarketDiscountMaterialDao;
import cn.enn.ygego.sunny.user.model.MarketDiscountMaterial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: MarketDiscountMaterial
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@Service("marketDiscountMaterialService")
public class MarketDiscountMaterialServiceImpl implements MarketDiscountMaterialService{

    @Autowired
    private MarketDiscountMaterialDao marketDiscountMaterialDao;

    public List<MarketDiscountMaterial> findAll(){
       return  marketDiscountMaterialDao.selectAll();
    }

    public List<MarketDiscountMaterial> findMarketDiscountMaterials(MarketDiscountMaterial record){
       return  marketDiscountMaterialDao.select(record);
    }

    public MarketDiscountMaterial getMarketDiscountMaterialByPrimaryKey(Long chargeId){
        return marketDiscountMaterialDao.selectByPrimaryKey(chargeId);
    }

    public Integer deleteByPrimaryKey(Long chargeId){
        return marketDiscountMaterialDao.deleteByPrimaryKey(chargeId);
    }

    public Integer createMarketDiscountMaterial(MarketDiscountMaterial record){
        return marketDiscountMaterialDao.insertSelective(record);

    }

    public Integer deleteMarketDiscountMaterial(MarketDiscountMaterial record){
        return marketDiscountMaterialDao.delete(record);
    }

    public Integer removeMarketDiscountMaterial(MarketDiscountMaterial record){
        return marketDiscountMaterialDao.updateByPrimaryKeySelective(record);
    }

    public Integer updateMarketDiscountMaterialByPrimaryKeySelective(MarketDiscountMaterial record){
        return marketDiscountMaterialDao.updateByPrimaryKeySelective(record);
    }









}