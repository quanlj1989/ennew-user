package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.MarketStorageApplyInfoService;
import cn.enn.ygego.sunny.user.dao.MarketStorageApplyInfoDao;
import cn.enn.ygego.sunny.user.model.MarketStorageApplyInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: MarketStorageApplyInfo
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@Service("marketStorageApplyInfoService")
public class MarketStorageApplyInfoServiceImpl implements MarketStorageApplyInfoService{

    @Autowired
    private MarketStorageApplyInfoDao marketStorageApplyInfoDao;

    public List<MarketStorageApplyInfo> findAll(){
       return  marketStorageApplyInfoDao.selectAll();
    }

    public List<MarketStorageApplyInfo> findMarketStorageApplyInfos(MarketStorageApplyInfo record){
       return  marketStorageApplyInfoDao.select(record);
    }

    public MarketStorageApplyInfo getMarketStorageApplyInfoByPrimaryKey(Long storageApplyId){
        return marketStorageApplyInfoDao.selectByPrimaryKey(storageApplyId);
    }

    public Integer deleteByPrimaryKey(Long storageApplyId){
        return marketStorageApplyInfoDao.deleteByPrimaryKey(storageApplyId);
    }

    public Integer createMarketStorageApplyInfo(MarketStorageApplyInfo record){
        return marketStorageApplyInfoDao.insertSelective(record);

    }

    public Integer deleteMarketStorageApplyInfo(MarketStorageApplyInfo record){
        return marketStorageApplyInfoDao.delete(record);
    }

    public Integer removeMarketStorageApplyInfo(MarketStorageApplyInfo record){
        return marketStorageApplyInfoDao.updateByPrimaryKeySelective(record);
    }

    public Integer updateMarketStorageApplyInfoByPrimaryKeySelective(MarketStorageApplyInfo record){
        return marketStorageApplyInfoDao.updateByPrimaryKeySelective(record);
    }









}