package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.EntJoinMarket;

/**
 * dal Interface:EntJoinMarket
 * @author gencode
 */
public interface EntJoinMarketDao {

	Integer insert(EntJoinMarket record);

    Integer insertSelective(EntJoinMarket record);
    
    Integer delete(EntJoinMarket record);

    Integer deleteByPrimaryKey(@Param("joinId") Long joinId);
    
    Integer updateByPrimaryKey(EntJoinMarket record);

    List<EntJoinMarket> findAll();

    List<EntJoinMarket> find(EntJoinMarket record);

    Integer getCount(EntJoinMarket record);

    EntJoinMarket getByPrimaryKey(@Param("joinId") Long joinId);

	


}