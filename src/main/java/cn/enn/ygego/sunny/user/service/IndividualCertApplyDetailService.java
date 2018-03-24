package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.IndividualCertApplyDetail;

/**
 * dal Interface:IndividualCertApplyDetail
 * @author gencode
 * @date 2018-3-22
 */
public interface IndividualCertApplyDetailService {

    public List<IndividualCertApplyDetail> findAll();

    public List<IndividualCertApplyDetail> findIndividualCertApplyDetails(IndividualCertApplyDetail record);

    public IndividualCertApplyDetail getIndividualCertApplyDetailByPrimaryKey(Long certApplyDetailId);

    public Integer createIndividualCertApplyDetail(IndividualCertApplyDetail record);

    public Integer removeIndividualCertApplyDetail(IndividualCertApplyDetail record);

    public Integer removeByPrimaryKey(Long certApplyDetailId);

    public Integer modifyIndividualCertApplyDetailByPrimaryKey(IndividualCertApplyDetail record);



}