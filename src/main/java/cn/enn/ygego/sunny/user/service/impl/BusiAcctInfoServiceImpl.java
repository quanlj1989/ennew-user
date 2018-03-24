package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.BusiAcctInfoService;
import cn.enn.ygego.sunny.user.dao.BusiAcctInfoDao;
import cn.enn.ygego.sunny.user.model.BusiAcctInfo;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:BusiAcctInfo
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class BusiAcctInfoServiceImpl implements BusiAcctInfoService{

    @Autowired
    private BusiAcctInfoDao busiAcctInfoDao;

    public List<BusiAcctInfo> findAll(){
       return  busiAcctInfoDao.findAll();
    }

    public List<BusiAcctInfo> findBusiAcctInfos(BusiAcctInfo record){
       return  busiAcctInfoDao.find(record);
    }

    public BusiAcctInfo getBusiAcctInfoByPrimaryKey(Long acctId){
        return busiAcctInfoDao.getByPrimaryKey(acctId);
    }

    public Integer createBusiAcctInfo(BusiAcctInfo record){
        return busiAcctInfoDao.insert(record);
    }

    public Integer removeBusiAcctInfo(BusiAcctInfo record){
        return busiAcctInfoDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long acctId){
    	return busiAcctInfoDao.deleteByPrimaryKey(acctId);
    }

    public Integer modifyBusiAcctInfoByPrimaryKey(BusiAcctInfo record){
        return busiAcctInfoDao.updateByPrimaryKey(record);
    }









}