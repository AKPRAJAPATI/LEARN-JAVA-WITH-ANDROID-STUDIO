package com.example.javadevelopementapp.Toasts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.javadevelopementapp.R;

public class color_Toast extends AppCompatActivity {

    AppCompatButton   coloredToast ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_toast);
        coloredToast = findViewById(R.id.colorToast);
        coloredToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText( color_Toast.this, "This is Color Toast", Toast.LENGTH_SHORT);
                View view1 = toast.getView();
                view1.setBackgroundColor(getResources().getColor(R.color.background));
                TextView textView = (TextView) toast.getView().findViewById(android.R.id.message);
                textView.setTextColor(Color.WHITE);
                toast.show();

            }
        });

    }
}