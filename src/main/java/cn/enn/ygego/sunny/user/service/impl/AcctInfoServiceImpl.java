package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.AcctInfoService;
import cn.enn.ygego.sunny.user.dao.AcctInfoDao;
import cn.enn.ygego.sunny.user.model.AcctInfo;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:AcctInfo
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class AcctInfoServiceImpl implements AcctInfoService{

    @Autowired
    private AcctInfoDao acctInfoDao;

    public List<AcctInfo> findAll(){
       return  acctInfoDao.findAll();
    }

    public List<AcctInfo> findAcctInfos(AcctInfo record){
       return  acctInfoDao.find(record);
    }

    public AcctInfo getAcctInfoByPrimaryKey(Long acctId){
        return acctInfoDao.getByPrimaryKey(acctId);
    }

    public Integer createAcctInfo(AcctInfo record){
        return acctInfoDao.insert(record);
    }

    public Integer removeAcctInfo(AcctInfo record){
        return acctInfoDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long acctId){
    	return acctInfoDao.deleteByPrimaryKey(acctId);
    }

    public Integer modifyAcctInfoByPrimaryKey(AcctInfo record){
        return acctInfoDao.updateByPrimaryKey(record);
    }









}