package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.MarketInfoService;
import cn.enn.ygego.sunny.user.dao.MarketInfoDao;
import cn.enn.ygego.sunny.user.model.MarketInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: MarketInfo
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@Service("marketInfoService")
public class MarketInfoServiceImpl implements MarketInfoService{

    @Autowired
    private MarketInfoDao marketInfoDao;

    public List<MarketInfo> findAll(){
       return  marketInfoDao.selectAll();
    }

    public List<MarketInfo> findMarketInfos(MarketInfo record){
       return  marketInfoDao.select(record);
    }

    public MarketInfo getMarketInfoByPrimaryKey(Long marketId){
        return marketInfoDao.selectByPrimaryKey(marketId);
    }

    public Integer deleteByPrimaryKey(Long marketId){
        return marketInfoDao.deleteByPrimaryKey(marketId);
    }

    public Integer createMarketInfo(MarketInfo record){
        return marketInfoDao.insertSelective(record);

    }

    public Integer deleteMarketInfo(MarketInfo record){
        return marketInfoDao.delete(record);
    }

    public Integer removeMarketInfo(MarketInfo record){
        return marketInfoDao.updateByPrimaryKeySelective(record);
    }

    public Integer updateMarketInfoByPrimaryKeySelective(MarketInfo record){
        return marketInfoDao.updateByPrimaryKeySelective(record);
    }









}