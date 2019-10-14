package com.example.topikpractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dictionary_Activity extends AppCompatActivity {

    //private Button dictionary_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dictionary);

       /* dictionary_back = findViewById(R.id.dictionary_back);
        dictionary_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(dictionary_Activity.this, MainActivity.class);
                startActivity(intent); //액티비티 이동
            }
        });*/

    }
}
