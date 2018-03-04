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

        /*lVideo.add(new Video("The Scooby-Doo", "Categorie", "Something descriptive", R.drawable.logo));
        lVideo.add(new Video("Dabing", "Urban", "Something descriptive", R.drawable.logo));
        lVideo.add(new Video("Tango", "Latin", "Something descriptive", R.drawable.logo));
        lVideo.add(new Video("Robocop", "Hip-hop", "Something descriptive", R.drawable.logo));*/

        RecyclerView myRecycler = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myadapter = new RecyclerViewAdapter(this, lVideo);
        myRecycler.setLayoutManager(new GridLayoutManager(this, 3));
        myRecycler.setAdapter(myadapter);
    }

    public void clickMe(View view){

    }
}
