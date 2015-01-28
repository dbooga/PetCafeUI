package com.teampetcafe.petcafeui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.teampetcafe.petcafeui.FragmentBlog1;
import com.teampetcafe.petcafeui.FragmentBlog2;
import com.teampetcafe.petcafeui.FragmentBlog3;
 
public class TabsPagerAdapter extends FragmentPagerAdapter {
 
    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }
 
    @Override
    public Fragment getItem(int index) {
 
        switch (index) {
        case 0:
            // Top Rated fragment activity
            return new FragmentBlog1();
        case 1:
            // Games fragment activity
            return new FragmentBlog2();
        case 2:
            // Movies fragment activity
            return new FragmentBlog3();
        }
 
        return null;
    }
 
    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 3;
    }
 
}