package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.EntSetService;
import cn.enn.ygego.sunny.user.constant.JoinEntConstant;
import cn.enn.ygego.sunny.user.dao.EntCustInfoDao;
import cn.enn.ygego.sunny.user.dao.EntSetDao;
import cn.enn.ygego.sunny.user.dto.vo.JoinCompanyQueryVO;
import cn.enn.ygego.sunny.user.dto.vo.JoinCompanyVO;
import cn.enn.ygego.sunny.user.model.EntCustInfo;
import cn.enn.ygego.sunny.user.model.EntSet;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:EntSet
 * @author gencode
 * @date 2018-3-28
 */
@Service
public class EntSetServiceImpl implements EntSetService{

    @Autowired
    private EntSetDao entSetDao;
    
    @Autowired
    private EntCustInfoDao entCustInfoDao;

    public List<EntSet> findAll(){
       return  entSetDao.findAll();
    }

    public List<EntSet> findEntSets(EntSet record){
       return  entSetDao.find(record);
    }

    public EntSet getEntSetByPrimaryKey(Long setId){
        return entSetDao.getByPrimaryKey(setId);
    }

    public Integer createEntSet(EntSet record){
        return entSetDao.insert(record);
    }

    @Override
    public Integer createEntSetList(List<EntSet> records) {
        return entSetDao.insertList(records);
    }
    
    public Integer removeEntSet(EntSet record){
        return entSetDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long setId){
    	return entSetDao.deleteByPrimaryKey(setId);
    }

    public Integer modifyEntSetByPrimaryKey(EntSet record){
        return entSetDao.updateByPrimaryKey(record);
    }

    @Override
    public Integer getFerrSunCompanyCount(JoinCompanyQueryVO query) {
        query.setFreeCompany(true);
        return entSetDao.getCompanyListCount(query);
    }

    @Override
    public List<JoinCompanyVO> getFerrSunCompanyList(JoinCompanyQueryVO query) {
        query.setFreeCompany(true);
        return entSetDao.getCompanyList(query);
    }
    
    @Override
    public Integer getJoinCompanyCount(JoinCompanyQueryVO query) {
        return entSetDao.getJoinCompanyListCount(query);
    }

    @Override
    public List<JoinCompanyVO> getJoinCompanyList(JoinCompanyQueryVO query) {
        return entSetDao.getJoinCompanyList(query);
    }
    
    @Override
    public JoinCompanyVO getSunCompanyDetail(JoinCompanyQueryVO query){
        return entSetDao.getSunCompanyBySetId(query);
    }

    @Override
    public Integer agreeJoinCompanyAndSet(EntSet entSet) {
        // 查询所有申请加入企业
        EntSet setQuery = new EntSet();
        setQuery.setMemberId(entSet.getMemberId());
        List<EntSet> entSetList = entSetDao.find(setQuery);
        // 修改企业授权设置状态
        for(EntSet set : entSetList ){
            if(set.getSetId() == entSet.getSetId()){
                set.setApplyType(JoinEntConstant.SET_APPLYTYPE_AGREE);
                set.setStatus(JoinEntConstant.SET_STATUS_AGREE);
            }else{
                set.setApplyType(JoinEntConstant.SET_APPLYTYPE_REFUSE);
                set.setStatus(JoinEntConstant.SET_STATUS_REFUSE);
            }
        }
        // 批量修改ENT_SET表状态
        Integer operation = entSetDao.updateEntSetByList(entSetList);
        
        // 修改ENT_CUST_INFO 表 子公司配置 状态
        EntCustInfo entCust = new EntCustInfo();
        entCust.setMemberId(entSet.getMemberId()); // 子公司ID
        entCust.setPareMemberId(entSet.getPareMemberId());           // 父级会员ID设置
        entCust.setBlackWhiteListSet(entSet.getBlackWhiteListSet()); // 黑白名单设置 
        entCust.setAgreementPriceId(entSet.getAgreementPriceId());   // 协议价设置
        entCust.setCateMateId(entSet.getCateMateId());               // 类目物料设置 
        operation += entCustInfoDao.updateByPrimaryKey(entCust);
        return operation;
    }

    @Override
    public Integer agreeSetAccredit(EntSet entSet) {
        // 修改ENT_SET表状态
        entSet.setApplyType(JoinEntConstant.SET_APPLYTYPE_AGREE);
        entSet.setStatus(JoinEntConstant.SET_STATUS_AGREE);
        Integer operation = entSetDao.updateByPrimaryKey(entSet);
        
        // 修改ENT_CUST_INFO 表状态
        EntCustInfo entCust = new EntCustInfo();
        entCust.setMemberId(entSet.getMemberId());
        entCust.setBlackWhiteListSet(entSet.getBlackWhiteListSet()); // 黑白名单设置 
        entCust.setAgreementPriceId(entSet.getAgreementPriceId());   // 协议价设置
        entCust.setCateMateId(entSet.getCateMateId());               // 类目物料设置 
        operation += entCustInfoDao.updateByPrimaryKey(entCust);
        
        return operation;
    }

}