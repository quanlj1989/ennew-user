package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.EntPaySet;

/**
 * dal Interface:EntPaySet
 * @author gencode
 * @date 2018-3-28
 */
public interface EntPaySetService {

    public List<EntPaySet> findAll();

    public List<EntPaySet> findEntPaySets(EntPaySet record);

    public EntPaySet getEntPaySetByPrimaryKey(Long paySetId);

    public Integer createEntPaySet(EntPaySet record);

    public Integer removeEntPaySet(EntPaySet record);

    public Integer removeByPrimaryKey(Long paySetId);

    public Integer modifyEntPaySetByPrimaryKey(EntPaySet record);



}