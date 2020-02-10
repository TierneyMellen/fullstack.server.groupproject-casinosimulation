package com.github.curriculeon;

import java.util.List;

public class Hand{
    List<Card> hand;

    public Hand(List<Card> hand){
        this.hand = hand;
    }

    public void addCard(Card c){
        hand.add(c);
    }

    public boolean removeCard(Card c){
        return hand.remove(c);
    }

    public Card[] viewHand(){
        return (Card[]) hand.toArray();
    }

    public List<Card> getHand() {
        return hand;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }

}
