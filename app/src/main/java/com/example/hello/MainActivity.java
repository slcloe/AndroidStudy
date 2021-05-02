package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    EditText et_id;
    Button btn_test ;

    private Button btn_move;
    private EditText et_test;
    private String str;

    ImageView test;

    private ListView list;


    @Override
    protected void onCreate(Bundle savedInstanceState) { //어플을 틀었을 때 처음으로 실행된다
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView)findViewById(R.id.list);

        List<String> data = new ArrayList<>();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,data);
        list.setAdapter(adapter);

        data.add("pakapaka");
        data.add("dndnr");
        data.add("android");
        adapter.notifyDataSetChanged();  // 이걸써줘야만 저장이됨.



        test = (ImageView)findViewById(R.id.test);
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "우향향좌향향",Toast.LENGTH_SHORT).show();
            }
        });

        et_test = findViewById(R.id.et_test);


        btn_move = findViewById(R.id.btn_move);
        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = et_test.getText().toString();
                Intent intent = new Intent(MainActivity.this , SubActivity.class);
                intent.putExtra("str",str); //subActivity 쪽으로 데이터를 쏴줬다. ( A, B) A는 쏴줄때 데이터를 가리키는 별명 B 는 실제 데이터
                startActivity(intent); // 액티비티 이동.
            }
        });



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