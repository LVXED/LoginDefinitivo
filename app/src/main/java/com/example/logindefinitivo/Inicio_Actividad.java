package com.example.logindefinitivo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Inicio_Actividad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_actividad);

        String username =  getIntent().getStringExtra("USERNAME");
        TextView textViewUsername = findViewById(R.id.textView3);
        textViewUsername.setText("Bienvenido " + username + "!");

    }
}