package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.InspectFactoryApplyAttachService;
import cn.enn.ygego.sunny.user.dao.InspectFactoryApplyAttachDao;
import cn.enn.ygego.sunny.user.model.InspectFactoryApplyAttach;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:InspectFactoryApplyAttach
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class InspectFactoryApplyAttachServiceImpl implements InspectFactoryApplyAttachService{

    @Autowired
    private InspectFactoryApplyAttachDao inspectFactoryApplyAttachDao;

    public List<InspectFactoryApplyAttach> findAll(){
       return  inspectFactoryApplyAttachDao.findAll();
    }

    public List<InspectFactoryApplyAttach> findInspectFactoryApplyAttachs(InspectFactoryApplyAttach record){
       return  inspectFactoryApplyAttachDao.find(record);
    }

    public InspectFactoryApplyAttach getInspectFactoryApplyAttachByPrimaryKey(Long attaId){
        return inspectFactoryApplyAttachDao.getByPrimaryKey(attaId);
    }

    public Integer createInspectFactoryApplyAttach(InspectFactoryApplyAttach record){
        return inspectFactoryApplyAttachDao.insert(record);
    }

    public Integer removeInspectFactoryApplyAttach(InspectFactoryApplyAttach record){
        return inspectFactoryApplyAttachDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long attaId){
    	return inspectFactoryApplyAttachDao.deleteByPrimaryKey(attaId);
    }

    public Integer modifyInspectFactoryApplyAttachByPrimaryKey(InspectFactoryApplyAttach record){
        return inspectFactoryApplyAttachDao.updateByPrimaryKey(record);
    }









}