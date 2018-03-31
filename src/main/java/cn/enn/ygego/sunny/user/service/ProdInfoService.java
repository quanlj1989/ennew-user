package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.ProdInfo;

/**
 * dal Interface:ProdInfo
 * @author gencode
 * @date 2018-3-28
 */
public interface ProdInfoService {

    public List<ProdInfo> findAll();

    public List<ProdInfo> findProdInfos(ProdInfo record);

    public ProdInfo getProdInfoByPrimaryKey(Long prodId);

    public Integer createProdInfo(ProdInfo record);

    public Integer removeProdInfo(ProdInfo record);

    public Integer removeByPrimaryKey(Long prodId);

    public Integer modifyProdInfoByPrimaryKey(ProdInfo record);



}