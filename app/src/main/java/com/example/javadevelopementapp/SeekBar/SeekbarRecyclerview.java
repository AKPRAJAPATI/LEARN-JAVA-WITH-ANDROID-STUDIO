package com.example.javadevelopementapp.SeekBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.javadevelopementapp.Adapters.EditText_DetailAdapters;
import com.example.javadevelopementapp.Adapters.SeekBarAdapters;
import com.example.javadevelopementapp.EditTextDirectory.EditOutPut_Activity;
import com.example.javadevelopementapp.Models.Model_Detail;
import com.example.javadevelopementapp.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class SeekbarRecyclerview extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar_recyclerview);
        getSupportActionBar().hide();

        recyclerView = (RecyclerView) findViewById(R.id.recycleviewItems);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        ArrayList<Model_Detail> arrayList = new ArrayList<>();
        SeekBarAdapters detailAdapters= new SeekBarAdapters(getApplicationContext(),arrayList);

        arrayList.add(new Model_Detail("Manifest"));
        arrayList.add(new Model_Detail("MainActivity.class"));
        arrayList.add(new Model_Detail("Actvity_main.xml"));
        arrayList.add(new Model_Detail("build Gradle"));
        recyclerView.setAdapter(detailAdapters);
    }

    public void outPutActivity(View view) {
        startActivity(new Intent(this, SeekbarOutput.class));
    }

}