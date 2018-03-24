package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.UserInfo;

/**
 * dal Interface:UserInfo
 * @author gencode
 * @date 2018-3-22
 */
public interface UserInfoService {

    public List<UserInfo> findAll();

    public List<UserInfo> findUserInfos(UserInfo record);

    public UserInfo getUserInfoByPrimaryKey(Long userId);

    public Integer createUserInfo(UserInfo record);

    public Integer removeUserInfo(UserInfo record);

    public Integer removeByPrimaryKey(Long userId);

    public Integer modifyUserInfoByPrimaryKey(UserInfo record);



}