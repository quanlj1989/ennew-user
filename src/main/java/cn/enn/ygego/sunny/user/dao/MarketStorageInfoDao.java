package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import cn.enn.ygego.sunny.user.model.MarketStorageInfo;
import org.springframework.stereotype.Repository;


/**
 * ClassName: MarketStorageInfo
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public interface MarketStorageInfoDao {

    List<MarketStorageInfo> selectAll();

    List<MarketStorageInfo> select(MarketStorageInfo record);

    Integer selectCount(MarketStorageInfo record);

    MarketStorageInfo selectByPrimaryKey(Long storageId);

    Integer deleteByPrimaryKey(Long storageId);

    Integer delete(MarketStorageInfo record);

    Integer insertSelective(MarketStorageInfo record);

    Integer updateByPrimaryKeySelective(MarketStorageInfo record);







}