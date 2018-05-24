package com.example.ha_hai.hocdatabinding.model;

import com.example.ha_hai.hocdatabinding.MainActivityContact;

/**
 * Created by ha_hai on 4/13/2018.
 */

public class MainActivityPresenter {

    private MainActivityContact.View view;

    public MainActivityPresenter(MainActivityContact.View view) {
        this.view = view;
    }

    public void onShowData(TemperatureData temperatureData) {
        this.view.showData(temperatureData);
    }
}
