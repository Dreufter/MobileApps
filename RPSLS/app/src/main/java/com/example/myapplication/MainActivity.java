package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View view) {
        ImageView iv = findViewById(R.id.imageView);
        switch (view.getId()){
            case R.id.button:
                iv.setImageResource(R.drawable.rock);

                break;

            case R.id.button2:

                break;

            case R.id.button3:

                break;

            case R.id.button4:

                break;

            case R.id.button5:

                break;
        }
    }
}