package cn.enn.ygego.sunny.user.dao;

import cn.enn.ygego.sunny.user.model.QuestionResponse;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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

    List<QuestionResponse> getByQuestionId(Long questionId);

    Integer insertBatch(List<QuestionResponse> list);
}