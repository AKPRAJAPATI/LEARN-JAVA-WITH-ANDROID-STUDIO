package com.example.javadevelopementapp.whatsappActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.javadevelopementapp.R;

public class whatsappOutput extends AppCompatActivity {
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whatsapp_output);
        editText = findViewById(R.id.editTextTextPersonName4);
    }
    public void sendWhatsapp(View view) {
    String text = editText.getText().toString();
        Intent waIntent = new Intent(Intent.ACTION_SEND);
        waIntent.setType("text/plain");
        waIntent.setPackage("com.whatsapp");
        waIntent.putExtra(Intent.EXTRA_TEXT, text);
        startActivity(Intent.createChooser(waIntent, "Share with"));
    }
}