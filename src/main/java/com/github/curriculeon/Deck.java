package com.github.curriculeon;

import java.util.Collections;
import java.util.LinkedList;

public class Deck{
    LinkedList<Card> deck;
    public Deck(){
        createDeck(); //we might want to take this out of the constructor
    }

    void createDeck(){
        LinkedList<Card> deck = null;
        for (Card c : Card.values()){
            deck.add(c);
        }
    }

    public Card draw(){
        return deck.pop();
    }

    public boolean remove(Card c){
        return deck.remove(c);
    }

    public void add(Card c){
        deck.add(c);
    }

    public void shuffle(){
        Collections.shuffle(deck);
    }

    public LinkedList<Card> getDeck() {
        return deck;
    }

    public void setDeck(LinkedList<Card> deck) {
        this.deck = deck;
    }
}
