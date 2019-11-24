package com.example.quiz_database;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class Test1Activity extends AppCompatActivity {

    boolean yes1, yes2, yes3, yes4;
    int i = 0;
    int a = 0;
    int count = 0;
    int right_answer = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);

        UpdateQ(i);
    }

    private void UpdateQ(final int num) {
        String quest = "";

        Bundle arguments = getIntent().getExtras();
        final int ID_q = (int) arguments.get("ID");
        count = Question.getCount();

        quest = Question.quests[num].getQuest();
        final TextView tvQuest = findViewById(R.id.tvQuestion);

        final Button next = findViewById(R.id.next);
        final Button btnEnd = findViewById(R.id.end);

        tvQuest.setText(quest);

        final CheckBox chb_a1 = findViewById(R.id.chb_a1);
        final CheckBox chb_a2 = findViewById(R.id.chb_a2);
        final CheckBox chb_a3 = findViewById(R.id.chb_a3);
        final CheckBox chb_a4 = findViewById(R.id.chb_a4);

        chb_a1.setChecked(false);
        chb_a2.setChecked(false);
        chb_a3.setChecked(false);
        chb_a4.setChecked(false);

        yes1 = false;
        yes2 = false;
        yes3 = false;
        yes4 = false;

        chb_a1.setText(Answer.answers[a].getAnswer());
        if (Answer.answers[a].getYes()) yes1 = true;
        chb_a2.setText(Answer.answers[a + 1].getAnswer());
        if (Answer.answers[a + 1].getYes()) yes2 = true;
        chb_a3.setText(Answer.answers[a + 2].getAnswer());
        if (Answer.answers[a + 2].getYes()) yes3 = true;
        chb_a4.setText(Answer.answers[a + 3].getAnswer());
        if (Answer.answers[a + 3].getYes()) yes4 = true;

        final View.OnClickListener oclBtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView tvCount = findViewById(R.id.tvCount);

                boolean a1 = chb_a1.isChecked();
                boolean a2 = chb_a2.isChecked();
                boolean a3 = chb_a3.isChecked();
                boolean a4 = chb_a4.isChecked();

                if(num+2 == count) {

                    btnEnd.setVisibility(btnEnd.VISIBLE);
                    next.setVisibility(next.INVISIBLE);
                }

                if (a1 == yes1 && a2 == yes2 && a3 == yes3 && a4 == yes4) {
                    tvCount.setText(num+2 + "/" + count);
                    right_answer = right_answer + 1;
                } else {
                    tvCount.setText(num+2 + "/" + count);
                }

                i = i + 1;
                a = a + 4;
                UpdateQ(i);

            }
        };

        final View.OnClickListener oclEnd = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Test1Activity.this, Result.class);
                intent.putExtra("ID", ID_q);
                intent.putExtra("right_answer", right_answer);
                intent.putExtra("Count", count);
                startActivity(intent);

            }
        };

        next.setOnClickListener(oclBtnOk);
        btnEnd.setOnClickListener(oclEnd);

    }
}




