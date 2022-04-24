package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    TextView forgotPassNow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView username = findViewById(R.id.username);
        TextView password = findViewById(R.id.password);
        forgotPassNow = findViewById(R.id.forgotpassbtn);

        MaterialButton loginbtn = findViewById(R.id.loginbtn);

        forgotPassNow.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, ForgotPassword.class));
        });
        loginbtn.setOnClickListener(v -> {
            if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                //correct
                Toast.makeText(MainActivity.this, "Login Successful!!!", Toast.LENGTH_SHORT).show();
            } else
                //incorrect
                Toast.makeText(MainActivity.this, "Login Failed!!!", Toast.LENGTH_SHORT).show();


        });



    }
}