package com.example.lab1app2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScoreTotal, teamBScoreTotal = 0;

    Button threeA, threeB, twoA, twoB, oneA, oneB, result, reset;
    TextView teamAScore, teamBScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        threeA = findViewById(R.id.buttonplus3A);
        threeB = findViewById(R.id.buttonplus3B);

        twoA = findViewById(R.id.buttonplus2A);
        twoB = findViewById(R.id.buttonplus2B);

        oneA = findViewById(R.id.buttonplus1A);
        oneB = findViewById(R.id.buttonplus1B);

        teamAScore = findViewById(R.id.teamAScore);
        teamBScore = findViewById(R.id.teamBScore);

        result = findViewById(R.id.result);
        reset = findViewById(R.id.reset);

        threeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamAScoreTotal += 3;
            }
        });

        twoA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamAScoreTotal += 2;
            }
        });

        oneA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamAScoreTotal += 1;
            }
        });

        threeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamBScoreTotal += 3;
            }
        });

        twoB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamBScoreTotal += 2;
            }
        });

        oneB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamBScoreTotal += 1;
            }
        });

        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamAScore.setText(Integer.toString(teamAScoreTotal));
                teamBScore.setText(Integer.toString(teamBScoreTotal));
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamAScoreTotal = 0;
                teamBScoreTotal = 0;
                teamAScore.setText("0");
                teamBScore.setText("0");
            }
        });

    }
}