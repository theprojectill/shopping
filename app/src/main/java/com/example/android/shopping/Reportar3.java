package com.example.android.shopping;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.text.TextWatcher;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class Reportar3 extends ActionBarActivity
{
    ImageButton btn_enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reportar3);

        btn_enviar = (ImageButton) findViewById(R.id.btn_enviar);
        btn_enviar.setOnClickListener (new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(getApplicationContext(), "Incidente Enviado", Toast.LENGTH_SHORT).show();
                Intent cambiar = new Intent(Reportar3.this, Inicio.class);
                startActivity(cambiar);
            }
        });

        ImageButton btn_volver = (ImageButton) findViewById(R.id.btn_volver);
        btn_volver.setOnClickListener (new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent cambiar = new Intent(Reportar3.this, Reportar2.class);
                startActivity(cambiar);
            }
        });

        btn_enviar.setClickable(false);

        EditText editText3 = (EditText) findViewById(R.id.editText3);
        editText3.addTextChangedListener(new TextWatcher()
        {

            public void afterTextChanged(Editable s)
            {

            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                TextView editText3 = (TextView) findViewById(R.id.editText3);
                editText3.setText(s);
                btn_enviar.setClickable(true);
            }
        });
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
