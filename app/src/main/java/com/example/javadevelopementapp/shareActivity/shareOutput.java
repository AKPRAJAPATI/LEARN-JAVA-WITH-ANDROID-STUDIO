package com.example.javadevelopementapp.shareActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.javadevelopementapp.R;

public class shareOutput extends AppCompatActivity {

    String shayari = "जिसे कोयल समझा वो कौवा निकला,\n" +
            "दोस्ती के नाम पर हौवा निकला,\n" +
            "जो रोकते थे हमें शराब पीने से,\n" +
            "आज उन्हीं की जेब में पौवा निकला।";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_output);
    }

    public void shareText(View view) {
        Intent whatsappIntent = new Intent(Intent.ACTION_SEND);
        whatsappIntent.setType("text/plain");
        whatsappIntent.setPackage("com.whatsapp");
        whatsappIntent.putExtra(Intent.EXTRA_TEXT, shayari);
        try {
            startActivity(whatsappIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(this, "WhatsApp not installed" + ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}