package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.QuestionAttach;

/**
 * dal Interface:QuestionAttach
 * @author gencode
 * @date 2018-3-22
 */
public interface QuestionAttachService {

    public List<QuestionAttach> findAll();

    public List<QuestionAttach> findQuestionAttachs(QuestionAttach record);

    public QuestionAttach getQuestionAttachByPrimaryKey(Long questionAttachId);

    public Integer createQuestionAttach(QuestionAttach record);

    public Integer removeQuestionAttach(QuestionAttach record);

    public Integer removeByPrimaryKey(Long questionAttachId);

    public Integer modifyQuestionAttachByPrimaryKey(QuestionAttach record);



}