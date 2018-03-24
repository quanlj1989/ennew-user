package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.RoleOperPrivRelaService;
import cn.enn.ygego.sunny.user.dao.RoleOperPrivRelaDao;
import cn.enn.ygego.sunny.user.model.RoleOperPrivRela;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:RoleOperPrivRela
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class RoleOperPrivRelaServiceImpl implements RoleOperPrivRelaService{

    @Autowired
    private RoleOperPrivRelaDao roleOperPrivRelaDao;

    public List<RoleOperPrivRela> findAll(){
       return  roleOperPrivRelaDao.findAll();
    }

    public List<RoleOperPrivRela> findRoleOperPrivRelas(RoleOperPrivRela record){
       return  roleOperPrivRelaDao.find(record);
    }

    public RoleOperPrivRela getRoleOperPrivRelaByPrimaryKey(Long relaId){
        return roleOperPrivRelaDao.getByPrimaryKey(relaId);
    }

    public Integer createRoleOperPrivRela(RoleOperPrivRela record){
        return roleOperPrivRelaDao.insert(record);
    }

    public Integer removeRoleOperPrivRela(RoleOperPrivRela record){
        return roleOperPrivRelaDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long relaId){
    	return roleOperPrivRelaDao.deleteByPrimaryKey(relaId);
    }

    public Integer modifyRoleOperPrivRelaByPrimaryKey(RoleOperPrivRela record){
        return roleOperPrivRelaDao.updateByPrimaryKey(record);
    }









}