package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.MarketAuthApplyFileService;
import cn.enn.ygego.sunny.user.dao.MarketAuthApplyFileDao;
import cn.enn.ygego.sunny.user.model.MarketAuthApplyFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: MarketAuthApplyFile
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@Service("marketAuthApplyFileService")
public class MarketAuthApplyFileServiceImpl implements MarketAuthApplyFileService{

    @Autowired
    private MarketAuthApplyFileDao marketAuthApplyFileDao;

    public List<MarketAuthApplyFile> findAll(){
       return  marketAuthApplyFileDao.selectAll();
    }

    public List<MarketAuthApplyFile> findMarketAuthApplyFiles(MarketAuthApplyFile record){
       return  marketAuthApplyFileDao.select(record);
    }

    public MarketAuthApplyFile getMarketAuthApplyFileByPrimaryKey(Long applyFileId){
        return marketAuthApplyFileDao.selectByPrimaryKey(applyFileId);
    }

    public Integer deleteByPrimaryKey(Long applyFileId){
        return marketAuthApplyFileDao.deleteByPrimaryKey(applyFileId);
    }

    public Integer createMarketAuthApplyFile(MarketAuthApplyFile record){
        return marketAuthApplyFileDao.insertSelective(record);

    }

    public Integer deleteMarketAuthApplyFile(MarketAuthApplyFile record){
        return marketAuthApplyFileDao.delete(record);
    }

    public Integer removeMarketAuthApplyFile(MarketAuthApplyFile record){
        return marketAuthApplyFileDao.updateByPrimaryKeySelective(record);
    }

    public Integer updateMarketAuthApplyFileByPrimaryKeySelective(MarketAuthApplyFile record){
        return marketAuthApplyFileDao.updateByPrimaryKeySelective(record);
    }









}