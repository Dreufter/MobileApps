package com.example.cardsgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imageButton1:

                break;
            case R.id.imageButton2:

                break;
            case R.id.imageButton3:

                break;
            case R.id.imageButton4:

                break;
            case R.id.imageButton5:

                break;
            case R.id.imageButton6:

                break;
            case R.id.imageButton7:

                break;
            case R.id.imageButton8:

                break;
            case R.id.imageButton9:

                break;
        }
    }
}