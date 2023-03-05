package com.example.pranimitraa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;


public class MainActivity3 extends AppCompatActivity
{
    private Button button2;
    private FirebaseAuth mAuth;
    private EditText login;
    private EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mAuth = FirebaseAuth.getInstance();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        login = findViewById(R.id.editTextTextPersonName5);
        password = findViewById(R.id.editTextTextPassword3);
        button2 = findViewById(R.id.button3);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity3.this,MainActivity4.class);
                startActivity(intent2);
            }
        });
    }
}