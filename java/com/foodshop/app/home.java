package com.foodshop.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class home extends AppCompatActivity {
    TextView textview24;
    ImageButton home, order, profile, search;
    EditText edt_search;
    View layout1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        home = findViewById(R.id.home);
        order = findViewById(R.id.order);
        profile = findViewById(R.id.profile);
        search = findViewById(R.id.search);
        layout1 = findViewById(R.id.relativeLayout2);
        edt_search = findViewById(R.id.edt_seach);
        textview24 = findViewById(R.id.textView24);

        layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profile = new Intent(home.this, Profile.class);
                startActivity(profile);
            }
        });
        textview24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Menu = new Intent(home.this, menu.class);
                startActivity(Menu);
            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profile_go = new Intent(home.this, Profile.class);
                startActivity(profile_go);
            }
        });
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent order_go = new Intent(home.this, giohang.class);
                startActivity(order_go);
            }
        });
    }
}