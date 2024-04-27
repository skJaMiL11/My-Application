package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class KobiList extends AppCompatActivity {

//    String[] kobis = {"Abrity", "Kazi Nazrul","Rabindranath","Abrity", "Kazi Nazrul","Rabindranath","Abrity", "Kazi Nazrul","Rabindranath"};
    String[] kobis;
    int[] images = {R.drawable.abrity,
            R.drawable.nazrul, R.drawable.rabi};
    String[] dob = {"1993","1899","1861"};
    ListView lstKobis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kobi_list);

        lstKobis = findViewById(R.id.lst_kobi);
        kobis = getResources().getStringArray(R.array.kobis);

        lstKobis.setAdapter(new CustomKobiAdapter
                (KobiList.this, kobis,dob,images));

//        lstKobis.setAdapter(new ArrayAdapter<String>
//                (KobiList.this, R.layout.item_kobi_list,R.id.txt_kobi_name,kobis));
        lstKobis.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(KobiList.this, kobis[position], Toast.LENGTH_LONG).show();
                Intent i=new Intent(KobiList.this, KobiDetails.class);
                i.putExtra("KobiName",kobis[position]);
                startActivity(i);
            }
        });


    }
}