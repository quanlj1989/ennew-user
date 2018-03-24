package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.IndividualServiceApplyCert;

/**
 * dal Interface:IndividualServiceApplyCert
 * @author gencode
 * @date 2018-3-22
 */
public interface IndividualServiceApplyCertService {

    public List<IndividualServiceApplyCert> findAll();

    public List<IndividualServiceApplyCert> findIndividualServiceApplyCerts(IndividualServiceApplyCert record);

    public IndividualServiceApplyCert getIndividualServiceApplyCertByPrimaryKey(Long serviceApplyCertId);

    public Integer createIndividualServiceApplyCert(IndividualServiceApplyCert record);

    public Integer removeIndividualServiceApplyCert(IndividualServiceApplyCert record);

    public Integer removeByPrimaryKey(Long serviceApplyCertId);

    public Integer modifyIndividualServiceApplyCertByPrimaryKey(IndividualServiceApplyCert record);



}