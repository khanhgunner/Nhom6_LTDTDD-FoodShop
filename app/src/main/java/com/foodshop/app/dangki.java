package com.example.sixfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class dangki extends AppCompatActivity {
    TextView tv_godangnhap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangki);
        tv_godangnhap = findViewById(R.id.tv_dangnhap);
        tv_godangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go_dangnhapIntent = new Intent(dangki.this, dangnhap.class);
                startActivity(go_dangnhapIntent);
            }
        });
    }
}