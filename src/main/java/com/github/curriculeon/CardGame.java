package com.github.curriculeon;

public abstract class CardGame{
    Deck deck;
    public Card draw() {
        return deck.draw();
    }
}
