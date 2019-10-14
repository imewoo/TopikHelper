package com.example.topikpractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cookie_Activity extends AppCompatActivity {

    //private Button cookie_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cookie);

      /*  cookie_back = findViewById(R.id.cookie_back);
        cookie_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cookie_Activity.this, MainActivity.class);
                startActivity(intent); //액티비티 이동
            }
        });
*/


    }
}
