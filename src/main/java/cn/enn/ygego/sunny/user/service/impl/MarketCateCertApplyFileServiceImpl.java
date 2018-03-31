package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.MarketCateCertApplyFileService;
import cn.enn.ygego.sunny.user.dao.MarketCateCertApplyFileDao;
import cn.enn.ygego.sunny.user.model.MarketCateCertApplyFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: MarketCateCertApplyFile
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@Service("marketCateCertApplyFileService")
public class MarketCateCertApplyFileServiceImpl implements MarketCateCertApplyFileService{

    @Autowired
    private MarketCateCertApplyFileDao marketCateCertApplyFileDao;

    public List<MarketCateCertApplyFile> findAll(){
       return  marketCateCertApplyFileDao.selectAll();
    }

    public List<MarketCateCertApplyFile> findMarketCateCertApplyFiles(MarketCateCertApplyFile record){
       return  marketCateCertApplyFileDao.select(record);
    }

    public MarketCateCertApplyFile getMarketCateCertApplyFileByPrimaryKey(Long certApplyFileId){
        return marketCateCertApplyFileDao.selectByPrimaryKey(certApplyFileId);
    }

    public Integer deleteByPrimaryKey(Long certApplyFileId){
        return marketCateCertApplyFileDao.deleteByPrimaryKey(certApplyFileId);
    }

    public Integer createMarketCateCertApplyFile(MarketCateCertApplyFile record){
        return marketCateCertApplyFileDao.insertSelective(record);

    }

    public Integer deleteMarketCateCertApplyFile(MarketCateCertApplyFile record){
        return marketCateCertApplyFileDao.delete(record);
    }

    public Integer removeMarketCateCertApplyFile(MarketCateCertApplyFile record){
        return marketCateCertApplyFileDao.updateByPrimaryKeySelective(record);
    }

    public Integer updateMarketCateCertApplyFileByPrimaryKeySelective(MarketCateCertApplyFile record){
        return marketCateCertApplyFileDao.updateByPrimaryKeySelective(record);
    }









}