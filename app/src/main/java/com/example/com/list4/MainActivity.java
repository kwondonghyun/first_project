package com.example.com.list4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> items = new ArrayList<>();
    CustomAdapter customAdapter;
    ListView list;
    EditText edit;
    Button button;
    Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.list);
        edit = findViewById(R.id.edit);
        button = findViewById(R.id.button);
        button = findViewById(R.id.reset);
        customAdapter = new CustomAdapter(items);
        list.setAdapter(customAdapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inp = edit.getText().toString();
                items.add(inp);
                customAdapter.notifyDataSetChanged();
                edit.setText("");
            }
        });

    }
}
