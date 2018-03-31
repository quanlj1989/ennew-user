package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.SellerProdService;
import cn.enn.ygego.sunny.user.dao.SellerProdDao;
import cn.enn.ygego.sunny.user.model.SellerProd;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:SellerProd
 * @author gencode
 * @date 2018-3-28
 */
@Service
public class SellerProdServiceImpl implements SellerProdService{

    @Autowired
    private SellerProdDao sellerProdDao;

    public List<SellerProd> findAll(){
       return  sellerProdDao.findAll();
    }

    public List<SellerProd> findSellerProds(SellerProd record){
       return  sellerProdDao.find(record);
    }

    public SellerProd getSellerProdByPrimaryKey(Long sellerProdId){
        return sellerProdDao.getByPrimaryKey(sellerProdId);
    }

    public Integer createSellerProd(SellerProd record){
        return sellerProdDao.insert(record);
    }

    public Integer removeSellerProd(SellerProd record){
        return sellerProdDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long sellerProdId){
    	return sellerProdDao.deleteByPrimaryKey(sellerProdId);
    }

    public Integer modifySellerProdByPrimaryKey(SellerProd record){
        return sellerProdDao.updateByPrimaryKey(record);
    }









}