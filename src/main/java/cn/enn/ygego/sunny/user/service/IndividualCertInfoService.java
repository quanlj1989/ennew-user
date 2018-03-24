package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.IndividualCertInfo;

/**
 * dal Interface:IndividualCertInfo
 * @author gencode
 * @date 2018-3-22
 */
public interface IndividualCertInfoService {

    public List<IndividualCertInfo> findAll();

    public List<IndividualCertInfo> findIndividualCertInfos(IndividualCertInfo record);

    public IndividualCertInfo getIndividualCertInfoByPrimaryKey(Long certInfoId);

    public Integer createIndividualCertInfo(IndividualCertInfo record);

    public Integer removeIndividualCertInfo(IndividualCertInfo record);

    public Integer removeByPrimaryKey(Long certInfoId);

    public Integer modifyIndividualCertInfoByPrimaryKey(IndividualCertInfo record);



}