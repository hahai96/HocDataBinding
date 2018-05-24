package com.example.ha_hai.hocdatabinding;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.ha_hai.hocdatabinding.databinding.ActivityMainBinding;
import com.example.ha_hai.hocdatabinding.model.MainActivityPresenter;
import com.example.ha_hai.hocdatabinding.model.TemperatureData;

public class MainActivity extends AppCompatActivity implements MainActivityContact.View{

    private MyClickHandlers handlers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        MainActivityPresenter presenter = new MainActivityPresenter(this);
        TemperatureData temp = new TemperatureData("100");
        
        binding.setTemp(temp);
        binding.setPresenter(presenter);

        handlers = new MyClickHandlers();
        binding.setHandlers(handlers);
    }

    @Override
    public void showData(TemperatureData temperatureData) {
        Toast.makeText(this, temperatureData.getCelsius(), Toast.LENGTH_SHORT).show();
    }

    public class MyClickHandlers {
        public void listContactOnClick() {
            Intent intent = new Intent(MainActivity.this, ListContact.class);
            startActivity(intent);
        }
    }

}
