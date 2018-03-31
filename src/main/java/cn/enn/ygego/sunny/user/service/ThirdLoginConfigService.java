package cn.enn.ygego.sunny.user.service;

import java.util.List;

import cn.enn.ygego.sunny.user.dto.login.ThirdLoginConfigResponse;
import cn.enn.ygego.sunny.user.model.ThirdLoginConfig;

/**
 * dal Interface:ThirdLoginConfig
 * @author gencode
 * @date 2018-3-28
 */
public interface ThirdLoginConfigService {

    public List<ThirdLoginConfig> findAll();

    public List<ThirdLoginConfig> findThirdLoginConfigs(ThirdLoginConfig record);

    public ThirdLoginConfig getThirdLoginConfigByPrimaryKey(Long configId);

    public Integer createThirdLoginConfig(ThirdLoginConfig record);

    public Integer removeThirdLoginConfig(ThirdLoginConfig record);

    public Integer removeByPrimaryKey(Long configId);

    public Integer modifyThirdLoginConfigByPrimaryKey(ThirdLoginConfig record);


    /**
     * 查询第三方登陆配置信息
     * @return
     */
    List<ThirdLoginConfigResponse> findEnabledConfigs();

}