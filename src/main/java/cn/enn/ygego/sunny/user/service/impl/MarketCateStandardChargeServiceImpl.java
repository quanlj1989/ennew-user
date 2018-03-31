package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.MarketCateStandardChargeService;
import cn.enn.ygego.sunny.user.dao.MarketCateStandardChargeDao;
import cn.enn.ygego.sunny.user.model.MarketCateStandardCharge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: MarketCateStandardCharge
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@Service("marketCateStandardChargeService")
public class MarketCateStandardChargeServiceImpl implements MarketCateStandardChargeService{

    @Autowired
    private MarketCateStandardChargeDao marketCateStandardChargeDao;

    public List<MarketCateStandardCharge> findAll(){
       return  marketCateStandardChargeDao.selectAll();
    }

    public List<MarketCateStandardCharge> findMarketCateStandardCharges(MarketCateStandardCharge record){
       return  marketCateStandardChargeDao.select(record);
    }

    public MarketCateStandardCharge getMarketCateStandardChargeByPrimaryKey(Long chargeId){
        return marketCateStandardChargeDao.selectByPrimaryKey(chargeId);
    }

    public Integer deleteByPrimaryKey(Long chargeId){
        return marketCateStandardChargeDao.deleteByPrimaryKey(chargeId);
    }

    public Integer createMarketCateStandardCharge(MarketCateStandardCharge record){
        return marketCateStandardChargeDao.insertSelective(record);

    }

    public Integer deleteMarketCateStandardCharge(MarketCateStandardCharge record){
        return marketCateStandardChargeDao.delete(record);
    }

    public Integer removeMarketCateStandardCharge(MarketCateStandardCharge record){
        return marketCateStandardChargeDao.updateByPrimaryKeySelective(record);
    }

    public Integer updateMarketCateStandardChargeByPrimaryKeySelective(MarketCateStandardCharge record){
        return marketCateStandardChargeDao.updateByPrimaryKeySelective(record);
    }









}