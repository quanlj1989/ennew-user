package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.EntAuthTypeApply;

/**
 * dal Interface:EntAuthTypeApply
 * @author gencode
 * @date 2018-3-28
 */
public interface EntAuthTypeApplyService {

    public List<EntAuthTypeApply> findAll();

    public List<EntAuthTypeApply> findEntAuthTypeApplys(EntAuthTypeApply record);

    public EntAuthTypeApply getEntAuthTypeApplyByPrimaryKey(Long authApplyId);

    public Integer createEntAuthTypeApply(EntAuthTypeApply record);

    public Integer removeEntAuthTypeApply(EntAuthTypeApply record);

    public Integer removeByPrimaryKey(Long authApplyId);

    public Integer modifyEntAuthTypeApplyByPrimaryKey(EntAuthTypeApply record);



}