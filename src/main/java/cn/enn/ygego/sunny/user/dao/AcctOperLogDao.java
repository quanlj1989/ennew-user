package cn.enn.ygego.sunny.user.dao;

import cn.enn.ygego.sunny.user.dto.vo.AcctOperLogVO;
import cn.enn.ygego.sunny.user.model.AcctLoginLog;
import cn.enn.ygego.sunny.user.model.AcctOperLog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * dal Interface:AcctOperLog
 * @author gencode
 */
public interface AcctOperLogDao {

	Integer insert(AcctOperLog record);

    Integer insertSelective(AcctOperLog record);
    
    Integer delete(AcctOperLog record);

    Integer deleteByPrimaryKey(@Param("logId") Long logId);
    
    Integer updateByPrimaryKey(AcctOperLog record);

    List<AcctOperLog> findAll();

    List<AcctOperLog> find(AcctOperLog record);

    Integer getCount(AcctOperLog record);

    AcctOperLog getByPrimaryKey(@Param("logId") Long logId);

    List<AcctOperLog> findPage(AcctOperLogVO acctOperLogVO);

    Long findPageCount(AcctOperLogVO acctOperLogVO);
}