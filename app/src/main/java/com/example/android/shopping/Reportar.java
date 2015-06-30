package com.example.android.shopping;

import android.content.Intent;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.android.shopping.db.SectoresDb;
import com.example.android.shopping.db.UbicacionesDb;

import java.util.List;


public class Reportar extends ActionBarActivity
{
    private Spinner spinnerSectores;
    private Spinner spinnerUbicaciones;
    private ImageButton btn_siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reportar);

        spinnerSectores = (Spinner)findViewById(R.id.spinner_sectores);
        spinnerUbicaciones = (Spinner)findViewById(R.id.spinner_ubicaciones);

        spinnerUbicaciones.setClickable(false);

        btn_siguiente = (ImageButton) findViewById(R.id.btn_siguiente);

        btn_siguiente.setOnClickListener (new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //TODO: Agregar validaciones para que no avance si no eligieron nada
                Intent cambiar = new Intent(Reportar.this, Reportar2.class);
                cambiar.putExtra("SECTOR", spinnerSectores.getSelectedItem().toString());
                cambiar.putExtra("UBICACION", spinnerUbicaciones.getSelectedItem().toString());
                startActivity(cambiar);
            }
        });

        btn_siguiente.setClickable(false);

        final ImageButton boton_volver = (ImageButton) findViewById(R.id.btn_volver);
        boton_volver.setOnClickListener (new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent cambiar = new Intent(Reportar.this, Inicio.class);
                startActivity(cambiar);
            }
        });

        List<String> sectores = new SectoresDb().getSectores();
        sectores.add(0, "Elija un sector...");
        //TODO: Agregar la opcion "Elija un sector..."
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, sectores);
        spinnerSectores.setAdapter(adaptador);

        spinnerSectores.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        spinnerUbicaciones.setAlpha(0);
                        spinnerUbicaciones.setClickable(false);
                        break;

                    default:
                        String textSector = parent.getItemAtPosition(position).toString();
                        List<String> ubicaciones = new UbicacionesDb().getUbicaciones(textSector);
                        ubicaciones.add(0, "Elija una ubicación...");

                        ArrayAdapter<String> ubicacionesAdapter =
                                new ArrayAdapter<String>(Reportar.this, android.R.layout.simple_spinner_item, ubicaciones);
                        spinnerUbicaciones.setAdapter(ubicacionesAdapter);
                        spinnerUbicaciones.setAlpha(1);
                        spinnerUbicaciones.setClickable(true);
                        Toast t = Toast.makeText(getApplicationContext(), textSector, Toast.LENGTH_LONG);
                        t.show();
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

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
