package com.angus.topdemo;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.angus.topdemo.adapters.ClassifyAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ViewPager pager = (ViewPager) findViewById(R.id.main_pager);
        pager.setAdapter(new ClassifyAdapter(getSupportFragmentManager()));
        TabLayout tab = (TabLayout) findViewById(R.id.main_tab);
        tab.setupWithViewPager(pager);
    }
}
