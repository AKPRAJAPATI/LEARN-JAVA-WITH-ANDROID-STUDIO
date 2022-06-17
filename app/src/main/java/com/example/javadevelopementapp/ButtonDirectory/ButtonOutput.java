package com.example.javadevelopementapp.ButtonDirectory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.javadevelopementapp.R;

public class ButtonOutput extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_output);
        button = findViewById(R.id.buttonClicked);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ButtonOutput.this, "Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}