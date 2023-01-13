package com.company;

import java.util.ArrayList;
import java.util.Random;

public class rollDice {
    Random rand = new Random();




    void display(){
        for(dice thisDice) {
            int result=thisDice.lowestNum+rand.nextInt(thisDice.highestNum-thisDice.lowestNum);
        }
    }
}
