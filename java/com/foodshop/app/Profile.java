package com.foodshop.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PerformanceHintManager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Profile extends AppCompatActivity {
    TextView ten, email;
    ImageButton btn_profile, home, order;
    View diachi, yeuthich, pttt, dangxuat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        diachi = findViewById(R.id.diachi);
        yeuthich = findViewById(R.id.yeuthich);
        pttt = findViewById(R.id.pttt);
        home = findViewById(R.id.home);
        order = findViewById(R.id.order);
        dangxuat = findViewById(R.id.dangxuat);
       btn_profile = findViewById(R.id.profile);
       ten = findViewById(R.id.textView28);
       email = findViewById(R.id.textView30);
        FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();

        if (currentUser != null) {
            // Người dùng đã đăng nhập
            String displayName = currentUser.getDisplayName();
            String userEmail = currentUser.getEmail();

            // Kiểm tra và hiển thị tên
            if (displayName != null && !displayName.isEmpty()) {
                ten.setText(displayName);
            }

            // Kiểm tra và hiển thị email
            if (userEmail != null && !userEmail.isEmpty()) {
                email.setText("" + userEmail);
            }
        } else {
            // Người dùng chưa đăng nhập, có thể xử lý tùy ý
        }
       btn_profile.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent profile_go = new Intent(Profile.this, MainActivity.class);
               startActivity(profile_go);
           }
       });
       diachi.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent diachi_go = new Intent(Profile.this, activity_diachi.class);
               startActivity(diachi_go);
           }
       });
       yeuthich.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent favorite_go = new Intent(Profile.this, favorite.class);
               startActivity(favorite_go);
           }
       });
       pttt.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent pttt_go = new Intent(Profile.this, Thanhtoan.class);
               startActivity(pttt_go);
           }
       });
       dangxuat.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent dangxuat_go = new Intent(Profile.this, dangnhap.class);
               startActivity(dangxuat_go);
           }
       });
       home.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent home_go = new Intent(Profile.this, home.class);
               startActivity(home_go);
           }
       });
       order.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent order_go = new Intent(Profile.this, giohang.class);
               startActivity(order_go);
           }
       });
    }
}