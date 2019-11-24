package com.example.quiz_database;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Bundle arguments = getIntent().getExtras();
        final String ID_q = (arguments.get("ID").toString());
        final String right_answer =  (arguments.get("right_answer").toString());
        final int count = (int) arguments.get("Count");

        TextView tvNum_test = findViewById(R.id.num_test);
        TextView tvR_answer = findViewById(R.id.r_answer);

        tvNum_test.setText(ID_q);
        tvR_answer.setText(right_answer);

    }
}
