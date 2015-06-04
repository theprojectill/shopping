package com.example.android.shopping;

import android.content.Intent;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class Reportar extends ActionBarActivity
{
    Spinner lista;
    String[] datos = {"Baños", "PaCo", "Mall"};

    Spinner lista2;
    String[] datos2 = {"Planta Baja", "Piso 1", "Piso 2"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reportar);

        final Button boton = (Button) findViewById(R.id.button14);
        boton.setOnClickListener (new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent cambiar = new Intent(Reportar.this, Reportar2.class);
                startActivity(cambiar);
            }
        });

        final Button boton2 = (Button) findViewById(R.id.button13);
        boton2.setOnClickListener (new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent cambiar = new Intent(Reportar.this, Inicio.class);
                startActivity(cambiar);
            }
        });

        lista = (Spinner)findViewById(R.id.spinner);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datos);
        lista.setAdapter(adaptador);

        lista.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                switch (position)
                {
                    case 0:
                        Toast to = Toast.makeText(getApplicationContext(), datos[position], Toast.LENGTH_LONG);
                        to.show();
                        break;

                    case 1:
                        Toast t = Toast.makeText(getApplicationContext(), datos[position], Toast.LENGTH_LONG);
                        t.show();
                        break;

                    case 2:
                        Toast po = Toast.makeText(getApplicationContext(), datos[position], Toast.LENGTH_LONG);
                        po.show();
                        break;

                    case 3:
                        Toast p = Toast.makeText(getApplicationContext(), datos[position], Toast.LENGTH_LONG);
                        p.show();
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {

            }
        });



        lista2 = (Spinner)findViewById(R.id.spinner2);

        ArrayAdapter<String> adaptador2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datos2);
        lista2.setAdapter(adaptador2);

        lista2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                switch (position)
                {
                    case 0:
                        Toast to = Toast.makeText(getApplicationContext(), datos2[position], Toast.LENGTH_LONG);
                        to.show();
                        break;

                    case 1:
                        Toast t = Toast.makeText(getApplicationContext(), datos2[position], Toast.LENGTH_LONG);
                        t.show();
                        break;

                    case 2:
                        Toast po = Toast.makeText(getApplicationContext(), datos2[position], Toast.LENGTH_LONG);
                        po.show();
                        break;

                    case 3:
                        Toast p = Toast.makeText(getApplicationContext(), datos2[position], Toast.LENGTH_LONG);
                        p.show();
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_reportar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
