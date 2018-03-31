package cn.enn.ygego.sunny.user.service;

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
public interface MarketAuthApplyFileService {

    public List<MarketAuthApplyFile> findAll();

    public List<MarketAuthApplyFile> findMarketAuthApplyFiles(MarketAuthApplyFile record);

    public MarketAuthApplyFile getMarketAuthApplyFileByPrimaryKey(Long applyFileId);

    public Integer deleteByPrimaryKey(Long applyFileId);

    public Integer createMarketAuthApplyFile(MarketAuthApplyFile record);

    public Integer deleteMarketAuthApplyFile(MarketAuthApplyFile record);

    public Integer removeMarketAuthApplyFile(MarketAuthApplyFile record);

    public Integer updateMarketAuthApplyFileByPrimaryKeySelective(MarketAuthApplyFile record);









}