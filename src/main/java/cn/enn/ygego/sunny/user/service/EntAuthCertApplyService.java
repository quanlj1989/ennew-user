package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.EntAuthCertApply;

/**
 * dal Interface:EntAuthCertApply
 * @author gencode
 * @date 2018-3-28
 */
public interface EntAuthCertApplyService {

    public List<EntAuthCertApply> findAll();

    public List<EntAuthCertApply> findEntAuthCertApplys(EntAuthCertApply record);

    public EntAuthCertApply getEntAuthCertApplyByPrimaryKey(Long certApplyId);

    public Integer createEntAuthCertApply(EntAuthCertApply record);

    public Integer removeEntAuthCertApply(EntAuthCertApply record);

    public Integer removeByPrimaryKey(Long certApplyId);

    public Integer modifyEntAuthCertApplyByPrimaryKey(EntAuthCertApply record);



}