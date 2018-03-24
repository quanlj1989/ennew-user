package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.IndividualBrandApply;

/**
 * dal Interface:IndividualBrandApply
 * @author gencode
 * @date 2018-3-22
 */
public interface IndividualBrandApplyService {

    public List<IndividualBrandApply> findAll();

    public List<IndividualBrandApply> findIndividualBrandApplys(IndividualBrandApply record);

    public IndividualBrandApply getIndividualBrandApplyByPrimaryKey(Integer brandApplyId);

    public Integer createIndividualBrandApply(IndividualBrandApply record);

    public Integer removeIndividualBrandApply(IndividualBrandApply record);

    public Integer removeByPrimaryKey(Integer brandApplyId);

    public Integer modifyIndividualBrandApplyByPrimaryKey(IndividualBrandApply record);



}