package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Intent intent;
    int[] states = {R.drawable.rock, R.drawable.paper, R.drawable.scissors, R.drawable.lizard, R.drawable.spock};
    String[] response = new String[2];
    Handler h = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void compare(int i, View v){
        intent = new Intent (v.getContext(), SecondaryActivity.class);
        Random random = new Random();
        int rand = random.nextInt(states.length-1);
        ImageView iv2 = findViewById(R.id.imageView2);
        iv2.setImageResource(states[rand]);
        System.out.println("----------------------->"+rand);
        if (states[rand] == i){
            response[0]="empate";
            response[1]="Nadie Gana";
            intent.putExtra("frase", response);
            System.out.println("empate");
            h.postDelayed(() -> {
                startActivityForResult(intent, 0);
            }, (999));
        }else if (states[rand] == R.drawable.rock && i == R.drawable.paper || states[rand] == R.drawable.paper && i == R.drawable.rock){
            response[0]="empate";
            System.out.println("gana papel");
            if (i == R.drawable.paper){
                System.out.println("jugador gana");
                response[1]="Jugador Gana";
            }
            else {
                System.out.println("maquina gana");
                response[1]="Maquina Gana";
            }
            intent.putExtra("frase", response);
            h.postDelayed(() -> {
                startActivityForResult(intent, 0);
            }, (999));
        }else if (states[rand] == R.drawable.rock && i == R.drawable.scissors || states[rand] == R.drawable.scissors && i == R.drawable.rock){
            System.out.println("gana piedra");
            response[0]="Gana Piedra";
            if (i == R.drawable.rock){
                System.out.println("jugador gana");
                response[1]="Jugador Gana";
            }
            else {
                System.out.println("maquina gana");
                response[1]="Maquina Gana";
            }
            intent.putExtra("frase", response);
            h.postDelayed(() -> {
                startActivityForResult(intent, 0);
            }, (999));
        }else if(states[rand] == R.drawable.rock && i == R.drawable.lizard || states[rand] == R.drawable.lizard && i == R.drawable.rock){
            System.out.println("gana piedra");
            response[0]="Gana Piedra";
            if (i == R.drawable.rock){
                System.out.println("jugador gana");
                response[1]="Jugador Gana";
            }
            else {
                System.out.println("maquina gana");
                response[1]="Maquina Gana";
            }
            intent.putExtra("frase", response);
            h.postDelayed(() -> {
                startActivityForResult(intent, 0);
            }, (999));
        }else if (states[rand] == R.drawable.rock && i == R.drawable.spock || states[rand] == R.drawable.spock && i == R.drawable.rock){
            System.out.println("gana spock");
            response[0]="Gana Spock";
            if (i == R.drawable.spock){
                System.out.println("jugador gana");
                response[1]="Jugador Gana";
            }
            else {
                System.out.println("maquina gana");
                response[1]="Maquina Gana";
            }
            intent.putExtra("frase", response);
            h.postDelayed(() -> {
                startActivityForResult(intent, 0);
            }, (999));
        }else if (states[rand] == R.drawable.paper && i == R.drawable.scissors || states[rand] == R.drawable.scissors && i == R.drawable.paper){
            System.out.println("gana tijeras");
            response[0]="Gana Tijeras";
            if (i == R.drawable.scissors){
                System.out.println("jugador gana");
                response[1]="Jugador Gana";
            }
            else {
                System.out.println("maquina gana");
                response[1]="Maquina Gana";
            }
            intent.putExtra("frase", response);
            h.postDelayed(() -> {
                startActivityForResult(intent, 0);
            }, (999));
        }else if (states[rand] == R.drawable.paper && i == R.drawable.lizard || states[rand] == R.drawable.lizard && i == R.drawable.paper){
            System.out.println("gana lagarto");
            response[0]="Gana Lagarto";
            if (i == R.drawable.lizard){
                System.out.println("jugador gana");
                response[1]="Jugador Gana";
            }
            else {
                System.out.println("maquina gana");
                response[1]="Maquina Gana";
            }
            intent.putExtra("frase", response);
            h.postDelayed(() -> {
                startActivityForResult(intent, 0);
            }, (999));
        }else if (states[rand] == R.drawable.paper && i == R.drawable.spock || states[rand] == R.drawable.spock && i == R.drawable.paper){
            System.out.println("gana papel");
            response[0]="Gana Papel";
            if (i == R.drawable.paper){
                System.out.println("jugador gana");
                response[1]="Jugador Gana";
            }
            else {
                System.out.println("maquina gana");
                response[1]="Maquina Gana";
            }
            intent.putExtra("frase", response);
            h.postDelayed(() -> {
                startActivityForResult(intent, 0);
            }, (999));
        }else if (states[rand] == R.drawable.scissors && i == R.drawable.lizard || states[rand] == R.drawable.lizard && i == R.drawable.scissors){
            System.out.println("gana tijeras");
            response[0]="Gana Tijeras";
            if (i == R.drawable.scissors){
                System.out.println("jugador gana");
                response[1]="Jugador Gana";
            }
            else {
                System.out.println("maquina gana");
                response[1]="Maquina Gana";
            }
            intent.putExtra("frase", response);
            h.postDelayed(() -> {
                startActivityForResult(intent, 0);
            }, (999));
        }else if (states[rand] == R.drawable.scissors && i == R.drawable.spock || states[rand] == R.drawable.spock && i == R.drawable.scissors){
            System.out.println("gana spock");
            response[0]="Gana Spock";
            if (i == R.drawable.spock){
                System.out.println("jugador gana");
                response[1]="Jugador Gana";
            }
            else {
                System.out.println("maquina gana");
                response[1]="Maquina Gana";
            }
            intent.putExtra("frase", response);
            h.postDelayed(() -> {
                startActivityForResult(intent, 0);
            }, (999));
        }else if (states[rand] == R.drawable.lizard && i == R.drawable.spock || states[rand] == R.drawable.spock && i == R.drawable.lizard){
            System.out.println("gana lagarto");
            response[0]="Gana Lagarto";
            if (i == R.drawable.lizard){
                System.out.println("jugador gana");
                response[1]="Jugador Gana";
            }
            else {
                System.out.println("maquina gana");
                response[1]="Maquina Gana";
            }
            intent.putExtra("frase", response);
            h.postDelayed(() -> {
                startActivityForResult(intent, 0);
            }, (999));

        }
    }

    @Override
    public void onClick(View view) {
        Button[] btns = {findViewById(R.id.button), findViewById(R.id.button2), findViewById(R.id.button3), findViewById(R.id.button4), findViewById(R.id.button5)};
        for (int i=0; i<btns.length; i++){
            btns[i].setEnabled(false);
        }

        ImageView iv = findViewById(R.id.imageView);
        switch (view.getId()){
            case R.id.button:
                iv.setImageResource(R.drawable.rock);
                compare(R.drawable.rock, view);
                break;

            case R.id.button2:
                iv.setImageResource(R.drawable.paper);
                compare(R.drawable.paper, view);
                break;

            case R.id.button3:
                iv.setImageResource(R.drawable.scissors);
                compare(R.drawable.scissors, view);
                break;

            case R.id.button4:
                iv.setImageResource(R.drawable.lizard);
                compare(R.drawable.lizard, view);
                break;

            case R.id.button5:
                iv.setImageResource(R.drawable.spock);
                compare(R.drawable.spock, view);
                break;
        }
    }
}