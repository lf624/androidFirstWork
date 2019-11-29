package com.example.worklayout;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.worklayout.MainActivity.input_mima;
import static com.example.worklayout.MainActivity.input_yong;
public class zhuceActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhuce);
        ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null)
            actionBar.hide();
        Button button_zhuce=findViewById(R.id.button_denglu);
        button_zhuce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edit_yonohu= (EditText)findViewById(R.id.edit_yonghu);
                input_yong = edit_yonohu.getText().toString();
                EditText edit_mima=findViewById(R.id.edit_mima);
                input_mima= edit_mima.getText().toString();
                Toast.makeText(zhuceActivity.this,"注册成功!",Toast.LENGTH_SHORT).show();
            }
        });
        Button button_back=findViewById(R.id.title_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(zhuceActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
