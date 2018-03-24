package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.InspectFactoryApplyInfoService;
import cn.enn.ygego.sunny.user.dao.InspectFactoryApplyInfoDao;
import cn.enn.ygego.sunny.user.model.InspectFactoryApplyInfo;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:InspectFactoryApplyInfo
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class InspectFactoryApplyInfoServiceImpl implements InspectFactoryApplyInfoService{

    @Autowired
    private InspectFactoryApplyInfoDao inspectFactoryApplyInfoDao;

    public List<InspectFactoryApplyInfo> findAll(){
       return  inspectFactoryApplyInfoDao.findAll();
    }

    public List<InspectFactoryApplyInfo> findInspectFactoryApplyInfos(InspectFactoryApplyInfo record){
       return  inspectFactoryApplyInfoDao.find(record);
    }

    public InspectFactoryApplyInfo getInspectFactoryApplyInfoByPrimaryKey(Long applyId){
        return inspectFactoryApplyInfoDao.getByPrimaryKey(applyId);
    }

    public Integer createInspectFactoryApplyInfo(InspectFactoryApplyInfo record){
        return inspectFactoryApplyInfoDao.insert(record);
    }

    public Integer removeInspectFactoryApplyInfo(InspectFactoryApplyInfo record){
        return inspectFactoryApplyInfoDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long applyId){
    	return inspectFactoryApplyInfoDao.deleteByPrimaryKey(applyId);
    }

    public Integer modifyInspectFactoryApplyInfoByPrimaryKey(InspectFactoryApplyInfo record){
        return inspectFactoryApplyInfoDao.updateByPrimaryKey(record);
    }









}