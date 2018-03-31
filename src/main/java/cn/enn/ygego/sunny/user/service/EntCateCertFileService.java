package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.EntCateCertFile;

/**
 * dal Interface:EntCateCertFile
 * @author gencode
 * @date 2018-3-28
 */
public interface EntCateCertFileService {

    public List<EntCateCertFile> findAll();

    public List<EntCateCertFile> findEntCateCertFiles(EntCateCertFile record);

    public EntCateCertFile getEntCateCertFileByPrimaryKey(Long certFileId);

    public Integer createEntCateCertFile(EntCateCertFile record);

    public Integer removeEntCateCertFile(EntCateCertFile record);

    public Integer removeByPrimaryKey(Long certFileId);

    public Integer modifyEntCateCertFileByPrimaryKey(EntCateCertFile record);



}