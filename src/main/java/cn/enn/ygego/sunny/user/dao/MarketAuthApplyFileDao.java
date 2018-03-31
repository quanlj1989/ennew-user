package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import cn.enn.ygego.sunny.user.model.MarketAuthApplyFile;
import org.springframework.stereotype.Repository;


/**
 * ClassName: MarketAuthApplyFile
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public interface MarketAuthApplyFileDao {

    List<MarketAuthApplyFile> selectAll();

    List<MarketAuthApplyFile> select(MarketAuthApplyFile record);

    Integer selectCount(MarketAuthApplyFile record);

    MarketAuthApplyFile selectByPrimaryKey(Long applyFileId);

    Integer deleteByPrimaryKey(Long applyFileId);

    Integer delete(MarketAuthApplyFile record);

    Integer insertSelective(MarketAuthApplyFile record);

    Integer updateByPrimaryKeySelective(MarketAuthApplyFile record);







}