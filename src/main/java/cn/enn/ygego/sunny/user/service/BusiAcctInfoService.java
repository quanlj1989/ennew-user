package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.BusiAcctInfo;

/**
 * dal Interface:BusiAcctInfo
 * @author gencode
 * @date 2018-3-22
 */
public interface BusiAcctInfoService {

    public List<BusiAcctInfo> findAll();

    public List<BusiAcctInfo> findBusiAcctInfos(BusiAcctInfo record);

    public BusiAcctInfo getBusiAcctInfoByPrimaryKey(Long acctId);

    public Integer createBusiAcctInfo(BusiAcctInfo record);

    public Integer removeBusiAcctInfo(BusiAcctInfo record);

    public Integer removeByPrimaryKey(Long acctId);

    public Integer modifyBusiAcctInfoByPrimaryKey(BusiAcctInfo record);



}