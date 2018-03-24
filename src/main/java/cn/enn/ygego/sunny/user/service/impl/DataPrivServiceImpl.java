package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.DataPrivService;
import cn.enn.ygego.sunny.user.dao.DataPrivDao;
import cn.enn.ygego.sunny.user.model.DataPriv;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:DataPriv
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class DataPrivServiceImpl implements DataPrivService{

    @Autowired
    private DataPrivDao dataPrivDao;

    public List<DataPriv> findAll(){
       return  dataPrivDao.findAll();
    }

    public List<DataPriv> findDataPrivs(DataPriv record){
       return  dataPrivDao.find(record);
    }

    public DataPriv getDataPrivByPrimaryKey(Long privId){
        return dataPrivDao.getByPrimaryKey(privId);
    }

    public Integer createDataPriv(DataPriv record){
        return dataPrivDao.insert(record);
    }

    public Integer removeDataPriv(DataPriv record){
        return dataPrivDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long privId){
    	return dataPrivDao.deleteByPrimaryKey(privId);
    }

    public Integer modifyDataPrivByPrimaryKey(DataPriv record){
        return dataPrivDao.updateByPrimaryKey(record);
    }









}