package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.UserInfo;

/**
 * dal Interface:UserInfo
 * @author gencode
 */
public interface UserInfoDao {

	Integer insert(UserInfo record);

    Integer insertSelective(UserInfo record);
    
    Integer delete(UserInfo record);

    Integer deleteByPrimaryKey(@Param("userId") Long userId);
    
    Integer updateByPrimaryKey(UserInfo record);

    List<UserInfo> findAll();

    List<UserInfo> find(UserInfo record);

    Integer getCount(UserInfo record);

    UserInfo getByPrimaryKey(@Param("userId") Long userId);

	


}