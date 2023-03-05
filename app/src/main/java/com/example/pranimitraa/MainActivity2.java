package com.example.pranimitraa;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.firebase.auth.AuthResult;

public class MainActivity2 extends AppCompatActivity
{
    private EditText email;
    private EditText pass;
    private EditText cpass;
    private EditText name;
    private Button proceed;
    private CheckBox confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        email = findViewById(R.id.editTextTextPersonName4);
        pass = findViewById(R.id.editTextTextPassword);
        cpass = findViewById(R.id.editTextTextPassword2);
        name = findViewById(R.id.editTextTextPersonName);
        proceed = findViewById(R.id.button4);
        confirm = findViewById(R.id.checkBox);

        proceed.setEnabled(false);
        if(pass.equals(cpass))
        {
            proceed.setEnabled(true);
        }
    }
}