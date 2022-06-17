package com.example.javadevelopementapp.TextSiwtcher;

import androidx.appcompat.app.AppCompatActivity;

import com.example.javadevelopementapp.MainActivity;
import com.example.javadevelopementapp.R;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

public class textSwitcherOutput extends AppCompatActivity {
    private TextSwitcher textSwitcher;
    private Button nextButton;
    private int index = 0;
    private String[] arr = { "AKASH KUMAR", "ANDROID", "BIKASH", "SACHIN", "MAYANK", "ARPIT", "MORE" };
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_switcher_output);
        textSwitcher = findViewById(R.id.textSwitcher);
        nextButton = findViewById(R.id.button);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index == arr.length - 1) {
                    index = 0;
                    textSwitcher.setText(arr[index]);
                }
                else {
                    textSwitcher.setText(arr[++index]);
                }
            }
        });


        textSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
                    @Override
                    public View makeView()
                    {
                        textView = new TextView(textSwitcherOutput.this);
                        textView.setTextColor(Color.parseColor("#219806"));
                        textView.setTextSize(40);textView.setGravity(Gravity.CENTER_HORIZONTAL);
                        return textView;
                    }
                });
        textSwitcher.setText(arr[index]);
    }
}