package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.BusiUserInfoService;
import cn.enn.ygego.sunny.user.dao.BusiUserInfoDao;
import cn.enn.ygego.sunny.user.model.BusiUserInfo;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:BusiUserInfo
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class BusiUserInfoServiceImpl implements BusiUserInfoService{

    @Autowired
    private BusiUserInfoDao busiUserInfoDao;

    public List<BusiUserInfo> findAll(){
       return  busiUserInfoDao.findAll();
    }

    public List<BusiUserInfo> findBusiUserInfos(BusiUserInfo record){
       return  busiUserInfoDao.find(record);
    }

    public BusiUserInfo getBusiUserInfoByPrimaryKey(Long userId){
        return busiUserInfoDao.getByPrimaryKey(userId);
    }

    public Integer createBusiUserInfo(BusiUserInfo record){
        return busiUserInfoDao.insert(record);
    }

    public Integer removeBusiUserInfo(BusiUserInfo record){
        return busiUserInfoDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long userId){
    	return busiUserInfoDao.deleteByPrimaryKey(userId);
    }

    public Integer modifyBusiUserInfoByPrimaryKey(BusiUserInfo record){
        return busiUserInfoDao.updateByPrimaryKey(record);
    }









}