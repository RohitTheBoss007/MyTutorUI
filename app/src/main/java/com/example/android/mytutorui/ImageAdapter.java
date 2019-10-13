package com.example.android.mytutorui;

import android.content.Context;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {




    private Context mContext;
    public int[] imageArray={
            R.drawable.rectangle_1,
            R.drawable.rectangle_copy,
            R.drawable.rectangle_copy_2,
            R.drawable.rectangle_copy_2_1,
            R.drawable.rectangle_copy_2_2,
            R.drawable.rectangle_copy_3,
            R.drawable.rectangle_copy_3_1,
            R.drawable.rectangle_copy_4
    };

    public ImageAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return imageArray.length;
    }

    @Override
    public Object getItem(int position) {
        return imageArray[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView=new ImageView(mContext);
        imageView.setImageResource(imageArray[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(200,200));
        return imageView;
    }
}

