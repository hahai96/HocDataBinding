package com.example.ha_hai.hocdatabinding.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.ha_hai.hocdatabinding.BR;

/**
 * Created by ha_hai on 4/13/2018.
 */

public class TemperatureData extends BaseObservable {

    private String celsius;
    private String fahrenheit;

    public TemperatureData() {
    }

    public TemperatureData(String oelsius) {
        this.celsius = oelsius;
    }

    public TemperatureData(String oelsius, String fahrenheit) {
        this.celsius = oelsius;
        this.fahrenheit = fahrenheit;
    }

    @Bindable
    public String getCelsius() {
        return celsius;
    }

    @Bindable
    public void setCelsius(String celsius) {
        this.celsius = celsius;
        notifyPropertyChanged(BR.celsius);
    }

    @Bindable
    public String getFahrenheit() {
        return fahrenheit;
    }

    @Bindable
    public void setFahrenheit(String fahrenheit) {
        this.fahrenheit = fahrenheit;
        notifyPropertyChanged(BR.fahrenheit);
    }
}
