package com.example.locurasproject.flujocalor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.locurasproject.MainActivity;
import com.example.locurasproject.R;

public class Historia extends AppCompatActivity {


    private ImageButton imgbtnsig,btnimghome,btnimregresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia);

        btnimregresar=findViewById(R.id.btnimreg);
        btnimregresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Historia.this, MainActivity2.class);
                startActivity(intent);
                finish();
            }
        });
        btnimghome=findViewById(R.id.btnimhome);
        btnimghome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Historia.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}