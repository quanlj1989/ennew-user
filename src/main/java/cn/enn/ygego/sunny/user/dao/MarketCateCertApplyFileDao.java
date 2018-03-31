package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import cn.enn.ygego.sunny.user.model.MarketCateCertApplyFile;
import org.springframework.stereotype.Repository;


/**
 * ClassName: MarketCateCertApplyFile
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public interface MarketCateCertApplyFileDao {

    List<MarketCateCertApplyFile> selectAll();

    List<MarketCateCertApplyFile> select(MarketCateCertApplyFile record);

    Integer selectCount(MarketCateCertApplyFile record);

    MarketCateCertApplyFile selectByPrimaryKey(Long certApplyFileId);

    Integer deleteByPrimaryKey(Long certApplyFileId);

    Integer delete(MarketCateCertApplyFile record);

    Integer insertSelective(MarketCateCertApplyFile record);

    Integer updateByPrimaryKeySelective(MarketCateCertApplyFile record);







}