package com.quizmagic.qmas;

/**
 * Created by student on 2016/4/12.
 */
public interface QuestionAdapter {
    int getQuestionCount();
    CharSequence getQuestion(int index);
    CharSequence getQuestionQptionsA(int index);
    CharSequence getQuestionQptionsB(int index);
    CharSequence getQuestionQptionsC(int index);
}
