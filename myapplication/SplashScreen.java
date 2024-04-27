package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

public class SplashScreen extends AppCompatActivity {

    LinearLayout llSplash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Log.e("SHUVO","OnCreate");

        llSplash = findViewById(R.id.ll_splash);
        llSplash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SplashScreen.this, KobiList.class);
                startActivity(i);
            }
        });

        Thread th = new Thread(){
            @Override
            public void run() {
                super.run();
//
//                try {
////                    sleep(3000);
////                    startActivity(new Intent(SplashScreen.this, MainActivity.class));
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
            }
        };



        th.start();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("SHUVO","OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("SHUVO","OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("SHUVO","OnPause");
        finish();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("SHUVO","OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("SHUVO","OnDestroy");
    }
}