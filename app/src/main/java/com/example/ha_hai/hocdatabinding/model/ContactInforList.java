package com.example.ha_hai.hocdatabinding.model;

import android.databinding.ObservableArrayList;
import android.view.View;

import java.util.Observable;
import java.util.Random;

/**
 * Created by ha_hai on 4/13/2018.
 */

public class ContactInforList {

    public ObservableArrayList<Contact> list = new ObservableArrayList<>();
    private int totalContact = 500;

    Random random = new Random();

    public ContactInforList() {
        for (int i = 0; i < totalContact; i++) {
            Contact c = new Contact();
            String ten = "Ten " + i;
            String phone = "098";
            for (int p = 0; p < 7; p++) {
                phone += random.nextInt(10);
            }
            c.setName(ten);
            c.setPhone(phone);
            add(c);
        }
    }

    private void add(Contact c) {
        list.add(c);
    }

    public void add(View view) {
        String ten = "Ten " + (++totalContact);
        String phone = "098";
        for (int p = 0; p < 7; p++) {
            phone += random.nextInt(10);
        }
        Contact c = new Contact();
        c.setName(ten);
        c.setPhone(phone);
        add(c);
    }

    public void remove(View view) {
        if (!list.isEmpty()) {
            list.remove(0);
        }
    }

}
