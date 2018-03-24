package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.QuestionFeedback;

/**
 * dal Interface:QuestionFeedback
 * @author gencode
 */
public interface QuestionFeedbackDao {

	Integer insert(QuestionFeedback record);

    Integer insertSelective(QuestionFeedback record);
    
    Integer delete(QuestionFeedback record);

    Integer deleteByPrimaryKey(@Param("questionId") Long questionId);
    
    Integer updateByPrimaryKey(QuestionFeedback record);

    List<QuestionFeedback> findAll();

    List<QuestionFeedback> find(QuestionFeedback record);

    Integer getCount(QuestionFeedback record);

    QuestionFeedback getByPrimaryKey(@Param("questionId") Long questionId);

	


}