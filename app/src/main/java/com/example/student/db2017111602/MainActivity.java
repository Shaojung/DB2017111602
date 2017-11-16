package com.example.student.db2017111602;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    MyAdapter adapter;
    CityData[] data = {
            new CityData("台北", "02"),
            new CityData("台中", "04"),
            new CityData("高雄", "07")
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.listView);
        adapter = new MyAdapter(MainActivity.this, data);
        lv.setAdapter(adapter);
    }
}
