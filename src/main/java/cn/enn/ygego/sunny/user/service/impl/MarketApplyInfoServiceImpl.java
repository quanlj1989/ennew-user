package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.MarketApplyInfoService;
import cn.enn.ygego.sunny.user.dao.MarketApplyInfoDao;
import cn.enn.ygego.sunny.user.model.MarketApplyInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: MarketApplyInfo
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@Service("marketApplyInfoService")
public class MarketApplyInfoServiceImpl implements MarketApplyInfoService{

    @Autowired
    private MarketApplyInfoDao marketApplyInfoDao;

    public List<MarketApplyInfo> findAll(){
       return  marketApplyInfoDao.selectAll();
    }

    public List<MarketApplyInfo> findMarketApplyInfos(MarketApplyInfo record){
       return  marketApplyInfoDao.select(record);
    }

    public MarketApplyInfo getMarketApplyInfoByPrimaryKey(Long marketApplyId){
        return marketApplyInfoDao.selectByPrimaryKey(marketApplyId);
    }

    public Integer deleteByPrimaryKey(Long marketApplyId){
        return marketApplyInfoDao.deleteByPrimaryKey(marketApplyId);
    }

    public Integer createMarketApplyInfo(MarketApplyInfo record){
        return marketApplyInfoDao.insertSelective(record);

    }

    public Integer deleteMarketApplyInfo(MarketApplyInfo record){
        return marketApplyInfoDao.delete(record);
    }

    public Integer removeMarketApplyInfo(MarketApplyInfo record){
        return marketApplyInfoDao.updateByPrimaryKeySelective(record);
    }

    public Integer updateMarketApplyInfoByPrimaryKeySelective(MarketApplyInfo record){
        return marketApplyInfoDao.updateByPrimaryKeySelective(record);
    }









}