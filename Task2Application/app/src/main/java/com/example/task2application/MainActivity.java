package com.example.task2application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bDot, bPlus, bMinus, bTimes, bDiv, bEq, bReset;
    EditText results;

    double val1, val2;
    boolean add, sub, mult, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0 = findViewById(R.id.button0);
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button7);
        b8 = findViewById(R.id.button8);
        b9 = findViewById(R.id.button9);

        bDot = findViewById(R.id.dotbutton);
        bPlus = findViewById(R.id.plusButton);
        bMinus = findViewById(R.id.minusButton);
        bTimes = findViewById(R.id.timesButton);
        bDiv = findViewById(R.id.divideButton);
        bEq = findViewById(R.id.equalsbutton);

        bReset = findViewById(R.id.resetButton);

        results = findViewById(R.id.results);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                results.setText(results.getText() + "0");
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                results.setText(results.getText() + "1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                results.setText(results.getText() + "2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                results.setText(results.getText() + "3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                results.setText(results.getText() + "4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                results.setText(results.getText() + "5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                results.setText(results.getText() + "6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                results.setText(results.getText() + "7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                results.setText(results.getText() + "8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                results.setText(results.getText() + "9");
            }
        });

        bReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                results.setText("");
            }
        });

        bDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                results.setText(results.getText() + ".");
            }
        });

        bPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (results.getText() == null) {
                    results.setText("");
                } else {
                    val1 = Double.parseDouble(results.getText() + "");
                    add = true;
                    results.setText(null);
                }
            }
        });

        bMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (results.getText() == null) {
                    results.setText("");
                } else {
                    val1 = Double.parseDouble(results.getText() + "");
                    sub = true;
                    results.setText(null);
                }
            }
        });

        bTimes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (results.getText() == null) {
                    results.setText("");
                } else {
                    val1 = Double.parseDouble(results.getText() + "");
                    mult = true;
                    results.setText(null);
                }
            }
        });

        bDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (results.getText() == null) {
                    results.setText("");
                } else {
                    val1 = Double.parseDouble(results.getText() + "");
                    div = true;
                    results.setText(null);
                }
            }
        });
        bEq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val2 = Double.parseDouble(results.getText() + "");

                if (add == true) {
                    results.setText(val1 + val2 + "");
                    add = false;
                } else if (sub == true) {
                    results.setText(val1 - val2 + "");
                    sub = false;
                } else if (mult == true) {
                    results.setText(val1 * val2 + "");
                    mult = false;
                } else if (div == true) {
                    results.setText(val1 / val2 + "");
                    div = false;
                } else {
                    results.setText("If it somehow got here, you probably touched the code of the app and broke it!");
                }
            }
        });
    }
}