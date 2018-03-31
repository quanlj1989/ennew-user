package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import cn.enn.ygego.sunny.user.dto.vo.JoinCompanyQueryVO;
import cn.enn.ygego.sunny.user.dto.vo.JoinCompanyVO;
import cn.enn.ygego.sunny.user.model.EntSet;

/**
 * dal Interface:EntSet
 * @author gencode
 */
public interface EntSetDao {

	Integer insert(EntSet record);

    Integer insertSelective(EntSet record);
    
    Integer insertList(List<EntSet> records);
    
    Integer delete(EntSet record);

    Integer deleteByPrimaryKey(@Param("setId") Long setId);
    
    Integer updateByPrimaryKey(EntSet record);

    List<EntSet> findAll();

    List<EntSet> find(EntSet record);

    Integer getCount(EntSet record);

    EntSet getByPrimaryKey(@Param("setId") Long setId);

    /**
     * @Description 根据条件查询子公司总条数
     * @author puanl
     * @date 2018年3月29日 上午10:54:56 
     * @param query
     * @return
     */
    Integer getCompanyListCount(JoinCompanyQueryVO query);
    
    /**
     * @Description 根据条件查询子公司列表
     * @author puanl
     * @date 2018年3月29日 上午10:58:43 
     * @param query
     * @return
     */
    List<JoinCompanyVO> getCompanyList(JoinCompanyQueryVO query);
    
    /**
     * @Description 查询关联企业数量（子查父 / 父查子）
     * @author puanl
     * @date 2018年3月29日 下午4:21:50 
     * @param query
     * @return
     */
    Integer getJoinCompanyListCount(JoinCompanyQueryVO query);
    
    /**
     * @Description 查询关联企业列表（子查父 / 父查子）
     * @author puanl
     * @date 2018年3月29日 下午4:22:34 
     * @param query
     * @return
     */
    List<JoinCompanyVO> getJoinCompanyList(JoinCompanyQueryVO query);

    /**
     * 
     * @Description 根据关系ID，查询子公司配置信息
     * @author puanl
     * @date 2018年3月30日 上午9:34:52 
     * @param query
     * @return
     */
    JoinCompanyVO getSunCompanyBySetId(JoinCompanyQueryVO query);

    /**
     * @Description 批量修改父级会员关联状态
     * @author puanl
     * @date 2018年3月31日 上午9:25:29 
     * @param entSet
     * @return
     */
    Integer updateEntSetByList(List<EntSet> entSet);
    
}