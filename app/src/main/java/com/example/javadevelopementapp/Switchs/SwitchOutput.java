package com.example.javadevelopementapp.Switchs;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.javadevelopementapp.R;

public class SwitchOutput extends AppCompatActivity {
    Switch aSwitch;
    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch_output);
        aSwitch = findViewById(R.id.switches);

        constraintLayout = findViewById(R.id.switchbackground);

        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b == true) {
                    constraintLayout.setBackgroundColor(getResources().getColor(R.color.background));
                } else {
                    constraintLayout.setBackgroundColor(getResources().getColor(R.color.white));
                }
            }
        });
    }
}