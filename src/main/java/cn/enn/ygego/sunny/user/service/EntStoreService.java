package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.EntStore;

/**
 * dal Interface:EntStore
 * @author gencode
 * @date 2018-3-22
 */
public interface EntStoreService {

    public List<EntStore> findAll();

    public List<EntStore> findEntStores(EntStore record);

    public EntStore getEntStoreByPrimaryKey(Long storeId);

    public Integer createEntStore(EntStore record);

    public Integer removeEntStore(EntStore record);

    public Integer removeByPrimaryKey(Long storeId);

    public Integer modifyEntStoreByPrimaryKey(EntStore record);



}