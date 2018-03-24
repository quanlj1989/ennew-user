package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.RoleOperPrivRela;

/**
 * dal Interface:RoleOperPrivRela
 * @author gencode
 * @date 2018-3-22
 */
public interface RoleOperPrivRelaService {

    public List<RoleOperPrivRela> findAll();

    public List<RoleOperPrivRela> findRoleOperPrivRelas(RoleOperPrivRela record);

    public RoleOperPrivRela getRoleOperPrivRelaByPrimaryKey(Long relaId);

    public Integer createRoleOperPrivRela(RoleOperPrivRela record);

    public Integer removeRoleOperPrivRela(RoleOperPrivRela record);

    public Integer removeByPrimaryKey(Long relaId);

    public Integer modifyRoleOperPrivRelaByPrimaryKey(RoleOperPrivRela record);



}