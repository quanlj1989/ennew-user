package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.DataPriv;

/**
 * dal Interface:DataPriv
 * @author gencode
 * @date 2018-3-22
 */
public interface DataPrivService {

    public List<DataPriv> findAll();

    public List<DataPriv> findDataPrivs(DataPriv record);

    public DataPriv getDataPrivByPrimaryKey(Long privId);

    public Integer createDataPriv(DataPriv record);

    public Integer removeDataPriv(DataPriv record);

    public Integer removeByPrimaryKey(Long privId);

    public Integer modifyDataPrivByPrimaryKey(DataPriv record);



}