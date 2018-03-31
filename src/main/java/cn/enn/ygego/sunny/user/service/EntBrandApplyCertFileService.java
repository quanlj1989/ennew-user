package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.EntBrandApplyCertFile;

/**
 * dal Interface:EntBrandApplyCertFile
 * @author gencode
 * @date 2018-3-28
 */
public interface EntBrandApplyCertFileService {

    public List<EntBrandApplyCertFile> findAll();

    public List<EntBrandApplyCertFile> findEntBrandApplyCertFiles(EntBrandApplyCertFile record);

    public EntBrandApplyCertFile getEntBrandApplyCertFileByPrimaryKey(Long certApplyFileId);

    public Integer createEntBrandApplyCertFile(EntBrandApplyCertFile record);

    public Integer removeEntBrandApplyCertFile(EntBrandApplyCertFile record);

    public Integer removeByPrimaryKey(Long certApplyFileId);

    public Integer modifyEntBrandApplyCertFileByPrimaryKey(EntBrandApplyCertFile record);



}