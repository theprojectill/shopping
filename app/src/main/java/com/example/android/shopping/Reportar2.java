package com.example.android.shopping;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.example.android.shopping.db.AspectosDb;
import java.util.List;

public class Reportar2 extends ActionBarActivity
{
    ImageButton btn_enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reportar3);

        TextView textSector = (TextView) this.findViewById(R.id.text_sector);
        Intent intent = this.getIntent();
        String sector = intent.getStringExtra("SECTOR");
        String ubicacion = intent.getStringExtra("UBICACION");
        textSector.setText(sector + " - " + ubicacion);

        List<String> aspectos = new AspectosDb().getAspectos(sector, ubicacion);

        btn_enviar = (ImageButton) findViewById(R.id.btn_enviar);
        btn_enviar.setOnClickListener (new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(getApplicationContext(), "Incidente Enviado", Toast.LENGTH_SHORT).show();
                Intent cambiar = new Intent(Reportar2.this, Inicio.class);
                startActivity(cambiar);
            }
        });

        ImageButton btn_volver = (ImageButton) findViewById(R.id.btn_volver);
        btn_volver.setOnClickListener (new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                //Todo Guardar reporte y mostrar mensaje de configuracion



                Intent cambiar = new Intent(Reportar2.this, Reportar.class);
                startActivity(cambiar);
            }
        });

        ViewGroup container = (ViewGroup) this.findViewById(R.id.container);

        for (String asp : aspectos)
        {

            LinearLayout tomaContainer = new LinearLayout(this);

            TextView label = new TextView(this);
            label.setText(asp);
            RadioGroup group = new RadioGroup(this);
            group.setOrientation(LinearLayout.HORIZONTAL);

            RadioButton radioIncompleto = new RadioButton(this);
            radioIncompleto.setText("Incompleto");
            radioIncompleto.setSelected(true);

            RadioButton radioBien = new RadioButton(this);
            radioBien.setText("Bien");

            RadioButton radioRegular = new RadioButton(this);
            radioRegular.setText("Regular");

            RadioButton radioMal = new RadioButton(this);
            radioMal.setText("Mal");

            group.addView(radioIncompleto);
            group.addView(radioBien);
            group.addView(radioRegular);
            group.addView(radioMal);

            Button fotoVideo = new Button(this);
            fotoVideo.setText("Foto/Video");

            tomaContainer.addView(label);
            tomaContainer.addView(group);
            tomaContainer.addView(fotoVideo);

            container.addView(tomaContainer);
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_reportar3, menu);
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
