package com.example.cardsgame;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int[] cards = {R.id.imageButton1, R.id.imageButton2, R.id.imageButton3, R.id.imageButton4, R.id.imageButton5, R.id.imageButton6, R.id.imageButton7, R.id.imageButton8, R.id.imageButton9};
    int[] drawables = {R.drawable.playing_card_2_of_diamonds, R.drawable.playing_card_2_of_hearts, R.drawable.playing_card_clubs_2, R.drawable.playing_card_diamond_2};
    Integer[] usedPos = new Integer[]{9, 9, 9, 9, 9, 9, 9, 9};
    List<Integer> intList = new ArrayList<>(Arrays.asList(usedPos));
    Integer[] randDrawables = new Integer[]{9, 9, 9, 9};
    List<Integer> intList2 = new ArrayList<>(Arrays.asList(randDrawables));
    int[] reps = {1,1,1,1,1,1,1,1,1};
    Drawable[] couple = new Drawable[2];
    int[] coupleId = new int[2];
    int count=0;

    //primero aleatorio drawable, luego dos aleatorios de los 9 que no se puedan repetir

    protected void randomizeCard(int cardId, int drawableId){
        ImageButton ib = findViewById(cardId);
        ib.setImageDrawable(getResources().getDrawable(drawableId));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i=0; i<intList2.size(); i++){
            Random randDraws = new Random();
            int randDraw = randDraws.nextInt(4);
            System.out.println(randDraw+": --- "+intList2.contains(randDraw)+" ---- "+i);

            if(!intList2.contains(randDraw)){
                intList2.set(i, randDraw);
            }else{
                i--;
            }
        }

        for (int i=0; i<intList.size(); i++){
            Random drawableRandom = new Random();
            int rand = drawableRandom.nextInt(8);
            System.out.println(rand+": --- "+intList.contains(rand)+" ---- "+i);

            if(!intList.contains(rand)){
                intList.set(i, rand);
            }else{
                i--;
            }
        }

        //intList.set(intList.size()-1, (0+1+2+3+4+5+6+7)-cont);
        //System.out.println(intList.get(intList.size() - 1));

        //for (int i = 0; i<8; i++)System.out.println("---------------------"+usedPos[i]);

        //ImageButton ib = findViewById(R.id.imageButton1);
        //ib.setImageDrawable(getResources().getDrawable(R.drawable.black_joker));

    }

    @Override
    public void onClick(View view) {



        switch (view.getId()){
            case R.id.imageButton1:
                reps[0]++;
                if (reps[0]%2==0){
                    randomizeCard(view.getId(), drawables[intList2.get(0)]);
                }else{
                    randomizeCard(view.getId(), R.drawable.card_back_01);
                }
                break;
            case R.id.imageButton2:
                reps[1]++;
                if (reps[1]%2==0){
                    randomizeCard(view.getId(), drawables[intList2.get(3)]);
                }else{
                    randomizeCard(view.getId(), R.drawable.card_back_01);
                }
                break;
            case R.id.imageButton3:
                reps[2]++;
                if (reps[2]%2==0){
                    randomizeCard(view.getId(), drawables[intList2.get(1)]);
                }else{
                    randomizeCard(view.getId(), R.drawable.card_back_01);
                }
                break;
            case R.id.imageButton4:
                reps[3]++;
                if (reps[3]%2==0){
                    randomizeCard(view.getId(), drawables[intList2.get(2)]);
                }else{
                    randomizeCard(view.getId(), R.drawable.card_back_01);
                }
                break;
            case R.id.imageButton5:
                reps[4]++;
                if (reps[4]%2==0){
                    randomizeCard(view.getId(), drawables[intList2.get(0)]);
                }else{
                    randomizeCard(view.getId(), R.drawable.card_back_01);
                }
                break;
            case R.id.imageButton6:
                reps[5]++;
                if (reps[5]%2==0){
                    randomizeCard(view.getId(), drawables[intList2.get(3)]);
                }else{
                    randomizeCard(view.getId(), R.drawable.card_back_01);
                }
                break;
            case R.id.imageButton7:
                reps[6]++;
                if (reps[6]%2==0){
                    randomizeCard(view.getId(), drawables[intList2.get(2)]);
                }else{
                    randomizeCard(view.getId(), R.drawable.card_back_01);
                }
                break;
            case R.id.imageButton8:
                reps[7]++;
                if (reps[7]%2==0){
                    randomizeCard(view.getId(), drawables[intList2.get(1)]);
                }else{
                    randomizeCard(view.getId(), R.drawable.card_back_01);
                }
                break;
            case R.id.imageButton9:
                reps[8]++;
                if (reps[8]%2==0){
                    randomizeCard(view.getId(), drawables[intList2.get(1)]);
                }else if (reps[8]%2!=0 && count!=2){
                    randomizeCard(view.getId(), R.drawable.card_back_01);
                }
                break;
        }

        ImageButton ib = (ImageButton) view;
        couple[count]=ib.getDrawable();
        coupleId[count]=view.getId();
        count++;
        if (count==2){
            count=0;
            if (couple[0]==couple[1]){
                for (int i=0; i<2; i++){
                    ImageButton btn = (ImageButton) findViewById(coupleId[i]);
                    btn.setActivated(false);
                }
            }else{
                for (int i=0; i<2; i++){
                    ImageButton btn = (ImageButton) findViewById(coupleId[i]);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    btn.setImageDrawable(getResources().getDrawable(R.drawable.card_back_01));
                }
            }

        }

    }
}