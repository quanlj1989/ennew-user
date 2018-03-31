package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.EntCertFile;

/**
 * dal Interface:EntCertFile
 * @author gencode
 * @date 2018-3-28
 */
public interface EntCertFileService {

    public List<EntCertFile> findAll();

    public List<EntCertFile> findEntCertFiles(EntCertFile record);

    public EntCertFile getEntCertFileByPrimaryKey(Long certFileId);

    public Integer createEntCertFile(EntCertFile record);

    public Integer removeEntCertFile(EntCertFile record);

    public Integer removeByPrimaryKey(Long certFileId);

    public Integer modifyEntCertFileByPrimaryKey(EntCertFile record);



}