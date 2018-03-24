package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.EntCertApplyFile;

/**
 * dal Interface:EntCertApplyFile
 * @author gencode
 * @date 2018-3-22
 */
public interface EntCertApplyFileService {

    public List<EntCertApplyFile> findAll();

    public List<EntCertApplyFile> findEntCertApplyFiles(EntCertApplyFile record);

    public EntCertApplyFile getEntCertApplyFileByPrimaryKey(Long certApplyFileId);

    public Integer createEntCertApplyFile(EntCertApplyFile record);

    public Integer removeEntCertApplyFile(EntCertApplyFile record);

    public Integer removeByPrimaryKey(Long certApplyFileId);

    public Integer modifyEntCertApplyFileByPrimaryKey(EntCertApplyFile record);



}