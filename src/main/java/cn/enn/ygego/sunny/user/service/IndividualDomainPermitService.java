package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.IndividualDomainPermit;

/**
 * dal Interface:IndividualDomainPermit
 * @author gencode
 * @date 2018-3-22
 */
public interface IndividualDomainPermitService {

    public List<IndividualDomainPermit> findAll();

    public List<IndividualDomainPermit> findIndividualDomainPermits(IndividualDomainPermit record);

    public IndividualDomainPermit getIndividualDomainPermitByPrimaryKey(Long domainPermitId);

    public Integer createIndividualDomainPermit(IndividualDomainPermit record);

    public Integer removeIndividualDomainPermit(IndividualDomainPermit record);

    public Integer removeByPrimaryKey(Long domainPermitId);

    public Integer modifyIndividualDomainPermitByPrimaryKey(IndividualDomainPermit record);



}