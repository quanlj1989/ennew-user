package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.MaterialBlackListService;
import cn.enn.ygego.sunny.user.dao.MaterialBlackListDao;
import cn.enn.ygego.sunny.user.model.MaterialBlackList;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:MaterialBlackList
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class MaterialBlackListServiceImpl implements MaterialBlackListService{

    @Autowired
    private MaterialBlackListDao materialBlackListDao;

    public List<MaterialBlackList> findAll(){
       return  materialBlackListDao.findAll();
    }

    public List<MaterialBlackList> findMaterialBlackLists(MaterialBlackList record){
       return  materialBlackListDao.find(record);
    }

    public MaterialBlackList getMaterialBlackListByPrimaryKey(Long listId){
        return materialBlackListDao.getByPrimaryKey(listId);
    }

    public Integer createMaterialBlackList(MaterialBlackList record){
        return materialBlackListDao.insert(record);
    }

    public Integer removeMaterialBlackList(MaterialBlackList record){
        return materialBlackListDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long listId){
    	return materialBlackListDao.deleteByPrimaryKey(listId);
    }

    public Integer modifyMaterialBlackListByPrimaryKey(MaterialBlackList record){
        return materialBlackListDao.updateByPrimaryKey(record);
    }









}