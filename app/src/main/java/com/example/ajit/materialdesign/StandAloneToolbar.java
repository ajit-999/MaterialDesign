package com.example.ajit.materialdesign;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class StandAloneToolbar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);
        Toolbar mToolbar =(Toolbar)findViewById(R.id.tool);
        mToolbar.setTitle("StandAlone");
        mToolbar.setSubtitle("Shopnfest");
        mToolbar.setNavigationIcon(R.drawable.navi);
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP)
        {

            mToolbar.setElevation(10f);

        }


    }
}
