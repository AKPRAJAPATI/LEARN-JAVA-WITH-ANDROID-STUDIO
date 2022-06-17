package com.example.javadevelopementapp.ImageSwitcher;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

import com.example.javadevelopementapp.R;

public class ImageSwitcherOutput extends AppCompatActivity {
    ImageView btPrevious, btNext;
    ImageSwitcher imageSwitcher;

    int imageList[] = {R.drawable.java_png, R.drawable.java_d, R.drawable.java_c, R.drawable.java_a, R.drawable.java_b};
    int currentIndex = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_switcher_output);
        btPrevious = findViewById(R.id.bt_previous);
        btNext = findViewById(R.id.bt_next);
        imageSwitcher = findViewById(R.id.image_switcher);
        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
                return imageView;

            }
        });

        btNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentIndex < imageList.length - 1) {
                    currentIndex = currentIndex + 1;
                    imageSwitcher.setImageResource(imageList[currentIndex]);
                }
            }
        });
        btPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentIndex > 0) {
                    currentIndex = currentIndex - 1;
                    imageSwitcher.setImageResource(imageList[currentIndex]);
                }
            }
        });
    }
}