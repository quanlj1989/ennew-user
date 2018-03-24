package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.QuestionResponse;

/**
 * dal Interface:QuestionResponse
 * @author gencode
 */
public interface QuestionResponseDao {

	Integer insert(QuestionResponse record);

    Integer insertSelective(QuestionResponse record);
    
    Integer delete(QuestionResponse record);

    Integer deleteByPrimaryKey(@Param("responseId") Long responseId);
    
    Integer updateByPrimaryKey(QuestionResponse record);

    List<QuestionResponse> findAll();

    List<QuestionResponse> find(QuestionResponse record);

    Integer getCount(QuestionResponse record);

    QuestionResponse getByPrimaryKey(@Param("responseId") Long responseId);

	


}