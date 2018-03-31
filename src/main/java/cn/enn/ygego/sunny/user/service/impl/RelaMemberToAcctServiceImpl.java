package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.RelaMemberToAcctService;
import cn.enn.ygego.sunny.user.dao.RelaMemberToAcctDao;
import cn.enn.ygego.sunny.user.model.MemberInfo;
import cn.enn.ygego.sunny.user.model.RelaMemberToAcct;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:RelaMemberToAcct
 * @author gencode
 * @date 2018-3-24
 */
@Service
public class RelaMemberToAcctServiceImpl implements RelaMemberToAcctService{

    @Autowired
    private RelaMemberToAcctDao relaMemberToAcctDao;

    public List<RelaMemberToAcct> findAll(){
       return  relaMemberToAcctDao.findAll();
    }

    public List<RelaMemberToAcct> findRelaMemberToAccts(RelaMemberToAcct record){
       return  relaMemberToAcctDao.find(record);
    }

    public RelaMemberToAcct getRelaMemberToAcctByPrimaryKey(Long relaId){
        return relaMemberToAcctDao.getByPrimaryKey(relaId);
    }

    public Integer createRelaMemberToAcct(RelaMemberToAcct record){
        return relaMemberToAcctDao.insert(record);
    }

    public Integer removeRelaMemberToAcct(RelaMemberToAcct record){
        return relaMemberToAcctDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long relaId){
    	return relaMemberToAcctDao.deleteByPrimaryKey(relaId);
    }

    public Integer modifyRelaMemberToAcctByPrimaryKey(RelaMemberToAcct record){
        return relaMemberToAcctDao.updateByPrimaryKey(record);
    }

    @Override
    public boolean modifyEntAdminRela(MemberInfo newAdminMember, RelaMemberToAcct oldRela) {
        
        boolean result = false;
        
        // TODO 删除原有关联
            //1. 调用权限配置
            //2. 删除关系数据
        
        // TODO 建立新的关联
            //1. 调用权限配置
        
        return result;
    }



}