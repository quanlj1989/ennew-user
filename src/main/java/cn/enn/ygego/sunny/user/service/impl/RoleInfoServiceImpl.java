package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.RoleInfoService;
import cn.enn.ygego.sunny.user.dao.RoleInfoDao;
import cn.enn.ygego.sunny.user.model.RoleInfo;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:RoleInfo
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class RoleInfoServiceImpl implements RoleInfoService{

    @Autowired
    private RoleInfoDao roleInfoDao;

    public List<RoleInfo> findAll(){
       return  roleInfoDao.findAll();
    }

    public List<RoleInfo> findRoleInfos(RoleInfo record){
       return  roleInfoDao.find(record);
    }

    public RoleInfo getRoleInfoByPrimaryKey(Long roleId){
        return roleInfoDao.getByPrimaryKey(roleId);
    }

    public Integer createRoleInfo(RoleInfo record){
        return roleInfoDao.insert(record);
    }

    public Integer removeRoleInfo(RoleInfo record){
        return roleInfoDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long roleId){
    	return roleInfoDao.deleteByPrimaryKey(roleId);
    }

    public Integer modifyRoleInfoByPrimaryKey(RoleInfo record){
        return roleInfoDao.updateByPrimaryKey(record);
    }









}