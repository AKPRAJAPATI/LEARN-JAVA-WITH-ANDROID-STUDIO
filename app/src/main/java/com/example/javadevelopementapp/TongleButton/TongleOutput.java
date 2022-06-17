package com.example.javadevelopementapp.TongleButton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.example.javadevelopementapp.R;

public class TongleOutput extends AppCompatActivity {
    ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tongle_output);

        toggleButton = findViewById(R.id.ToggleButton);
        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleButton.isChecked()) {
                    Toast.makeText(TongleOutput.this, "Toggle ON", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(TongleOutput.this, "Toggle OFF", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}