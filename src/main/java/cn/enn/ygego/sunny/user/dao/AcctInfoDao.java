package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.AcctInfo;

/**
 * dal Interface:AcctInfo
 * @author gencode
 */
public interface AcctInfoDao {

	Integer insert(AcctInfo record);

    Integer insertSelective(AcctInfo record);
    
    Integer delete(AcctInfo record);

    Integer deleteByPrimaryKey(@Param("acctId") Long acctId);
    
    Integer updateByPrimaryKey(AcctInfo record);

    List<AcctInfo> findAll();

    List<AcctInfo> find(AcctInfo record);

    Integer getCount(AcctInfo record);

    AcctInfo getByPrimaryKey(@Param("acctId") Long acctId);

	


}