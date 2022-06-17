package com.example.javadevelopementapp.valuePassActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.javadevelopementapp.R;

public class valueVassOutput extends AppCompatActivity {
EditText firstname,lastname;
Button sendButton;

TextView first_name,last_name;
LinearLayout linearLayout; //not for you

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_value_vass_output);
        firstname = findViewById(R.id.firstname);
        lastname = findViewById(R.id.lastname);
        sendButton = findViewById(R.id.sendData);

        first_name = findViewById(R.id.name);
        last_name = findViewById(R.id.lastnameTExtview);



        linearLayout = findViewById(R.id.linearlayoutakash);

        String hidation = getIntent().getStringExtra("hide") ;
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getIntent().getStringExtra("hide")!=null && getIntent().getStringExtra("hide").equals(hidation)){
                    firstname.setVisibility(View.GONE);
                    lastname.setVisibility(View.GONE);
                    sendButton.setVisibility(View.GONE);
                    linearLayout.setVisibility(View.VISIBLE);
                    first_name.setText(getIntent().getStringExtra("first"));
                    last_name.setText(getIntent().getStringExtra("last"));

                }else{
                    String firstnam = firstname.getText().toString();
                    String lastnam = lastname.getText().toString();
                    Intent intent = new Intent(getApplicationContext(),valueVassOutput.class);
                    intent.putExtra("hide","hide");  //this is only to me not for you
                    intent.putExtra("first",firstnam);
                    intent.putExtra("last",lastnam);
                    startActivity(intent);
                    finish();
                    firstname.setVisibility(View.VISIBLE);
                    lastname.setVisibility(View.VISIBLE);
                    linearLayout.setVisibility(View.GONE);
                }
            }
        });

    }
}