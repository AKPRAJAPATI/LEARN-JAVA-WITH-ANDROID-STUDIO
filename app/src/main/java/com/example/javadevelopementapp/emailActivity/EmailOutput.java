package com.example.javadevelopementapp.emailActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.javadevelopementapp.R;

public class EmailOutput extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_output);
    }

    public void emailSend(View view) {
        Intent email = new Intent(Intent.ACTION_SEND);
        email.setData(Uri.parse("Email"));
        String[] mail = {"akp97583757@gmail.com", "akp97583757@gmail.com"};
        email.putExtra(Intent.EXTRA_EMAIL, mail);
        email.putExtra(Intent.EXTRA_SUBJECT, "Enter suject here");
        email.putExtra(Intent.EXTRA_TEXT, "Enter text here");
        email.setType("message/rfc822");
        Intent intent = Intent.createChooser(email, "start Email");
        startActivity(intent);
    }
}