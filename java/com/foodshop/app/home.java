package com.foodshop.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class home extends AppCompatActivity {
    TextView tv1, tv23, email, ten;
    ImageButton btn_profile, search, order;
    View layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        tv1 = findViewById(R.id.textView23);
        search = findViewById(R.id.search);
        order = findViewById(R.id.order);
        btn_profile = findViewById(R.id.profile);
        tv23 = findViewById(R.id.textView23);
        layout = findViewById(R.id.relativeLayout2);
        ten = findViewById(R.id.textView28);
        email = findViewById(R.id.textView30);
        FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();

        if (currentUser != null) {
            // Người dùng đã đăng nhập
            String displayName = currentUser.getDisplayName();
            String userEmail = currentUser.getEmail();

            // Kiểm tra và hiển thị tên
            if (displayName != null && !displayName.isEmpty()) {
                ten.setText("Chào, " + displayName + "!");
            } else {
                ten.setText("Chào!");
            }

            // Kiểm tra và hiển thị email
            if (userEmail != null && !userEmail.isEmpty()) {
                email.setText("" + userEmail);
            }
        } else {
            // Người dùng chưa đăng nhập, có thể xử lý tùy ý
        }
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menu_go = new Intent(home.this, menu_douong.class);
                startActivity(menu_go);
            }
        });
        btn_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profile_go = new Intent(home.this,Profile.class);
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
        tv23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menu_go = new Intent(home.this, menu_douong.class);
                startActivity(menu_go);
            }
        });
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profile_go = new Intent(home.this, Profile.class);
                startActivity(profile_go);
            }
        });
    }
}