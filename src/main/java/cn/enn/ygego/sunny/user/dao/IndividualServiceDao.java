package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.IndividualService;

/**
 * dal Interface:IndividualService
 * @author gencode
 */
public interface IndividualServiceDao {

	Integer insert(IndividualService record);

    Integer insertSelective(IndividualService record);
    
    Integer delete(IndividualService record);

    Integer deleteByPrimaryKey(@Param("serviceId") Long serviceId);
    
    Integer updateByPrimaryKey(IndividualService record);

    List<IndividualService> findAll();

    List<IndividualService> find(IndividualService record);

    Integer getCount(IndividualService record);

    IndividualService getByPrimaryKey(@Param("serviceId") Long serviceId);

	


}