package com.trackfolks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {


    private EditText mobile;
    private Button btnMobile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mobile = findViewById(R.id.mobile);
        btnMobile = findViewById(R.id.buttonmobile);

        btnMobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mobileText = mobile.getText().toString().trim();

                if (mobileText.isEmpty() || mobile.length() < 10) {
                    mobile.setError("Enter a valid mobile");
                    mobile.requestFocus();
                    return;
                }

                Intent intent = new Intent(LoginActivity.this, OtpActivity.class);
                intent.putExtra("mobile", mobileText);
                startActivity(intent);
            }
        });

    }
}