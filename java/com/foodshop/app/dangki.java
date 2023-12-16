package com.foodshop.app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.google.firebase.auth.FirebaseUser;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.UserProfileChangeRequest;

public class dangki extends AppCompatActivity {
    TextView tv_godangnhap;
    EditText edt_email;
    EditText edt_name;
    Button btn_dangki;
    EditText edt_mk;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangki);
        mAuth = FirebaseAuth.getInstance();
        tv_godangnhap = findViewById(R.id.tv_dangnhap);
        edt_name=findViewById(R.id.editTextText2);
        edt_email = findViewById(R.id.email);
        edt_mk = findViewById(R.id.mk);
        btn_dangki = findViewById(R.id.button2);

        btn_dangki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dang_ky(); // Chỉ gọi đăng ký khi nút được nhấn
            }
        });

        tv_godangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go_dangnhapIntent = new Intent(dangki.this, dangnhap.class);
                startActivity(go_dangnhapIntent);
            }
        });
    }

    private void dang_ky() {
        String email = edt_email.getText().toString();
        String password = edt_mk.getText().toString();
        String displayName = edt_name.getText().toString(); // Lấy tên từ EditText

        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Đăng ký thành công
                            Toast.makeText(dangki.this, "Đăng ký thành công", Toast.LENGTH_SHORT).show();

                            // Lấy người dùng hiện tại
                            FirebaseUser user = mAuth.getCurrentUser();

                            // Thêm thông tin tên
                            UserProfileChangeRequest profileUpdates = new UserProfileChangeRequest.Builder()
                                    .setDisplayName(displayName)
                                    .build();

                            // Cập nhật thông tin người dùng
                            user.updateProfile(profileUpdates);

                            // Chuyển hướng đến trang đăng nhập hoặc màn hình chính
                            Intent go_dangnhapIntent = new Intent(dangki.this, dangnhap.class);
                            startActivity(go_dangnhapIntent);
                        } else {
                            // Đăng ký thất bại, hiển thị thông báo lỗi
                            Toast.makeText(dangki.this, "Authentication failed.", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
}