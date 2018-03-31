package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.ThirdLoginInfo;

/**
 * dal Interface:ThirdLoginInfo
 * @author gencode
 */
public interface ThirdLoginInfoDao {

	Integer insert(ThirdLoginInfo record);

    Integer insertSelective(ThirdLoginInfo record);
    
    Integer delete(ThirdLoginInfo record);

    Integer deleteByPrimaryKey(@Param("loginId") String loginId);
    
    Integer updateByPrimaryKey(ThirdLoginInfo record);

    List<ThirdLoginInfo> findAll();

    List<ThirdLoginInfo> find(ThirdLoginInfo record);

    Integer getCount(ThirdLoginInfo record);

    ThirdLoginInfo getByPrimaryKey(@Param("loginId") String loginId);

	


}