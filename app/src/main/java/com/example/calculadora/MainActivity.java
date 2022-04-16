package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String oldNumer = "";
    String op = "+";
    EditText ed1;
    boolean isNewOperator = true;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.editText);
    }

    public void numberEvent(View view) {

        if (isNewOperator) {
            ed1.setText("");
        }
        isNewOperator = false;

        String number = ed1.getText().toString();

        switch (view.getId()) {
            case R.id.btn1:
                number += '1';
                break;
            case R.id.btn2:
                number += '2';
                break;
            case R.id.btn3:
                number += '3';
                break;
            case R.id.btn4:
                number += '4';
                break;
            case R.id.btn5:
                number += '5';
                break;
            case R.id.btn6:
                number += '6';
                break;
            case R.id.btn7:
                number += '7';
                break;
            case R.id.btn8:
                number += '8';
                break;
            case R.id.btn9:
                number += '9';
                break;
            case R.id.btn0:
                number += '0';
                break;
            case R.id.btnPonto:
                number += '.';
                break;
            case R.id.btnPlusMinus:
                number = '-' + number;
                break;
        }

        ed1.setText(number);
    }

    public void operatorEvent(View view) {
        isNewOperator = true;
        oldNumer = ed1.getText().toString();

        switch (view.getId()) {
            case R.id.btnDivide:op = "/"; break;
            case R.id.btnMultiplica:op = "*"; break;
            case R.id.btnPlus:op = "+"; break;
            case R.id.btnMinus:op = "-"; break;

        }
    }

    public void equalEvent(View view) {
        String newNumber = ed1.getText().toString();
        double result = 0.0;

        switch (op) {
            case "+":
                result = Double.parseDouble(oldNumer) + Double.parseDouble(newNumber);
                break;
            case "-":
                result = Double.parseDouble(oldNumer) - Double.parseDouble(newNumber);
                break;
            case "*":
                result = Double.parseDouble(oldNumer) * Double.parseDouble(newNumber);
                break;
            case "/":
                result = Double.parseDouble(oldNumer) / Double.parseDouble(newNumber);
                break;
        }

        ed1.setText(result+"");
    }

    public void acEvent(View view) {
        ed1.setText("0");
        isNewOperator = true;
    }

    public void percentEvent(View view) {
        double num = Double.parseDouble(ed1.getText().toString()) / 100;
        ed1.setText(num+"");
        isNewOperator = true;
    }
}