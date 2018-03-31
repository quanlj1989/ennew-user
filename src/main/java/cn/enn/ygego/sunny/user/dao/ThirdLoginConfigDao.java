package cn.enn.ygego.sunny.user.dao;

import java.util.List;

import cn.enn.ygego.sunny.user.dto.login.ThirdLoginConfigResponse;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.ThirdLoginConfig;

/**
 * dal Interface:ThirdLoginConfig
 * @author gencode
 */
public interface ThirdLoginConfigDao {

	Integer insert(ThirdLoginConfig record);

    Integer insertSelective(ThirdLoginConfig record);
    
    Integer delete(ThirdLoginConfig record);

    Integer deleteByPrimaryKey(@Param("configId") Long configId);
    
    Integer updateByPrimaryKey(ThirdLoginConfig record);

    List<ThirdLoginConfig> findAll();

    List<ThirdLoginConfig> find(ThirdLoginConfig record);

    Integer getCount(ThirdLoginConfig record);

    ThirdLoginConfig getByPrimaryKey(@Param("configId") Long configId);


    /**
     * 获取可用第三方登陆配置信息
     * @return
     */
    List<ThirdLoginConfigResponse> findEnabledConfigs();
}