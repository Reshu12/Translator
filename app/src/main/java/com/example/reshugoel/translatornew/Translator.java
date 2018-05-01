package com.example.reshugoel.translatornew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Translator extends AppCompatActivity {

    Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.hi);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        setContentView(R.layout.activity_translator);
        btn1=(Button)findViewById(R.id.s2t);
        btn2=(Button)findViewById(R.id.t2s);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Translator.this,Speech2Text.class);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Translator.this,Text2Speech.class);
                startActivity(intent);
            }
        });
    }


    }

