package com.liqg.jitpacktest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.liqg.jitpacklibrary.LiTest;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LiTest liTest=new LiTest();
        Log.d("MainActivity", liTest.getName());
    }
}
