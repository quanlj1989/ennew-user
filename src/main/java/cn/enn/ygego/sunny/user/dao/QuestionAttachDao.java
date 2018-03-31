package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.QuestionAttach;

/**
 * dal Interface:QuestionAttach
 * @author gencode
 */
public interface QuestionAttachDao {

	Integer insert(QuestionAttach record);

    Integer insertSelective(QuestionAttach record);
    
    Integer delete(QuestionAttach record);

    Integer deleteByPrimaryKey(@Param("questionAttachId") Long questionAttachId);
    
    Integer updateByPrimaryKey(QuestionAttach record);

    List<QuestionAttach> findAll();

    List<QuestionAttach> find(QuestionAttach record);

    Integer getCount(QuestionAttach record);

    QuestionAttach getByPrimaryKey(@Param("questionAttachId") Long questionAttachId);

    void insertBatch(List<QuestionAttach> attachList);

    List<QuestionAttach> getByQuestionId(Long questionId);
}