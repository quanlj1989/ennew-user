package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.RelaChannelToRoleService;
import cn.enn.ygego.sunny.user.dao.RelaChannelToRoleDao;
import cn.enn.ygego.sunny.user.model.RelaChannelToRole;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:RelaChannelToRole
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class RelaChannelToRoleServiceImpl implements RelaChannelToRoleService{

    @Autowired
    private RelaChannelToRoleDao relaChannelToRoleDao;

    public List<RelaChannelToRole> findAll(){
       return  relaChannelToRoleDao.findAll();
    }

    public List<RelaChannelToRole> findRelaChannelToRoles(RelaChannelToRole record){
       return  relaChannelToRoleDao.find(record);
    }

    public RelaChannelToRole getRelaChannelToRoleByPrimaryKey(Long relaId){
        return relaChannelToRoleDao.getByPrimaryKey(relaId);
    }

    public Integer createRelaChannelToRole(RelaChannelToRole record){
        return relaChannelToRoleDao.insert(record);
    }

    public Integer removeRelaChannelToRole(RelaChannelToRole record){
        return relaChannelToRoleDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long relaId){
    	return relaChannelToRoleDao.deleteByPrimaryKey(relaId);
    }

    public Integer modifyRelaChannelToRoleByPrimaryKey(RelaChannelToRole record){
        return relaChannelToRoleDao.updateByPrimaryKey(record);
    }









}