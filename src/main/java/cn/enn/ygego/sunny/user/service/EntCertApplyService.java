package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.EntCertApply;

/**
 * dal Interface:EntCertApply
 * @author gencode
 * @date 2018-3-22
 */
public interface EntCertApplyService {

    public List<EntCertApply> findAll();

    public List<EntCertApply> findEntCertApplys(EntCertApply record);

    public EntCertApply getEntCertApplyByPrimaryKey(Long certApplyId);

    public Integer createEntCertApply(EntCertApply record);

    public Integer removeEntCertApply(EntCertApply record);

    public Integer removeByPrimaryKey(Long certApplyId);

    public Integer modifyEntCertApplyByPrimaryKey(EntCertApply record);



}