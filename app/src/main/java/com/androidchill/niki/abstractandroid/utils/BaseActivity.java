package com.androidchill.niki.abstractandroid.utils;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.ButterKnife;

/**
 * Created by NIKI on 10/19/2016.
 */

public abstract class BaseActivity extends Activity implements BaseInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(myView());
        ButterKnife.bind(this);
        activityCreated();
    }

    @Override
    protected void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
    }

    public abstract int myView();
    public abstract void activityCreated();
}