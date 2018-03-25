package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.RelaMemberToAcctApplyService;
import cn.enn.ygego.sunny.user.dao.RelaMemberToAcctApplyDao;
import cn.enn.ygego.sunny.user.dto.vo.EmployeeQueryVO;
import cn.enn.ygego.sunny.user.dto.vo.EmployeeVO;
import cn.enn.ygego.sunny.user.model.RelaMemberToAcctApply;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:RelaMemberToAcctApply
 * @author gencode
 * @date 2018-3-24
 */
@Service
public class RelaMemberToAcctApplyServiceImpl implements RelaMemberToAcctApplyService{

    @Autowired
    private RelaMemberToAcctApplyDao relaMemberToAcctApplyDao;

    public List<RelaMemberToAcctApply> findAll(){
       return  relaMemberToAcctApplyDao.findAll();
    }

    public List<RelaMemberToAcctApply> findRelaMemberToAcctApplys(RelaMemberToAcctApply record){
       return  relaMemberToAcctApplyDao.find(record);
    }

    public RelaMemberToAcctApply getRelaMemberToAcctApplyByPrimaryKey(Long relaId){
        return relaMemberToAcctApplyDao.getByPrimaryKey(relaId);
    }

    public Integer createRelaMemberToAcctApply(RelaMemberToAcctApply record){
        return relaMemberToAcctApplyDao.insert(record);
    }

    public Integer removeRelaMemberToAcctApply(RelaMemberToAcctApply record){
        return relaMemberToAcctApplyDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long relaId){
    	return relaMemberToAcctApplyDao.deleteByPrimaryKey(relaId);
    }

    public Integer modifyRelaMemberToAcctApplyByPrimaryKey(RelaMemberToAcctApply record){
        return relaMemberToAcctApplyDao.updateByPrimaryKey(record);
    }

    @Override
    public Integer getEmployeeApplyCount(EmployeeQueryVO query){
    	return relaMemberToAcctApplyDao.getEmployeeApplyCount(query);
    }
    
	@Override
	public List<EmployeeVO> getEmployeeApplyList(EmployeeQueryVO query) {
		return relaMemberToAcctApplyDao.getEmployeeApplyList(query);
	}

	@Override
	public EmployeeVO getEmployeeApplyDetail(Long relaId) {
		return relaMemberToAcctApplyDao.getEmployeeApplyDetail(relaId);
	}



}