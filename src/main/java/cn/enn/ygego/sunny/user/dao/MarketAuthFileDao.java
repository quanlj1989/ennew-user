package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import cn.enn.ygego.sunny.user.model.MarketAuthFile;
import org.springframework.stereotype.Repository;


/**
 * ClassName: MarketAuthFile
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public interface MarketAuthFileDao {

    List<MarketAuthFile> selectAll();

    List<MarketAuthFile> select(MarketAuthFile record);

    Integer selectCount(MarketAuthFile record);

    MarketAuthFile selectByPrimaryKey(Long authFileId);

    Integer deleteByPrimaryKey(Long authFileId);

    Integer delete(MarketAuthFile record);

    Integer insertSelective(MarketAuthFile record);

    Integer updateByPrimaryKeySelective(MarketAuthFile record);







}