package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.DataPriv;

/**
 * dal Interface:DataPriv
 * @author gencode
 */
public interface DataPrivDao {

	Integer insert(DataPriv record);

    Integer insertSelective(DataPriv record);
    
    Integer delete(DataPriv record);

    Integer deleteByPrimaryKey(@Param("privId") Long privId);
    
    Integer updateByPrimaryKey(DataPriv record);

    List<DataPriv> findAll();

    List<DataPriv> find(DataPriv record);

    Integer getCount(DataPriv record);

    DataPriv getByPrimaryKey(@Param("privId") Long privId);

	


}