package com.foodshop.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Onboarding2 extends AppCompatActivity {
    Button btn_start;
    ImageButton imbtn_back;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding2);
        btn_start = findViewById(R.id.btn_batdau);
        imbtn_back = findViewById(R.id.ib_trove);
        imbtn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backIntent = new Intent(Onboarding2.this, Onboarding1.class);
                startActivity(backIntent);
            }
        });
        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent batdau_intent = new Intent(Onboarding2.this,dangnhap.class);
                startActivity(batdau_intent);
            }
        });

    }
}