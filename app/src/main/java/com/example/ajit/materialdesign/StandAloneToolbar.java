package com.example.ajit.materialdesign;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

public class StandAloneToolbar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);
        Toolbar mToolbar =(Toolbar)findViewById(R.id.tool);
        mToolbar.setTitle("StandAlone");
        mToolbar.setSubtitle("Shopnfest");
        mToolbar.setNavigationIcon(R.drawable.ic_action_navigation);
        mToolbar.inflateMenu(R.menu.menu_main);
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP)
        {

            mToolbar.setElevation(10f);


        }
        mToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                String title = item.getTitle().toString();
                Toast.makeText(getApplicationContext(),""+title,Toast.LENGTH_LONG).show();
                switch (item.getItemId()){
                    case R.id.save:
                        //Perform something
                        break;
                    case R.id.setting:
                        //Perform Something
                    case R.id.mail:
                        break;
                }
                return true;
            }
        });


    }
}
