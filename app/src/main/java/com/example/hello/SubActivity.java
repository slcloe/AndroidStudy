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

        Button btn_navi2 = (Button) findViewById(R.id.btn_customnavi);
        btn_navi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(SubActivity.this, customnavi.class);
                startActivity(intent1);
            }
        });

        Button btn_camera = (Button) findViewById(R.id.btn_camera);
        btn_camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(SubActivity.this, Cameraexample.class);
                startActivity(intent1);
            }
        });

        Button btn_recycler = (Button) findViewById(R.id.btn_recycler);
        btn_recycler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(SubActivity.this, RecyclerViewExample.class);
                startActivity(intent1);
            }
        });

        Intent intent = getIntent(); // ???????????? ???????????? intent ?????? ????????? ?????????
        String str = intent.getStringExtra("str"); // ???????????? ???????????? ????????? ????????? ???????????????.

        tv_sub.setText(str);
    }
}