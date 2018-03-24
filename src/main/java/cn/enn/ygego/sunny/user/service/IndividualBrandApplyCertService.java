package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.IndividualBrandApplyCert;

/**
 * dal Interface:IndividualBrandApplyCert
 * @author gencode
 * @date 2018-3-22
 */
public interface IndividualBrandApplyCertService {

    public List<IndividualBrandApplyCert> findAll();

    public List<IndividualBrandApplyCert> findIndividualBrandApplyCerts(IndividualBrandApplyCert record);

    public IndividualBrandApplyCert getIndividualBrandApplyCertByPrimaryKey(Long brandApplyCertId);

    public Integer createIndividualBrandApplyCert(IndividualBrandApplyCert record);

    public Integer removeIndividualBrandApplyCert(IndividualBrandApplyCert record);

    public Integer removeByPrimaryKey(Long brandApplyCertId);

    public Integer modifyIndividualBrandApplyCertByPrimaryKey(IndividualBrandApplyCert record);



}