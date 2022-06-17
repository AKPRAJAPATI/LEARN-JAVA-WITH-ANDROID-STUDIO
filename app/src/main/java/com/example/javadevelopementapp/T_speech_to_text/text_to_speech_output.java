package com.example.javadevelopementapp.T_speech_to_text;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.javadevelopementapp.R;

public class text_to_speech_output extends AppCompatActivity {
    EditText textEditText;
    Button button;

    TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_to_speech_output);
        button = findViewById(R.id.Speechbtn);
        textEditText = findViewById(R.id.textToSpeechEditText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String speechText = textEditText.getText().toString();
                speech(speechText);
            }
        });

    }

    @Override
    protected void onDestroy() {
        if (textToSpeech != null) {
            textToSpeech.stop();
            textToSpeech.shutdown();
        }
        super.onDestroy();
    }

    private void speech(String speechText) {
        textToSpeech.speak(speechText, TextToSpeech.QUEUE_FLUSH, null);
    }
}