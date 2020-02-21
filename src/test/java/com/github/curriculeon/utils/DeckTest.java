package com.github.curriculeon.utils;

import org.junit.Assert;
import org.junit.Test;

public class DeckTest {

    /**
     * DicePlayer instances (constructor with name and balance parameters)
     * have the expected name
     */
    public void testConstructorSize() {
        // given
        // Construct a deck object 52 cards
        Deck deck = new Deck();
        // when
        int actual = deck.getDeck().size();
        // then
        // Check to see if the deck actually has 52 cards
        Assert.assertEquals(52, actual);
    }

    @Test
    public void testConstructor1() {
        testConstructorSize();
    }

    public void testDraw() {
        // given
        // Construct a deck object 52 cards with
        Deck deck = new Deck();
        // when
        Card actual = deck.draw();
        // then
        // Check to see if the last card is the king of spades
        Assert.assertEquals(Card.SK, actual);
    }

    @Test
    public void testDraw1() {
        testDraw();
    }

    /**
     * peek() shows the last card but does not remove it from the deck
     */
    public void testPeek() {
        // given
        // Construct a deck object 52 cards with
        Deck deck = new Deck();
        // when
        Card actual = deck.peek();
        // then
        // Check to see if the last card is the king of spades
        Assert.assertEquals(Card.SK, actual);
    }

    @Test
    public void testPeek1() {
        testPeek();
    }

}