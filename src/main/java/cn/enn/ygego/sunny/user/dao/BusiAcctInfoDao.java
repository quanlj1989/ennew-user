package cn.enn.ygego.sunny.user.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.BusiAcctInfo;

/**
 * dal Interface:BusiAcctInfo
 *
 * @author gencode
 */
public interface BusiAcctInfoDao {

    Integer insert(BusiAcctInfo record);

    Integer insertSelective(BusiAcctInfo record);

    Integer delete(BusiAcctInfo record);

    Integer deleteByPrimaryKey(@Param("acctId") Long acctId);

    Integer updateByPrimaryKey(BusiAcctInfo record);

    List<BusiAcctInfo> findAll();

    List<BusiAcctInfo> find(BusiAcctInfo record);

    Integer getCount(BusiAcctInfo record);

    BusiAcctInfo getByPrimaryKey(@Param("acctId") Long acctId);

    /**
     * 查询用户登录信息
     *
     * @param username 用户名（账号，手机号，邮箱）
     * @param password 密码
     * @return
     */
    BusiAcctInfo loginAcctInfo(@Param("username") String username, @Param("password") String password);

    /**
     * 更新密码
     *
     * @param acctId      账号id
     * @param newPassword 新密码
     * @return
     */
    int updatePassword(@Param("acctId") Long acctId, @Param("newPassword") String newPassword);

    /**
     * 更新邮箱
     *
     * @param acctId 账号id
     * @param email  邮箱
     * @return
     */
    int updateEmail(@Param("acctId") Long acctId, @Param("email") String email);


    /**
     * 绑定新手机号
     *
     * @param acctId   账号id
     * @param newPhone 新手机号
     * @return
     */
    int updatePhone(@Param("acctId") Long acctId, @Param("newPhone") String newPhone);

    /**
     * 查询账号是否存在 0 不存在
     *
     * @param acctName 账号
     * @return
     */
    int findByAcctName(@Param("acctName") String acctName);

    /**
     * 查询手机号是否存在 0 不存在
     *
     * @param mobilePhone 手机号
     * @return
     */
    int findByPhone(@Param("mobilePhone") String mobilePhone);


    /**
     * 查询邮箱是否存在 0 不存在
     *
     * @param email 邮箱
     * @return
     */
    int findByEmail(@Param("email") String email);

}