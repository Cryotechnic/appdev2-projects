package com.example.task1application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    public static int childTotal;
    public static int adultTotal;
    TextView results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Binding object to view
        results = findViewById(R.id.resultsText);

        results.setText("You have: " + childTotal + " children booked and " + adultTotal + " adults booked.");
    }
}