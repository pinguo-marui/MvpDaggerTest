package com.okry.mvpdaggertest;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.okry.mvpdaggertest.weather.WeatherFragment;


public class WeatherBoardActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_container);
        if (savedInstanceState == null) {
            WeatherFragment fragment = new WeatherFragment();
            getFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
        }
    }

}
