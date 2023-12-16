package com.foodshop.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {
    TextView click_wc, aboutus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        click_wc = findViewById(R.id.tv_wc);
        aboutus = findViewById(R.id.aboutus);
        click_wc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wc_intent = new Intent(Welcome.this,Onboarding1.class);
                startActivity(wc_intent);
            }
        });
        aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent as_go = new Intent(Welcome.this, about_us.class);
                startActivity(as_go);
            }
        });


    }
}