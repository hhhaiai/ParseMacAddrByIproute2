package com.github.qiang.iproute2.parsemac;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    static {
        System.loadLibrary("native-lib");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public native String parseMac();

    public void click(View view) {
        String s = parseMac();
        Log.i("Q_M", "MAC:" + s);
    }
}