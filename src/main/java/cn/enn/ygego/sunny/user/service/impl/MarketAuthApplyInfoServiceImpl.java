package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.MarketAuthApplyInfoService;
import cn.enn.ygego.sunny.user.dao.MarketAuthApplyInfoDao;
import cn.enn.ygego.sunny.user.model.MarketAuthApplyInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: MarketAuthApplyInfo
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@Service("marketAuthApplyInfoService")
public class MarketAuthApplyInfoServiceImpl implements MarketAuthApplyInfoService{

    @Autowired
    private MarketAuthApplyInfoDao marketAuthApplyInfoDao;

    public List<MarketAuthApplyInfo> findAll(){
       return  marketAuthApplyInfoDao.selectAll();
    }

    public List<MarketAuthApplyInfo> findMarketAuthApplyInfos(MarketAuthApplyInfo record){
       return  marketAuthApplyInfoDao.select(record);
    }

    public MarketAuthApplyInfo getMarketAuthApplyInfoByPrimaryKey(Long authApplyId){
        return marketAuthApplyInfoDao.selectByPrimaryKey(authApplyId);
    }

    public Integer deleteByPrimaryKey(Long authApplyId){
        return marketAuthApplyInfoDao.deleteByPrimaryKey(authApplyId);
    }

    public Integer createMarketAuthApplyInfo(MarketAuthApplyInfo record){
        return marketAuthApplyInfoDao.insertSelective(record);

    }

    public Integer deleteMarketAuthApplyInfo(MarketAuthApplyInfo record){
        return marketAuthApplyInfoDao.delete(record);
    }

    public Integer removeMarketAuthApplyInfo(MarketAuthApplyInfo record){
        return marketAuthApplyInfoDao.updateByPrimaryKeySelective(record);
    }

    public Integer updateMarketAuthApplyInfoByPrimaryKeySelective(MarketAuthApplyInfo record){
        return marketAuthApplyInfoDao.updateByPrimaryKeySelective(record);
    }









}