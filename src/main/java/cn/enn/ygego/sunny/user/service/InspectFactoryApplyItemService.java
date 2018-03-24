package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.InspectFactoryApplyItem;

/**
 * dal Interface:InspectFactoryApplyItem
 * @author gencode
 * @date 2018-3-22
 */
public interface InspectFactoryApplyItemService {

    public List<InspectFactoryApplyItem> findAll();

    public List<InspectFactoryApplyItem> findInspectFactoryApplyItems(InspectFactoryApplyItem record);

    public InspectFactoryApplyItem getInspectFactoryApplyItemByPrimaryKey(Long applyItemId);

    public Integer createInspectFactoryApplyItem(InspectFactoryApplyItem record);

    public Integer removeInspectFactoryApplyItem(InspectFactoryApplyItem record);

    public Integer removeByPrimaryKey(Long applyItemId);

    public Integer modifyInspectFactoryApplyItemByPrimaryKey(InspectFactoryApplyItem record);



}