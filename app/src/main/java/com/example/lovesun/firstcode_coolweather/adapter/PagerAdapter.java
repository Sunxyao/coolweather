package com.example.lovesun.firstcode_coolweather.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;

import com.example.lovesun.firstcode_coolweather.fragment.WeatherFragment;

import java.util.List;

/**
 * Created by Love—Sun on 2017/6/7.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {
    private List<WeatherFragment> fragmentList;
    private ViewPager viewPager;

    public PagerAdapter(FragmentManager fm,List<WeatherFragment> fragmentList,ViewPager viewPager) {
        super(fm);
        this.fragmentList = fragmentList;
        this.viewPager = viewPager;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Override
    public int getItemPosition(Object object) {
        return PagerAdapter.POSITION_NONE;
    }
}
