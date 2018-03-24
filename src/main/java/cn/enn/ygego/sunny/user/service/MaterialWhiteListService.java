package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.MaterialWhiteList;

/**
 * dal Interface:MaterialWhiteList
 * @author gencode
 * @date 2018-3-22
 */
public interface MaterialWhiteListService {

    public List<MaterialWhiteList> findAll();

    public List<MaterialWhiteList> findMaterialWhiteLists(MaterialWhiteList record);

    public MaterialWhiteList getMaterialWhiteListByPrimaryKey(Long listId);

    public Integer createMaterialWhiteList(MaterialWhiteList record);

    public Integer removeMaterialWhiteList(MaterialWhiteList record);

    public Integer removeByPrimaryKey(Long listId);

    public Integer modifyMaterialWhiteListByPrimaryKey(MaterialWhiteList record);



}