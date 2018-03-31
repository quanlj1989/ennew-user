package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.MarketCateMaterialApplyService;
import cn.enn.ygego.sunny.user.dao.MarketCateMaterialApplyDao;
import cn.enn.ygego.sunny.user.model.MarketCateMaterialApply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: MarketCateMaterialApply
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@Service("marketCateMaterialApplyService")
public class MarketCateMaterialApplyServiceImpl implements MarketCateMaterialApplyService{

    @Autowired
    private MarketCateMaterialApplyDao marketCateMaterialApplyDao;

    public List<MarketCateMaterialApply> findAll(){
       return  marketCateMaterialApplyDao.selectAll();
    }

    public List<MarketCateMaterialApply> findMarketCateMaterialApplys(MarketCateMaterialApply record){
       return  marketCateMaterialApplyDao.select(record);
    }

    public MarketCateMaterialApply getMarketCateMaterialApplyByPrimaryKey(Long applyId){
        return marketCateMaterialApplyDao.selectByPrimaryKey(applyId);
    }

    public Integer deleteByPrimaryKey(Long applyId){
        return marketCateMaterialApplyDao.deleteByPrimaryKey(applyId);
    }

    public Integer createMarketCateMaterialApply(MarketCateMaterialApply record){
        return marketCateMaterialApplyDao.insertSelective(record);

    }

    public Integer deleteMarketCateMaterialApply(MarketCateMaterialApply record){
        return marketCateMaterialApplyDao.delete(record);
    }

    public Integer removeMarketCateMaterialApply(MarketCateMaterialApply record){
        return marketCateMaterialApplyDao.updateByPrimaryKeySelective(record);
    }

    public Integer updateMarketCateMaterialApplyByPrimaryKeySelective(MarketCateMaterialApply record){
        return marketCateMaterialApplyDao.updateByPrimaryKeySelective(record);
    }









}