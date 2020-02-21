package com.github.curriculeon.utils;

public enum Card{
    //A = ace, J = jack, Q = queen, k = king
    //Clubs
    CA ("Clubs", "Ace"), C2 ("Clubs", "2"), C3 ("Clubs", "3"), C4 ("Clubs", "4"), C5 ("Clubs", "5"), C6 ("Clubs", "6"),
    C7 ("Clubs", "7"), C8 ("Clubs", "8"), C9 ("Clubs", "9"), CJ ("Clubs", "Jack"), CQ ("Clubs", "Queen"), CK ("Clubs", "King"),
    //Diamonds
    DA ("Diamonds", "Ace"), D2 ("Diamonds", "2"), D3 ("Diamonds", "3"), D4 ("Diamonds", "4"), D5 ("Diamonds", "5"), D6 ("Diamonds", "6"),
    D7 ("Diamonds", "7"), D8 ("Diamonds", "8"), D9 ("Diamonds", "9"), DJ ("Diamonds", "Jack"), DQ ("Diamonds", "Queen"), DK ("Diamonds", "King"),
    //Hearts
    HA ("Hearts", "Ace"), H2 ("Hearts", "2"), H3 ("Hearts", "3"), H4 ("Hearts", "4"), H5 ("Hearts", "5"), H6 ("Hearts", "6"),
    H7 ("Hearts", "7"), H8 ("Hearts", "8"), H9 ("Hearts", "9"), HJ ("Hearts", "Jack"), HQ ("Hearts", "Queen"), HK ("Hearts", "King"),
    //Spades
    SA ("Spades", "Ace"), S2 ("Spades", "2"), S3 ("Spades", "3"), S4 ("Spades", "4"), S5 ("Spades", "5"), S6 ("Spades", "6"),
    S7 ("Spades", "7"), S8 ("Spades", "8"), S9 ("Spades", "9"), SJ ("Spades", "Jack"), SQ ("Spades", "Queen"), SK ("Spades", "King");
    
    String suit;
    String face;
    Card(String suit, String face){
        this.suit = suit;
        this.face = face;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public void toString(Card c){ //we probably won't use this, but I wanted to write it
        System.out.println("This card is the " + c.getFace() + " of " + c.getSuit());
    }

}