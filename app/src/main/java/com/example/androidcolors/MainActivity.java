package com.example.androidcolors;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView textview;
    ConstraintLayout display;
    Random rnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inti();
        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int red = rnd.nextInt(256);
                int green = rnd.nextInt(256);
                int blue = rnd.nextInt(256);
                display.setBackgroundColor(Color.rgb(red,green,blue));
                if(3 * 127 > 3 * red + green + blue) {
                    textview.setTextColor(Color.WHITE);
                }
                else{
                    textview.setTextColor(Color.BLACK);
                }

            }

        });
    }
    void inti(){
        textview = findViewById(R.id.textView);
        display = findViewById(R.id.display);
        rnd=new Random();
    }
}