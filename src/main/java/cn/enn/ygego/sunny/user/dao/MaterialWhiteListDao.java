package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.MaterialWhiteList;

/**
 * dal Interface:MaterialWhiteList
 * @author gencode
 */
public interface MaterialWhiteListDao {

	Integer insert(MaterialWhiteList record);

    Integer insertSelective(MaterialWhiteList record);
    
    Integer delete(MaterialWhiteList record);

    Integer deleteByPrimaryKey(@Param("listId") Long listId);
    
    Integer updateByPrimaryKey(MaterialWhiteList record);

    List<MaterialWhiteList> findAll();

    List<MaterialWhiteList> find(MaterialWhiteList record);

    Integer getCount(MaterialWhiteList record);

    MaterialWhiteList getByPrimaryKey(@Param("listId") Long listId);

	


}