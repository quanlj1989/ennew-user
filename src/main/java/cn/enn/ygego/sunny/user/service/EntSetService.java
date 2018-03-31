package cn.enn.ygego.sunny.user.service;

import java.util.List;

import cn.enn.ygego.sunny.user.dto.vo.JoinCompanyQueryVO;
import cn.enn.ygego.sunny.user.dto.vo.JoinCompanyVO;
import cn.enn.ygego.sunny.user.model.EntSet;

/**
 * dal Interface:EntSet
 * @author gencode
 * @date 2018-3-28
 */
public interface EntSetService {

    public List<EntSet> findAll();

    public List<EntSet> findEntSets(EntSet record);

    public EntSet getEntSetByPrimaryKey(Long setId);

    public Integer createEntSet(EntSet record);
    
    public Integer createEntSetList(List<EntSet> records);

    public Integer removeEntSet(EntSet record);

    public Integer removeByPrimaryKey(Long setId);

    public Integer modifyEntSetByPrimaryKey(EntSet record);

    /**
     * @Description 查询可添加子公司条数
     * @author puanl
     * @date 2018年3月29日 上午11:06:25 
     * @param query
     * @return
     */
    public Integer getFerrSunCompanyCount(JoinCompanyQueryVO query);
    
    /**
     * @Description 查询可添加子公司列表
     * @author puanl
     * @date 2018年3月29日 上午11:06:45 
     * @param query
     * @return
     */
    public List<JoinCompanyVO> getFerrSunCompanyList(JoinCompanyQueryVO query);
    
    /**
     * @Description 查询关联企业数量（子查父 / 父查子）
     * @author puanl
     * @date 2018年3月29日 下午4:24:45 
     * @param query
     * @return
     */
    public Integer getJoinCompanyCount(JoinCompanyQueryVO query);
    
    /**
     * @Description 查询关联企业列表（子查父 / 父查子）
     * @author puanl
     * @date 2018年3月29日 下午4:25:12 
     * @param query
     * @return
     */
    public List<JoinCompanyVO> getJoinCompanyList(JoinCompanyQueryVO query);
    
    /**
     * @Description 查看子公司配置详情
     * @author puanl
     * @date 2018年3月30日 上午9:37:29 
     * @param query
     * @return
     */
    public JoinCompanyVO getSunCompanyDetail(JoinCompanyQueryVO query);

    /**
     * 子公司同意加入企业
     * @Description TODO
     * @author puanl
     * @date 2018年3月30日 下午3:31:58 
     * @return
     */
    public Integer agreeJoinCompanyAndSet(EntSet entSet);
    
    /**
     * 子公司同意修改授权配置
     * @Description TODO
     * @author puanl
     * @date 2018年3月30日 下午3:32:32 
     * @return
     */
    public Integer agreeSetAccredit(EntSet entSet);
    
}