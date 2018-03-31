package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.EntPaySet;

/**
 * dal Interface:EntPaySet
 * @author gencode
 */
public interface EntPaySetDao {

	Integer insert(EntPaySet record);

    Integer insertSelective(EntPaySet record);
    
    Integer delete(EntPaySet record);

    Integer deleteByPrimaryKey(@Param("paySetId") Long paySetId);
    
    Integer updateByPrimaryKey(EntPaySet record);

    List<EntPaySet> findAll();

    List<EntPaySet> find(EntPaySet record);

    Integer getCount(EntPaySet record);

    EntPaySet getByPrimaryKey(@Param("paySetId") Long paySetId);

    Integer insertBatch(List<EntPaySet> paySets);

    void deleteByMemberId(@Param("memberId") Long memberId);
}