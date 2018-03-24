package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.UserInfoService;
import cn.enn.ygego.sunny.user.dao.UserInfoDao;
import cn.enn.ygego.sunny.user.model.UserInfo;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:UserInfo
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class UserInfoServiceImpl implements UserInfoService{

    @Autowired
    private UserInfoDao userInfoDao;

    public List<UserInfo> findAll(){
       return  userInfoDao.findAll();
    }

    public List<UserInfo> findUserInfos(UserInfo record){
       return  userInfoDao.find(record);
    }

    public UserInfo getUserInfoByPrimaryKey(Long userId){
        return userInfoDao.getByPrimaryKey(userId);
    }

    public Integer createUserInfo(UserInfo record){
        return userInfoDao.insert(record);
    }

    public Integer removeUserInfo(UserInfo record){
        return userInfoDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long userId){
    	return userInfoDao.deleteByPrimaryKey(userId);
    }

    public Integer modifyUserInfoByPrimaryKey(UserInfo record){
        return userInfoDao.updateByPrimaryKey(record);
    }









}