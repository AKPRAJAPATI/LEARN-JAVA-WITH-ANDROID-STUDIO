package com.example.javadevelopementapp.sqliteDatabase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class sqliteDatabaseOpenHelper extends SQLiteOpenHelper {
    public sqliteDatabaseOpenHelper(Context context) {
        super(context, "student.db", null, 2);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table student_table(id interger primary key autoincrement, name, text , vill text, post text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS student_table");
        onCreate(sqLiteDatabase);
    }

    public String insertOurData(String name, String vill, String post) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", name);
        contentValues.put("vill", vill);
        contentValues.put("post", post);

        float res = sqLiteDatabase.insert("student_table", null, contentValues);
        if (res == 1) {
            return "Inserted";
        } else {
            return "Failed";
        }

    }
    public Cursor getData(){
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor res = sqLiteDatabase.rawQuery("select * from akashtbl",null);
        return res;
    }
    public String updateData(String  id, String name, String vill, String post) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", id);
        contentValues.put("name", name);
        contentValues.put("vill", vill);
        contentValues.put("post", post);


        float res = sqLiteDatabase.update("akashtbl",contentValues,"id = ?",new String[]{id});

        if (res == 1) {
            return "Update";
        } else {
            return "Failed";
        }

    }

    public Integer deleteDatai(String id){
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        return sqLiteDatabase.delete("akashtbl","id = ?",new String[]{id});
    }

}
