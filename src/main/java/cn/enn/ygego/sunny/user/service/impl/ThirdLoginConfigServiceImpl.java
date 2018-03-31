package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;

import cn.enn.ygego.sunny.user.dto.login.ThirdLoginConfigResponse;
import cn.enn.ygego.sunny.user.service.ThirdLoginConfigService;
import cn.enn.ygego.sunny.user.dao.ThirdLoginConfigDao;
import cn.enn.ygego.sunny.user.model.ThirdLoginConfig;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * dal Interface:ThirdLoginConfig
 *
 * @author gencode
 * @date 2018-3-28
 */
@Service
public class ThirdLoginConfigServiceImpl implements ThirdLoginConfigService {

    @Autowired
    private ThirdLoginConfigDao thirdLoginConfigDao;

    public List<ThirdLoginConfig> findAll() {
        return thirdLoginConfigDao.findAll();
    }

    public List<ThirdLoginConfig> findThirdLoginConfigs(ThirdLoginConfig record) {
        return thirdLoginConfigDao.find(record);
    }

    public ThirdLoginConfig getThirdLoginConfigByPrimaryKey(Long configId) {
        return thirdLoginConfigDao.getByPrimaryKey(configId);
    }

    public Integer createThirdLoginConfig(ThirdLoginConfig record) {
        return thirdLoginConfigDao.insert(record);
    }

    public Integer removeThirdLoginConfig(ThirdLoginConfig record) {
        return thirdLoginConfigDao.delete(record);
    }

    public Integer removeByPrimaryKey(Long configId) {
        return thirdLoginConfigDao.deleteByPrimaryKey(configId);
    }

    public Integer modifyThirdLoginConfigByPrimaryKey(ThirdLoginConfig record) {
        return thirdLoginConfigDao.updateByPrimaryKey(record);
    }

    /**
     * 查询第三方登陆配置信息
     *
     * @return
     */
    @Override
    public List<ThirdLoginConfigResponse> findEnabledConfigs() {

        return thirdLoginConfigDao.findEnabledConfigs();
    }

}