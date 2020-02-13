package com.github.curriculeon.utils;

import java.util.Random;

//technically this class should be called die, dice is plural
public class Dice{
    int numSides;
    int faceValue; //holds last rolled value

    public Dice(int numSides){
        this.numSides = numSides;
    }

    public Dice(){ this.numSides = 6;} //default die has 6 sides


    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }

    public int roll(){
        faceValue = new Random().nextInt((numSides) + 1);
        return faceValue;
    }

    public int getNumSides() {
        return numSides;
    }

    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }
}
