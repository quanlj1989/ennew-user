package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.AcctRoleRela;

/**
 * dal Interface:AcctRoleRela
 * @author gencode
 * @date 2018-3-22
 */
public interface AcctRoleRelaService {

    public List<AcctRoleRela> findAll();

    public List<AcctRoleRela> findAcctRoleRelas(AcctRoleRela record);

    public AcctRoleRela getAcctRoleRelaByPrimaryKey(Long relaId);

    public Integer createAcctRoleRela(AcctRoleRela record);

    public Integer removeAcctRoleRela(AcctRoleRela record);

    public Integer removeByPrimaryKey(Long relaId);

    public Integer modifyAcctRoleRelaByPrimaryKey(AcctRoleRela record);



}