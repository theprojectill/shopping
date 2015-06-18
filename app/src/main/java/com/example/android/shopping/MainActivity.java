package com.example.android.shopping;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.android.shopping.db.UsuariosDbManager;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UsuariosDbManager manager = new UsuariosDbManager(this);
        manager.insertar("Adam", "Adam");


        ImageButton boton = (ImageButton) findViewById(R.id.button_ingresar);

        boton.setOnClickListener (new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String usuario = ((EditText)findViewById(R.id.editUsusario)).getText().toString();
                String contraseña = ((EditText)findViewById(R.id.editContraseña)).getText().toString();
                if (usuario.equals("admin")&& contraseña.equals("admin"))
                {
                    Intent nuevoformulario = new Intent(MainActivity.this, Inicio.class);
                    startActivity(nuevoformulario);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Usuario Incorrecto", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

}
