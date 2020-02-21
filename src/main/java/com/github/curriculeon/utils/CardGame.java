package com.github.curriculeon.utils;

import java.util.List;

public abstract class CardGame implements Game{
    Deck deck;
    List<Player> players;

    public Card draw() {
        return deck.draw();
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Deck getDeck(){
        return deck;
    }
    public void setDeck(Deck deck){
        this.deck = deck;
    }
}
