package com.example.student.db2017111602;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by student on 2017/11/16.
 */

public class MyAdapter extends BaseAdapter {
    Context context;
    CityData[] data;
    public MyAdapter(Context context, CityData[] data)
    {
        this.context = context;
        this.data = data;
    }
    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.myitem1, null);
        TextView tv = (TextView) v.findViewById(R.id.textView);
        tv.setText(data[position].cityname);
        return v;
    }
}
