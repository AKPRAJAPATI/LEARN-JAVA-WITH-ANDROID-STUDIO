package com.example.javadevelopementapp.ExplictIntent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.javadevelopementapp.R;

public class ExplictOutput extends AppCompatActivity {
    //intent activity to clicked the button
    ConstraintLayout constraintLayout;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explict_output);
        constraintLayout = findViewById(R.id.constaraintLayout);
        button = findViewById(R.id.button2);

    }

    public void gotonewActivity(View view) {
        if (getIntent().getStringExtra("hide") != null && getIntent().getStringExtra("hide").equals("hide")) {
            constraintLayout.setBackgroundColor(getResources().getColor(R.color.background));
            button.setVisibility(View.GONE);
        } else {
            Intent intent = new Intent(getApplicationContext(), ExplictOutput.class);
            intent.putExtra("hide", "hide");
            startActivity(new Intent(intent));
        }
    }
}