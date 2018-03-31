package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import cn.enn.ygego.sunny.user.model.MarketCateMaterialApply;
import org.springframework.stereotype.Repository;


/**
 * ClassName: MarketCateMaterialApply
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public interface MarketCateMaterialApplyDao {

    List<MarketCateMaterialApply> selectAll();

    List<MarketCateMaterialApply> select(MarketCateMaterialApply record);

    Integer selectCount(MarketCateMaterialApply record);

    MarketCateMaterialApply selectByPrimaryKey(Long applyId);

    Integer deleteByPrimaryKey(Long applyId);

    Integer delete(MarketCateMaterialApply record);

    Integer insertSelective(MarketCateMaterialApply record);

    Integer updateByPrimaryKeySelective(MarketCateMaterialApply record);







}