package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.MarketBuyerDiscountCateService;
import cn.enn.ygego.sunny.user.dao.MarketBuyerDiscountCateDao;
import cn.enn.ygego.sunny.user.model.MarketBuyerDiscountCate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: MarketBuyerDiscountCate
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@Service("marketBuyerDiscountCateService")
public class MarketBuyerDiscountCateServiceImpl implements MarketBuyerDiscountCateService{

    @Autowired
    private MarketBuyerDiscountCateDao marketBuyerDiscountCateDao;

    public List<MarketBuyerDiscountCate> findAll(){
       return  marketBuyerDiscountCateDao.selectAll();
    }

    public List<MarketBuyerDiscountCate> findMarketBuyerDiscountCates(MarketBuyerDiscountCate record){
       return  marketBuyerDiscountCateDao.select(record);
    }

    public MarketBuyerDiscountCate getMarketBuyerDiscountCateByPrimaryKey(Long discountId){
        return marketBuyerDiscountCateDao.selectByPrimaryKey(discountId);
    }

    public Integer deleteByPrimaryKey(Long discountId){
        return marketBuyerDiscountCateDao.deleteByPrimaryKey(discountId);
    }

    public Integer createMarketBuyerDiscountCate(MarketBuyerDiscountCate record){
        return marketBuyerDiscountCateDao.insertSelective(record);

    }

    public Integer deleteMarketBuyerDiscountCate(MarketBuyerDiscountCate record){
        return marketBuyerDiscountCateDao.delete(record);
    }

    public Integer removeMarketBuyerDiscountCate(MarketBuyerDiscountCate record){
        return marketBuyerDiscountCateDao.updateByPrimaryKeySelective(record);
    }

    public Integer updateMarketBuyerDiscountCateByPrimaryKeySelective(MarketBuyerDiscountCate record){
        return marketBuyerDiscountCateDao.updateByPrimaryKeySelective(record);
    }









}