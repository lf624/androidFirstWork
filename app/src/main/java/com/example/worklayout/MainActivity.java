package com.example.worklayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static String input_yong;
    public static String input_mima;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("登录");
        Button button_1=findViewById(R.id.button_1);
        Button button_2=findViewById(R.id.button_2);
        Button button_3=findViewById(R.id.button_3);
        Button button_4=findViewById(R.id.button_4);
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_denglu=new Intent(MainActivity.this,dengluActivity.class);
                startActivity(intent_denglu);
            }
        });
        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_zhuce=new Intent(MainActivity.this,zhuceActivity.class);
                startActivity(intent_zhuce);
            }
        });
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"腾讯微博登录",Toast.LENGTH_SHORT).show();
            }
        });
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"新浪微博登录",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
