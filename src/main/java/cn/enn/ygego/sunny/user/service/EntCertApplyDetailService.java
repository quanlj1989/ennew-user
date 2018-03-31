package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.EntCertApplyDetail;

/**
 * dal Interface:EntCertApplyDetail
 * @author gencode
 * @date 2018-3-28
 */
public interface EntCertApplyDetailService {

    public List<EntCertApplyDetail> findAll();

    public List<EntCertApplyDetail> findEntCertApplyDetails(EntCertApplyDetail record);

    public EntCertApplyDetail getEntCertApplyDetailByPrimaryKey(Long certApplyDetailId);

    public Integer createEntCertApplyDetail(EntCertApplyDetail record);

    public Integer removeEntCertApplyDetail(EntCertApplyDetail record);

    public Integer removeByPrimaryKey(Long certApplyDetailId);

    public Integer modifyEntCertApplyDetailByPrimaryKey(EntCertApplyDetail record);



}