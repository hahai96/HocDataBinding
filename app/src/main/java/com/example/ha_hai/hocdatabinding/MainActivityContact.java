package com.example.ha_hai.hocdatabinding;

import com.example.ha_hai.hocdatabinding.model.TemperatureData;

/**
 * Created by ha_hai on 4/13/2018.
 */

public interface MainActivityContact {

    public interface Presenter {
        void onShowData(TemperatureData temperatureData);
    }

    public interface View {
        void showData(TemperatureData temperatureData);
    }
}
