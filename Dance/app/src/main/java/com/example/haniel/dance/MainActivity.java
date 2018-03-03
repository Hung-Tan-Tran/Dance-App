package com.example.haniel.dance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    TextView Mylabel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Mylabel = (TextView) findViewById(R.id.tvLabel);
    }

    public void clickMe(View view){
        Mylabel.setText("Why did you click me!");
    }
}
