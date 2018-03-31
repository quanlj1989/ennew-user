package cn.enn.ygego.sunny.user.service;

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
public interface MarketCateCertApplyFileService {

    public List<MarketCateCertApplyFile> findAll();

    public List<MarketCateCertApplyFile> findMarketCateCertApplyFiles(MarketCateCertApplyFile record);

    public MarketCateCertApplyFile getMarketCateCertApplyFileByPrimaryKey(Long certApplyFileId);

    public Integer deleteByPrimaryKey(Long certApplyFileId);

    public Integer createMarketCateCertApplyFile(MarketCateCertApplyFile record);

    public Integer deleteMarketCateCertApplyFile(MarketCateCertApplyFile record);

    public Integer removeMarketCateCertApplyFile(MarketCateCertApplyFile record);

    public Integer updateMarketCateCertApplyFileByPrimaryKeySelective(MarketCateCertApplyFile record);









}