package com.quizmagic.qmas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class Activity1 extends AppCompatActivity {

    public static final String Q1_ANSWER_KEY = "Q1";

    private TextView m_tv_no,m_tv_question;
    private RadioButton m_radio_a,m_radio_b,m_radio_c;
    private CharSequence m_answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        LinearLayout L = (LinearLayout)findViewById(R.id.bg);
        L.getBackground().setAlpha(200);//0~255
        init();
    }

    private void init() {
        m_tv_no = (TextView) findViewById(R.id.tv_no);
        m_tv_question = (TextView) findViewById(R.id.tv_question);
        m_radio_a = (RadioButton) findViewById(R.id.radio_a);
        m_radio_b = (RadioButton) findViewById(R.id.radio_b);
        m_radio_c = (RadioButton) findViewById(R.id.radio_c);

        int index = 0;
        String no = String.valueOf(index+1);
        m_tv_no.setText(no);

//        m_tv_no.setText("No.1");
        QuestionAdapter adapter = QuestionAdapterFactory.getQuestionAdapter();
        m_tv_question.setText(adapter.getQuestion(index));
        m_radio_a.setText(adapter.getQuestionQptionsA(index));
        m_radio_b.setText(adapter.getQuestionQptionsB(index));
        m_radio_c.setText(adapter.getQuestionQptionsC(index));
    }

    public void next(View view){
        Intent intent = new Intent(this,Activity2.class);
        intent.putExtra(Q1_ANSWER_KEY, m_answer);
        startActivity(intent);

        overridePendingTransition(R.anim.left, R.anim.right);
    }

    public void click(View view){
        m_answer = view.getTag().toString();
    }
}
