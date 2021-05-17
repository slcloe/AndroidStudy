package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    private TextView tv_sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Button btn_navi = (Button)findViewById(R.id.btn_next);
        tv_sub  = findViewById(R.id.tv_sub);

        btn_navi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(SubActivity.this, NaviExample.class);
                startActivity(intent1);
            }
        });

        Button btn_shared = (Button) findViewById(R.id.btn_sharedPreference);
        btn_shared.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(SubActivity.this, Sharedexample.class);
                startActivity(intent1);
            }
        });

        Button btn_web = (Button) findViewById(R.id.btn_webview);
        btn_web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(SubActivity.this, webviewexample.class);
                startActivity(intent1);
            }
        });

        Intent intent = getIntent(); // 어디선가 날라오는 intent 값이 있으면 받는다
        String str = intent.getStringExtra("str"); // 받아오는 데이터의 별명을 똑같이 써줘야한다.

        tv_sub.setText(str);
    }
}