package com.application.lab1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bAdd, bSub, bDiv, bMul, bClr, bEql;
    EditText editText1;
    String result = "place";
    float operand1, operand2;
    boolean add, sub, mul, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0 = (Button) findViewById(R.id.button0);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        b9 = (Button) findViewById(R.id.button9);
        bClr = (Button) findViewById(R.id.buttonC);
        bAdd = (Button) findViewById(R.id.buttonadd);
        bSub = (Button) findViewById(R.id.buttonsub);
        bMul = (Button) findViewById(R.id.buttonmul);
        bDiv = (Button) findViewById(R.id.buttondiv);
        bEql = (Button) findViewById(R.id.buttoneql);
        editText1 = (EditText) findViewById(R.id.editText1);

        b0.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText() + "0");
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText() + "1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText() + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText() + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText() + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText() + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText() + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText() + "7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText() + "8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText() + "9");
            }
        });

        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText1 == null) {
                    editText1.setText("");
                } else {
                    operand1 = Float.parseFloat(editText1.getText() + "");
                    add = true;
                    editText1.setText(null);
                }
            }
        });

        bSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText1 == null) {
                    editText1.setText("");
                } else {
                    operand1 = Float.parseFloat(editText1.getText() + "");
                    sub = true;
                    editText1.setText(null);
                }
            }
        });

        bMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText1 == null) {
                    editText1.setText("");
                } else {
                    operand1 = Float.parseFloat(editText1.getText() + "");
                    mul = true;
                    editText1.setText(null);
                }
            }
        });

        bDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText1 == null) {
                    editText1.setText("");
                } else {
                    operand1 = Float.parseFloat(editText1.getText() + "");
                    div = true;
                    editText1.setText(null);
                }
            }
        });

        bClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText("");
            }
        });


        bEql.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                operand2 = Float.parseFloat(editText1.getText() + "");

                if (add) {
                    result = operand1 + operand2 + "";
                    add = false;
                }

                if (sub) {
                    result = operand1 - operand2 + "";
                    sub = false;
                }

                if (mul) {
                    result = operand1 * operand2 + "";
                    mul = false;
                }

                if (div) {
                    result = operand1 / operand2 + "";
                    div = false;
                }

                Intent putResultIntent = new Intent(MainActivity.this, ResultActivity.class);
                putResultIntent.putExtra("result", result.toString());
                MainActivity.this.startActivity(putResultIntent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.w("onStartWarningLog", "Log: onStart method was called.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w("onStartWarningLog", "Log: onResume method was called.");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.w("onStartWarningLog", "Log: onRestart method was called.");
    }
}