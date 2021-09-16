package com.example.task1application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView results;
    String childTotal, adultTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Binding object to view
        results = findViewById(R.id.resultsText);

        // Get intent from Main class
        Intent i = getIntent();

        childTotal = i.getStringExtra("childrenCount");
        adultTotal = i.getStringExtra("adultResult");

        results.setText("You have: " + childTotal + " children booked and " + adultTotal + " adults booked.");
    }
}