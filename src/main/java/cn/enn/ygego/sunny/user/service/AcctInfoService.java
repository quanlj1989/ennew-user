package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.AcctInfo;

/**
 * dal Interface:AcctInfo
 * @author gencode
 * @date 2018-3-22
 */
public interface AcctInfoService {

    public List<AcctInfo> findAll();

    public List<AcctInfo> findAcctInfos(AcctInfo record);

    public AcctInfo getAcctInfoByPrimaryKey(Long acctId);

    public Integer createAcctInfo(AcctInfo record);

    public Integer removeAcctInfo(AcctInfo record);

    public Integer removeByPrimaryKey(Long acctId);

    public Integer modifyAcctInfoByPrimaryKey(AcctInfo record);



}