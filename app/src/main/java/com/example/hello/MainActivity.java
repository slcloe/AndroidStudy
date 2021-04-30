package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText et_id;
    Button btn_test ;

    @Override
    protected void onCreate(Bundle savedInstanceState) { //어플을 틀었을 때 처음으로 실행된다
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        et_id = findViewById(R.id.et_id); // et_id 이거랑 xml 에 있는 id 랑 연결
        btn_test = findViewById(R.id.btn_test);

        btn_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // 여기에 버튼이 클릭됐을때 나타낼 동작들을 코딩
                et_id.setText("alpaca"); // et_id 안에 있는 text 를 set 하는것
            }
        });

    }
}