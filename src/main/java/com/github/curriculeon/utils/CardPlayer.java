package com.github.curriculeon.utils;

public abstract class CardPlayer implements Player {
    String name;
    Hand hand;
    public CardPlayer(String name, Hand hand){
        this.name = name;
        this.hand = hand;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public void viewHand(){
        hand.toString();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}