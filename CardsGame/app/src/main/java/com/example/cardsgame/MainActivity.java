package com.example.cardsgame;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int[] cards = {R.id.imageButton1, R.id.imageButton2, R.id.imageButton3, R.id.imageButton4, R.id.imageButton5, R.id.imageButton6, R.id.imageButton7, R.id.imageButton8, R.id.imageButton9};
    int[] drawables = {R.drawable.playing_card_2_of_diamonds, R.drawable.playing_card_2_of_hearts, R.drawable.playing_card_clubs_2, R.drawable.playing_card_diamond_2};
    int[] finalDrawables = new int[4];

    //primero aleatorio drawable, luego dos aleatorios de los 9 que no se puedan repetir

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i=0; i<drawables.length; i++){
            Random drawableRandom = new Random();
            int rand = drawableRandom.nextInt();
            finalDrawables[i]=rand;
        }

        for (int i = 0; i<4; i++)System.out.println("---------------------"+finalDrawables[i]);

        //for (int i=0; i<cards.length; i++){
        //    Random drawableRandom = new Random();
        //    drawableRandom.nextInt();
        //}

        //ImageButton ib = findViewById(R.id.imageButton1);
        //ib.setImageDrawable(getResources().getDrawable(R.drawable.black_joker));

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