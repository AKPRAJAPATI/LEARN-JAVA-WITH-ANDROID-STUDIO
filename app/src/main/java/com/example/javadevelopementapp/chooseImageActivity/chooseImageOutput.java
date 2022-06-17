package com.example.javadevelopementapp.chooseImageActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.javadevelopementapp.R;

public class chooseImageOutput extends AppCompatActivity {
    Uri IMAGE_URI;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_image_output);
        getSupportActionBar().hide();
         imageView = (ImageView) findViewById(R.id.imageviewakash);
    }

    public void chooseImage(View view) {
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType("image/*");
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivityForResult(intent, 100);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100 || resultCode == RESULT_OK && data!=null) {
            Uri selectedImageUri = data.getData();
            imageView.setImageURI(selectedImageUri);
        }
    }
}