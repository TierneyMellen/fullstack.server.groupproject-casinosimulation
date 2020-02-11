package com.github.curriculeon;

/**
 * Chris Vo created on 11 Feb, 2020
 * project - casino
 * package - com.github.curriculeon
 */

public class Dice {
    private int total_side;
    private int faceValue;

    public Dice(int total_side){
        this.total_side = total_side;
    }


    public int roll(){
        faceValue = (int)(Math.random() * total_side) + 1;
        return faceValue;
    }

    public void setFaceValue(int value) {
        faceValue = value;
    }

    public int getFaceValue() {
        return this.faceValue;
    }

    public String toString() {
        String result = Integer.toString(faceValue);
        return result;
    }
}
