package cn.enn.ygego.sunny.user.dao;

import cn.enn.ygego.sunny.user.dto.QuestionFeedbackDTO;
import cn.enn.ygego.sunny.user.dto.vo.QuestionFeedbackVO;
import cn.enn.ygego.sunny.user.model.QuestionFeedback;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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

    List<QuestionFeedbackDTO> findPage(QuestionFeedbackVO questionVO);

    Long insertReturnId(QuestionFeedback questionFeedback);

    Long insertReturnIdSelective(QuestionFeedback questionFeedback);

    Integer updateBatchQuestion(QuestionFeedbackVO questionFeedbackVO);

    QuestionFeedbackDTO getQuestionInfo(QuestionFeedbackVO questionFeedbackVO);

    Long findPageCount(QuestionFeedbackVO questionVO);
}