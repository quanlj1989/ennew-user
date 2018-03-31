package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import cn.enn.ygego.sunny.user.model.MarketDiscountMaterial;
import org.springframework.stereotype.Repository;


/**
 * ClassName: MarketDiscountMaterial
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public interface MarketDiscountMaterialDao {

    List<MarketDiscountMaterial> selectAll();

    List<MarketDiscountMaterial> select(MarketDiscountMaterial record);

    Integer selectCount(MarketDiscountMaterial record);

    MarketDiscountMaterial selectByPrimaryKey(Long chargeId);

    Integer deleteByPrimaryKey(Long chargeId);

    Integer delete(MarketDiscountMaterial record);

    Integer insertSelective(MarketDiscountMaterial record);

    Integer updateByPrimaryKeySelective(MarketDiscountMaterial record);







}