package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.OperManageService;
import cn.enn.ygego.sunny.user.dao.OperManageDao;
import cn.enn.ygego.sunny.user.model.OperManage;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:OperManage
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class OperManageServiceImpl implements OperManageService{

    @Autowired
    private OperManageDao operManageDao;

    public List<OperManage> findAll(){
       return  operManageDao.findAll();
    }

    public List<OperManage> findOperManages(OperManage record){
       return  operManageDao.find(record);
    }

    public OperManage getOperManageByPrimaryKey(Long operId){
        return operManageDao.getByPrimaryKey(operId);
    }

    public Integer createOperManage(OperManage record){
        return operManageDao.insert(record);
    }

    public Integer removeOperManage(OperManage record){
        return operManageDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long operId){
    	return operManageDao.deleteByPrimaryKey(operId);
    }

    public Integer modifyOperManageByPrimaryKey(OperManage record){
        return operManageDao.updateByPrimaryKey(record);
    }









}