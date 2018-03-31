package cn.enn.ygego.sunny.user.dao;

import java.util.List;

import cn.enn.ygego.sunny.user.dto.vo.AcctLoginLogVO;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.AcctLoginLog;

/**
 * dal Interface:AcctLoginLog
 * @author gencode
 */
public interface AcctLoginLogDao {

	Integer insert(AcctLoginLog record);

    Integer insertSelective(AcctLoginLog record);
    
    Integer delete(AcctLoginLog record);

    Integer deleteByPrimaryKey(@Param("logId") Long logId);
    
    Integer updateByPrimaryKey(AcctLoginLog record);

    List<AcctLoginLog> findAll();

    List<AcctLoginLog> find(AcctLoginLog record);

    Integer getCount(AcctLoginLog record);

    AcctLoginLog getByPrimaryKey(@Param("logId") Long logId);

    List<AcctLoginLog> findPage(AcctLoginLogVO acctLoginLogVO);

    Long findPageCount(AcctLoginLogVO acctLoginLogVO);
}