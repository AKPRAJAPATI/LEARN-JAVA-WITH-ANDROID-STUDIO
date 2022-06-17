package com.example.javadevelopementapp.ImplictIntent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.javadevelopementapp.R;

public class EmplictOutput extends AppCompatActivity {
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emplict_output);
        editText = findViewById(R.id.editTextTextPersonName3);
        button = findViewById(R.id.button3search);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String searchEdit = editText.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://"+searchEdit));
                startActivity(intent);

            }
        });
    }
}