package com.example.lovesun.firstcode_coolweather.test;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

import java.util.List;

/**
 * Created by Love—Sun on 2017/6/5.
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    private List<BlankFragment> fragmentList;
    private ViewPager pager;
    public ViewPagerAdapter(FragmentManager fm,List<BlankFragment> fragmentList,ViewPager pager) {
        super(fm);
        this.fragmentList = fragmentList;
        this.pager = pager;
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

    public void addFragment(BlankFragment fragment){
        fragmentList.add(fragment);
        this.notifyDataSetChanged();
        pager.setCurrentItem(fragmentList.size(),false);
        pager.setOffscreenPageLimit(fragmentList.size());
    }
}
