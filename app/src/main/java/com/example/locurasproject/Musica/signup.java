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

public class signup extends AppCompatActivity {
    EditText emailEditText, passwordEditText, confirmPasswordEditText;
    Button signupButton;
    TextView loginRedirectText;
    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        databaseHelper = new DatabaseHelper(this);

        emailEditText = findViewById(R.id.signup_email);
        passwordEditText = findViewById(R.id.signup_password);
        confirmPasswordEditText = findViewById(R.id.signup_confirm_password);
        signupButton = findViewById(R.id.signup_button);
        loginRedirectText = findViewById(R.id.login_redirect_text);

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailEditText.getText().toString().trim();
                String password = passwordEditText.getText().toString().trim();
                String confirmPassword = confirmPasswordEditText.getText().toString().trim();

                if (password.equals(confirmPassword)) {
                    if (!databaseHelper.checkEmail(email)) {
                        // Registro exitoso
                        boolean inserted = databaseHelper.insertData(email, password);
                        if (inserted) {
                            Toast.makeText(signup.this, "Registro exitoso", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(signup.this, Musicactivity.class);
                            startActivity(intent);
                            finish();
                        } else {
                            Toast.makeText(signup.this, "Registro fallido", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        // El email ya está registrado
                        Toast.makeText(signup.this, "Este Email ya existe", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    // Las contraseñas no coinciden
                    Toast.makeText(signup.this, "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show();
                }
            }
        });

        loginRedirectText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signup.this, login.class);
                startActivity(intent);
            }
        });
    }
}