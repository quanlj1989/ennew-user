package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import cn.enn.ygego.sunny.user.model.MarketCateCertApply;
import org.springframework.stereotype.Repository;


/**
 * ClassName: MarketCateCertApply
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public interface MarketCateCertApplyDao {

    List<MarketCateCertApply> selectAll();

    List<MarketCateCertApply> select(MarketCateCertApply record);

    Integer selectCount(MarketCateCertApply record);

    MarketCateCertApply selectByPrimaryKey(Long certApplyDetailId);

    Integer deleteByPrimaryKey(Long certApplyDetailId);

    Integer delete(MarketCateCertApply record);

    Integer insertSelective(MarketCateCertApply record);

    Integer updateByPrimaryKeySelective(MarketCateCertApply record);







}