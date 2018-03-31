package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import cn.enn.ygego.sunny.user.model.MarketAuthInfo;
import org.springframework.stereotype.Repository;


/**
 * ClassName: MarketAuthInfo
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public interface MarketAuthInfoDao {

    List<MarketAuthInfo> selectAll();

    List<MarketAuthInfo> select(MarketAuthInfo record);

    Integer selectCount(MarketAuthInfo record);

    MarketAuthInfo selectByPrimaryKey(Long authId);

    Integer deleteByPrimaryKey(Long authId);

    Integer delete(MarketAuthInfo record);

    Integer insertSelective(MarketAuthInfo record);

    Integer updateByPrimaryKeySelective(MarketAuthInfo record);







}