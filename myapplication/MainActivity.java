package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnOne, btnTwo, btnThree, btnFour;
    TextView txtS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);

        btnOne = findViewById(R.id.btn_one);
        btnTwo = findViewById(R.id.btn_two);
        btnThree = findViewById(R.id.btn_three);
        btnFour = findViewById(R.id.btn_four);
        txtS = findViewById(R.id.txt_screen);


        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
//        btnOne.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String input = txtS.getText().toString();
//                txtS.setText(input +"1");
//            }
//        });
//
//        btnTwo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String input = txtS.getText().toString();
//                txtS.setText(input +"2");
//            }
//        });
    }

    @Override
    public void onClick(View v) {
        String input = txtS.getText().toString();
//        if (v.getId() == R.id.btn_one){
//            txtS.setText(input + "1");
//        }else if(v.getId() == R.id.btn_two){
//            txtS.setText(input + "2");
//        }

        if (v.getId() == R.id.btn_one) {
        }
    }
}