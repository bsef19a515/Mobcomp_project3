package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import  android.view.View;



public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4;
    TextView text3;
    EditText text1,text2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.ad);
        btn2=findViewById(R.id.sub);
        btn3=findViewById(R.id.mul);
        btn4=findViewById(R.id.div);

        text1=findViewById(R.id.num1);
        text2=findViewById(R.id.num2);
        text3=findViewById(R.id.res);

    }
    public void Add(View view) {
        double num1 = Double.parseDouble(text1.getText().toString());
        double num2 = Double.parseDouble(text2.getText().toString());

        double sum=num1+num2;
        text3.setText(Double.toString(sum));
    }

    public void Subtract(View view) {
        double num1 = Double.parseDouble(text1.getText().toString());
        double num2 = Double.parseDouble(text2.getText().toString());

        double sub=num1-num2;
        text3.setText(Double.toString(sub));
    }

    public void Multiply(View view) {
        double num1 = Double.parseDouble(text1.getText().toString());
        double num2 = Double.parseDouble(text2.getText().toString());

        double mul=num1*num2;
        text3.setText(Double.toString(mul));
    }

    public void Divide(View view) {
        double num1 = Double.parseDouble(text1.getText().toString());
        double num2 = Double.parseDouble(text2.getText().toString());

        double div=num1/num2;
        text3.setText(Double.toString(div));
    }
}