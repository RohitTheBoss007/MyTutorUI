package com.example.android.mytutorui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerViewAdapter extends FragmentPagerAdapter {
    public PagerViewAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch(i)
        {
            case 0:
                PopularCoursesFragment pcFragment=new PopularCoursesFragment();
                return pcFragment;
            case 1:
                VideosFragment vidFragment=new VideosFragment();
                return vidFragment;
            case 2:
                InspirationFragment inspirationFragment=new InspirationFragment();
                return inspirationFragment;
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
