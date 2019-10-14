package com.example.topikpractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class problem_time_Activity extends AppCompatActivity {

    //private Button problem_time_back;
    private Button problem1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem_time);

    /*    problem_time_back = findViewById(R.id.problem_time_back);
        problem_time_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(problem_time_Activity.this, MainActivity.class);
                startActivity(intent); //액티비티 이동
            }
        });
        */

    problem1 = findViewById(R.id.problem1);
    problem1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(problem_time_Activity.this, test_with_time_Activity.class);
            startActivity(intent);
        }
    });
    }
}
