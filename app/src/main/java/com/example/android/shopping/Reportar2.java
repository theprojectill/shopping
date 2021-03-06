package com.example.android.shopping;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.example.android.shopping.db.AspectosDb;
import com.example.android.shopping.db.ReportesDb;

import java.util.HashMap;
import java.util.List;

public class Reportar2 extends ActionBarActivity
{
    private static final String INCOMPLETO = "Incompl.";
    private static final String BIEN = "Bien";
    private static final String REGULAR = "Regular";
    private static final String MAL = "Mal";

    ImageButton btn_enviar;
    HashMap<String, Integer> estadosDeLocaciones;
    //HashMap<String, RadioButton> mapaRadioButtons;
    HashMap<String, RadioGroup> mapaRadioGroups;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reportar3);

        TextView textSector = (TextView) this.findViewById(R.id.text_sector);
        Intent intent = this.getIntent();
        String sector = intent.getStringExtra("SECTOR");
        String ubicacion = intent.getStringExtra("UBICACION");
        textSector.setText(sector + " : " + ubicacion);


        List<String> aspectos = new AspectosDb().getAspectos(sector, ubicacion);

        btn_enviar = (ImageButton) findViewById(R.id.btn_enviar);
        btn_enviar.setOnClickListener (new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //TODO Recorrer los radio buttons seleccionados y guardar los valores en estados de locaciones

                /*for (String aspecto : mapaRadioGroups.keySet()) {
                    RadioGroup group = mapaRadioGroups.get(aspecto);
                    int idSeleccionado = group.getCheckedRadioButtonId();

                    if (idSeleccionado > 0) {
                        estadosDeLocaciones.put(aspecto, idSeleccionado);
                    }
                }*/

                ReportesDb reportesDb = new ReportesDb(getApplicationContext());

                //reportesDb.guardarReporte(idUsuario, idEdificio, idSector, idUbicacion, estadosDeLocaciones);

                Toast toast = Toast.makeText(getApplicationContext(), "Enviando reporte...", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();

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

                //Todo Mensaje de alerta de que no se guardaran los cambios

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
            label.setTextColor(Color.parseColor("#314361"));

            RadioGroup group = new RadioGroup(this);
            group.setOrientation(TableLayout.HORIZONTAL);

            RadioButton radioIncompleto = new RadioButton(this);
            radioIncompleto.setText(INCOMPLETO);
            //group.check(group.getChildAt(0).getId());
            //radioIncompleto.setChecked(true);
            //mapaRadioButtons.put(asp+INCOMPLETO, radioIncompleto);

            RadioButton radioBien = new RadioButton(this);
            radioBien.setText(BIEN);
            //radioBien.setChecked(false);
            //mapaRadioButtons.put(asp+BIEN, radioBien);

            RadioButton radioRegular = new RadioButton(this);
            radioRegular.setText(REGULAR);
            //radioRegular.setChecked(false);
            //mapaRadioButtons.put(asp+REGULAR, radioRegular);

            RadioButton radioMal = new RadioButton(this);
            radioMal.setText(MAL);
            //radioMal.setChecked(false);
            //mapaRadioButtons.put(asp+MAL, radioMal);

            group.addView(radioIncompleto);
            group.addView(radioBien);
            group.addView(radioRegular);
            group.addView(radioMal);

            //mapaRadioGroups.put(asp, group);

            Button fotoVideo = new Button(this);
            fotoVideo.setText("");
            fotoVideo.setBackgroundResource(R.drawable.camera);
            //fotoVideo.setBackgroundColor(Color.parseColor("#9dc7d5"));
            fotoVideo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    Toast.makeText(getApplicationContext(), "Se elegiría entre CÁMARA o GALERÍA", Toast.LENGTH_SHORT).show();
                }
            });

            Button comment = new Button(this);
            comment.setText("");
            comment.setBackgroundResource(R.drawable.comment);

            comment.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    Toast.makeText(getApplicationContext(), "Se insertaría un comentario", Toast.LENGTH_SHORT).show();
                }
            });

            tomaContainer.addView(label);
            tomaContainer.addView(group);
            tomaContainer.addView(fotoVideo);
            tomaContainer.addView(comment);

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

        switch (item.getItemId()) {

            case R.id.action_settings:
                Intent cambiar = new Intent(Reportar2.this, Inicio.class);
                startActivity(cambiar);
                return true;
            case R.id.action_settings1:
                Intent cambiar1 = new Intent(Reportar2.this, MainActivity.class);
                startActivity(cambiar1);
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
