package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.MarketMaterialStandardChargeService;
import cn.enn.ygego.sunny.user.dao.MarketMaterialStandardChargeDao;
import cn.enn.ygego.sunny.user.model.MarketMaterialStandardCharge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: MarketMaterialStandardCharge
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@Service("marketMaterialStandardChargeService")
public class MarketMaterialStandardChargeServiceImpl implements MarketMaterialStandardChargeService{

    @Autowired
    private MarketMaterialStandardChargeDao marketMaterialStandardChargeDao;

    public List<MarketMaterialStandardCharge> findAll(){
       return  marketMaterialStandardChargeDao.selectAll();
    }

    public List<MarketMaterialStandardCharge> findMarketMaterialStandardCharges(MarketMaterialStandardCharge record){
       return  marketMaterialStandardChargeDao.select(record);
    }

    public MarketMaterialStandardCharge getMarketMaterialStandardChargeByPrimaryKey(Long chargeId){
        return marketMaterialStandardChargeDao.selectByPrimaryKey(chargeId);
    }

    public Integer deleteByPrimaryKey(Long chargeId){
        return marketMaterialStandardChargeDao.deleteByPrimaryKey(chargeId);
    }

    public Integer createMarketMaterialStandardCharge(MarketMaterialStandardCharge record){
        return marketMaterialStandardChargeDao.insertSelective(record);

    }

    public Integer deleteMarketMaterialStandardCharge(MarketMaterialStandardCharge record){
        return marketMaterialStandardChargeDao.delete(record);
    }

    public Integer removeMarketMaterialStandardCharge(MarketMaterialStandardCharge record){
        return marketMaterialStandardChargeDao.updateByPrimaryKeySelective(record);
    }

    public Integer updateMarketMaterialStandardChargeByPrimaryKeySelective(MarketMaterialStandardCharge record){
        return marketMaterialStandardChargeDao.updateByPrimaryKeySelective(record);
    }









}