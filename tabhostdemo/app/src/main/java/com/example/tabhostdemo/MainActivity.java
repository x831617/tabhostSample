package com.example.tabhostdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends TabActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();

        TabSpec spec = tabHost.newTabSpec("t1");
        Intent it1 = new Intent(this,A1.class);

        spec.setContent(it1); //Setting the activity of t1
        spec.setIndicator("Tab 1");  // Naming the name of Tab
        tabHost.addTab(spec);

        TabSpec spec2 = tabHost.newTabSpec("t2");
        Intent it2 = new Intent(this,A2.class);

        spec2.setContent(it2);
        spec2.setIndicator("Tab 2");
        tabHost.addTab(spec2);

        TabSpec spec3 = tabHost.newTabSpec("t3");
        spec3.setContent(R.id.tab3);
        spec3.setIndicator("Tab 3");
        tabHost.addTab(spec3);

        tabHost.setCurrentTab(1); // Setting the default Tab
    }
}

