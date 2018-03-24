package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.IndividualBrandCertInfo;

/**
 * dal Interface:IndividualBrandCertInfo
 * @author gencode
 * @date 2018-3-22
 */
public interface IndividualBrandCertInfoService {

    public List<IndividualBrandCertInfo> findAll();

    public List<IndividualBrandCertInfo> findIndividualBrandCertInfos(IndividualBrandCertInfo record);

    public IndividualBrandCertInfo getIndividualBrandCertInfoByPrimaryKey(Long brandCertId);

    public Integer createIndividualBrandCertInfo(IndividualBrandCertInfo record);

    public Integer removeIndividualBrandCertInfo(IndividualBrandCertInfo record);

    public Integer removeByPrimaryKey(Long brandCertId);

    public Integer modifyIndividualBrandCertInfoByPrimaryKey(IndividualBrandCertInfo record);



}