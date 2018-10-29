package com.java.mavis.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void login(View view) {
        EditText edusername = findViewById(R.id.ed_userName);
        EditText edpassword = findViewById(R.id.ed_password);
        String username = edusername.getText().toString();
        String password = edpassword.getText().toString();
        if ("Mavis".equals(username) && "253698".equals(password)) {
            finish();
        }
    }
}
