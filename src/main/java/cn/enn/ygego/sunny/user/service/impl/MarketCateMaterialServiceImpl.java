package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.MarketCateMaterialService;
import cn.enn.ygego.sunny.user.dao.MarketCateMaterialDao;
import cn.enn.ygego.sunny.user.model.MarketCateMaterial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: MarketCateMaterial
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@Service("marketCateMaterialService")
public class MarketCateMaterialServiceImpl implements MarketCateMaterialService{

    @Autowired
    private MarketCateMaterialDao marketCateMaterialDao;

    public List<MarketCateMaterial> findAll(){
       return  marketCateMaterialDao.selectAll();
    }

    public List<MarketCateMaterial> findMarketCateMaterials(MarketCateMaterial record){
       return  marketCateMaterialDao.select(record);
    }

    public MarketCateMaterial getMarketCateMaterialByPrimaryKey(Long cateMaterialId){
        return marketCateMaterialDao.selectByPrimaryKey(cateMaterialId);
    }

    public Integer deleteByPrimaryKey(Long cateMaterialId){
        return marketCateMaterialDao.deleteByPrimaryKey(cateMaterialId);
    }

    public Integer createMarketCateMaterial(MarketCateMaterial record){
        return marketCateMaterialDao.insertSelective(record);

    }

    public Integer deleteMarketCateMaterial(MarketCateMaterial record){
        return marketCateMaterialDao.delete(record);
    }

    public Integer removeMarketCateMaterial(MarketCateMaterial record){
        return marketCateMaterialDao.updateByPrimaryKeySelective(record);
    }

    public Integer updateMarketCateMaterialByPrimaryKeySelective(MarketCateMaterial record){
        return marketCateMaterialDao.updateByPrimaryKeySelective(record);
    }









}