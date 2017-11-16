package com.example.student.db2017111602;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    MyAdapter adapter;
    String[] data = {"Bob", "Mary", "John", "Jack", "May", "Jane"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.listView);
        adapter = new MyAdapter(MainActivity.this);
        lv.setAdapter(adapter);
    }
}
