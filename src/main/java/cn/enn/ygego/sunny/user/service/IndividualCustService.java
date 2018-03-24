package cn.enn.ygego.sunny.user.service;

import java.util.List;

import cn.enn.ygego.sunny.user.dto.IndividualCustDTO;
import cn.enn.ygego.sunny.user.dto.vo.PersonQueryVO;
import cn.enn.ygego.sunny.user.dto.vo.PersonVO;
import cn.enn.ygego.sunny.user.model.IndividualCust;

/**
 * dal Interface:IndividualCust
 * @author gencode
 * @date 2018-3-22
 */
public interface IndividualCustService {

    public List<IndividualCust> findAll();

    public List<IndividualCust> findIndividualCusts(IndividualCust record);

    public IndividualCust getIndividualCustByPrimaryKey(Long memberId);

    public Integer createIndividualCust(IndividualCust record);

    public Integer removeIndividualCust(IndividualCust record);

    public Integer removeByPrimaryKey(Long memberId);

    public Integer modifyIndividualCustByPrimaryKey(IndividualCust record);

    /**
     * @Description 查询用户资质认证详情
     * @author puanl
     * @date 2018年3月24日 下午3:58:29 
     * @param memberId
     * @param hasFile
     * @return
     */
    public IndividualCustDTO getIndividualCustById(Long memberId , boolean hasFile);
    
    /**
     * @Description 查询用户详情
     * @author puanl
     * @date 2018年3月24日 下午3:57:41 
     * @param memberId
     * @param acctId
     * @return
     */
    public PersonVO getPersonDetail(Long memberId , Long acctId);
    
    /**
     * @Description 分页查询列表总数
     * @author puanl
     * @date 2018年3月24日 下午5:23:42 
     * @param query
     * @return
     */
    Integer getPersonCount(PersonQueryVO query);
    /**
     * @Description 查询用户列表数据
     * @author puanl
     * @date 2018年3月24日 下午3:58:00 
     * @param query
     * @return
     */
    public List<PersonVO> getPersonList(PersonQueryVO query);

}