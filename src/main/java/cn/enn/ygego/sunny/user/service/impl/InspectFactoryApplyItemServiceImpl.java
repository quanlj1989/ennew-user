package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.InspectFactoryApplyItemService;
import cn.enn.ygego.sunny.user.dao.InspectFactoryApplyItemDao;
import cn.enn.ygego.sunny.user.model.InspectFactoryApplyItem;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:InspectFactoryApplyItem
 * @author gencode
 * @date 2018-3-30
 */
@Service
public class InspectFactoryApplyItemServiceImpl implements InspectFactoryApplyItemService{

    @Autowired
    private InspectFactoryApplyItemDao inspectFactoryApplyItemDao;

    public List<InspectFactoryApplyItem> findAll(){
       return  inspectFactoryApplyItemDao.findAll();
    }

    public List<InspectFactoryApplyItem> findInspectFactoryApplyItems(InspectFactoryApplyItem record){
       return  inspectFactoryApplyItemDao.find(record);
    }

    public InspectFactoryApplyItem getInspectFactoryApplyItemByPrimaryKey(Long applyItemId){
        return inspectFactoryApplyItemDao.getByPrimaryKey(applyItemId);
    }

    public Integer createInspectFactoryApplyItem(InspectFactoryApplyItem record){
        return inspectFactoryApplyItemDao.insert(record);
    }

    public Integer removeInspectFactoryApplyItem(InspectFactoryApplyItem record){
        return inspectFactoryApplyItemDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long applyItemId){
    	return inspectFactoryApplyItemDao.deleteByPrimaryKey(applyItemId);
    }

    public Integer modifyInspectFactoryApplyItemByPrimaryKey(InspectFactoryApplyItem record){
        return inspectFactoryApplyItemDao.updateByPrimaryKey(record);
    }









}