package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.MarketAuthFileService;
import cn.enn.ygego.sunny.user.dao.MarketAuthFileDao;
import cn.enn.ygego.sunny.user.model.MarketAuthFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: MarketAuthFile
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@Service("marketAuthFileService")
public class MarketAuthFileServiceImpl implements MarketAuthFileService{

    @Autowired
    private MarketAuthFileDao marketAuthFileDao;

    public List<MarketAuthFile> findAll(){
       return  marketAuthFileDao.selectAll();
    }

    public List<MarketAuthFile> findMarketAuthFiles(MarketAuthFile record){
       return  marketAuthFileDao.select(record);
    }

    public MarketAuthFile getMarketAuthFileByPrimaryKey(Long authFileId){
        return marketAuthFileDao.selectByPrimaryKey(authFileId);
    }

    public Integer deleteByPrimaryKey(Long authFileId){
        return marketAuthFileDao.deleteByPrimaryKey(authFileId);
    }

    public Integer createMarketAuthFile(MarketAuthFile record){
        return marketAuthFileDao.insertSelective(record);

    }

    public Integer deleteMarketAuthFile(MarketAuthFile record){
        return marketAuthFileDao.delete(record);
    }

    public Integer removeMarketAuthFile(MarketAuthFile record){
        return marketAuthFileDao.updateByPrimaryKeySelective(record);
    }

    public Integer updateMarketAuthFileByPrimaryKeySelective(MarketAuthFile record){
        return marketAuthFileDao.updateByPrimaryKeySelective(record);
    }









}