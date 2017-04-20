package com.example.ajit.materialdesign;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Actionbar(View view) {
        startActivity(new Intent(this,StandAloneToolbar.class));
    }

    public void Context(View view) {
        startActivity(new Intent(this,ContextualMenu.class));
    }

    public void StandAl(View view) {
        startActivity(new Intent(this,ActionBarToolbar.class));
    }
}
