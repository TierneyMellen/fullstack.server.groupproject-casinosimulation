package com.github.curriculeon.utils;

import org.junit.Assert;
import org.junit.Test;

public class CardTest {

    /**
     * Card instances have the expected face
     */
    public void testGetFace(Card c, String face) {
        // given

        // when
        String actual = c.getFace();

        // then
        // Check to see if the dicePlayer's name matches the expected
        Assert.assertEquals(face, actual);
    }

    @Test
    public void testFace1() {
        testGetFace(Card.C9, "9");
    }

    @Test
    public void testFace2() {
        testGetFace(Card.DK, "King");
    }

    /**   /**
     * Card instances have the expected face
     */
    public void testGetSuit(Card c, String suit) {
        // given

        // when
        String actual = c.getSuit();

        // then
        // Check to see if the dicePlayer's name matches the expected
        Assert.assertEquals(suit, actual);
    }

    @Test
    public void testSuit1() {
        testGetSuit(Card.C9, "Clubs");
    }

    @Test
    public void testSuit2() {
        testGetSuit(Card.DK, "Diamonds");
    }
}