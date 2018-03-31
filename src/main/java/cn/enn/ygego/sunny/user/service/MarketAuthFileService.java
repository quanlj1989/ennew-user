package cn.enn.ygego.sunny.user.service;

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
public interface MarketAuthFileService {

    public List<MarketAuthFile> findAll();

    public List<MarketAuthFile> findMarketAuthFiles(MarketAuthFile record);

    public MarketAuthFile getMarketAuthFileByPrimaryKey(Long authFileId);

    public Integer deleteByPrimaryKey(Long authFileId);

    public Integer createMarketAuthFile(MarketAuthFile record);

    public Integer deleteMarketAuthFile(MarketAuthFile record);

    public Integer removeMarketAuthFile(MarketAuthFile record);

    public Integer updateMarketAuthFileByPrimaryKeySelective(MarketAuthFile record);









}