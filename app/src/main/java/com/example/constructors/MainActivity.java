package com.example.constructors;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private int hour;
    private int minute;
    private double second;

    public MainActivity() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0.0;
    }

    public MainActivity(int hour, int minute, double second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
}


        }

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
