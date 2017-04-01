package com.example.adityasi.justjava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private EditText input;
    private TextView result;
    double n1=0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        input = (EditText) findViewById(R.id.input);
        result = (TextView) findViewById(R.id.result);

        Button sqr= (Button) findViewById(R.id.button2);
        Button sqrt= (Button) findViewById(R.id.button3);
        Button log= (Button) findViewById(R.id.button4);
        Button sin= (Button) findViewById(R.id.button5);
        Button cos= (Button) findViewById(R.id.button6);
        Button tan= (Button) findViewById(R.id.button7);
        Button asin= (Button) findViewById(R.id.button8);
        Button acos= (Button) findViewById(R.id.button9);
        Button atan= (Button) findViewById(R.id.button10);
        Button sinh= (Button) findViewById(R.id.button11);
        Button cosh= (Button) findViewById(R.id.button13);
        Button tanh= (Button) findViewById(R.id.button14);

        sqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                double n1 = Double.valueOf(input.getText().toString());


                result.setText("The result is: \n" + (n1*n1));
            }
        });
        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                n1 = Double.valueOf(input.getText().toString());


                result.setText("The result is: \n" + Math.sqrt(n1));
            }
        });
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                 n1 = Double.valueOf(input.getText().toString());


                result.setText("The result is: \n" + Math.log(n1));
            }
        });
        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                 n1 = Double.valueOf(input.getText().toString());


                result.setText("The result is: \n" + Math.sin(n1));
            }
        });
        sinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                 n1 = Double.valueOf(input.getText().toString());


                result.setText("The result is: \n" + Math.sinh(n1));
            }
        });
        asin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                 n1 = Double.valueOf(input.getText().toString());


                result.setText("The result is: \n" + Math.asin(n1));
            }
        });
        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                 n1 = Double.valueOf(input.getText().toString());


                result.setText("The result is: \n" + Math.cos(n1));

            }
        });
        cosh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                 n1 = Double.valueOf(input.getText().toString());


                result.setText("The result is: \n" + Math.cosh(n1));

            }
        });
        acos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                 n1 = Double.valueOf(input.getText().toString());


                result.setText("The result is: \n" + Math.acos(n1));

            }
        });
        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                 n1 = Double.valueOf(input.getText().toString());


                result.setText("The result is: \n" + Math.tan(n1));

            }
        });
        tanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                 n1 = Double.valueOf(input.getText().toString());


                result.setText("The result is: \n" + Math.tanh(n1));

            }
        });
        atan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                 n1 = Double.valueOf(input.getText().toString());


                result.setText("The result is: \n" + Math.atan(n1));

            }
        });



    }


}
