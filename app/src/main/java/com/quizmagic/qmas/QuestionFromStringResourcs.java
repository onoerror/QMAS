package com.quizmagic.qmas;


import android.content.res.Resources;
import android.text.Html;

import java.util.ArrayList;
import java.util.List;

public class QuestionFromStringResourcs implements QuestionAdapter{

    public List<Question> list = new ArrayList<>();

    public QuestionFromStringResourcs(Resources res){
        list.add(new Question(res.getString(R.string.question_1),
                        res.getString(R.string.question_1_radio_a),
                        res.getString(R.string.question_1_radio_b),
                        res.getString(R.string.question_1_radio_c))
        );
        list.add(new Question(res.getString(R.string.question_2),
                        res.getString(R.string.question_2_radio_a),
                        res.getString(R.string.question_2_radio_b),
                        res.getString(R.string.question_2_radio_c))
        );
        list.add(new Question(res.getString(R.string.question_3),
                        res.getString(R.string.question_3_radio_a),
                        res.getString(R.string.question_3_radio_b),
                        res.getString(R.string.question_3_radio_c))
        );

    }

    @Override
    public int getQuestionCount(){
        return list.size();
    }

    @Override
    public CharSequence getQuestion(int index) {
        return null;
    }

    @Override
    public CharSequence getQuestionQptionsA(int index) {
        return Html.fromHtml(list.get(index).getOptionA());
    }

    @Override
    public CharSequence getQuestionQptionsB(int index) {
        return Html.fromHtml(list.get(index).getOptionB());
    }

    @Override
    public CharSequence getQuestionQptionsC(int index) {
        return Html.fromHtml(list.get(index).getOptionC());
    }
}
