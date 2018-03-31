package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.InspectFactoryMaterial;

/**
 * dal Interface:InspectFactoryMaterial
 * @author gencode
 * @date 2018-3-30
 */
public interface InspectFactoryMaterialService {

    public List<InspectFactoryMaterial> findAll();

    public List<InspectFactoryMaterial> findInspectFactoryMaterials(InspectFactoryMaterial record);

    public InspectFactoryMaterial getInspectFactoryMaterialByPrimaryKey(Long inspectMaterialId);

    public Integer createInspectFactoryMaterial(InspectFactoryMaterial record);

    public Integer removeInspectFactoryMaterial(InspectFactoryMaterial record);

    public Integer removeByPrimaryKey(Long inspectMaterialId);

    public Integer modifyInspectFactoryMaterialByPrimaryKey(InspectFactoryMaterial record);



}