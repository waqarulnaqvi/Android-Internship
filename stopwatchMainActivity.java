package com.syedwaqarul786.stopwatch;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;



public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;

    TextView time, stop, start, reset;
    long mseconds = 0;
    //    long seconds = 0;
    boolean isRunning;//Default value is false
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start = findViewById(R.id.startbtn);
        stop = findViewById(R.id.stopbtn);
        reset = findViewById(R.id.resetbtn);
        time = findViewById(R.id.timetv); // Initialize the time TextView
        getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this, R.color.green));
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));
        setSupportActionBar(toolbar);
        handler = new Handler();


    }

    public void startbt(View view) {
        isRunning = true;
        if (stop.getVisibility() == View.INVISIBLE) {
            startTimer(); // Uncomment this line if needed
        }
        stop.setVisibility(View.VISIBLE);
        reset.setVisibility(View.VISIBLE);


    }

    public void stopbt(View view) {
        isRunning = false;
        // Your stop button logic here
    }

    public void resetbt(View view) {
        isRunning = false;
        mseconds = 0;
//      seconds=0;
        time.setText("00:00:00:00");
        reset.setVisibility(View.INVISIBLE);
        stop.setVisibility(View.INVISIBLE);
    }


    public void startTimer() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                if (isRunning) {
                    long ms = mseconds % 100;
                    long s = (mseconds / 60) % 60; // updating seconds
                    long m = (mseconds / 60) / 60; // updating minutes
                    long h = m/60; // updating hours
                    mseconds++;

                    String formatString = String.format(Locale.getDefault(), "%02d:%02d:%02d:%02d", h, m, s, ms);
                    time.setText(formatString);
                    handler.postDelayed(this, 10); // Adjust the delay as needed (10 milliseconds in this example)
                }
            }
        };
        handler.post(runnable);
    }

    // Other methods remain the same...
}
