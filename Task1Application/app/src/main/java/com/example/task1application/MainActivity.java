package com.example.task1application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Creating instances of buttons and Textviews & var definition
    Button childMinus, childPlus, adultMinus, adultPlus, scheduleButton;
    TextView childCount, adultCount;
    public static int adultTotal;
    public static int childTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Assigning instanced button objects to buttons in application
        childMinus = findViewById(R.id.minusChild);
        childPlus = findViewById(R.id.plusChild);

        adultMinus = findViewById(R.id.minusAdult);
        adultPlus = findViewById(R.id.plusAdult);

        childCount = findViewById(R.id.counterChild);
        adultCount = findViewById(R.id.counterAdult);

        scheduleButton = findViewById(R.id.scheduleButton);

        this.childTotal = MainActivity2.childTotal;
        this.adultTotal = MainActivity2.adultTotal;

        // Event listeners for +/- buttons
        childMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                childTotal--;
                if (childTotal < 0) {
                    childTotal = 0;
                    childCount.setText("0 children");
                }
                childCount.setText(Integer.toString(childTotal) + " children");
            }
        });

        childPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                childTotal++;
                childCount.setText(Integer.toString(childTotal) + " children");
            }
        });

        adultMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adultTotal--;
                if (adultTotal < 0) {
                    adultTotal = 0;
                    adultCount.setText("0 adults");
                }
                adultCount.setText(Integer.toString(adultTotal) + " adults");
            }
        });

        adultPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adultTotal++;
                adultCount.setText(Integer.toString(adultTotal) + " adults");
            }
        });

        // Start 2nd activity to display counter for each.
        // TODO: Implement TextViews in 2nd Activity
        scheduleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(i);
            }
        });
    }
}