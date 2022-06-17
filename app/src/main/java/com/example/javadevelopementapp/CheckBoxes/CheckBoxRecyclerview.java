package com.example.javadevelopementapp.CheckBoxes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import com.example.javadevelopementapp.Adapters.CheckBoxAdapters;
import com.example.javadevelopementapp.Adapters.EditText_DetailAdapters;
import com.example.javadevelopementapp.EditTextDirectory.EditOutPut_Activity;
import com.example.javadevelopementapp.Models.Model_Detail;
import com.example.javadevelopementapp.R;

import java.util.ArrayList;

public class CheckBoxRecyclerview extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box_recyclerview);
        getSupportActionBar().hide();

        recyclerView = (RecyclerView) findViewById(R.id.recycleviewItems);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        ArrayList<Model_Detail> arrayList = new ArrayList<>();
        CheckBoxAdapters detailAdapters = new CheckBoxAdapters(getApplicationContext(), arrayList);

        arrayList.add(new Model_Detail("Manifest"));
        arrayList.add(new Model_Detail("MainActivity.class"));
        arrayList.add(new Model_Detail("Actvity_main.xml"));
        arrayList.add(new Model_Detail("build Gradle"));
        recyclerView.setAdapter(detailAdapters);
    }

    public void outPutActivity(View view) {
        startActivity(new Intent(this, checkBoxOutput.class));
    }
}
