package com.example.lovesun.firstcode_coolweather;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.lovesun.firstcode_coolweather.test.BlankFragment;
import com.example.lovesun.firstcode_coolweather.test.ViewPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class TestActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private List<BlankFragment> fragmentList;
    private ViewPagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        fragmentList = new ArrayList<>();
        BlankFragment fragment = new BlankFragment("第一个");
        fragmentList.add(fragment);
        adapter = new ViewPagerAdapter(getSupportFragmentManager(),fragmentList,viewPager);
        viewPager.setAdapter(adapter);
    }


    public void addFragment(View view) {
        BlankFragment fragment = new BlankFragment("第二个");
        adapter.addFragment(fragment);
    }
}
