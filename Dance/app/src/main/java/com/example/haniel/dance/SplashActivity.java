package com.example.haniel.dance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

/**
 * Created by sergioperez on 3/3/18.
 */

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //switch from splash activity to main activity
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
