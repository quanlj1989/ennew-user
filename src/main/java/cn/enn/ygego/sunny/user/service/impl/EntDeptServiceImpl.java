package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.EntDeptService;
import cn.enn.ygego.sunny.user.dao.EntDeptDao;
import cn.enn.ygego.sunny.user.model.EntDept;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:EntDept
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class EntDeptServiceImpl implements EntDeptService{

    @Autowired
    private EntDeptDao entDeptDao;

    public List<EntDept> findAll(){
       return  entDeptDao.findAll();
    }

    public List<EntDept> findEntDepts(EntDept record){
       return  entDeptDao.find(record);
    }

    public EntDept getEntDeptByPrimaryKey(Long deptId){
        return entDeptDao.getByPrimaryKey(deptId);
    }

    public Integer createEntDept(EntDept record){
        return entDeptDao.insert(record);
    }

    public Integer removeEntDept(EntDept record){
        return entDeptDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long deptId){
    	return entDeptDao.deleteByPrimaryKey(deptId);
    }

    public Integer modifyEntDeptByPrimaryKey(EntDept record){
        return entDeptDao.updateByPrimaryKey(record);
    }









}