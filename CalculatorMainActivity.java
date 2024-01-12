package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etFirstvalue,etSecondvalue;
    TextView tvAns;
    Button add,substract,multiply,divide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFirstvalue=findViewById(R.id.etFirstValue);
       etSecondvalue=findViewById(R.id.etSecoundValue);
       tvAns=findViewById(R.id.tvAnswer);
//
       add=findViewById(R.id.btnAddition);
       substract =findViewById(R.id.btnSubstraction);
       multiply=findViewById(R.id.btnMultiply);
       divide=findViewById(R.id.btnDivide);

     add.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             float firstvalue,secondvalue,ans;
             firstvalue=Float.parseFloat(etFirstvalue.getText().toString());
             secondvalue=Float.parseFloat(etSecondvalue.getText().toString());
              ans=firstvalue+secondvalue;
              tvAns.setText("Ans is ="+ans);
         }
     });

     substract.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             float firstvalue,secondvalue,ans;
             firstvalue=Float.parseFloat(etFirstvalue.getText().toString());
             secondvalue=Float.parseFloat(etSecondvalue.getText().toString());
             ans=firstvalue-secondvalue;
             tvAns.setText("Ans is ="+ans);
         }
     });

     multiply.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             float firstvalue,secondvalue,ans;
             firstvalue=Float.parseFloat(etFirstvalue.getText().toString());
             secondvalue=Float.parseFloat(etSecondvalue.getText().toString());
             ans=firstvalue*secondvalue;
             tvAns.setText("Ans is ="+ans);
         }
     });

     divide.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             float firstvalue,secondvalue,ans;
             firstvalue=Float.parseFloat(etFirstvalue.getText().toString());
             secondvalue=Float.parseFloat(etSecondvalue.getText().toString());
             ans=firstvalue/secondvalue;
             tvAns.setText("Ans is ="+ans);
         }
     });

//Thread is a java build_in class
//                We use thread where we want to do more than 1 work


//     12 46 - 2 7
//        Flat icon is a website to get a calculator logo.
//        Make gravity center to center the element.
//        when you use linear layout then don't move the image manually use  margin instead.
//  Introduction screen in android app

//        use layout center in parents to center the image in Relative layout or may be in other layouts.


//        16 38
//            17 48
    }
}