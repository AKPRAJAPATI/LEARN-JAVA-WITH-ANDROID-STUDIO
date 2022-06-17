package com.example.javadevelopementapp.sqliteDatabase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.javadevelopementapp.Adapters.ButtonAdapters;
import com.example.javadevelopementapp.Adapters.sqliteDatabaseAdapters;
import com.example.javadevelopementapp.ButtonDirectory.ButtonOutput;
import com.example.javadevelopementapp.ImageButton.ImageButtonOutput;
import com.example.javadevelopementapp.Models.Model_Detail;
import com.example.javadevelopementapp.R;

import java.util.ArrayList;

public class sqliteDatabaseRecyclerview extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlite_database_recyclerview);
        getSupportActionBar().hide();

        recyclerView = findViewById(R.id.recycleviewItems);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        ArrayList<Model_Detail> arrayList = new ArrayList<>();
        sqliteDatabaseAdapters detailAdapters= new sqliteDatabaseAdapters(getApplicationContext(),arrayList);

        arrayList.add(new Model_Detail("Manifest"));
        arrayList.add(new Model_Detail("MainActivity.class"));
        arrayList.add(new Model_Detail("Actvity_main.xml"));

        arrayList.add(new Model_Detail("SqliteOpenHelper"));

        arrayList.add(new Model_Detail("build Gradle"));
        recyclerView.setAdapter(detailAdapters);
    }

    public void outPutActivity(View view) {
        startActivity(new Intent(this, ImageButtonOutput.class));
    }
}