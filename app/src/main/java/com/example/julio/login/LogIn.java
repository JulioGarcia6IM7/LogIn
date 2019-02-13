package com.example.julio.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LogIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
    }

    public void Ingresa(View VISTA){
        EditText usuario = findViewById(R.id.usua);
        EditText password = findViewById(R.id.passw);
        if(usuario.getText().toString().equals("Julio") && password.getText().toString().equals("contra123")){
            Intent ve = new Intent(this, Bienvenido.class);
            finish();
            startActivity(ve);
        }
        else{
            Toast error =  Toast.makeText(getApplicationContext(), "Datos incorrectos", Toast.LENGTH_LONG);
            error.setGravity(Gravity.BOTTOM,0,0);
            error.show();
        }
    }
}
