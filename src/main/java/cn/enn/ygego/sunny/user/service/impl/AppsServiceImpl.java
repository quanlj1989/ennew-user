package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.AppsService;
import cn.enn.ygego.sunny.user.dao.AppsDao;
import cn.enn.ygego.sunny.user.model.Apps;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:Apps
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class AppsServiceImpl implements AppsService{

    @Autowired
    private AppsDao appsDao;

    public List<Apps> findAll(){
       return  appsDao.findAll();
    }

    public List<Apps> findAppss(Apps record){
       return  appsDao.find(record);
    }

    public Apps getAppsByPrimaryKey(Long appId){
        return appsDao.getByPrimaryKey(appId);
    }

    public Integer createApps(Apps record){
        return appsDao.insert(record);
    }

    public Integer removeApps(Apps record){
        return appsDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long appId){
    	return appsDao.deleteByPrimaryKey(appId);
    }

    public Integer modifyAppsByPrimaryKey(Apps record){
        return appsDao.updateByPrimaryKey(record);
    }









}