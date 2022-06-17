package com.example.javadevelopementapp.Toasts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.javadevelopementapp.R;

public class positionToast extends AppCompatActivity {
    AppCompatButton PositionToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_position_toast);
        PositionToast = findViewById(R.id.positionToast);
        PositionToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toastTop = Toast.makeText(getApplicationContext(), "Position Top", Toast.LENGTH_SHORT);
                toastTop.setGravity(Gravity.TOP, 0, 0);

                Toast toastbottom = Toast.makeText(getApplicationContext(), "Position Bottom", Toast.LENGTH_SHORT);
                toastbottom.setGravity(Gravity.BOTTOM, 0, 0);

                Toast toastleft = Toast.makeText(getApplicationContext(), "Position Left", Toast.LENGTH_SHORT);
                toastleft.setGravity(Gravity.LEFT, 0, 0);

                Toast toastright = Toast.makeText(getApplicationContext(), "Position Right", Toast.LENGTH_SHORT);
                toastright.setGravity(Gravity.RIGHT, 0, 0);


            }
        });
    }
}
