package com.github.curriculeon.utils;

import java.util.Collections;
import java.util.LinkedList;

public class Deck{
    LinkedList<Card> deck; //using LL because it works like a stack and can pop
    public Deck(){
        createDeck(); //we might want to take this out of the constructor, this will make a full deck every time
    }

    void createDeck(){
        LinkedList<Card> deck = new LinkedList<>();
        for (Card c : Card.values()){
            deck.add(c);
        }
    }

    public Card draw(){
        return deck.pop();
    }

    public Card peek(){
        return deck.peek();
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
