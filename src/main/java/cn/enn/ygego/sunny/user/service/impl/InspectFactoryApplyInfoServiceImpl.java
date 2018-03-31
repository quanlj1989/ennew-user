package cn.enn.ygego.sunny.user.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.client.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.enn.ygego.sunny.core.page.PageDTO;
import cn.enn.ygego.sunny.user.constant.FactoryApplyStatusEnum;
import cn.enn.ygego.sunny.user.dao.InspectFactoryApplyInfoDao;
import cn.enn.ygego.sunny.user.dto.factory.CategoryQueryVO;
import cn.enn.ygego.sunny.user.dto.factory.InspectFactoryApplyInfoVO;
import cn.enn.ygego.sunny.user.model.InspectFactoryApplyInfo;
import cn.enn.ygego.sunny.user.service.InspectFactoryApplyInfoService;



/**
 * dal Interface:InspectFactoryApplyInfo
 * @author gencode
 * @date 2018-3-30
 */
@Service
public class InspectFactoryApplyInfoServiceImpl implements InspectFactoryApplyInfoService{

    @Autowired
    private InspectFactoryApplyInfoDao inspectFactoryApplyInfoDao;

    public List<InspectFactoryApplyInfo> findAll(){
       return  inspectFactoryApplyInfoDao.findAll();
    }

    public List<InspectFactoryApplyInfo> findInspectFactoryApplyInfos(InspectFactoryApplyInfo record){
       return  inspectFactoryApplyInfoDao.find(record);
    }

    public InspectFactoryApplyInfo getInspectFactoryApplyInfoByPrimaryKey(Long applyId){
        return inspectFactoryApplyInfoDao.getByPrimaryKey(applyId);
    }

    public Integer createInspectFactoryApplyInfo(InspectFactoryApplyInfo record){
        return inspectFactoryApplyInfoDao.insert(record);
    }

    public Integer removeInspectFactoryApplyInfo(InspectFactoryApplyInfo record){
        return inspectFactoryApplyInfoDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long applyId){
    	return inspectFactoryApplyInfoDao.deleteByPrimaryKey(applyId);
    }

    public Integer modifyInspectFactoryApplyInfoByPrimaryKey(InspectFactoryApplyInfo record){
        return inspectFactoryApplyInfoDao.updateByPrimaryKey(record);
    }

	@Override
	public PageDTO<InspectFactoryApplyInfoVO> getAuditCategoryList(CategoryQueryVO query) {
		PageDTO<InspectFactoryApplyInfoVO> page = new PageDTO<InspectFactoryApplyInfoVO>(
				query.getPageNum(), query.getPageSize());
		query.setStartRow(page.getStartRow());
		InspectFactoryApplyInfo record = new InspectFactoryApplyInfo();
		if (StringUtils.isNotBlank(query.getCategoryId())) {
			record.setCategoryId(Integer.valueOf(query.getCategoryId()));
		}
		if (StringUtils.isNotBlank(query.getApplystatus())) {
			record.setApplyStatus(Integer.valueOf(query.getApplystatus()));
		}
		if (StringUtils.isNotBlank(query.getCreateMemberId())) {
			record.setCreateMemberId(Long.valueOf(query.getCreateMemberId()));
		}
		List<InspectFactoryApplyInfo> list = inspectFactoryApplyInfoDao
				.find(record);
		page.setResultData(new ArrayList<InspectFactoryApplyInfoVO> ());
		if (list.size() > 0) {
			List<InspectFactoryApplyInfoVO> resultData = inspectFactoryApplyInfoDao
					.getAuditCategoryList(query);
			// 参数类型装换
			for (int i = 0; i < resultData.size(); i++) {
			  String dateStr = DateUtils.formatDate(resultData.get(i)
					  .getCreateTime(), "yyyy-MM-dd");
			  resultData.get(i).setCreateTimeStr(dateStr);
			  resultData.get(i).setApplyStatusStr(FactoryApplyStatusEnum
					.getStatusName(resultData.get(i).getApplyStatus()+"")); 
			}
			page.setResultData(resultData);
		}
		page.setTotal(list.size());
		return page;
	}









}