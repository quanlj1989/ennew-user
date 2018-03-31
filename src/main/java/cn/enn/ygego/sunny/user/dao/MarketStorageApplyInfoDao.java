package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import cn.enn.ygego.sunny.user.model.MarketStorageApplyInfo;
import org.springframework.stereotype.Repository;


/**
 * ClassName: MarketStorageApplyInfo
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public interface MarketStorageApplyInfoDao {

    List<MarketStorageApplyInfo> selectAll();

    List<MarketStorageApplyInfo> select(MarketStorageApplyInfo record);

    Integer selectCount(MarketStorageApplyInfo record);

    MarketStorageApplyInfo selectByPrimaryKey(Long storageApplyId);

    Integer deleteByPrimaryKey(Long storageApplyId);

    Integer delete(MarketStorageApplyInfo record);

    Integer insertSelective(MarketStorageApplyInfo record);

    Integer updateByPrimaryKeySelective(MarketStorageApplyInfo record);







}