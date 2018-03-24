package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.IndividualServiceApply;

/**
 * dal Interface:IndividualServiceApply
 * @author gencode
 * @date 2018-3-22
 */
public interface IndividualServiceApplyService {

    public List<IndividualServiceApply> findAll();

    public List<IndividualServiceApply> findIndividualServiceApplys(IndividualServiceApply record);

    public IndividualServiceApply getIndividualServiceApplyByPrimaryKey(Long serviceApplyId);

    public Integer createIndividualServiceApply(IndividualServiceApply record);

    public Integer removeIndividualServiceApply(IndividualServiceApply record);

    public Integer removeByPrimaryKey(Long serviceApplyId);

    public Integer modifyIndividualServiceApplyByPrimaryKey(IndividualServiceApply record);



}