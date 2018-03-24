package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.IndividualCertApplyFile;

/**
 * dal Interface:IndividualCertApplyFile
 * @author gencode
 * @date 2018-3-22
 */
public interface IndividualCertApplyFileService {

    public List<IndividualCertApplyFile> findAll();

    public List<IndividualCertApplyFile> findIndividualCertApplyFiles(IndividualCertApplyFile record);

    public IndividualCertApplyFile getIndividualCertApplyFileByPrimaryKey(Long certApplyFileId);

    public Integer createIndividualCertApplyFile(IndividualCertApplyFile record);

    public Integer removeIndividualCertApplyFile(IndividualCertApplyFile record);

    public Integer removeByPrimaryKey(Long certApplyFileId);

    public Integer modifyIndividualCertApplyFileByPrimaryKey(IndividualCertApplyFile record);



}