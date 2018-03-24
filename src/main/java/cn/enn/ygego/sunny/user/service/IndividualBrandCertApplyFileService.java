package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.IndividualBrandCertApplyFile;

/**
 * dal Interface:IndividualBrandCertApplyFile
 * @author gencode
 * @date 2018-3-22
 */
public interface IndividualBrandCertApplyFileService {

    public List<IndividualBrandCertApplyFile> findAll();

    public List<IndividualBrandCertApplyFile> findIndividualBrandCertApplyFiles(IndividualBrandCertApplyFile record);

    public IndividualBrandCertApplyFile getIndividualBrandCertApplyFileByPrimaryKey(Long certApplyFileId);

    public Integer createIndividualBrandCertApplyFile(IndividualBrandCertApplyFile record);

    public Integer removeIndividualBrandCertApplyFile(IndividualBrandCertApplyFile record);

    public Integer removeByPrimaryKey(Long certApplyFileId);

    public Integer modifyIndividualBrandCertApplyFileByPrimaryKey(IndividualBrandCertApplyFile record);



}