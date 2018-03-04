package com.example.haniel.dance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.*;

import java.util.ArrayList;
import java.util.List;


public class Explore extends AppCompatActivity {

    List<Video> lVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lVideo = Helper.getLinkArray(Helper.parseJson("test.json",this));

        RecyclerView myRecycler = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myadapter = new RecyclerViewAdapter(this, lVideo);
        myRecycler.setLayoutManager(new GridLayoutManager(this, 2));
        myRecycler.setAdapter(myadapter);
    }
}
