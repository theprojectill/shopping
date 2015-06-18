package com.example.android.shopping.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by android on 16/06/2015.
 */
public class UsuariosDbManager
{
    public static final String TABLE_NAME = "usuarios";
    public static final String CN_ID = "_id";
    public static final String CN_USUARIO = "usuario";
    public static final String CN_CONTRASEÑA = "contraseña";

//create table contactos(
//_id integer primary key autoincrement,
//nombre text not null,
//telefono text);

    public static final String CREATE_TABLE = "create table " +TABLE_NAME+ " ("
            + CN_ID + " integer primary key autoincrement,"
            + CN_USUARIO + " text not null,"
            + CN_CONTRASEÑA + " text);";

    private DbHelper helper;
    private SQLiteDatabase db;

    public UsuariosDbManager(Context context)
    {
        this.helper = new DbHelper(context);
        this.db = helper.getWritableDatabase();
    }

    private ContentValues generarContentValues(String usuario, String contraseña)
    {
        ContentValues valores = new ContentValues();
        valores.put(CN_USUARIO, usuario);
        valores.put(CN_CONTRASEÑA, contraseña);

        return valores;
    }

    public void insertar(String usuario, String contraseña)
    {
        //db.insert(TABLA, NullColumnHack, ContentValues);

        db.insert(TABLE_NAME, null, this.generarContentValues(usuario, contraseña));
    }

    /*db.insert();
    db.execSQL();
    db.rawQuery();

    public void eliminar(String nombre)
    {
        //db. delete (Tabla, Claúsula Where, Argumentos Where)

        db.delete(TABLE_NAME, CN_USUARIO + "=?", new String[]{usuario});
    }

    public void eliminarMultiple(String us1, String us2)
    {
        db.delete(TABLE_NAME, CN_USUARIO + "IN (?,?)", new String[]{us1, us2});
    }*/

    public void modificarContraseña(String usuario, String nuevaContraseña)
    {
        //db.update(TABLA, ContentValues, Claúsula Where, Argumentos Where)

        db.update(TABLE_NAME, this.generarContentValues(usuario, nuevaContraseña), CN_USUARIO + "=?", new String[]{usuario});
    }

    public boolean existeUsuario(String usuario, String contraseña) {
        Cursor cursor = this.db.rawQuery("select 1 from " + TABLE_NAME + " where " + CN_USUARIO + "=? AND " + CN_CONTRASEÑA + " =?",
                new String[] { usuario, contraseña });
        boolean exists = (cursor.getCount() > 0);
        cursor.close();
        return exists;
    }
}
