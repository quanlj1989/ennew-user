package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.IndividualCertFile;

/**
 * dal Interface:IndividualCertFile
 * @author gencode
 * @date 2018-3-22
 */
public interface IndividualCertFileService {

    public List<IndividualCertFile> findAll();

    public List<IndividualCertFile> findIndividualCertFiles(IndividualCertFile record);

    public IndividualCertFile getIndividualCertFileByPrimaryKey(Long certFileId);

    public Integer createIndividualCertFile(IndividualCertFile record);

    public Integer removeIndividualCertFile(IndividualCertFile record);

    public Integer removeByPrimaryKey(Long certFileId);

    public Integer modifyIndividualCertFileByPrimaryKey(IndividualCertFile record);

    public List<IndividualCertFile> getFilesByCertInfoId(Long certInfoId);

}