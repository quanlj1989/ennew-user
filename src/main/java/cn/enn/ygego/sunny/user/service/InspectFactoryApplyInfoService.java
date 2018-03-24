package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.InspectFactoryApplyInfo;

/**
 * dal Interface:InspectFactoryApplyInfo
 * @author gencode
 * @date 2018-3-22
 */
public interface InspectFactoryApplyInfoService {

    public List<InspectFactoryApplyInfo> findAll();

    public List<InspectFactoryApplyInfo> findInspectFactoryApplyInfos(InspectFactoryApplyInfo record);

    public InspectFactoryApplyInfo getInspectFactoryApplyInfoByPrimaryKey(Long applyId);

    public Integer createInspectFactoryApplyInfo(InspectFactoryApplyInfo record);

    public Integer removeInspectFactoryApplyInfo(InspectFactoryApplyInfo record);

    public Integer removeByPrimaryKey(Long applyId);

    public Integer modifyInspectFactoryApplyInfoByPrimaryKey(InspectFactoryApplyInfo record);



}