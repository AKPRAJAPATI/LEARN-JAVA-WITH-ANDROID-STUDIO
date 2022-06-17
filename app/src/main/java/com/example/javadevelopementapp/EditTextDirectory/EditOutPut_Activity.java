package com.example.javadevelopementapp.EditTextDirectory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.javadevelopementapp.R;

public class EditOutPut_Activity extends AppCompatActivity {
    EditText name, lastname;
    Button savebtn;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_out_put);

        textView = findViewById(R.id.textText);
        name = findViewById(R.id.editTextTextPersonName);
        lastname = findViewById(R.id.editTextTextPersonName2);
        savebtn = findViewById(R.id.button);

        savebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstname = name.getText().toString();
                String last_name = lastname.getText().toString();
                String fullname = firstname + " " + last_name;
                textView.setText(fullname);
            }
        });
    }
}