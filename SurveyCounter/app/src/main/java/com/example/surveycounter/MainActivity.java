package com.example.surveycounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button goodButton, badButton, noComment, scoreButton;
    TextView finalScore;
    int counterPositive = 0;
    int counterNegative = 0;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goodButton = findViewById(R.id.goodbutton);
        badButton = findViewById(R.id.badbutton);
        noComment = findViewById(R.id.nocommentbutton);
        scoreButton = findViewById(R.id.scorebutton);
        finalScore = findViewById(R.id.finalscore);

        goodButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counterPositive++;
                counter++;
            }
        });

        badButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counterNegative++;
                counter--;
            }
        });

        noComment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finalScore.setText(Integer.toString(counter));
            }
        });

        scoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counterPositive > counterNegative) {
                    Toast.makeText(MainActivity.this, "There are more positive answers: " + counter, Toast.LENGTH_LONG).show();
                }
                else if (counterNegative > counterPositive) {
                    Toast.makeText(MainActivity.this, "There are more negative answers: " + counter, Toast.LENGTH_LONG).show();
                }
                else  {
                    Toast.makeText(MainActivity.this, "There are equal positive and negative answers: " + counter, Toast.LENGTH_LONG).show();
                }

            }
        });

    }


}
