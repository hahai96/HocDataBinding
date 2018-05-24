package com.example.ha_hai.hocdatabinding.model;

import android.databinding.BindingAdapter;
import android.databinding.ObservableArrayList;
import android.widget.ListView;

/**
 * Created by ha_hai on 4/13/2018.
 */

public class ListBinder {
    @BindingAdapter("bind:items")
    public static void bindList(ListView listView, ObservableArrayList<Contact> list) {
        ListContactAdapter adapter = new ListContactAdapter(list);
        listView.setAdapter(adapter);
    }
}
