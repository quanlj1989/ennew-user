package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.IndividualServiceCertFile;

/**
 * dal Interface:IndividualServiceCertFile
 * @author gencode
 * @date 2018-3-22
 */
public interface IndividualServiceCertFileService {

    public List<IndividualServiceCertFile> findAll();

    public List<IndividualServiceCertFile> findIndividualServiceCertFiles(IndividualServiceCertFile record);

    public IndividualServiceCertFile getIndividualServiceCertFileByPrimaryKey(Long certApplyFileId);

    public Integer createIndividualServiceCertFile(IndividualServiceCertFile record);

    public Integer removeIndividualServiceCertFile(IndividualServiceCertFile record);

    public Integer removeByPrimaryKey(Long certApplyFileId);

    public Integer modifyIndividualServiceCertFileByPrimaryKey(IndividualServiceCertFile record);



}