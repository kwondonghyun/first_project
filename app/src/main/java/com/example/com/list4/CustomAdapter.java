package com.example.com.list4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
    ArrayList<String> items = new ArrayList<>();

    public CustomAdapter(ArrayList<String> items) {
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.diary,null);
        TextView diary = (TextView) v.findViewById(R.id.content);
        diary.setText(items.get(position));
        return v;
    }
}
