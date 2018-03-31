package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.EntCateCertApplyFile;

/**
 * dal Interface:EntCateCertApplyFile
 * @author gencode
 * @date 2018-3-28
 */
public interface EntCateCertApplyFileService {

    public List<EntCateCertApplyFile> findAll();

    public List<EntCateCertApplyFile> findEntCateCertApplyFiles(EntCateCertApplyFile record);

    public EntCateCertApplyFile getEntCateCertApplyFileByPrimaryKey(Long certApplyFileId);

    public Integer createEntCateCertApplyFile(EntCateCertApplyFile record);

    public Integer removeEntCateCertApplyFile(EntCateCertApplyFile record);

    public Integer removeByPrimaryKey(Long certApplyFileId);

    public Integer modifyEntCateCertApplyFileByPrimaryKey(EntCateCertApplyFile record);



}