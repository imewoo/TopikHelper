package com.example.topikpractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mypage_Activity extends AppCompatActivity {

  // private Button mypage_back;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage);

    /*    mypage_back = findViewById(R.id.mypage_back);
        mypage_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mypage_Activity.this, MainActivity.class);
                startActivity(intent); //액티비티 이동
            }
        });*/
    }
}
