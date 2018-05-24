package com.example.ha_hai.hocdatabinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ha_hai.hocdatabinding.databinding.ActivityListContactBinding;
import com.example.ha_hai.hocdatabinding.model.ContactInforList;
import com.example.ha_hai.hocdatabinding.model.ListHeading;

public class ListContact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_contact);

        ActivityListContactBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_list_contact);
        ListHeading heading = new ListHeading("Danh sach contact");
        binding.setHeading(heading);

        ContactInforList inforList = new ContactInforList();
        binding.setInfors(inforList);
    }
}
