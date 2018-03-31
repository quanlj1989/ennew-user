package cn.enn.ygego.sunny.user.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.enn.ygego.sunny.user.dto.factory.CategoryQueryVO;
import cn.enn.ygego.sunny.user.dto.factory.InspectFactoryApplyInfoVO;
import cn.enn.ygego.sunny.user.model.InspectFactoryApplyInfo;

/**
 * dal Interface:InspectFactoryApplyInfo
 * @author gencode
 */
public interface InspectFactoryApplyInfoDao {

	Integer insert(InspectFactoryApplyInfo record);

    Integer insertSelective(InspectFactoryApplyInfo record);
    
    Integer delete(InspectFactoryApplyInfo record);

    Integer deleteByPrimaryKey(@Param("applyId") Long applyId);
    
    Integer updateByPrimaryKey(InspectFactoryApplyInfo record);

    List<InspectFactoryApplyInfo> findAll();

    List<InspectFactoryApplyInfo> find(InspectFactoryApplyInfo record);

    Integer getCount(InspectFactoryApplyInfo record);

    InspectFactoryApplyInfo getByPrimaryKey(@Param("applyId") Long applyId);
    /**
     * @Description 查询供应航的验厂类目信息
     * @author zhengyang
     * @date 2018年3月30日 下午8:16:47 
     * @param query
     * @return
     */
    List<InspectFactoryApplyInfoVO> getAuditCategoryList(CategoryQueryVO query);
    

	


}