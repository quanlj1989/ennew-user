package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.EntCustInfoService;
import cn.enn.ygego.sunny.user.dao.EntCustInfoDao;
import cn.enn.ygego.sunny.user.model.EntCustInfo;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:EntCustInfo
 * @author gencode
 * @date 2018-3-28
 */
@Service
public class EntCustInfoServiceImpl implements EntCustInfoService{

    @Autowired
    private EntCustInfoDao entCustInfoDao;

    public List<EntCustInfo> findAll(){
       return  entCustInfoDao.findAll();
    }

    public List<EntCustInfo> findEntCustInfos(EntCustInfo record){
       return  entCustInfoDao.find(record);
    }

    public EntCustInfo getEntCustInfoByPrimaryKey(Long memberId){
        return entCustInfoDao.getByPrimaryKey(memberId);
    }

    public Integer createEntCustInfo(EntCustInfo record){
        return entCustInfoDao.insert(record);
    }

    public Integer removeEntCustInfo(EntCustInfo record){
        return entCustInfoDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long memberId){
    	return entCustInfoDao.deleteByPrimaryKey(memberId);
    }

    public Integer modifyEntCustInfoByPrimaryKey(EntCustInfo record){
        return entCustInfoDao.updateByPrimaryKey(record);
    }









}