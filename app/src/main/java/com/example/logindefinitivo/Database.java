package com.example.logindefinitivo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



public class Database extends SQLiteOpenHelper {
    public Database( Context context,  String dbname,  SQLiteDatabase.CursorFactory factory, int version) {
        super(context, dbname, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
