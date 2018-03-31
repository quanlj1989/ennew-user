package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.MarketBuyerDiscountSupplierService;
import cn.enn.ygego.sunny.user.dao.MarketBuyerDiscountSupplierDao;
import cn.enn.ygego.sunny.user.model.MarketBuyerDiscountSupplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: MarketBuyerDiscountSupplier
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@Service("marketBuyerDiscountSupplierService")
public class MarketBuyerDiscountSupplierServiceImpl implements MarketBuyerDiscountSupplierService{

    @Autowired
    private MarketBuyerDiscountSupplierDao marketBuyerDiscountSupplierDao;

    public List<MarketBuyerDiscountSupplier> findAll(){
       return  marketBuyerDiscountSupplierDao.selectAll();
    }

    public List<MarketBuyerDiscountSupplier> findMarketBuyerDiscountSuppliers(MarketBuyerDiscountSupplier record){
       return  marketBuyerDiscountSupplierDao.select(record);
    }

    public MarketBuyerDiscountSupplier getMarketBuyerDiscountSupplierByPrimaryKey(Long discountId){
        return marketBuyerDiscountSupplierDao.selectByPrimaryKey(discountId);
    }

    public Integer deleteByPrimaryKey(Long discountId){
        return marketBuyerDiscountSupplierDao.deleteByPrimaryKey(discountId);
    }

    public Integer createMarketBuyerDiscountSupplier(MarketBuyerDiscountSupplier record){
        return marketBuyerDiscountSupplierDao.insertSelective(record);

    }

    public Integer deleteMarketBuyerDiscountSupplier(MarketBuyerDiscountSupplier record){
        return marketBuyerDiscountSupplierDao.delete(record);
    }

    public Integer removeMarketBuyerDiscountSupplier(MarketBuyerDiscountSupplier record){
        return marketBuyerDiscountSupplierDao.updateByPrimaryKeySelective(record);
    }

    public Integer updateMarketBuyerDiscountSupplierByPrimaryKeySelective(MarketBuyerDiscountSupplier record){
        return marketBuyerDiscountSupplierDao.updateByPrimaryKeySelective(record);
    }









}