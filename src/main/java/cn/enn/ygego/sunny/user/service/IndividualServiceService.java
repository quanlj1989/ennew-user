package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.IndividualService;

/**
 * dal Interface:IndividualService
 * @author gencode
 * @date 2018-3-22
 */
public interface IndividualServiceService {

    public List<IndividualService> findAll();

    public List<IndividualService> findIndividualServices(IndividualService record);

    public IndividualService getIndividualServiceByPrimaryKey(Long serviceId);

    public Integer createIndividualService(IndividualService record);

    public Integer removeIndividualService(IndividualService record);

    public Integer removeByPrimaryKey(Long serviceId);

    public Integer modifyIndividualServiceByPrimaryKey(IndividualService record);



}