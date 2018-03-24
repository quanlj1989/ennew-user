package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.AcctOperPrivRela;

/**
 * dal Interface:AcctOperPrivRela
 * @author gencode
 */
public interface AcctOperPrivRelaDao {

	Integer insert(AcctOperPrivRela record);

    Integer insertSelective(AcctOperPrivRela record);
    
    Integer delete(AcctOperPrivRela record);

    Integer deleteByPrimaryKey(@Param("relaId") Long relaId);
    
    Integer updateByPrimaryKey(AcctOperPrivRela record);

    List<AcctOperPrivRela> findAll();

    List<AcctOperPrivRela> find(AcctOperPrivRela record);

    Integer getCount(AcctOperPrivRela record);

    AcctOperPrivRela getByPrimaryKey(@Param("relaId") Long relaId);

	


}