package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.BusiUserInfo;

/**
 * dal Interface:BusiUserInfo
 * @author gencode
 * @date 2018-3-22
 */
public interface BusiUserInfoService {

    public List<BusiUserInfo> findAll();

    public List<BusiUserInfo> findBusiUserInfos(BusiUserInfo record);

    public BusiUserInfo getBusiUserInfoByPrimaryKey(Long userId);

    public Integer createBusiUserInfo(BusiUserInfo record);

    public Integer removeBusiUserInfo(BusiUserInfo record);

    public Integer removeByPrimaryKey(Long userId);

    public Integer modifyBusiUserInfoByPrimaryKey(BusiUserInfo record);



}