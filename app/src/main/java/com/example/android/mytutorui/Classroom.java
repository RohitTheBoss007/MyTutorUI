package com.example.android.mytutorui;

import android.graphics.Color;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Classroom extends AppCompatActivity {
    ViewPager mMainPager;
    PagerViewAdapter mPagerViewAdapter;
    TextView mCoursesLabel;
    TextView mVidsLabel;
    TextView mInspirationLabel;
    LinearLayout dash,dash2,dash3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dxc);
        mMainPager=findViewById(R.id.mainPager);
        mMainPager.setOffscreenPageLimit(2);
        mPagerViewAdapter=new PagerViewAdapter(getSupportFragmentManager());
        mCoursesLabel=findViewById(R.id.coursesLabel);
        mVidsLabel=findViewById(R.id.vidLabel);
        mInspirationLabel=findViewById(R.id.inspLabel);
        dash=findViewById(R.id.dash);
        dash2=findViewById(R.id.dash2);
        dash3=findViewById(R.id.dash3);

        mCoursesLabel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMainPager.setCurrentItem(0);
            }
        });

        mVidsLabel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMainPager.setCurrentItem(1);
            }
        });
        mInspirationLabel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMainPager.setCurrentItem(2);
            }
        });
        mMainPager.setAdapter(mPagerViewAdapter);
        mMainPager.setOffscreenPageLimit(2);
        mMainPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                changeTabs(i);
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });



    }

    private void changeTabs(int i) {

        if(i==0)
        {
            mCoursesLabel.setTextColor(Color.parseColor("#444444"));
            mCoursesLabel.setTextSize(18);
            dash.setVisibility(View.VISIBLE);

            mVidsLabel.setTextColor(Color.parseColor("#999999"));
            mVidsLabel.setTextSize(16);
            dash2.setVisibility(View.GONE);


            mInspirationLabel.setTextColor(Color.parseColor("#999999"));
            mInspirationLabel.setTextSize(16);
            dash3.setVisibility(View.GONE);


        }
        if(i==1)
        {

            mCoursesLabel.setTextColor(Color.parseColor("#999999"));
            mCoursesLabel.setTextSize(16);
            dash.setVisibility(View.GONE);

            mVidsLabel.setTextColor(Color.parseColor("#444444"));
            mVidsLabel.setTextSize(18);
            dash2.setVisibility(View.VISIBLE);


            mInspirationLabel.setTextColor(Color.parseColor("#999999"));
            mInspirationLabel.setTextSize(16);
            dash3.setVisibility(View.GONE);

        }
        if(i==2)
        {

            mCoursesLabel.setTextColor(Color.parseColor("#999999"));
            mCoursesLabel.setTextSize(16);
            dash.setVisibility(View.GONE);

            mVidsLabel.setTextColor(Color.parseColor("#999999"));
            mVidsLabel.setTextSize(16);
            dash2.setVisibility(View.GONE);


            mInspirationLabel.setTextColor(Color.parseColor("#444444"));
            mInspirationLabel.setTextSize(18);
            dash3.setVisibility(View.VISIBLE);


        }


    }
}
