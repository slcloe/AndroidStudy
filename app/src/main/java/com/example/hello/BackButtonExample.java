package com.example.hello;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class BackButtonExample extends AppCompatActivity {

    private long backBtnTime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_button_example);
    }

    @Override
    public void onBackPressed() {
        long curTime = System.currentTimeMillis();
        long gapTime = curTime - backBtnTime;

        if( 0 <= gapTime && 2000 >= gapTime){
            super.onBackPressed();
        }else{
            backBtnTime = curTime;
            Toast.makeText( this, "한번 더 누르면 종료됩니다.", Toast.LENGTH_SHORT).show();
        }


    }
}