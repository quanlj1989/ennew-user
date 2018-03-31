package cn.enn.ygego.sunny.user.service;

import java.util.List;

import cn.enn.ygego.sunny.core.page.PageDTO;
import cn.enn.ygego.sunny.user.dto.factory.CategoryQueryVO;
import cn.enn.ygego.sunny.user.dto.factory.InspectFactoryApplyInfoVO;
import cn.enn.ygego.sunny.user.model.InspectFactoryApplyInfo;

/**
 * dal Interface:InspectFactoryApplyInfo
 * @author gencode
 * @date 2018-3-30
 */
public interface InspectFactoryApplyInfoService {

    public List<InspectFactoryApplyInfo> findAll();

    public List<InspectFactoryApplyInfo> findInspectFactoryApplyInfos(InspectFactoryApplyInfo record);

    public InspectFactoryApplyInfo getInspectFactoryApplyInfoByPrimaryKey(Long applyId);

    public Integer createInspectFactoryApplyInfo(InspectFactoryApplyInfo record);

    public Integer removeInspectFactoryApplyInfo(InspectFactoryApplyInfo record);

    public Integer removeByPrimaryKey(Long applyId);

    public Integer modifyInspectFactoryApplyInfoByPrimaryKey(InspectFactoryApplyInfo record);
    /**
     * @Description 查询供应商的验厂类目信息
     * @author zhengyang
     * @date 2018年3月30日 下午8:07:02 
     * @param query
     * @return
     */
    public PageDTO<InspectFactoryApplyInfoVO> getAuditCategoryList(CategoryQueryVO query);



}