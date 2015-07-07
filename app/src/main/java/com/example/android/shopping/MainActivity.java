package com.example.android.shopping;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.android.shopping.db.UsuariosDbManager;


public class MainActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final UsuariosDbManager manager = new UsuariosDbManager(this);
        manager.insertar("adam", "adam");
        manager.insertar("eve", "eve");
        manager.insertar("admin", "admin");



        ImageButton boton = (ImageButton) findViewById(R.id.button_ingresar);


        boton.setOnClickListener (new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String usuario = ((EditText)findViewById(R.id.editUsusario)).getText().toString();
                String contraseña = ((EditText)findViewById(R.id.editContraseña)).getText().toString();


                if (manager.existeUsuario(usuario, contraseña))
                {
                    Intent nuevoformulario = new Intent(MainActivity.this, Shopping.class);
                    startActivity(nuevoformulario);


                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Usuario y/o contraseña incorrectos", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

}
