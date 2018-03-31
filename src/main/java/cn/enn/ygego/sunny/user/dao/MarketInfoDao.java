package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import cn.enn.ygego.sunny.user.model.MarketInfo;
import org.springframework.stereotype.Repository;


/**
 * ClassName: MarketInfo
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public interface MarketInfoDao {

    List<MarketInfo> selectAll();

    List<MarketInfo> select(MarketInfo record);

    Integer selectCount(MarketInfo record);

    MarketInfo selectByPrimaryKey(Long marketId);

    Integer deleteByPrimaryKey(Long marketId);

    Integer delete(MarketInfo record);

    Integer insertSelective(MarketInfo record);

    Integer updateByPrimaryKeySelective(MarketInfo record);







}