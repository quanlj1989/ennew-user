package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.IndividualBrandCertFile;

/**
 * dal Interface:IndividualBrandCertFile
 * @author gencode
 * @date 2018-3-22
 */
public interface IndividualBrandCertFileService {

    public List<IndividualBrandCertFile> findAll();

    public List<IndividualBrandCertFile> findIndividualBrandCertFiles(IndividualBrandCertFile record);

    public IndividualBrandCertFile getIndividualBrandCertFileByPrimaryKey(Long certApplyFileId);

    public Integer createIndividualBrandCertFile(IndividualBrandCertFile record);

    public Integer removeIndividualBrandCertFile(IndividualBrandCertFile record);

    public Integer removeByPrimaryKey(Long certApplyFileId);

    public Integer modifyIndividualBrandCertFileByPrimaryKey(IndividualBrandCertFile record);



}