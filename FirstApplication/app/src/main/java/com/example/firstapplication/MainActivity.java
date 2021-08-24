package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Instantiating buttons for controls later
    Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Binding buttons from design to programming
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);

        // Creating Event Listeners for actions onClick()

        button1.setOnClickListener(new View.OnClickListener() { // Displays message at the bottom of the screen
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Welcome to the first class!",
                        Toast.LENGTH_LONG).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() { // Instantiates 2nd window/pane
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(i);
            }
        });
    }
}