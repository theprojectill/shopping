package com.example.android.shopping;

import android.content.Intent;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    private CheckBox recordameckBox;
    private EditText user;
    private EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = (EditText)findViewById(R.id.editUsusario);       //obtengo la referencia del EditText
        pass = (EditText)findViewById(R.id.editContraseña);
        SharedPreferences prefe=getSharedPreferences("recordameData", Context.MODE_PRIVATE);        //Obtenemos una referencia de un objeto de la clase SharedPreferences a través del método getSharedPreferences. El primer parámetro es el nombre del archivo de preferencias y el segundo la forma de creación del archivo (MODE_PRIVATE indica que solo esta aplicación puede consultar el archivo XML que se crea)
        user.setText(prefe.getString("recordameUser",""));       //Para extraer los datos del archivo de preferencias debemos indicar el nombre a extraer y un valor de retorno si dicho nombre no existe en el archivo de preferencias (en nuestro ejemplo la primera vez que se ejecute nuestro programa como es lógico no existe el archivo de preferencias lo que hace que Android lo cree, si tratamos de extraer el valor de recordameUser o recordamePass nos retornará el segundo parámetro es decir el String con una cadena vacía)je =)
        pass.setText(prefe.getString("recordamePass",""));


        ImageButton boton = (ImageButton) findViewById(R.id.button_ingresar);
        recordameckBox = (CheckBox) findViewById(R.id.recordame_ckBox);

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

                    if (recordameckBox.isChecked()) {
                        SharedPreferences preferencias=getSharedPreferences("recordameData",Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor=preferencias.edit();        //Debemos crear un objeto de la clase Editor y obtener la referencia del objeto de la clase SharedPreferences que acabamos de crear. Mediante el método putString almacenamos en recordameData el valor del String cargado en el EditText. Luego debemos llamar al método commit de la clase Editor para que el dato quede almacenado en forma permanente en el archivo de preferencias. Esto hace que cuando volvamos a arrancar la aplicación se recuperen los datos ingresados.
                        editor.putString("recordameData", user.getText().toString());
                        editor.putString("recordameData", pass.getText().toString());
                        editor.commit();
                        startActivity(nuevoformulario);
                        //finish();
                    }
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Datos Incorrectos", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

}
