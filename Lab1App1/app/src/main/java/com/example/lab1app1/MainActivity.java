package com.example.lab1app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int guestsTotal, roomsTotal = 0;

    // Importing libraries and instantiating objects
    Button plus1, plus2, minus1, minus2;
    TextView guestsResult, roomsResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plus1 = findViewById(R.id.buttonPlus1);
        plus2 = findViewById(R.id.buttonPlus2);

        minus1 = findViewById(R.id.buttonMinus1);
        minus2 = findViewById(R.id.buttonMinus2);

        guestsResult = findViewById(R.id.guestsDisplay);
        roomsResult = findViewById(R.id.roomsDisplay);

        plus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                guestsTotal++;
                if (guestsTotal == 1) {
                    guestsResult.setText(Integer.toString(guestsTotal) + " Guest");
                }
                else {
                    guestsResult.setText(Integer.toString(guestsTotal) + " Guests");
                }
            }
        });
        minus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                guestsTotal--;
                if (guestsTotal < 0) {
                    guestsTotal = 0;
                    guestsResult.setText(Integer.toString(guestsTotal) + " Guests");
                } else {
                    if (guestsTotal == 1) {
                        guestsResult.setText(Integer.toString(guestsTotal) + " Guest");
                    } else {
                        guestsResult.setText(Integer.toString(guestsTotal) + " Guests");
                    }
                }
            }
        });
        plus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                roomsTotal++;
                if (roomsTotal == 1) {
                    roomsResult.setText(Integer.toString(roomsTotal) + " Room");
                }
                else {
                    roomsResult.setText(Integer.toString(roomsTotal) + " Rooms");
                }
            }
        });
        minus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                roomsTotal--;
                if (roomsTotal < 0) {
                    roomsTotal = 0;
                    roomsResult.setText(Integer.toString(roomsTotal) + " Rooms");
                } else {
                    if (roomsTotal == 1) {
                        roomsResult.setText(Integer.toString(roomsTotal) + " Room");
                    } else {
                        roomsResult.setText(Integer.toString(roomsTotal) + " Rooms");
                    }
                }
            }
        });
    }
}