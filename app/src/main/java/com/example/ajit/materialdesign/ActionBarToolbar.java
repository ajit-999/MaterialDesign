package com.example.ajit.materialdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class ActionBarToolbar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);
        Toolbar mToolbar =(Toolbar)findViewById(R.id.tool);
        setSupportActionBar(mToolbar);

        getSupportActionBar().setTitle("Action Bar Toolbar");
        mToolbar.setSubtitle("By Shopnfest");


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String msg = "";
        switch (item.getItemId()){
            case R.id.save:
                msg =getString(R.string.save);
                break;
            case R.id.mail:
                msg =getString(R.string.mail);
                break;
            case R.id.setting:
                msg = getString(R.string.setting);
                break;
            case R.id.help:
                msg = getString(R.string.Help);
                break;
        }
        Toast.makeText(this,""+msg,Toast.LENGTH_LONG).show();

        return super.onOptionsItemSelected(item);
    }
}
