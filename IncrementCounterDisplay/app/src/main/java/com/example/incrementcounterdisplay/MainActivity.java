package com.example.incrementcounterdisplay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private int incr = 0;
    Button plus, minus;
    EditText e1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Selecting buttons & TextView
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        e1 = findViewById(R.id.editTextNumber);

        // Event listeners for click +/-
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                incr++; // Increment counter
                e1.setText(Integer.toString(incr)); // Updates textbox with new value
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                incr--; // Decrement counter
                e1.setText(Integer.toString(incr)); // Updates textbox with new value
            }
        });

    }
}