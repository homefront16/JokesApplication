package com.example.jokesapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnJoke1, btnJoke2, btnJoke3, btnJoke4, btnJoke5, btnJoke6 ;
    TextView tvMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnJoke1 = findViewById(R.id.btnJoke1);
        btnJoke2 = findViewById(R.id.btnJoke2);
        btnJoke3 = findViewById(R.id.btnJoke3);
        btnJoke4 = findViewById(R.id.btnJoke4);
        btnJoke5 = findViewById(R.id.btnJoke5);
        btnJoke6 = findViewById(R.id.btnJoke6);
        tvMessage = findViewById(R.id.tvMessage);

        // Create a click listener
        btnJoke1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "To get to the other side", Toast.LENGTH_SHORT).show();
            }
        });

        btnJoke2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Bison", Toast.LENGTH_SHORT).show();
            }
        });
        btnJoke3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Red Paint", Toast.LENGTH_SHORT).show();
            }
        });

        // Jokes 4, 5, and 6 will use the textview to display the answer
        btnJoke4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMessage.setText("B");
            }
        });

        btnJoke5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMessage.setText("I'm just very relaxed");
            }
        });

        btnJoke6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMessage.setText("And never let a fool kiss you");
            }
        });
    }
}