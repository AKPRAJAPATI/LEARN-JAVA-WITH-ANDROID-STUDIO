package com.example.javadevelopementapp.RadioButton;

import androidx.appcompat.app.AppCompatActivity;
import com.example.javadevelopementapp.R;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButtonOutput extends AppCompatActivity {
RadioGroup radioGroup;
RadioButton male,female,other;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button_output);

        radioGroup  = findViewById(R.id.redioGroup);
        male = findViewById(R.id.male);
        female = findViewById(R.id.female);
        other = findViewById(R.id.other);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.male:
                        Toast.makeText(RadioButtonOutput.this, "Male is checked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.female:
                        Toast.makeText(RadioButtonOutput.this, "female is checked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.other:
                        Toast.makeText(RadioButtonOutput.this, "other is checked", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}