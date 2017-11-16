package com.example.student.db2017111602;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by student on 2017/11/16.
 */

public class MyAdapter extends BaseAdapter {
    Context context;
    public MyAdapter(Context context)
    {
        this.context = context;
    }
    @Override
    public int getCount() {
        return 5;
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
        TextView tv = new TextView(context);
        tv.setText("Hello World");
        return tv;
    }
}
