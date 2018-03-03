package com.example.haniel.dance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import java.util.ArrayList;


public class Explore extends AppCompatActivity {
    TextView Mylabel;
    ArrayList<Link> test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Mylabel = (TextView) findViewById(R.id.tvLabel);
    }

    public void clickMe(View view){
        Mylabel.setText(test.toString());

    }
}
