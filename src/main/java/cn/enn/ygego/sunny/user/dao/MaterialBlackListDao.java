package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.MaterialBlackList;

/**
 * dal Interface:MaterialBlackList
 * @author gencode
 */
public interface MaterialBlackListDao {

	Integer insert(MaterialBlackList record);

    Integer insertSelective(MaterialBlackList record);
    
    Integer delete(MaterialBlackList record);

    Integer deleteByPrimaryKey(@Param("listId") Long listId);
    
    Integer updateByPrimaryKey(MaterialBlackList record);

    List<MaterialBlackList> findAll();

    List<MaterialBlackList> find(MaterialBlackList record);

    Integer getCount(MaterialBlackList record);

    MaterialBlackList getByPrimaryKey(@Param("listId") Long listId);

	


}