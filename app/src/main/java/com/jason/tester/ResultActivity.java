package com.jason.tester;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        SharedPreferences pref = getSharedPreferences("LOGIN", MODE_PRIVATE);

//        Bundle bundleResult = this.getIntent().getExtras();
//        String account = bundleResult.getString("Account");
//        String email = bundleResult.getString("E-mail");
//        String password = bundleResult.getString("Password");

        String account = pref.getString("ACCOUNT", "Data not found");
        String email = pref.getString("EMAIL", null);
        String password = pref.getString("PASSWORD", "Data not found");

        TextView opAccount = findViewById(R.id.op1);
        opAccount.setText("您的帳號: " + account);
        TextView opEmail = findViewById(R.id.op2);
        opEmail.setText("您的信箱: " + email);
        TextView opPassword = findViewById(R.id.op3);
        opPassword.setText("您的密碼: " + password);
    }
}
