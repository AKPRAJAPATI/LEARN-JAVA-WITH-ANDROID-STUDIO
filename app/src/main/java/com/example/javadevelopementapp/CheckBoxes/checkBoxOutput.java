package com.example.javadevelopementapp.CheckBoxes;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.javadevelopementapp.R;

public class checkBoxOutput extends AppCompatActivity {

    CheckBox first, second, third;
    Button check;
    boolean checked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box_output);

        first = findViewById(R.id.firstCheckBox);
        second = findViewById(R.id.secondCheckBox);
        third = findViewById(R.id.thirdCheckBox);
        check = findViewById(R.id.ckeckCheckBox);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (first.isChecked()) {
                    Toast.makeText(checkBoxOutput.this, "First is checked", Toast.LENGTH_SHORT).show();
                } else if (second.isChecked()) {
                    Toast.makeText(checkBoxOutput.this, "second is checked", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(checkBoxOutput.this, "Third is checked", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}