package com.foodshop.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class dangnhap extends AppCompatActivity {
    TextView tv_godangki;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangnhap);
        tv_godangki = findViewById(R.id.tv_dangki);
        btn_login = findViewById(R.id.btn_dangnhap);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go_homeIntent = new Intent(dangnhap.this, home.class);
                startActivity(go_homeIntent);
            }
        });
        tv_godangki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go_dangkiIntent = new Intent(dangnhap.this, dangki.class);
                startActivity(go_dangkiIntent);
            }
        });

    }
}