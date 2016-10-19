package com.androidchill.niki.abstractandroid.activity;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.androidchill.niki.abstractandroid.R;
import com.androidchill.niki.abstractandroid.utils.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TestActivity extends BaseActivity {
    public static final String TAG = TestActivity.class.getSimpleName();

    @BindView(R.id.text_test)
    TextView textView;

    @Override
    public int myView() {
        return R.layout.activity_test;
    }

    @Override
    public void activityCreated() {

        //Activity Create
        Log.i(TAG, "Created");

        //Add String
        String hello = "Hello from " + TAG;

        //Print Text
        textView.setText(hello);
    }
}
