package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.MarketAuthInfoService;
import cn.enn.ygego.sunny.user.dao.MarketAuthInfoDao;
import cn.enn.ygego.sunny.user.model.MarketAuthInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: MarketAuthInfo
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@Service("marketAuthInfoService")
public class MarketAuthInfoServiceImpl implements MarketAuthInfoService{

    @Autowired
    private MarketAuthInfoDao marketAuthInfoDao;

    public List<MarketAuthInfo> findAll(){
       return  marketAuthInfoDao.selectAll();
    }

    public List<MarketAuthInfo> findMarketAuthInfos(MarketAuthInfo record){
       return  marketAuthInfoDao.select(record);
    }

    public MarketAuthInfo getMarketAuthInfoByPrimaryKey(Long authId){
        return marketAuthInfoDao.selectByPrimaryKey(authId);
    }

    public Integer deleteByPrimaryKey(Long authId){
        return marketAuthInfoDao.deleteByPrimaryKey(authId);
    }

    public Integer createMarketAuthInfo(MarketAuthInfo record){
        return marketAuthInfoDao.insertSelective(record);

    }

    public Integer deleteMarketAuthInfo(MarketAuthInfo record){
        return marketAuthInfoDao.delete(record);
    }

    public Integer removeMarketAuthInfo(MarketAuthInfo record){
        return marketAuthInfoDao.updateByPrimaryKeySelective(record);
    }

    public Integer updateMarketAuthInfoByPrimaryKeySelective(MarketAuthInfo record){
        return marketAuthInfoDao.updateByPrimaryKeySelective(record);
    }









}