package com.example.myemptyactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText user, edtPassword;
    private Button btnSign_in;
    private String email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.edt_username);
        edtPassword = findViewById(R.id.edt_password);
        btnSign_in = findViewById(R.id.btn_sign_in);


        //mengfungsikan click di button
        btnSign_in.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_sign_in:
                // ngambil text dari edit text
                Intent intent_toMain = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent_toMain);
                break;
        }
    }
}
