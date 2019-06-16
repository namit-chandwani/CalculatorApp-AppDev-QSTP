package com.example.namit.additionofnumbersapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView t1;
    private TextView t2;
    private TextView tOp;

    private double num1;
    private double num2;
    private String op;


    public void buttonClickNumberDec(View view)
    {
        Button b1 = (Button) view;
        t2.append(b1.getText().toString());

    }
    public void buttonClickSign(View view)
    {
        Button b2 = (Button) view;
        tOp.setText(b2.getText().toString());
        if(t1.getText().toString().equals(""))
        {
            t1.setText(t2.getText().toString());
            t2.setText("");
        }
    }
    public void buttonClickEqual(View view)
    {
        num1=Double.parseDouble(t1.getText().toString());
        num2=Double.parseDouble(t2.getText().toString());
        op=tOp.getText().toString();
        tOp.setText("=");

        switch(op)
        {
            case "+": num1 += num2;
                break;

            case "-": num1 -= num2;
                break;

            case "*": num1 *= num2;
                break;

            case "/": num1 /= num2;
                break;
        }
        t1.setText(Double.toString(num1));
        t2.setText("");
    }
    public void buttonClickClear(View view)
    {
        t1.setText("");
        t2.setText("");
        tOp.setText("");
        num1=0;
        num2=0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1= (TextView) findViewById(R.id.resultDisplay);
        t2= (TextView) findViewById(R.id.secondNumberDisplay);
        tOp= (TextView) findViewById(R.id.operatorDisplay);

        t1.setText("");
        t2.setText("");
        tOp.setText("");


    }
}
