package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.EntDept;

/**
 * dal Interface:EntDept
 * @author gencode
 * @date 2018-3-28
 */
public interface EntDeptService {

    public List<EntDept> findAll();

    public List<EntDept> findEntDepts(EntDept record);

    public EntDept getEntDeptByPrimaryKey(Long deptId);

    public Integer createEntDept(EntDept record);

    public Integer removeEntDept(EntDept record);

    public Integer removeByPrimaryKey(Long deptId);

    public Integer modifyEntDeptByPrimaryKey(EntDept record);



}