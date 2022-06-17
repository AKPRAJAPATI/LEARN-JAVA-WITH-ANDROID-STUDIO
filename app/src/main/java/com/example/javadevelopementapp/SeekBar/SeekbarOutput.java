package com.example.javadevelopementapp.SeekBar;

import androidx.appcompat.app.AppCompatActivity;
import com.example.javadevelopementapp.R;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.Toast;

public class SeekbarOutput extends AppCompatActivity {
    SeekBar seekbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar_output);
        seekbar = (SeekBar)findViewById(R.id.seekbar);

         seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
             @Override
             public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                 Toast.makeText(SeekbarOutput.this, "Seekbar value is "+i, Toast.LENGTH_SHORT).show();
             }

             @Override
             public void onStartTrackingTouch(SeekBar seekBar) {

             }

             @Override
             public void onStopTrackingTouch(SeekBar seekBar) {

             }
         });
    }
}