package com.example.googlecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Vector;

public class MainActivity extends AppCompatActivity {
    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button add;
    private Button subtract;
    private Button multiple;
    private Button divide;
    private TextView editText;
    private Button dot;
    private Button equals;
    private Button clear;
    private Button del;
    private Button percentage;
    private Button power;
    private Button sqrt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zero = findViewById(R.id.zero);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        add = findViewById(R.id.add);
        divide = findViewById(R.id.divide);
        equals = findViewById(R.id.equals);
        dot = findViewById(R.id.dot);
        editText = findViewById(R.id.editText);
        clear = findViewById(R.id.clear);
        del = findViewById(R.id.del);
        subtract = findViewById(R.id.substract);
        multiple = findViewById(R.id.multiple);
        sqrt = findViewById(R.id.sqrt);
        percentage = findViewById(R.id.percentage);
        power = findViewById(R.id.power);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                if(text.length() != 0){
                    if(text.length() == 1 && text.charAt(text.length() - 1) == '0'){
                        text = "1";
                    }
                    else{
                        if(text.charAt(text.length() - 1) == '0' && (text.charAt(text.length() -  2) < '0' ||
                                text.charAt(text.length() - 2) > '9') && text.charAt(text.length() - 2) != '.'){
                                text = text.substring(0, text.length() - 1) + '1';
                        }
                        else{
                            text += '1';
                        }
                    }
                }
                else{
                    text += '1';
                }
                editText.setText(text);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                if(text.length() != 0){
                    if(text.length() == 1 && text.charAt(text.length() - 1) == '0'){
                        text = "2";
                    }
                    else{
                        if(text.charAt(text.length() - 1) == '0' && (text.charAt(text.length() -  2) < '0' ||
                                text.charAt(text.length() - 2) > '9') && text.charAt(text.length() - 2) != '.'){
                            text = text.substring(0, text.length() - 1) + '2';
                        }
                        else{
                            text += '2';
                        }
                    }
                }
                else{
                    text += '2';
                }
                editText.setText(text);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                if(text.length() != 0){
                    if(text.length() == 1 && text.charAt(text.length() - 1) == '0'){
                        text = "3";
                    }
                    else{
                        if(text.charAt(text.length() - 1) == '0' && (text.charAt(text.length() -  2) < '0' ||
                                text.charAt(text.length() - 2) > '9') && text.charAt(text.length() - 2) != '.'){
                            text = text.substring(0, text.length() - 1) + '3';
                        }
                        else{
                            text += '3';
                        }
                    }
                }
                else{
                    text += '3';
                }
                editText.setText(text);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                if(text.length() != 0){
                    if(text.length() == 1 && text.charAt(text.length() - 1) == '0'){
                        text = "4";
                    }
                    else{
                        if(text.charAt(text.length() - 1) == '0' && (text.charAt(text.length() -  2) < '0' ||
                                text.charAt(text.length() - 2) > '9') && text.charAt(text.length() - 2) != '.'){
                            text = text.substring(0, text.length() - 1) + '4';
                        }
                        else{
                            text += '4';
                        }
                    }
                }
                else{
                    text += '4';
                }
                editText.setText(text);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                if(text.length() != 0){
                    if(text.length() == 1 && text.charAt(text.length() - 1) == '0'){
                        text = "5";
                    }
                    else{
                        if(text.charAt(text.length() - 1) == '0' && (text.charAt(text.length() -  2) < '0' ||
                                text.charAt(text.length() - 2) > '9') && text.charAt(text.length() - 2) != '.'){
                            text = text.substring(0, text.length() - 1) + '5';
                        }
                        else{
                            text += '5';
                        }
                    }
                }
                else{
                    text += '5';
                }
                editText.setText(text);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                if(text.length() != 0){
                    if(text.length() == 1 && text.charAt(text.length() - 1) == '0'){
                        text = "6";
                    }
                    else{
                        if(text.charAt(text.length() - 1) == '0' && (text.charAt(text.length() -  2) < '0' ||
                                text.charAt(text.length() - 2) > '9') && text.charAt(text.length() - 2) != '.'){
                            text = text.substring(0, text.length() - 1) + '6';
                        }
                        else{
                            text += '6';
                        }
                    }
                }
                else{
                    text += '6';
                }
                editText.setText(text);
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                if(text.length() != 0){
                    if(text.length() == 1 && text.charAt(text.length() - 1) == '0'){
                        text = "7";
                    }
                    else{
                        if(text.charAt(text.length() - 1) == '0' && (text.charAt(text.length() -  2) < '0' ||
                                text.charAt(text.length() - 2) > '9') && text.charAt(text.length() - 2) != '.'){
                            text = text.substring(0, text.length() - 1) + '7';
                        }
                        else{
                            text += '7';
                        }
                    }
                }
                else{
                    text += '7';
                }
                editText.setText(text);
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                if(text.length() != 0){
                    if(text.length() == 1 && text.charAt(text.length() - 1) == '0'){
                        text = "8";
                    }
                    else{
                        if(text.charAt(text.length() - 1) == '0' && (text.charAt(text.length() -  2) < '0' ||
                                text.charAt(text.length() - 2) > '9') && text.charAt(text.length() - 2) != '.'){
                            text = text.substring(0, text.length() - 1) + '8';
                        }
                        else{
                            text += '8';
                        }
                    }
                }
                else{
                    text += '8';
                }
                editText.setText(text);
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                if(text.length() != 0){
                    if(text.length() == 1 && text.charAt(text.length() - 1) == '0'){
                        text = "9";
                    }
                    else{
                        if(text.charAt(text.length() - 1) == '0' && (text.charAt(text.length() -  2) < '0' ||
                                text.charAt(text.length() - 2) > '9') && text.charAt(text.length() - 2) != '.'){
                            text = text.substring(0, text.length() - 1) + '9';
                        }
                        else{
                            text += '9';
                        }
                    }
                }
                else{
                    text += '9';
                }
                editText.setText(text);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                if(text.length() != 0) {
                    if(text.charAt(0) == 'C'){
                        editText.setText("");
                    }
                    else
                        editText.setText(text.substring(0, text.length() - 1));
                }
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                if(text.length() != 0){
                    if(text.length() == 1 && text.charAt(text.length() - 1) == '0'){
                        text = "0";
                    }
                    else{
                        if(text.charAt(text.length() - 1) == '0' && (text.charAt(text.length() -  2) < '0' ||
                                text.charAt(text.length() - 2) > '9') && text.charAt(text.length() - 2) != '.'){
                            text = text.substring(0, text.length() - 1) + '0';
                        }
                        else{
                            text += '0';
                        }
                    }
                }
                else{
                    text += '0';
                }
                editText.setText(text);
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                if(text.length() != '0' && text.charAt(text.length() - 1) != '.'){
                    char cur = text.charAt(text.length() - 1);
                    if(cur == '+' || cur == '-' || cur == '÷' || cur == '%' || cur == '×' || cur == '^'){
                        text = text.substring(0, text.length() - 1);
                    }
                    else{
                        text += '+';
                    }
                }
                editText.setText(text);
            }
        });



















        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                if(text.length() != 0 && text.charAt(text.length() - 1) != '.'){
                    char current = text.charAt(text.length() - 1);
                    if(current == '+' || current == '-' || current == '÷' || current == '×' || current == '%' || current == '^'
                            ){
                        text = text.substring(0, text.length() - 1) + '-';
                    }
                    else if(current != '√'){
                        text += '-';
                    }
                }
                editText.setText(text);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                if(text.length() != 0 && text.charAt(text.length() - 1) != '.'){
                    char current = text.charAt(text.length() - 1);
                    if(current == '+' || current == '-' || current == '÷' || current == '×' || current == '%' || current == '^'
                            ){
                        text = text.substring(0, text.length() - 1) + '÷';
                    }
                    else if(current != '√'){
                        text += '÷';
                    }
                }
                editText.setText(text);
            }
        });
        multiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                if(text.length() != 0 && text.charAt(text.length() - 1) != '.'){
                    char current = text.charAt(text.length() - 1);
                    if(current == '+' || current == '-' || current == '÷' || current == '×' || current == '%' || current == '^'){
                        text = text.substring(0, text.length() - 1) + '×';
                    }
                    else if(current != '√'){
                        text += '×';
                    }
                }
                editText.setText(text);
            }
        });
        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                if(text.length() != 0 && text.charAt(text.length() - 1) != '.' &&
                        (text.charAt(text.length() - 1) < '0' || text.charAt(text.length() - 1) > '9')){
                    char current = text.charAt(text.length() - 1);
                    if(current != '√' && current != '.')
                        text += '√';
                }
                else if(text.length() == 0) {
                    text += '√';
                }
                editText.setText(text);
            }
        });
        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                if(text.length() != 0 && text.charAt(text.length() - 1) != '.'){
                    char current = text.charAt(text.length() - 1);
                    if(current == '+' || current == '-' || current == '÷' || current == '×' || current == '%' || current == '^'
                           ){
                        text = text.substring(0, text.length() - 1) + '^';
                    }
                    else if(current != '√'){
                        text += '^';
                    }
                }
                editText.setText(text);
            }
        });
        percentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                if(text.length() != 0 && text.charAt(text.length() - 1) != '.'){

                    char current = text.charAt(text.length() - 1);
                    if(current == '+' || current == '-' || current == '÷' || current == '×' || current == '%' || current == '^'
                           ){
                        text = text.substring(0, text.length() - 1) + '%';
                    }
                    else if(current != '√'){
                        text += '%';
                    }
                }
                editText.setText(text);
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean hasDot = false;
                String text = editText.getText().toString();
                if(text.length() != 0){
                    if(text.charAt(text.length() - 1) >= '0' && text.charAt(text.length() - 1) <= '9'){
                        for(int i = text.length() - 1; i >= 0; --i){
                            if(text.charAt(i) == '.') hasDot = true;
                            if(text.charAt(i) < '0' || text.charAt(i) > '9') break;
                        }
                        if(!hasDot){
                            text += '.';
                        }
                    }
                }
                editText.setText(text);
            }
        });
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double last = 0;
                String text = editText.getText().toString();
                String current = "";
                char lastOperation = '+';
                boolean hasSqrt = false;
                boolean divideByZero = false;
                if (text.length() != 0) {
                    if (text.charAt(text.length() - 1) == '.') {
                        text = text.substring(0, text.length() - 1);
                    }
                    text += '+';
                    String newText;
                        for (int i = 0; i < text.length(); ++i) {
                            char cur = text.charAt(i);
                            if (cur == '√') {
                                hasSqrt = true;
                            } else if (cur == '.' || (cur >= '0' && cur <= '9')) {
                                current += cur;
                            } else {
                                double have = Double.parseDouble(current);
                                if (hasSqrt) {
                                    have = Math.sqrt(have);
                                }
                                if (lastOperation == '+') {
                                    last += have;
                                } else if (lastOperation == '-') {
                                    last -= have;
                                } else if (lastOperation == '×') {
                                    last *= have;
                                } else if (lastOperation == '^') {
                                    last = Math.pow(last, have);
                                } else if (lastOperation == '%') {
                                    last = last * have / 100.0;
                                } else if (lastOperation == '÷') {
                                    boolean haveit = false;
                                    for (int j = 0; j < current.length(); ++j) {
                                        if (current.charAt(j) >= '1' && current.charAt(j) <= '9') {
                                            haveit = true;
                                            break;
                                        }
                                    }
                                    if (haveit == false) {
                                        divideByZero = true;
                                        break;
                                    } else {
                                        last /= have;
                                    }
                                }
                                current = "";
                                lastOperation = cur;
                            }
                        }
                        if (divideByZero) {
                            editText.setText("Cannot Divide by Zero");
                        } else {
                            newText = Double.toString(last);
                            boolean hasDots = false;
                            for (int j = newText.length() - 1; j >= 0; --j) {
                                if (newText.charAt(j) == '.') hasDots = true;
                            }
                            while (hasDots && newText.length() > 1 && (newText.charAt(newText.length() - 1) == '.' ||
                                    newText.charAt(newText.length() - 1) == '0' || newText.charAt(newText.length() - 1) == '√')) {
                                if (newText.charAt(newText.length() - 1) == '.') {
                                    newText = newText.substring(0, newText.length() - 1);
                                    break;
                                }
                                newText = newText.substring(0, newText.length() - 1);
                            }
                            editText.setText(newText);
                        }
                    }
                }
        });
    }
}
