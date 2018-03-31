package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.EntStoreService;
import cn.enn.ygego.sunny.user.dao.EntStoreDao;
import cn.enn.ygego.sunny.user.model.EntStore;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:EntStore
 * @author gencode
 * @date 2018-3-28
 */
@Service
public class EntStoreServiceImpl implements EntStoreService{

    @Autowired
    private EntStoreDao entStoreDao;

    public List<EntStore> findAll(){
       return  entStoreDao.findAll();
    }

    public List<EntStore> findEntStores(EntStore record){
       return  entStoreDao.find(record);
    }

    public EntStore getEntStoreByPrimaryKey(Long storeId){
        return entStoreDao.getByPrimaryKey(storeId);
    }

    public Integer createEntStore(EntStore record){
        return entStoreDao.insert(record);
    }

    public Integer removeEntStore(EntStore record){
        return entStoreDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long storeId){
    	return entStoreDao.deleteByPrimaryKey(storeId);
    }

    public Integer modifyEntStoreByPrimaryKey(EntStore record){
        return entStoreDao.updateByPrimaryKey(record);
    }









}