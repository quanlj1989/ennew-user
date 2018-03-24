package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.EntCustInfo;

/**
 * dal Interface:EntCustInfo
 * @author gencode
 */
public interface EntCustInfoDao {

	Integer insert(EntCustInfo record);

    Integer insertSelective(EntCustInfo record);
    
    Integer delete(EntCustInfo record);

    Integer deleteByPrimaryKey(@Param("memberId") Long memberId);
    
    Integer updateByPrimaryKey(EntCustInfo record);

    List<EntCustInfo> findAll();

    List<EntCustInfo> find(EntCustInfo record);

    Integer getCount(EntCustInfo record);

    EntCustInfo getByPrimaryKey(@Param("memberId") Long memberId);

	


}