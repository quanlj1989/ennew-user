package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.FunctionManageService;
import cn.enn.ygego.sunny.user.dao.FunctionManageDao;
import cn.enn.ygego.sunny.user.model.FunctionManage;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:FunctionManage
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class FunctionManageServiceImpl implements FunctionManageService{

    @Autowired
    private FunctionManageDao functionManageDao;

    public List<FunctionManage> findAll(){
       return  functionManageDao.findAll();
    }

    public List<FunctionManage> findFunctionManages(FunctionManage record){
       return  functionManageDao.find(record);
    }

    public FunctionManage getFunctionManageByPrimaryKey(Long functionId){
        return functionManageDao.getByPrimaryKey(functionId);
    }

    public Integer createFunctionManage(FunctionManage record){
        return functionManageDao.insert(record);
    }

    public Integer removeFunctionManage(FunctionManage record){
        return functionManageDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long functionId){
    	return functionManageDao.deleteByPrimaryKey(functionId);
    }

    public Integer modifyFunctionManageByPrimaryKey(FunctionManage record){
        return functionManageDao.updateByPrimaryKey(record);
    }









}