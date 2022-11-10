package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int[] states = {R.drawable.rock, R.drawable.paper, R.drawable.scissors, R.drawable.lizard, R.drawable.spock};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void compare(int i){
        Random random = new Random();
        int rand = random.nextInt(states.length-1);
        ImageView iv2 = findViewById(R.id.imageView2);
        iv2.setImageResource(states[rand]);
        System.out.println("----------------------->"+rand);
        if (states[rand] == i){
            System.out.println("empate");
        }else if (states[rand] == R.drawable.rock && i == R.drawable.paper || states[rand] == R.drawable.paper && i == R.drawable.rock){
            System.out.println("gana papel");
            if (i == R.drawable.paper)System.out.println("jugador gana");
            else System.out.println("maquina gana");
        }else if (states[rand] == R.drawable.rock && i == R.drawable.scissors || states[rand] == R.drawable.scissors && i == R.drawable.rock){
            System.out.println("gana piedra");
            if (i == R.drawable.rock)System.out.println("jugador gana");
            else System.out.println("maquina gana");
        }else if(states[rand] == R.drawable.rock && i == R.drawable.lizard || states[rand] == R.drawable.lizard && i == R.drawable.rock){
            System.out.println("gana piedra");
            if (i == R.drawable.rock)System.out.println("jugador gana");
            else System.out.println("maquina gana");
        }else if (states[rand] == R.drawable.rock && i == R.drawable.spock || states[rand] == R.drawable.spock && i == R.drawable.rock){
            System.out.println("gana spock");
            if (i == R.drawable.spock)System.out.println("jugador gana");
            else System.out.println("maquina gana");
        }else if (states[rand] == R.drawable.paper && i == R.drawable.scissors || states[rand] == R.drawable.scissors && i == R.drawable.paper){
            System.out.println("gana tijeras");
            if (i == R.drawable.scissors)System.out.println("jugador gana");
            else System.out.println("maquina gana");
        }else if (states[rand] == R.drawable.paper && i == R.drawable.lizard || states[rand] == R.drawable.lizard && i == R.drawable.paper){
            System.out.println("gana lagarto");
            if (i == R.drawable.lizard)System.out.println("jugador gana");
            else System.out.println("maquina gana");
        }else if (states[rand] == R.drawable.paper && i == R.drawable.spock || states[rand] == R.drawable.spock && i == R.drawable.paper){
            System.out.println("gana papel");
            if (i == R.drawable.paper)System.out.println("jugador gana");
            else System.out.println("maquina gana");
        }else if (states[rand] == R.drawable.scissors && i == R.drawable.lizard || states[rand] == R.drawable.lizard && i == R.drawable.scissors){
            System.out.println("gana tijeras");
            if (i == R.drawable.scissors)System.out.println("jugador gana");
            else System.out.println("maquina gana");
        }else if (states[rand] == R.drawable.scissors && i == R.drawable.spock || states[rand] == R.drawable.spock && i == R.drawable.scissors){
            System.out.println("gana spock");
            if (i == R.drawable.spock)System.out.println("jugador gana");
            else System.out.println("maquina gana");
        }else if (states[rand] == R.drawable.lizard && i == R.drawable.spock || states[rand] == R.drawable.spock && i == R.drawable.lizard){
            System.out.println("gana lagarto");
            if (i == R.drawable.lizard)System.out.println("jugador gana");
            else System.out.println("maquina gana");
        }
    }

    @Override
    public void onClick(View view) {
        ImageView iv = findViewById(R.id.imageView);
        switch (view.getId()){
            case R.id.button:
                iv.setImageResource(R.drawable.rock);
                compare(R.drawable.rock);
                break;

            case R.id.button2:
                iv.setImageResource(R.drawable.paper);
                compare(R.drawable.paper);
                break;

            case R.id.button3:
                iv.setImageResource(R.drawable.scissors);
                compare(R.drawable.scissors);
                break;

            case R.id.button4:
                iv.setImageResource(R.drawable.lizard);
                compare(R.drawable.lizard);
                break;

            case R.id.button5:
                iv.setImageResource(R.drawable.spock);
                compare(R.drawable.spock);
                break;
        }
    }
}