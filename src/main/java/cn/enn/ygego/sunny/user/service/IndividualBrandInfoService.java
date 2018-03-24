package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.IndividualBrandInfo;

/**
 * dal Interface:IndividualBrandInfo
 * @author gencode
 * @date 2018-3-22
 */
public interface IndividualBrandInfoService {

    public List<IndividualBrandInfo> findAll();

    public List<IndividualBrandInfo> findIndividualBrandInfos(IndividualBrandInfo record);

    public IndividualBrandInfo getIndividualBrandInfoByPrimaryKey(Long individualBrandId);

    public Integer createIndividualBrandInfo(IndividualBrandInfo record);

    public Integer removeIndividualBrandInfo(IndividualBrandInfo record);

    public Integer removeByPrimaryKey(Long individualBrandId);

    public Integer modifyIndividualBrandInfoByPrimaryKey(IndividualBrandInfo record);



}