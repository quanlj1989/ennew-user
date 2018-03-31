package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.EntMaterialService;
import cn.enn.ygego.sunny.user.dao.EntMaterialDao;
import cn.enn.ygego.sunny.user.model.EntMaterial;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:EntMaterial
 * @author gencode
 * @date 2018-3-28
 */
@Service
public class EntMaterialServiceImpl implements EntMaterialService{

    @Autowired
    private EntMaterialDao entMaterialDao;

    public List<EntMaterial> findAll(){
       return  entMaterialDao.findAll();
    }

    public List<EntMaterial> findEntMaterials(EntMaterial record){
       return  entMaterialDao.find(record);
    }

    public EntMaterial getEntMaterialByPrimaryKey(Long entMaterialId){
        return entMaterialDao.getByPrimaryKey(entMaterialId);
    }

    public Integer createEntMaterial(EntMaterial record){
        return entMaterialDao.insert(record);
    }

    public Integer removeEntMaterial(EntMaterial record){
        return entMaterialDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long entMaterialId){
    	return entMaterialDao.deleteByPrimaryKey(entMaterialId);
    }

    public Integer modifyEntMaterialByPrimaryKey(EntMaterial record){
        return entMaterialDao.updateByPrimaryKey(record);
    }









}