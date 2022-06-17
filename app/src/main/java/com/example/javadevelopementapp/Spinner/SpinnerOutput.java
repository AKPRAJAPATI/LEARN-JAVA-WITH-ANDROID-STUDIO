package com.example.javadevelopementapp.Spinner;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.example.javadevelopementapp.R;

public class SpinnerOutput extends AppCompatActivity {

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_output);

        spinner = findViewById(R.id.myspinner);
        String[] show_languages = {"C language", "C++ language", "Python", "Java", "Kotlin", "Ruby", "Swift", "Html", "css", "JavaScript", "jQuery", "Php", "Dbms", "Flutter"};
        //make adapter for the set language in spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, show_languages);
        spinner.setAdapter(adapter);

    }
}