package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.EntCateCertInfoService;
import cn.enn.ygego.sunny.user.dao.EntCateCertInfoDao;
import cn.enn.ygego.sunny.user.model.EntCateCertInfo;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:EntCateCertInfo
 * @author gencode
 * @date 2018-3-28
 */
@Service
public class EntCateCertInfoServiceImpl implements EntCateCertInfoService{

    @Autowired
    private EntCateCertInfoDao entCateCertInfoDao;

    public List<EntCateCertInfo> findAll(){
       return  entCateCertInfoDao.findAll();
    }

    public List<EntCateCertInfo> findEntCateCertInfos(EntCateCertInfo record){
       return  entCateCertInfoDao.find(record);
    }

    public EntCateCertInfo getEntCateCertInfoByPrimaryKey(Long certInfoId){
        return entCateCertInfoDao.getByPrimaryKey(certInfoId);
    }

    public Integer createEntCateCertInfo(EntCateCertInfo record){
        return entCateCertInfoDao.insert(record);
    }

    public Integer removeEntCateCertInfo(EntCateCertInfo record){
        return entCateCertInfoDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long certInfoId){
    	return entCateCertInfoDao.deleteByPrimaryKey(certInfoId);
    }

    public Integer modifyEntCateCertInfoByPrimaryKey(EntCateCertInfo record){
        return entCateCertInfoDao.updateByPrimaryKey(record);
    }









}