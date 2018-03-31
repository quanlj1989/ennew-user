package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.EntAuthApplyFile;

/**
 * dal Interface:EntAuthApplyFile
 * @author gencode
 * @date 2018-3-28
 */
public interface EntAuthApplyFileService {

    public List<EntAuthApplyFile> findAll();

    public List<EntAuthApplyFile> findEntAuthApplyFiles(EntAuthApplyFile record);

    public EntAuthApplyFile getEntAuthApplyFileByPrimaryKey(Long certApplyFileId);

    public Integer createEntAuthApplyFile(EntAuthApplyFile record);

    public Integer removeEntAuthApplyFile(EntAuthApplyFile record);

    public Integer removeByPrimaryKey(Long certApplyFileId);

    public Integer modifyEntAuthApplyFileByPrimaryKey(EntAuthApplyFile record);



}