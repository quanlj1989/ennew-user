package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.EntDomainPermit;

/**
 * dal Interface:EntDomainPermit
 * @author gencode
 * @date 2018-3-28
 */
public interface EntDomainPermitService {

    public List<EntDomainPermit> findAll();

    public List<EntDomainPermit> findEntDomainPermits(EntDomainPermit record);

    public EntDomainPermit getEntDomainPermitByPrimaryKey(Long domainPermitId);

    public Integer createEntDomainPermit(EntDomainPermit record);

    public Integer removeEntDomainPermit(EntDomainPermit record);

    public Integer removeByPrimaryKey(Long domainPermitId);

    public Integer modifyEntDomainPermitByPrimaryKey(EntDomainPermit record);



}