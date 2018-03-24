package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.SupplierWhiteListService;
import cn.enn.ygego.sunny.user.dao.SupplierWhiteListDao;
import cn.enn.ygego.sunny.user.model.SupplierWhiteList;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:SupplierWhiteList
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class SupplierWhiteListServiceImpl implements SupplierWhiteListService{

    @Autowired
    private SupplierWhiteListDao supplierWhiteListDao;

    public List<SupplierWhiteList> findAll(){
       return  supplierWhiteListDao.findAll();
    }

    public List<SupplierWhiteList> findSupplierWhiteLists(SupplierWhiteList record){
       return  supplierWhiteListDao.find(record);
    }

    public SupplierWhiteList getSupplierWhiteListByPrimaryKey(Long supplierListId){
        return supplierWhiteListDao.getByPrimaryKey(supplierListId);
    }

    public Integer createSupplierWhiteList(SupplierWhiteList record){
        return supplierWhiteListDao.insert(record);
    }

    public Integer removeSupplierWhiteList(SupplierWhiteList record){
        return supplierWhiteListDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long supplierListId){
    	return supplierWhiteListDao.deleteByPrimaryKey(supplierListId);
    }

    public Integer modifySupplierWhiteListByPrimaryKey(SupplierWhiteList record){
        return supplierWhiteListDao.updateByPrimaryKey(record);
    }









}