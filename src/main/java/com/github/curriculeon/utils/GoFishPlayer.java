package com.github.curriculeon.utils;

public class GoFishPlayer extends CardPlayer {

    public GoFishPlayer(String name, Hand hand) {
        super(name, hand);
    }

    public boolean ask(Card card) {
        //stuff goes here
        return true;
    }

    public Card give(Card card){
        //stuff goes here
        return null;
    }

}
