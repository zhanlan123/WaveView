package com.example.haoruan.myapplication;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class MainActivity extends FragmentActivity {

    private CustomizeView hhview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        hhview = (CustomizeView) findViewById(R.id.yuan);


    }
}
