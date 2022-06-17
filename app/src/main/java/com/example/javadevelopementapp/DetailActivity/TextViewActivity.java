package com.example.javadevelopementapp.DetailActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import com.example.javadevelopementapp.Adapters.DetailAdapters;
import com.example.javadevelopementapp.Models.Model_Detail;
import com.example.javadevelopementapp.Output_Activity;
import com.example.javadevelopementapp.R;

import java.util.ArrayList;


public class TextViewActivity extends AppCompatActivity {
RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_textview);
        getSupportActionBar().hide();

        recyclerView = findViewById(R.id.recycleviewItems);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        ArrayList<Model_Detail> arrayList = new ArrayList<>();
        DetailAdapters detailAdapters= new DetailAdapters(getApplicationContext(),arrayList);

        arrayList.add(new Model_Detail("Manifest"));
        arrayList.add(new Model_Detail("MainActivity.class"));
        arrayList.add(new Model_Detail("Actvity_main.xml"));
        arrayList.add(new Model_Detail("build Gradle"));


        recyclerView.setAdapter(detailAdapters);
    }

    public void outPutActivity(View view) {
        startActivity(new Intent(this, Output_Activity.class));
    }
}