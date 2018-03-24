package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.EntCertInfoService;
import cn.enn.ygego.sunny.user.dao.EntCertInfoDao;
import cn.enn.ygego.sunny.user.model.EntCertInfo;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:EntCertInfo
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class EntCertInfoServiceImpl implements EntCertInfoService{

    @Autowired
    private EntCertInfoDao entCertInfoDao;

    public List<EntCertInfo> findAll(){
       return  entCertInfoDao.findAll();
    }

    public List<EntCertInfo> findEntCertInfos(EntCertInfo record){
       return  entCertInfoDao.find(record);
    }

    public EntCertInfo getEntCertInfoByPrimaryKey(Long certInfoId){
        return entCertInfoDao.getByPrimaryKey(certInfoId);
    }

    public Integer createEntCertInfo(EntCertInfo record){
        return entCertInfoDao.insert(record);
    }

    public Integer removeEntCertInfo(EntCertInfo record){
        return entCertInfoDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long certInfoId){
    	return entCertInfoDao.deleteByPrimaryKey(certInfoId);
    }

    public Integer modifyEntCertInfoByPrimaryKey(EntCertInfo record){
        return entCertInfoDao.updateByPrimaryKey(record);
    }









}