package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.MaterialBlackList;

/**
 * dal Interface:MaterialBlackList
 * @author gencode
 * @date 2018-3-22
 */
public interface MaterialBlackListService {

    public List<MaterialBlackList> findAll();

    public List<MaterialBlackList> findMaterialBlackLists(MaterialBlackList record);

    public MaterialBlackList getMaterialBlackListByPrimaryKey(Long listId);

    public Integer createMaterialBlackList(MaterialBlackList record);

    public Integer removeMaterialBlackList(MaterialBlackList record);

    public Integer removeByPrimaryKey(Long listId);

    public Integer modifyMaterialBlackListByPrimaryKey(MaterialBlackList record);



}