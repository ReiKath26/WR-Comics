package com.example.wrcomic_uxproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    EditText username, password;
    Button btnLogin;
    public static String userName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.userNameEdite);
        password = findViewById(R.id.passEdite);
        btnLogin = findViewById(R.id.logInButton);

        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                if(TextUtils.isEmpty(username.getText().toString())
                        || TextUtils.isEmpty(password.getText()))
                {
                    Toast.makeText(MainActivity.this, "Username and Password must be filled", Toast.LENGTH_LONG).show();
                } else if(username.getText().length() > 7 || username.getText().length() < 5)
                {
                    Toast.makeText(MainActivity.this, "Username must be between 5 to 7 characters", Toast.LENGTH_LONG).show();
                } else
                {
                    Intent intent = new Intent(MainActivity.this, com.example.wrcomic_uxproject.Drawer.class);
//                    intent.putExtra("keyname", userName);
                    startActivity(intent);
                }
            }
        });

    }
}