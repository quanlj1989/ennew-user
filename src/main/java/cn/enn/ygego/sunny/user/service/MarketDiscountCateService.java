package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.MarketDiscountCate;
import org.springframework.stereotype.Repository;

/**
 * ClassName: MarketDiscountCate
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public interface MarketDiscountCateService {

    public List<MarketDiscountCate> findAll();

    public List<MarketDiscountCate> findMarketDiscountCates(MarketDiscountCate record);

    public MarketDiscountCate getMarketDiscountCateByPrimaryKey(Long discountId);

    public Integer deleteByPrimaryKey(Long discountId);

    public Integer createMarketDiscountCate(MarketDiscountCate record);

    public Integer deleteMarketDiscountCate(MarketDiscountCate record);

    public Integer removeMarketDiscountCate(MarketDiscountCate record);

    public Integer updateMarketDiscountCateByPrimaryKeySelective(MarketDiscountCate record);









}