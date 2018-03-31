package cn.enn.ygego.sunny.user.dao;

import cn.enn.ygego.sunny.user.model.MarketApplyInfo;

import java.util.List;


/**
 * ClassName: MarketApplyInfo
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public interface MarketApplyInfoDao {

    List<MarketApplyInfo> selectAll();

    List<MarketApplyInfo> select(MarketApplyInfo record);

    Integer selectCount(MarketApplyInfo record);

    MarketApplyInfo selectByPrimaryKey(Long marketApplyId);

    Integer deleteByPrimaryKey(Long marketApplyId);

    Integer delete(MarketApplyInfo record);

    Integer insertSelective(MarketApplyInfo record);

    Integer updateByPrimaryKeySelective(MarketApplyInfo record);







}