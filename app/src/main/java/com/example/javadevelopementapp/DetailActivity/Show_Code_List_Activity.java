package com.example.javadevelopementapp.DetailActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Base64;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.javadevelopementapp.Output_Activity;
import com.example.javadevelopementapp.R;
import com.protectsoft.webviewcode.Codeview;
import com.protectsoft.webviewcode.Settings;

public class Show_Code_List_Activity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_detail);
        getSupportActionBar().hide();
        textView = findViewById(R.id.textview);
        WebView webview = (WebView) findViewById(R.id.webview);

        String java = getIntent().getStringExtra("java_work");
        String xml = getIntent().getStringExtra("xml_work");
        String manifest = getIntent().getStringExtra("manifesting");
        String sqliteDatabase = getIntent().getStringExtra("sqliteDatabase");
        String build_gradle = getIntent().getStringExtra("build_gradle");



        if (java != null && java.equals("java_work")) {
            webview.setVisibility(View.VISIBLE);
            textView.setVisibility(View.GONE);
            String code = getIntent().getStringExtra("codingMain");
            Codeview.with(getApplicationContext()).withCode(code).into(webview);
        } else if (xml != null && xml.equals("xml_work")) {

            webview.setVisibility(View.GONE);
            textView.setVisibility(View.VISIBLE);
            textView.setMovementMethod(new ScrollingMovementMethod());
            String code = getIntent().getStringExtra("codingXml");
            textView.setText(code);

        } else if (manifest != null && manifest.equals("manifesting")) {
            webview.setVisibility(View.GONE);
            textView.setVisibility(View.VISIBLE);
            textView.setMovementMethod(new ScrollingMovementMethod());
            String code = getIntent().getStringExtra("manifest");
            textView.setText(code);

        } else if (sqliteDatabase != null && sqliteDatabase.equals("sqliteDatabase")) {

            textView.setMovementMethod(new ScrollingMovementMethod());
            webview.setVisibility(View.VISIBLE);
            textView.setVisibility(View.GONE);
            String code = getIntent().getStringExtra("sql");
            Codeview.with(getApplicationContext()).withCode(code).into(webview);



        } else {
            webview.setVisibility(View.GONE);
            textView.setVisibility(View.VISIBLE);
            textView.setMovementMethod(new ScrollingMovementMethod());
            String code = getIntent().getStringExtra("build");
            textView.setText(code);

        }
    }

}