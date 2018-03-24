package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.RelaChannelToRole;

/**
 * dal Interface:RelaChannelToRole
 * @author gencode
 * @date 2018-3-22
 */
public interface RelaChannelToRoleService {

    public List<RelaChannelToRole> findAll();

    public List<RelaChannelToRole> findRelaChannelToRoles(RelaChannelToRole record);

    public RelaChannelToRole getRelaChannelToRoleByPrimaryKey(Long relaId);

    public Integer createRelaChannelToRole(RelaChannelToRole record);

    public Integer removeRelaChannelToRole(RelaChannelToRole record);

    public Integer removeByPrimaryKey(Long relaId);

    public Integer modifyRelaChannelToRoleByPrimaryKey(RelaChannelToRole record);



}