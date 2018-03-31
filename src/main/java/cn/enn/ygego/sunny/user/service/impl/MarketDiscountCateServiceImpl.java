package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.MarketDiscountCateService;
import cn.enn.ygego.sunny.user.dao.MarketDiscountCateDao;
import cn.enn.ygego.sunny.user.model.MarketDiscountCate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: MarketDiscountCate
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@Service("marketDiscountCateService")
public class MarketDiscountCateServiceImpl implements MarketDiscountCateService{

    @Autowired
    private MarketDiscountCateDao marketDiscountCateDao;

    public List<MarketDiscountCate> findAll(){
       return  marketDiscountCateDao.selectAll();
    }

    public List<MarketDiscountCate> findMarketDiscountCates(MarketDiscountCate record){
       return  marketDiscountCateDao.select(record);
    }

    public MarketDiscountCate getMarketDiscountCateByPrimaryKey(Long discountId){
        return marketDiscountCateDao.selectByPrimaryKey(discountId);
    }

    public Integer deleteByPrimaryKey(Long discountId){
        return marketDiscountCateDao.deleteByPrimaryKey(discountId);
    }

    public Integer createMarketDiscountCate(MarketDiscountCate record){
        return marketDiscountCateDao.insertSelective(record);

    }

    public Integer deleteMarketDiscountCate(MarketDiscountCate record){
        return marketDiscountCateDao.delete(record);
    }

    public Integer removeMarketDiscountCate(MarketDiscountCate record){
        return marketDiscountCateDao.updateByPrimaryKeySelective(record);
    }

    public Integer updateMarketDiscountCateByPrimaryKeySelective(MarketDiscountCate record){
        return marketDiscountCateDao.updateByPrimaryKeySelective(record);
    }









}