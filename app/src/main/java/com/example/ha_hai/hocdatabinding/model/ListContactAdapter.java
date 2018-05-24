package com.example.ha_hai.hocdatabinding.model;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.ha_hai.hocdatabinding.R;
import com.example.ha_hai.hocdatabinding.databinding.ItemBinding;

/**
 * Created by ha_hai on 4/13/2018.
 */

public class ListContactAdapter extends BaseAdapter {

    private ObservableArrayList<Contact> list;
    private LayoutInflater inflater;

    public ListContactAdapter(ObservableArrayList<Contact> list) {
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (inflater == null) {
            inflater = (LayoutInflater) viewGroup.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        ItemBinding binding = DataBindingUtil.inflate(inflater, R.layout.item, viewGroup, false);
        binding.setInfo(list.get(i));
        return binding.getRoot();
    }
}
