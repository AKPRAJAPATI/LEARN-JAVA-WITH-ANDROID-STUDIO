package com.example.javadevelopementapp.copyActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.javadevelopementapp.R;

public class copyOutput extends AppCompatActivity {
EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_copy_output);
        editText = findViewById(R.id.copyEditTExt);
    }
    public void copyText(View view) {
        String edit = editText.getText().toString();
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Copied Text",edit);
        clipboard.setPrimaryClip(clip);
    }
}