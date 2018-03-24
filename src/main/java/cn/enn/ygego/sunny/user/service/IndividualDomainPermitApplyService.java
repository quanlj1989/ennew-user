package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.IndividualDomainPermitApply;

/**
 * dal Interface:IndividualDomainPermitApply
 * @author gencode
 * @date 2018-3-22
 */
public interface IndividualDomainPermitApplyService {

    public List<IndividualDomainPermitApply> findAll();

    public List<IndividualDomainPermitApply> findIndividualDomainPermitApplys(IndividualDomainPermitApply record);

    public IndividualDomainPermitApply getIndividualDomainPermitApplyByPrimaryKey(Long domainApplyId);

    public Integer createIndividualDomainPermitApply(IndividualDomainPermitApply record);

    public Integer removeIndividualDomainPermitApply(IndividualDomainPermitApply record);

    public Integer removeByPrimaryKey(Long domainApplyId);

    public Integer modifyIndividualDomainPermitApplyByPrimaryKey(IndividualDomainPermitApply record);



}