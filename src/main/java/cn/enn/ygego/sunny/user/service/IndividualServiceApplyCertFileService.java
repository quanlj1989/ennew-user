package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.IndividualServiceApplyCertFile;

/**
 * dal Interface:IndividualServiceApplyCertFile
 * @author gencode
 * @date 2018-3-22
 */
public interface IndividualServiceApplyCertFileService {

    public List<IndividualServiceApplyCertFile> findAll();

    public List<IndividualServiceApplyCertFile> findIndividualServiceApplyCertFiles(IndividualServiceApplyCertFile record);

    public IndividualServiceApplyCertFile getIndividualServiceApplyCertFileByPrimaryKey(Long certApplyFileId);

    public Integer createIndividualServiceApplyCertFile(IndividualServiceApplyCertFile record);

    public Integer removeIndividualServiceApplyCertFile(IndividualServiceApplyCertFile record);

    public Integer removeByPrimaryKey(Long certApplyFileId);

    public Integer modifyIndividualServiceApplyCertFileByPrimaryKey(IndividualServiceApplyCertFile record);



}