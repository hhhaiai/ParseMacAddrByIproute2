package com.github.qiang.iproute2.parsemac;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

    static {
        System.loadLibrary("native-lib");
    }

    public native String parseMac();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button btn = new Button(this);
        btn.setText("mac");
        setContentView(btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = parseMac();
                Log.i("Q_M", "MAC:" + s);
            }
        });
    }


}