package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import cn.enn.ygego.sunny.user.model.MarketAuthApplyInfo;
import org.springframework.stereotype.Repository;


/**
 * ClassName: MarketAuthApplyInfo
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public interface MarketAuthApplyInfoDao {

    List<MarketAuthApplyInfo> selectAll();

    List<MarketAuthApplyInfo> select(MarketAuthApplyInfo record);

    Integer selectCount(MarketAuthApplyInfo record);

    MarketAuthApplyInfo selectByPrimaryKey(Long authApplyId);

    Integer deleteByPrimaryKey(Long authApplyId);

    Integer delete(MarketAuthApplyInfo record);

    Integer insertSelective(MarketAuthApplyInfo record);

    Integer updateByPrimaryKeySelective(MarketAuthApplyInfo record);







}