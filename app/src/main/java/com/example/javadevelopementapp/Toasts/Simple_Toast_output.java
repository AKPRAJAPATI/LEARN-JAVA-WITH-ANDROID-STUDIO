package com.example.javadevelopementapp.Toasts;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.javadevelopementapp.R;

public class Simple_Toast_output extends AppCompatActivity {

    AppCompatButton simpleToast, coloredToast, PositionToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_toast);
        simpleToast = findViewById(R.id.simpleToastBtn);
        coloredToast = findViewById(R.id.colorToast);
        PositionToast = findViewById(R.id.positionToast);

        simpleToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Simple_Toast_output.this, "This is Simple Toast", Toast.LENGTH_SHORT).show();
            }
        });



     }
}