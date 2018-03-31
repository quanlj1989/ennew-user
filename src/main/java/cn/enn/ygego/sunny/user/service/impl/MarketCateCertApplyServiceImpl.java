package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.MarketCateCertApplyService;
import cn.enn.ygego.sunny.user.dao.MarketCateCertApplyDao;
import cn.enn.ygego.sunny.user.model.MarketCateCertApply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: MarketCateCertApply
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@Service("marketCateCertApplyService")
public class MarketCateCertApplyServiceImpl implements MarketCateCertApplyService{

    @Autowired
    private MarketCateCertApplyDao marketCateCertApplyDao;

    public List<MarketCateCertApply> findAll(){
       return  marketCateCertApplyDao.selectAll();
    }

    public List<MarketCateCertApply> findMarketCateCertApplys(MarketCateCertApply record){
       return  marketCateCertApplyDao.select(record);
    }

    public MarketCateCertApply getMarketCateCertApplyByPrimaryKey(Long certApplyDetailId){
        return marketCateCertApplyDao.selectByPrimaryKey(certApplyDetailId);
    }

    public Integer deleteByPrimaryKey(Long certApplyDetailId){
        return marketCateCertApplyDao.deleteByPrimaryKey(certApplyDetailId);
    }

    public Integer createMarketCateCertApply(MarketCateCertApply record){
        return marketCateCertApplyDao.insertSelective(record);

    }

    public Integer deleteMarketCateCertApply(MarketCateCertApply record){
        return marketCateCertApplyDao.delete(record);
    }

    public Integer removeMarketCateCertApply(MarketCateCertApply record){
        return marketCateCertApplyDao.updateByPrimaryKeySelective(record);
    }

    public Integer updateMarketCateCertApplyByPrimaryKeySelective(MarketCateCertApply record){
        return marketCateCertApplyDao.updateByPrimaryKeySelective(record);
    }









}