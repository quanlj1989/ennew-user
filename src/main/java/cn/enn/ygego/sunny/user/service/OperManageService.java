package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.OperManage;

/**
 * dal Interface:OperManage
 * @author gencode
 * @date 2018-3-22
 */
public interface OperManageService {

    public List<OperManage> findAll();

    public List<OperManage> findOperManages(OperManage record);

    public OperManage getOperManageByPrimaryKey(Long operId);

    public Integer createOperManage(OperManage record);

    public Integer removeOperManage(OperManage record);

    public Integer removeByPrimaryKey(Long operId);

    public Integer modifyOperManageByPrimaryKey(OperManage record);



}