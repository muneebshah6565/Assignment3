package com.example.exercise12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b4=(Button) findViewById(R.id.button);
        Date currenttime = Calendar.getInstance().getTime();
        b4.setText(currenttime.toString());
    }
}