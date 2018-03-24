package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.SupplierBlackListService;
import cn.enn.ygego.sunny.user.dao.SupplierBlackListDao;
import cn.enn.ygego.sunny.user.model.SupplierBlackList;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:SupplierBlackList
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class SupplierBlackListServiceImpl implements SupplierBlackListService{

    @Autowired
    private SupplierBlackListDao supplierBlackListDao;

    public List<SupplierBlackList> findAll(){
       return  supplierBlackListDao.findAll();
    }

    public List<SupplierBlackList> findSupplierBlackLists(SupplierBlackList record){
       return  supplierBlackListDao.find(record);
    }

    public SupplierBlackList getSupplierBlackListByPrimaryKey(Long supplierListId){
        return supplierBlackListDao.getByPrimaryKey(supplierListId);
    }

    public Integer createSupplierBlackList(SupplierBlackList record){
        return supplierBlackListDao.insert(record);
    }

    public Integer removeSupplierBlackList(SupplierBlackList record){
        return supplierBlackListDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long supplierListId){
    	return supplierBlackListDao.deleteByPrimaryKey(supplierListId);
    }

    public Integer modifySupplierBlackListByPrimaryKey(SupplierBlackList record){
        return supplierBlackListDao.updateByPrimaryKey(record);
    }









}