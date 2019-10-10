package com.example.android.mytutorui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MediaGridActivity extends AppCompatActivity {

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_grid);
        gridView=findViewById(R.id.grid_view);
        gridView.setAdapter(new ImageAdapter(this));

    }
}
