package com.androidchill.niki.abstractandroid.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.androidchill.niki.abstractandroid.R;
import com.androidchill.niki.abstractandroid.utils.BaseActivity;
import com.androidchill.niki.abstractandroid.utils.BaseActivityCompat;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivityCompat {
    public static final String TAG = MainActivity.class.getSimpleName();

    @BindView(R.id.text_main)
    TextView textView;

    @BindView(R.id.button_main)
    Button btn_main;

    @Override
    public int myView() {
        return R.layout.activity_main;
    }

    @Override
    public void activityCreated() {

        //Activity Create
        Log.i("MainActivity", "Created");

        //Add String
        String hello = "Hello from " + TAG;

        //Print Text
        textView.setText(hello);

        //Set Listener lambda
        btn_main.setOnClickListener(v -> {

            //Create Intent
            Intent i = new Intent(this, TestActivity.class);

            //Start Intent
            startActivity(i);
        });
    }
}
