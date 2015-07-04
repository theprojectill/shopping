package com.example.android.shopping.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.util.HashMap;

/**
 * Created by android on 30/06/2015.
 */
public class ReportesDb
{
    private DbHelper helper;
    private SQLiteDatabase db;

    public ReportesDb(Context context)
    {
        this.helper = new DbHelper(context);
        this.db = helper.getWritableDatabase();
    }

    public void guardarReporte(String idUsuario, String idEdificio, String idSectores, String idUbicaciones, HashMap<String, Integer> estadosDeLocaciones)
    {
        //TODO Código para guardar el reporte

        //Registrar toma
        // db.insert(idToma, idUsuario, fechaInicio, fechaFin, observaciones);

        for (String locacion : estadosDeLocaciones.keySet())
        {
            Integer valor = estadosDeLocaciones.get(locacion);
            //db.insert(idToma, idEdificio, idSector, idUbicacion, valor);
        }
    }
}
