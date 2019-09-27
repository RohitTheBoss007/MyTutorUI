package com.example.android.mytutorui;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ViewPagerAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;
    Integer [] images={R.drawable.tiger,R.drawable.slide_xhdpi,R.drawable.slide_xhdpi};
    @Override
    public int getCount() {
        return images.length;
    }

    public ViewPagerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view==o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
         View view=layoutInflater.inflate(R.layout.custom_layout, null);
         ImageView imageView=view.findViewById(R.id.slideImage);
         imageView.setImageResource(images[position]);

        ViewPager vp=(ViewPager)container;
        vp.addView(view,0);
        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ViewPager vp=(ViewPager)container;
        View view=(View)object;
        vp.removeView(view);
    }
}
