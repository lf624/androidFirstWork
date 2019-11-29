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

public class dengluActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_denglu);
        ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null)
            actionBar.hide();
        Button button_denglu=findViewById(R.id.button_denglu);
        final EditText edit_de_yong=findViewById(R.id.edit_de_yong);
        final EditText edit_de_mima=findViewById(R.id.edit_de_mima);
        button_denglu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String input_1=edit_de_yong.getText().toString();
                String input_2=edit_de_mima.getText().toString();
                if(input_1.equals(input_yong)&&input_2.equals(input_mima))
                Toast.makeText(dengluActivity.this,"登陆成功!",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(dengluActivity.this,"用户名或密码错误",Toast.LENGTH_SHORT).show();
            }
        });
        Button button_back=findViewById(R.id.title_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_back=new Intent(dengluActivity.this,MainActivity.class);
                startActivity(intent_back);
            }
        });
    }
}
