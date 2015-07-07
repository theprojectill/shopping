package com.example.android.shopping;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;


public class Inicio extends ActionBarActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        final ImageButton btn_comenzar_planilla = (ImageButton) findViewById(R.id.btn_comenzar_planilla);
        btn_comenzar_planilla.setOnClickListener (new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent cambiar = new Intent(Inicio.this, Reportar.class);
                startActivity(cambiar);
            }
        });

        final ImageButton btn_sincronizar = (ImageButton) findViewById(R.id.btn_sincronizar);
        btn_sincronizar.setOnClickListener (new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(getApplicationContext(), "Acá se forzaría a SINCRONIZAR", Toast.LENGTH_LONG).show();
            }
        });

        final ImageButton btn_edit_planilla = (ImageButton) findViewById(R.id.btn_edit_planilla);
        btn_edit_planilla.setOnClickListener (new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(getApplicationContext(), "Acá cambiaría a PANTALLA EDITAR", Toast.LENGTH_LONG).show();
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_inicio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (item.getItemId()) {

            case R.id.action_settings:
                Intent cambiar = new Intent(Inicio.this, MainActivity.class);
                startActivity(cambiar);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


        //noinspection SimplifiableIfStatement
       /* if (id == R.id.action_settings)
        {
            return true;


        }

        return super.onOptionsItemSelected(item);
*/
    }

}
