package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import cn.enn.ygego.sunny.user.model.MarketCateMaterial;
import org.springframework.stereotype.Repository;


/**
 * ClassName: MarketCateMaterial
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public interface MarketCateMaterialDao {

    List<MarketCateMaterial> selectAll();

    List<MarketCateMaterial> select(MarketCateMaterial record);

    Integer selectCount(MarketCateMaterial record);

    MarketCateMaterial selectByPrimaryKey(Long cateMaterialId);

    Integer deleteByPrimaryKey(Long cateMaterialId);

    Integer delete(MarketCateMaterial record);

    Integer insertSelective(MarketCateMaterial record);

    Integer updateByPrimaryKeySelective(MarketCateMaterial record);







}