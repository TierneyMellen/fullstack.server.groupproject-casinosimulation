package com.github.curriculeon.utils;

public abstract class CardGame implements Game{
    Deck deck;
    public Card draw() {
        return deck.draw();
    }
}
