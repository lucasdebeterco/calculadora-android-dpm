package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ed1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.editText);
    }

    public void numberEvent(View view) {
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
}