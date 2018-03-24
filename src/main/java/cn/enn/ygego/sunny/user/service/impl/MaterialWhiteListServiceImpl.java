package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.MaterialWhiteListService;
import cn.enn.ygego.sunny.user.dao.MaterialWhiteListDao;
import cn.enn.ygego.sunny.user.model.MaterialWhiteList;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:MaterialWhiteList
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class MaterialWhiteListServiceImpl implements MaterialWhiteListService{

    @Autowired
    private MaterialWhiteListDao materialWhiteListDao;

    public List<MaterialWhiteList> findAll(){
       return  materialWhiteListDao.findAll();
    }

    public List<MaterialWhiteList> findMaterialWhiteLists(MaterialWhiteList record){
       return  materialWhiteListDao.find(record);
    }

    public MaterialWhiteList getMaterialWhiteListByPrimaryKey(Long listId){
        return materialWhiteListDao.getByPrimaryKey(listId);
    }

    public Integer createMaterialWhiteList(MaterialWhiteList record){
        return materialWhiteListDao.insert(record);
    }

    public Integer removeMaterialWhiteList(MaterialWhiteList record){
        return materialWhiteListDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long listId){
    	return materialWhiteListDao.deleteByPrimaryKey(listId);
    }

    public Integer modifyMaterialWhiteListByPrimaryKey(MaterialWhiteList record){
        return materialWhiteListDao.updateByPrimaryKey(record);
    }









}