package com.github.curriculeon.utils;

public class CardPlayer extends Player {
    Hand hand;
    public CardPlayer(String name, Hand hand){
        super(name);
        this.hand = hand;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }
}