package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Input1;
    private EditText Input2;
    private TextView Output;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Input1 = (EditText) findViewById(R.id.Input1);
        Input2 = (EditText) findViewById(R.id.Input2);
        Output = (TextView) findViewById(R.id.Output);
    }

    public void addButton(View view) {
        double n1 = Double.parseDouble(Input1.getText().toString());
        double n2 = Double.parseDouble(Input2.getText().toString());
        double sum = n1 + n2;
        Output.setText(String.valueOf(sum));
    }
    public void minusButton(View view) {
        double n1 = Double.parseDouble(Input1.getText().toString());
        double n2 = Double.parseDouble(Input2.getText().toString());
        double minus = n1 - n2;
        Output.setText(String.valueOf(minus));
    }
    public void multiplyButton(View view) {
        double n1 = Double.parseDouble(Input1.getText().toString());
        double n2 = Double.parseDouble(Input2.getText().toString());
        double multiple = n1 * n2;
        Output.setText(String.valueOf(multiple));
    }
    public void divideButton(View view) {
        double n1 = Double.parseDouble(Input1.getText().toString());
        double n2 = Double.parseDouble(Input2.getText().toString());
        double division = n1 / n2;
        Output.setText(String.valueOf(division));
    }
}