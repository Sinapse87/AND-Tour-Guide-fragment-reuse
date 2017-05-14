package com.example.udacity.tourguide;

import com.example.udacity.tourguide.adapters.TabFragmentPagerAdapter;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null)
            getSupportActionBar().setTitle(getString(R.string.app_name));

        ViewPager pager = (ViewPager)findViewById(R.id.pager);
        TabLayout tabs = (TabLayout)findViewById(R.id.tabs);

        pager.setAdapter(new TabFragmentPagerAdapter(getSupportFragmentManager()));

        tabs.setTabTextColors(Color.BLACK, ResourcesCompat.getColor(getResources(), android.R.color.white, null));


        tabs.setupWithViewPager(pager);
    }
}
