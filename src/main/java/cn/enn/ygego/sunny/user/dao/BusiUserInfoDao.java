package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.BusiUserInfo;

/**
 * dal Interface:BusiUserInfo
 * @author gencode
 */
public interface BusiUserInfoDao {

	Integer insert(BusiUserInfo record);

    Integer insertSelective(BusiUserInfo record);
    
    Integer delete(BusiUserInfo record);

    Integer deleteByPrimaryKey(@Param("userId") Long userId);
    
    Integer updateByPrimaryKey(BusiUserInfo record);

    List<BusiUserInfo> findAll();

    List<BusiUserInfo> find(BusiUserInfo record);

    Integer getCount(BusiUserInfo record);

    BusiUserInfo getByPrimaryKey(@Param("userId") Long userId);


    /**
     * 根据UserTitle查找
     * @param userTitle
     * @return
     */
    BusiUserInfo selectByUserTitle(@Param("userId") String userTitle);

}