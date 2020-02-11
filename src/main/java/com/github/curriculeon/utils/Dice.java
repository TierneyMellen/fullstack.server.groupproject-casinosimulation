package com.github.curriculeon.utils;

import java.util.Random;

//technically this class should be called die, dice is plural
public class Dice{
    int numSides;

    public Dice(int numSides){
        this.numSides = numSides;
    }

    public int roll(){
        return new Random().nextInt((numSides) + 1);
    }

    public int getNumSides() {
        return numSides;
    }

    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }
}
