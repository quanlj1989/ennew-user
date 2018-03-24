package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.RoleInfo;

/**
 * dal Interface:RoleInfo
 * @author gencode
 * @date 2018-3-22
 */
public interface RoleInfoService {

    public List<RoleInfo> findAll();

    public List<RoleInfo> findRoleInfos(RoleInfo record);

    public RoleInfo getRoleInfoByPrimaryKey(Long roleId);

    public Integer createRoleInfo(RoleInfo record);

    public Integer removeRoleInfo(RoleInfo record);

    public Integer removeByPrimaryKey(Long roleId);

    public Integer modifyRoleInfoByPrimaryKey(RoleInfo record);



}