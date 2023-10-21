package com.example.sixfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Onboarding1 extends AppCompatActivity {
    Button btn_next;
    TextView tv_skip;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding1);
        btn_next = findViewById(R.id.btn_tiep);
        tv_skip = findViewById(R.id.tv_boqua);
        tv_skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent skip_intent = new Intent(Onboarding1.this, dangnhap.class);
                startActivity(skip_intent);
            }
        });
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  myIntent = new Intent(Onboarding1.this,Onboarding2.class);
                startActivity(myIntent);
            }
        });

    }
}