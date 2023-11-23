package com.example.logindefinitivo;

import androidx.appcompat.app.AppCompatActivity;
import  android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login_Actividad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login_actividad);
        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);
        Button buttonLogin = findViewById(R.id.buttonLogin);
        Button buttonRegistro1 = findViewById(R.id.buttonRegistro1);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String enteredPassword = password.getText().toString();
                String correctPassword = "password";

                if (enteredPassword.equals(correctPassword)) {
                    String enteredUsername = username.getText().toString();

                    Intent intent = new Intent(Login_Actividad.this, Inicio_Actividad.class);
                    intent.putExtra("USERNAME", enteredUsername);
                    startActivity(intent);
                } else {
                    Toast.makeText(Login_Actividad.this, "Los datos son incorrectos", Toast.LENGTH_SHORT).show();
                }
            }
        });
        buttonRegistro1.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(Login_Actividad.this,Registro_Actividad.class);
               startActivity(intent);
           }
        });

    }
}


