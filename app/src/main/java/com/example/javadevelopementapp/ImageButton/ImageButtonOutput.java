package com.example.javadevelopementapp.ImageButton;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.javadevelopementapp.R;

public class ImageButtonOutput extends AppCompatActivity {
    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_button_output);

        imageButton = findViewById(R.id.imageBtn);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ImageButtonOutput.this, "Image Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}