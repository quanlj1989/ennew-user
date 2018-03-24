package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.EntBrandCertFile;

/**
 * dal Interface:EntBrandCertFile
 * @author gencode
 * @date 2018-3-22
 */
public interface EntBrandCertFileService {

    public List<EntBrandCertFile> findAll();

    public List<EntBrandCertFile> findEntBrandCertFiles(EntBrandCertFile record);

    public EntBrandCertFile getEntBrandCertFileByPrimaryKey(Long certApplyFileId);

    public Integer createEntBrandCertFile(EntBrandCertFile record);

    public Integer removeEntBrandCertFile(EntBrandCertFile record);

    public Integer removeByPrimaryKey(Long certApplyFileId);

    public Integer modifyEntBrandCertFileByPrimaryKey(EntBrandCertFile record);



}