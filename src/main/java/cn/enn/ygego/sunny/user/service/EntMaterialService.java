package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.EntMaterial;

/**
 * dal Interface:EntMaterial
 * @author gencode
 * @date 2018-3-28
 */
public interface EntMaterialService {

    public List<EntMaterial> findAll();

    public List<EntMaterial> findEntMaterials(EntMaterial record);

    public EntMaterial getEntMaterialByPrimaryKey(Long entMaterialId);

    public Integer createEntMaterial(EntMaterial record);

    public Integer removeEntMaterial(EntMaterial record);

    public Integer removeByPrimaryKey(Long entMaterialId);

    public Integer modifyEntMaterialByPrimaryKey(EntMaterial record);



}