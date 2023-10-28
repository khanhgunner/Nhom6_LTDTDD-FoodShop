package com.foodshop.app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.text.Editable;
import android.text.TextWatcher;
import android.content.Intent;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.graphics.Color;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.Toast;


public class giohang extends AppCompatActivity {
    private ImageButton home, search, order, profile;
    private Button thanhtoan;
    private TextView textview1, textview2, tong, diachi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.giohang);
        thanhtoan = findViewById(R.id.thanhtoan);
        home = findViewById(R.id.home);
        search = findViewById(R.id.search);
        order = findViewById(R.id.order);
        profile = findViewById(R.id.profile);
        textview1 = findViewById(R.id.textview1);
        textview2 = findViewById(R.id.textview2);
        tong = findViewById(R.id.tong);
        diachi = findViewById(R.id.diachi);
        //chuyển trang
        thanhtoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(giohang.this, Thanhtoan.class);
                startActivity(intent);
            }
        });
        diachi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(giohang.this, diachi.class);
                startActivity(intent);
            }
        });
        //hover
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home_go = new Intent(giohang.this, home.class);
                startActivity(home_go);
            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profile_go = new Intent(giohang.this, Profile.class);
                startActivity(profile_go);
            }
        });
    }
}
