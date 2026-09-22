package com.example.locurasproject.Musica;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.locurasproject.R;

public class login extends AppCompatActivity {
    EditText emailEditText, passwordEditText;
    Button loginButton;
    TextView signupRedirectText;
    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        databaseHelper = new DatabaseHelper(this);

        emailEditText = findViewById(R.id.login_email);
        passwordEditText = findViewById(R.id.login_password);
        loginButton = findViewById(R.id.login_button);
        signupRedirectText = findViewById(R.id.signup_redirect_text);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailEditText.getText().toString().trim();
                String password = passwordEditText.getText().toString().trim();

                if (databaseHelper.checkEmailPassword(email, password)) {
                    // Login exitoso
                    Toast.makeText(login.this, "Inicio de sesion exitoso", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(login.this, Musicactivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(login.this, "Email o contraseña son incorrectos", Toast.LENGTH_SHORT).show();
                }
            }
        });
        signupRedirectText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login.this, signup.class);
                startActivity(intent);
            }
        });
    }
}