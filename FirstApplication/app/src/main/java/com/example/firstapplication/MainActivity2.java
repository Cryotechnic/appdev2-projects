package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    // Instantiate button
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Binding Button to programming
        button3 = findViewById(R.id.button3);

        // Creating Event Listener for onClick()

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { // closes current window to prevent buffer overflow + instantiates pane 1
                Intent i2 = new Intent(MainActivity2.this, MainActivity.class);
                finish();
            }
        });
    }
}