package com.foodshop.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import androidx.annotation.NonNull;



import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
;
public class dangnhap extends AppCompatActivity {
    TextView tv_godangki;
    Button btn_login;
    EditText editTextEmail;
    EditText editTextPassword;

    Context context = dangnhap.this;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangnhap);

        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextTextPassword2);

        mAuth = FirebaseAuth.getInstance();

        tv_godangki = findViewById(R.id.tv_dangki);
        btn_login = findViewById(R.id.btn_dangnhap);
        // Đặt sự kiện click cho TextView "Đăng ký"
        tv_godangki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Chuyển hướng đến trang đăng ký
                Log.d("ClickEvent", "TextView Đăng ký được nhấn");
                Intent go_dangkiIntent = new Intent(dangnhap.this,dangki.class);
                startActivity(go_dangkiIntent);
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dangnhap();
            }
        });


    }

    private void dangnhap() {
        String email = editTextEmail.getText().toString();
        String password = editTextPassword.getText().toString();

        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Đăng nhập thành công, chuyển đến trang home
                            Toast.makeText(dangnhap.this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();

                            // Chuyển đến trang home
                            Intent go_homeIntent = new Intent(dangnhap.this, home.class);
                            startActivity(go_homeIntent);
                        } else {
                            // Nếu đăng nhập thất bại, hiển thị thông báo lỗi
                            Toast.makeText(dangnhap.this, "Authentication failed: " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
}