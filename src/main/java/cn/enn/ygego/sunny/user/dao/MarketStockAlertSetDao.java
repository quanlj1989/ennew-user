package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import cn.enn.ygego.sunny.user.model.MarketStockAlertSet;
import org.springframework.stereotype.Repository;


/**
 * ClassName: MarketStockAlertSet
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public interface MarketStockAlertSetDao {

    List<MarketStockAlertSet> selectAll();

    List<MarketStockAlertSet> select(MarketStockAlertSet record);

    Integer selectCount(MarketStockAlertSet record);

    MarketStockAlertSet selectByPrimaryKey(Long alertSetId);

    Integer deleteByPrimaryKey(Long alertSetId);

    Integer delete(MarketStockAlertSet record);

    Integer insertSelective(MarketStockAlertSet record);

    Integer updateByPrimaryKeySelective(MarketStockAlertSet record);







}