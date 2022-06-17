package com.example.javadevelopementapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.javadevelopementapp.Adapters.Main_Adapters;
import com.example.javadevelopementapp.Models.Model;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        recyclerView = findViewById(R.id.recycleview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        ArrayList<Model> arrayList = new ArrayList<>();

        arrayList.add(new Model(Model.LAYOUT_ONE_SHOW_TEXT, "Wedgets"));
        arrayList.add(new Model(Model.LAYOUT_TWO_SHOW_PREVIEW, "TextView", "Detaiil", R.drawable.java_png));
        arrayList.add(new Model(Model.LAYOUT_TWO_SHOW_PREVIEW, "EditText", "Detaiil", R.drawable.java_png));
        arrayList.add(new Model(Model.LAYOUT_TWO_SHOW_PREVIEW, "Buttons", "Detaiil", R.drawable.java_png));
        arrayList.add(new Model(Model.LAYOUT_TWO_SHOW_PREVIEW, "Toggle Button", "Detaiil", R.drawable.java_png));
        arrayList.add(new Model(Model.LAYOUT_TWO_SHOW_PREVIEW, "Switch", "Detaiil", R.drawable.java_png));
        arrayList.add(new Model(Model.LAYOUT_TWO_SHOW_PREVIEW, "Image Button", "Detaiil", R.drawable.java_png));
        arrayList.add(new Model(Model.LAYOUT_TWO_SHOW_PREVIEW, "Check Box", "Detaiil", R.drawable.java_png));
        arrayList.add(new Model(Model.LAYOUT_TWO_SHOW_PREVIEW, "Spinner", "Detaiil", R.drawable.java_png));
        arrayList.add(new Model(Model.LAYOUT_TWO_SHOW_PREVIEW, "Radio Button", "Detaiil", R.drawable.java_png));
        arrayList.add(new Model(Model.LAYOUT_TWO_SHOW_PREVIEW, "Seek Bar", "Detaiil", R.drawable.java_png));
        arrayList.add(new Model(Model.LAYOUT_TWO_SHOW_PREVIEW, "Rating  Bar", "Detaiil", R.drawable.java_png));
        arrayList.add(new Model(Model.LAYOUT_TWO_SHOW_PREVIEW, "Text Switcher", "Detaiil", R.drawable.java_png));
        arrayList.add(new Model(Model.LAYOUT_TWO_SHOW_PREVIEW, "Scroll View", "Detaiil", R.drawable.java_png));
        arrayList.add(new Model(Model.LAYOUT_TWO_SHOW_PREVIEW, "Image Switcher", "Detaiil", R.drawable.java_png));
        arrayList.add(new Model(Model.LAYOUT_ONE_SHOW_TEXT, "Toast Message"));
        arrayList.add(new Model(Model.LAYOUT_TWO_SHOW_PREVIEW, "Simple Toast", "Detaiil", R.drawable.java_png));
        arrayList.add(new Model(Model.LAYOUT_TWO_SHOW_PREVIEW, "Colour Toast", "Detaiil", R.drawable.java_png));
        arrayList.add(new Model(Model.LAYOUT_TWO_SHOW_PREVIEW, "Custom Toast", "Detaiil", R.drawable.java_png));
        arrayList.add(new Model(Model.LAYOUT_ONE_SHOW_TEXT, "Activity with Intent"));
        arrayList.add(new Model(Model.LAYOUT_TWO_SHOW_PREVIEW, "Explict Intent", "Detaiil", R.drawable.java_png));
        arrayList.add(new Model(Model.LAYOUT_TWO_SHOW_PREVIEW, "Implict Intent", "Detaiil", R.drawable.java_png));
        arrayList.add(new Model(Model.LAYOUT_TWO_SHOW_PREVIEW, "Value Pass Activity", "Detaiil", R.drawable.java_png));
        arrayList.add(new Model(Model.LAYOUT_TWO_SHOW_PREVIEW, "Rate Us", "Detaiil", R.drawable.java_png));
        arrayList.add(new Model(Model.LAYOUT_TWO_SHOW_PREVIEW, "Share", "Detaiil", R.drawable.java_png));
        arrayList.add(new Model(Model.LAYOUT_TWO_SHOW_PREVIEW, "Email", "Detaiil", R.drawable.java_png));
        arrayList.add(new Model(Model.LAYOUT_TWO_SHOW_PREVIEW, "WhatsApp", "Detaiil", R.drawable.java_png));
        arrayList.add(new Model(Model.LAYOUT_TWO_SHOW_PREVIEW, "Copy", "Detaiil", R.drawable.java_png));
        arrayList.add(new Model(Model.LAYOUT_TWO_SHOW_PREVIEW, "Share", "Detaiil", R.drawable.java_png));
        arrayList.add(new Model(Model.LAYOUT_TWO_SHOW_PREVIEW, "Choose Image", "Detaiil", R.drawable.java_png));

        arrayList.add(new Model(Model.LAYOUT_ONE_SHOW_TEXT, "Menu"));
        arrayList.add(new Model(Model.LAYOUT_TWO_SHOW_PREVIEW, "PopUp Menu", "Detaiil", R.drawable.java_png));
        arrayList.add(new Model(Model.LAYOUT_TWO_SHOW_PREVIEW, "Option Menu", "Detaiil", R.drawable.java_png));
        arrayList.add(new Model(Model.LAYOUT_TWO_SHOW_PREVIEW, "Content Menu", "Detaiil", R.drawable.java_png));

        arrayList.add(new Model(Model.LAYOUT_ONE_SHOW_TEXT, "MultiMedia"));
        arrayList.add(new Model(Model.LAYOUT_TWO_SHOW_PREVIEW, "Take Photo", "Detaiil", R.drawable.java_png));
        arrayList.add(new Model(Model.LAYOUT_TWO_SHOW_PREVIEW, "Take Video", "Detaiil", R.drawable.java_png));
        arrayList.add(new Model(Model.LAYOUT_TWO_SHOW_PREVIEW, "Text to Speech", "Detaiil", R.drawable.java_png));
        arrayList.add(new Model(Model.LAYOUT_TWO_SHOW_PREVIEW, "Speech to Text", "Detaiil", R.drawable.java_png));

        arrayList.add(new Model(Model.LAYOUT_ONE_SHOW_TEXT, "Sqlite Database"));
        arrayList.add(new Model(Model.LAYOUT_TWO_SHOW_PREVIEW, "CURD OPRATION", "Detaiil", R.drawable.java_png));

        arrayList.add(new Model(Model.LAYOUT_ONE_SHOW_TEXT, "Our Projects"));
        arrayList.add(new Model(Model.LAYOUT_TWO_SHOW_PREVIEW, "Torch Application", "Projects", R.drawable.java_png));
        arrayList.add(new Model(Model.LAYOUT_TWO_SHOW_PREVIEW, "Student Management with Recyclerview", "Projects", R.drawable.java_png));
        arrayList.add(new Model(Model.LAYOUT_TWO_SHOW_PREVIEW, "Calculator", "Projects", R.drawable.java_png));
        arrayList.add(new Model(Model.LAYOUT_TWO_SHOW_PREVIEW, "Simple app with firebase", "Projects", R.drawable.java_png));

        Main_Adapters mainAdapters = new Main_Adapters(getApplicationContext(), arrayList);
        recyclerView.setAdapter(mainAdapters);
    }
}