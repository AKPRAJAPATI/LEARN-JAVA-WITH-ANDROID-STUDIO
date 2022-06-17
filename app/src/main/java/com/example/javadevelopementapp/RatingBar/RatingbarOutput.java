package com.example.javadevelopementapp.RatingBar;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.javadevelopementapp.R;

public class RatingbarOutput extends AppCompatActivity {
    RatingBar rt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratingbar_output);
        rt = (RatingBar) findViewById(R.id.ratingBar);
        LayerDrawable stars = (LayerDrawable) rt.getProgressDrawable();
        stars.getDrawable(2).setColorFilter(Color.YELLOW, PorterDuff.Mode.SRC_ATOP);
    }

    public void Call(View v) {
        TextView t = (TextView) findViewById(R.id.textView2);
        t.setText("You Rated :" + String.valueOf(rt.getRating()));
    }
}