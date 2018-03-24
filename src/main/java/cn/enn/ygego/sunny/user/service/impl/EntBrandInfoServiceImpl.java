package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.EntBrandInfoService;
import cn.enn.ygego.sunny.user.dao.EntBrandInfoDao;
import cn.enn.ygego.sunny.user.model.EntBrandInfo;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:EntBrandInfo
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class EntBrandInfoServiceImpl implements EntBrandInfoService{

    @Autowired
    private EntBrandInfoDao entBrandInfoDao;

    public List<EntBrandInfo> findAll(){
       return  entBrandInfoDao.findAll();
    }

    public List<EntBrandInfo> findEntBrandInfos(EntBrandInfo record){
       return  entBrandInfoDao.find(record);
    }

    public EntBrandInfo getEntBrandInfoByPrimaryKey(Long entBrandId){
        return entBrandInfoDao.getByPrimaryKey(entBrandId);
    }

    public Integer createEntBrandInfo(EntBrandInfo record){
        return entBrandInfoDao.insert(record);
    }

    public Integer removeEntBrandInfo(EntBrandInfo record){
        return entBrandInfoDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long entBrandId){
    	return entBrandInfoDao.deleteByPrimaryKey(entBrandId);
    }

    public Integer modifyEntBrandInfoByPrimaryKey(EntBrandInfo record){
        return entBrandInfoDao.updateByPrimaryKey(record);
    }









}