package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    private TextView tv_sub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        tv_sub  = findViewById(R.id.tv_sub);

        Intent intent = getIntent(); // 어디선가 날라오는 intent 값이 있으면 받는다
        String str = intent.getStringExtra("str"); // 받아오는 데이터의 별명을 똑같이 써줘야한다.

        tv_sub.setText(str);
    }
}