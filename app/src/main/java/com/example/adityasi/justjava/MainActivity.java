package com.example.adityasi.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.widget.EditText;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {                  //basic starting





    private EditText input1;
    private EditText input2;
    private TextView tv_result;
    double n1=0.0;
    double n2=0.0;


    @Override
    public void onCreate(Bundle savedInstanceState) {             //you are extending so you have to overrride
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);                    //again basic

                     //this is again basic







        input1 = (EditText) findViewById(R.id.input1);
        input2 = (EditText) findViewById(R.id.input2);

        Button bt_add = (Button) findViewById(R.id.bt_add);
        Button bt_sub = (Button) findViewById(R.id.bt_sub);
        Button bt_mul = (Button) findViewById(R.id.bt_mul);
        Button bt_div = (Button) findViewById(R.id.bt_div);

        tv_result = (TextView) findViewById(R.id.tv_result);

        bt_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                 n1 = Double.valueOf(input1.getText().toString());
                 n2 = Double.valueOf(input2.getText().toString());

                tv_result.setText("The result is: \n" + (n1 + n2));
            }
        });

        bt_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                n1 = Double.valueOf(input1.getText().toString());
                n2 = Double.valueOf(input2.getText().toString());

                tv_result.setText("The result is: \n" + (n1 - n2));
            }
        });

        bt_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                n1 = Double.valueOf(input1.getText().toString());
                n2 = Double.valueOf(input2.getText().toString());

                tv_result.setText("The result is: \n" + (n1 * n2));
            }
        });

        bt_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                n1 = Double.valueOf(input1.getText().toString());
                n2 = Double.valueOf(input2.getText().toString());

                tv_result.setText("The result is: \n" + (n1 / n2));
            }
        });



}
    public void openNewActivity(View view) {                                            //this is for new activity
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);

    }


}


