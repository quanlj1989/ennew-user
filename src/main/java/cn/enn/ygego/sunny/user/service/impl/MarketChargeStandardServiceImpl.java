package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.MarketChargeStandardService;
import cn.enn.ygego.sunny.user.dao.MarketChargeStandardDao;
import cn.enn.ygego.sunny.user.model.MarketChargeStandard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: MarketChargeStandard
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@Service("marketChargeStandardService")
public class MarketChargeStandardServiceImpl implements MarketChargeStandardService{

    @Autowired
    private MarketChargeStandardDao marketChargeStandardDao;

    public List<MarketChargeStandard> findAll(){
       return  marketChargeStandardDao.selectAll();
    }

    public List<MarketChargeStandard> findMarketChargeStandards(MarketChargeStandard record){
       return  marketChargeStandardDao.select(record);
    }

    public MarketChargeStandard getMarketChargeStandardByPrimaryKey(Long chargeStandardId){
        return marketChargeStandardDao.selectByPrimaryKey(chargeStandardId);
    }

    public Integer deleteByPrimaryKey(Long chargeStandardId){
        return marketChargeStandardDao.deleteByPrimaryKey(chargeStandardId);
    }

    public Integer createMarketChargeStandard(MarketChargeStandard record){
        return marketChargeStandardDao.insertSelective(record);

    }

    public Integer deleteMarketChargeStandard(MarketChargeStandard record){
        return marketChargeStandardDao.delete(record);
    }

    public Integer removeMarketChargeStandard(MarketChargeStandard record){
        return marketChargeStandardDao.updateByPrimaryKeySelective(record);
    }

    public Integer updateMarketChargeStandardByPrimaryKeySelective(MarketChargeStandard record){
        return marketChargeStandardDao.updateByPrimaryKeySelective(record);
    }









}