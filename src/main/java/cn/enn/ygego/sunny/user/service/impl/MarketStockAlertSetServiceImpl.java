package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.MarketStockAlertSetService;
import cn.enn.ygego.sunny.user.dao.MarketStockAlertSetDao;
import cn.enn.ygego.sunny.user.model.MarketStockAlertSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: MarketStockAlertSet
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@Service("marketStockAlertSetService")
public class MarketStockAlertSetServiceImpl implements MarketStockAlertSetService{

    @Autowired
    private MarketStockAlertSetDao marketStockAlertSetDao;

    public List<MarketStockAlertSet> findAll(){
       return  marketStockAlertSetDao.selectAll();
    }

    public List<MarketStockAlertSet> findMarketStockAlertSets(MarketStockAlertSet record){
       return  marketStockAlertSetDao.select(record);
    }

    public MarketStockAlertSet getMarketStockAlertSetByPrimaryKey(Long alertSetId){
        return marketStockAlertSetDao.selectByPrimaryKey(alertSetId);
    }

    public Integer deleteByPrimaryKey(Long alertSetId){
        return marketStockAlertSetDao.deleteByPrimaryKey(alertSetId);
    }

    public Integer createMarketStockAlertSet(MarketStockAlertSet record){
        return marketStockAlertSetDao.insertSelective(record);

    }

    public Integer deleteMarketStockAlertSet(MarketStockAlertSet record){
        return marketStockAlertSetDao.delete(record);
    }

    public Integer removeMarketStockAlertSet(MarketStockAlertSet record){
        return marketStockAlertSetDao.updateByPrimaryKeySelective(record);
    }

    public Integer updateMarketStockAlertSetByPrimaryKeySelective(MarketStockAlertSet record){
        return marketStockAlertSetDao.updateByPrimaryKeySelective(record);
    }









}