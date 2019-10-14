package com.example.topikpractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class problem_notime_Activity extends AppCompatActivity {

    private Button problem_random; // 랜덤별 풀기 버튼 클릭 이벤트

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem_notime);

        problem_random = findViewById(R.id.problem_random);
        problem_random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(problem_notime_Activity.this, test_with_notime_Activity.class);
                startActivity(intent); //액티비티 이동
            }
        });

    }
}
