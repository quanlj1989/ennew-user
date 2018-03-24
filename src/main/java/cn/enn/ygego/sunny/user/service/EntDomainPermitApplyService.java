package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.EntDomainPermitApply;

/**
 * dal Interface:EntDomainPermitApply
 * @author gencode
 * @date 2018-3-22
 */
public interface EntDomainPermitApplyService {

    public List<EntDomainPermitApply> findAll();

    public List<EntDomainPermitApply> findEntDomainPermitApplys(EntDomainPermitApply record);

    public EntDomainPermitApply getEntDomainPermitApplyByPrimaryKey(Long domainApplyId);

    public Integer createEntDomainPermitApply(EntDomainPermitApply record);

    public Integer removeEntDomainPermitApply(EntDomainPermitApply record);

    public Integer removeByPrimaryKey(Long domainApplyId);

    public Integer modifyEntDomainPermitApplyByPrimaryKey(EntDomainPermitApply record);



}