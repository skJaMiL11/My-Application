package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class KobiDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kobi_details);
        Intent i=getIntent();
        String kobi_name=i.getStringExtra("KobiName");
        getSupportActionBar().setTitle(kobi_name);
    }
}