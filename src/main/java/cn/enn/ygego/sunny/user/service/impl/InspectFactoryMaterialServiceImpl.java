package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.InspectFactoryMaterialService;
import cn.enn.ygego.sunny.user.dao.InspectFactoryMaterialDao;
import cn.enn.ygego.sunny.user.model.InspectFactoryMaterial;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:InspectFactoryMaterial
 * @author gencode
 * @date 2018-3-30
 */
@Service
public class InspectFactoryMaterialServiceImpl implements InspectFactoryMaterialService{

    @Autowired
    private InspectFactoryMaterialDao inspectFactoryMaterialDao;

    public List<InspectFactoryMaterial> findAll(){
       return  inspectFactoryMaterialDao.findAll();
    }

    public List<InspectFactoryMaterial> findInspectFactoryMaterials(InspectFactoryMaterial record){
       return  inspectFactoryMaterialDao.find(record);
    }

    public InspectFactoryMaterial getInspectFactoryMaterialByPrimaryKey(Long inspectMaterialId){
        return inspectFactoryMaterialDao.getByPrimaryKey(inspectMaterialId);
    }

    public Integer createInspectFactoryMaterial(InspectFactoryMaterial record){
        return inspectFactoryMaterialDao.insert(record);
    }

    public Integer removeInspectFactoryMaterial(InspectFactoryMaterial record){
        return inspectFactoryMaterialDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long inspectMaterialId){
    	return inspectFactoryMaterialDao.deleteByPrimaryKey(inspectMaterialId);
    }

    public Integer modifyInspectFactoryMaterialByPrimaryKey(InspectFactoryMaterial record){
        return inspectFactoryMaterialDao.updateByPrimaryKey(record);
    }









}