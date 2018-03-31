package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.InspectFactoryApplyAttach;

/**
 * dal Interface:InspectFactoryApplyAttach
 * @author gencode
 * @date 2018-3-30
 */
public interface InspectFactoryApplyAttachService {

    public List<InspectFactoryApplyAttach> findAll();

    public List<InspectFactoryApplyAttach> findInspectFactoryApplyAttachs(InspectFactoryApplyAttach record);

    public InspectFactoryApplyAttach getInspectFactoryApplyAttachByPrimaryKey(Long attaId);

    public Integer createInspectFactoryApplyAttach(InspectFactoryApplyAttach record);

    public Integer removeInspectFactoryApplyAttach(InspectFactoryApplyAttach record);

    public Integer removeByPrimaryKey(Long attaId);

    public Integer modifyInspectFactoryApplyAttachByPrimaryKey(InspectFactoryApplyAttach record);



}