package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.MarketStorageInfoService;
import cn.enn.ygego.sunny.user.dao.MarketStorageInfoDao;
import cn.enn.ygego.sunny.user.model.MarketStorageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: MarketStorageInfo
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@Service("marketStorageInfoService")
public class MarketStorageInfoServiceImpl implements MarketStorageInfoService{

    @Autowired
    private MarketStorageInfoDao marketStorageInfoDao;

    public List<MarketStorageInfo> findAll(){
       return  marketStorageInfoDao.selectAll();
    }

    public List<MarketStorageInfo> findMarketStorageInfos(MarketStorageInfo record){
       return  marketStorageInfoDao.select(record);
    }

    public MarketStorageInfo getMarketStorageInfoByPrimaryKey(Long storageId){
        return marketStorageInfoDao.selectByPrimaryKey(storageId);
    }

    public Integer deleteByPrimaryKey(Long storageId){
        return marketStorageInfoDao.deleteByPrimaryKey(storageId);
    }

    public Integer createMarketStorageInfo(MarketStorageInfo record){
        return marketStorageInfoDao.insertSelective(record);

    }

    public Integer deleteMarketStorageInfo(MarketStorageInfo record){
        return marketStorageInfoDao.delete(record);
    }

    public Integer removeMarketStorageInfo(MarketStorageInfo record){
        return marketStorageInfoDao.updateByPrimaryKeySelective(record);
    }

    public Integer updateMarketStorageInfoByPrimaryKeySelective(MarketStorageInfo record){
        return marketStorageInfoDao.updateByPrimaryKeySelective(record);
    }









}