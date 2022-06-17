package com.example.javadevelopementapp.ContentMenu;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.javadevelopementapp.R;

public class ContentMenuOutput extends AppCompatActivity {
    ListView listView;
    String listItems[] = {"First item", "second item", "Third item", "Fourth item", "fifth item"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_menu_output);

        listView = findViewById(R.id.listview);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, listItems);
        listView.setAdapter(arrayAdapter);
        registerForContextMenu(listView);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Please select any Menu");
        menu.add(0, v.getId(), 0, "item 1");
        menu.add(0, v.getId(), 0, "item 2");
        menu.add(0, v.getId(), 0, "item 3");
        menu.add(0, v.getId(), 0, "item 4");
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if (item.getTitle() == "item 1") {
            Toast.makeText(this, "Item 1 Selected", Toast.LENGTH_SHORT).show();
        } else if (item.getTitle() == "item 2") {
            Toast.makeText(this, "Item 2 Selected", Toast.LENGTH_SHORT).show();

        } else if (item.getTitle() == "item 3") {
            Toast.makeText(this, "Item 3 Selected", Toast.LENGTH_SHORT).show();

        } else if (item.getTitle() == "item 4") {
            Toast.makeText(this, "Item 4 Selected", Toast.LENGTH_SHORT).show();

        } else {
            return false;
        }

        return true;

    }


}
