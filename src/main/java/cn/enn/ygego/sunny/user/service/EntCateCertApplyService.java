package cn.enn.ygego.sunny.user.service;

import java.util.List;

import cn.enn.ygego.sunny.user.dto.vo.EntCateAndBrandVO;
import cn.enn.ygego.sunny.user.model.EntCateCertApply;

/**
 * dal Interface:EntCateCertApply
 * @author gencode
 * @date 2018-3-28
 */
public interface EntCateCertApplyService {

    public List<EntCateCertApply> findAll();

    public List<EntCateCertApply> findEntCateCertApplys(EntCateCertApply record);

    public EntCateCertApply getEntCateCertApplyByPrimaryKey(Long certApplyDetailId);

    public Integer createEntCateCertApply(EntCateCertApply record);

    public Integer removeEntCateCertApply(EntCateCertApply record);

    public Integer removeByPrimaryKey(Long certApplyDetailId);

    public Integer modifyEntCateCertApplyByPrimaryKey(EntCateCertApply record);

    public Integer createEntCateAndBrandApply(EntCateAndBrandVO record);



}