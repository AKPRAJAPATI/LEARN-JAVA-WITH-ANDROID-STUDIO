package com.example.javadevelopementapp.sqliteDatabase;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.javadevelopementapp.R;

public class sqliteDatbaseOutput extends AppCompatActivity implements View.OnClickListener {
    EditText id, name, village, post;
    Button insert, delete, update, read;
    sqliteDatabaseOpenHelper sqliteDatabaseOpenHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlite_datbase_output);

        id = findViewById(R.id.sqliteId);
        name = findViewById(R.id.sqliteName);
        village = findViewById(R.id.sqlitevillage);
        post = findViewById(R.id.sqlitepost);

        insert = findViewById(R.id.insertData);
        delete = findViewById(R.id.deleteData);
        update = findViewById(R.id.updateData);
        read = findViewById(R.id.readData);


        insert.setOnClickListener(this);
        delete.setOnClickListener(this);
        update.setOnClickListener(this);
        read.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.insertData:
                if (name.getText().toString().isEmpty()) {
                    Toast.makeText(this, "name is empty", Toast.LENGTH_SHORT).show();
                } else if (village.getText().toString().isEmpty()) {
                    Toast.makeText(this, "Village is empty", Toast.LENGTH_SHORT).show();
                } else if (post.getText().toString().isEmpty()) {
                    Toast.makeText(this, "Post is emtpy", Toast.LENGTH_SHORT).show();
                } else {
                    String insertData = sqliteDatabaseOpenHelper.insertOurData(name.getText().toString(), village.getText().toString(), post.getText().toString());
                    Toast.makeText(this, "Data inserted", Toast.LENGTH_SHORT).show();
                    id.setText("");
                    name.setText("");
                    village.setText("");
                    post.setText("");
                }

                break;

            case R.id.deleteData:
                String ids = id.getText().toString();
                Integer deleteRow = sqliteDatabaseOpenHelper.deleteDatai(ids);
                if (deleteRow > 0) {
                    Toast.makeText(this, "Data deleted", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(this, "Data not deleted", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.updateData:
                if (name.getText().toString().isEmpty()) {
                    Toast.makeText(this, "name is empty", Toast.LENGTH_SHORT).show();
                } else if (village.getText().toString().isEmpty()) {
                    Toast.makeText(this, "Village is empty", Toast.LENGTH_SHORT).show();
                } else if (post.getText().toString().isEmpty()) {
                    Toast.makeText(this, "Post is emtpy", Toast.LENGTH_SHORT).show();
                } else {
                    String insertData = sqliteDatabaseOpenHelper.updateData(id.getText().toString(), name.getText().toString(), village.getText().toString(), post.getText().toString());
                    Toast.makeText(this, "Data Updated", Toast.LENGTH_SHORT).show();
                    id.setText("");
                    name.setText("");
                    village.setText("");
                    post.setText("");
                }
                break;
            case R.id.readData:
                /*  I will changes in future this application this application is so long size sorry bro */
                break;
        }
    }
}