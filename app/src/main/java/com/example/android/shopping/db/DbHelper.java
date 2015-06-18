package com.example.android.shopping.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.android.shopping.db.UsuariosDbManager;

/**
 * Created by android on 16/06/2015.
 */
public class DbHelper extends SQLiteOpenHelper
{
    private static final String DB_NAME = "shopping.sqlite";
    private static final int DB_SCHEME_VERSION = 1;

    public DbHelper(Context context)
    {
        super(context, DB_NAME, null, DB_SCHEME_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL(UsuariosDbManager.CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
