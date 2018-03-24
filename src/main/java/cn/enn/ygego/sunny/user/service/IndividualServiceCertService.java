package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.IndividualServiceCert;

/**
 * dal Interface:IndividualServiceCert
 * @author gencode
 * @date 2018-3-22
 */
public interface IndividualServiceCertService {

    public List<IndividualServiceCert> findAll();

    public List<IndividualServiceCert> findIndividualServiceCerts(IndividualServiceCert record);

    public IndividualServiceCert getIndividualServiceCertByPrimaryKey(Long serviceCertId);

    public Integer createIndividualServiceCert(IndividualServiceCert record);

    public Integer removeIndividualServiceCert(IndividualServiceCert record);

    public Integer removeByPrimaryKey(Long serviceCertId);

    public Integer modifyIndividualServiceCertByPrimaryKey(IndividualServiceCert record);



}