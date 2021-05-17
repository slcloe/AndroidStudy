package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SharedElementCallback;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;

public class Sharedexample extends AppCompatActivity {

    EditText et_save;
    String shared = "file" ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sharedexample);

        et_save  = (EditText)findViewById(R.id.et_save);

        SharedPreferences sharedPreferences = getSharedPreferences(shared, 0);
        String value = sharedPreferences.getString("slcloe", "");
        et_save.setText(value);
    }

    @Override
    protected void onDestroy() { // 앱을 종료를 시켰을때 액티비티가 파괴될때 실행
        super.onDestroy();

        SharedPreferences sharedPreferences = getSharedPreferences(shared, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        String value = et_save.getText().toString();
        editor.putString("slcloe",value);
        editor.commit(); // save를 완료해라
    }
}