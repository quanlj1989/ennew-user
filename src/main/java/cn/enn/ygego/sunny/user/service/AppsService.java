package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.Apps;

/**
 * dal Interface:Apps
 * @author gencode
 * @date 2018-3-22
 */
public interface AppsService {

    public List<Apps> findAll();

    public List<Apps> findAppss(Apps record);

    public Apps getAppsByPrimaryKey(Long appId);

    public Integer createApps(Apps record);

    public Integer removeApps(Apps record);

    public Integer removeByPrimaryKey(Long appId);

    public Integer modifyAppsByPrimaryKey(Apps record);



}