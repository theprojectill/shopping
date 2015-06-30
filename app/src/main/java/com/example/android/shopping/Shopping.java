package com.example.android.shopping;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class Shopping extends ActionBarActivity
{
    Spinner lista;
    List<String> datosLista = new ArrayList<String>();
    ImageButton siguintoso;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);

        siguintoso = (ImageButton) findViewById(R.id.btn_siguiente);
        siguintoso.setOnClickListener (new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent cambiar = new Intent(Shopping.this, Inicio.class);
                startActivity(cambiar);
            }
        });

        ImageButton btn_volver = (ImageButton) findViewById(R.id.btn_volver);
        btn_volver.setOnClickListener (new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent cambiar = new Intent(Shopping.this, MainActivity.class);
                startActivity(cambiar);
            }
        });

        lista = (Spinner)findViewById(R.id.spinner3);

        datosLista.add("Elija opción...");
        datosLista.add("Abasto");
        datosLista.add("Alto Avellaneda");
        datosLista.add("Alto Palermo");
        datosLista.add("Bs As Design");
        datosLista.add("Cordoba Shopping");
        datosLista.add("Dot Baires");
        datosLista.add("Mza Plaza");
        datosLista.add("Alcorta Shopping");
        datosLista.add("Patio Bullrich");

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datosLista);
        lista.setAdapter(adaptador);

        lista.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                switch (position)
                {
                    case 0:
                        break;

                    case 1:
                        Toast t = Toast.makeText(getApplicationContext(), datosLista.get(position), Toast.LENGTH_LONG);
                        t.show();
                        break;

                    case 2:
                        Toast po = Toast.makeText(getApplicationContext(), datosLista.get(position), Toast.LENGTH_LONG);
                        po.show();
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
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_shopping, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }



        return super.onOptionsItemSelected(item);
    }
}
