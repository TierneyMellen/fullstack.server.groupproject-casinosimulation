package com.github.curriculeon.utils;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class HandTest {

    public void testConstructorSize(List<Card> hand) {
        // given
        int expected = hand.size();
        // Construct a hand object
        Hand newHand = new Hand(hand);
        // when
        int actual = newHand.size();
        // then
        // Check to see if the dicePlayer's name matches the expected
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testConstructorSize1() {
        List<Card> hand = new ArrayList<Card>();
        hand.add(Card.C9);
        hand.add(Card.DK);
        hand.add(Card.SA);
        testConstructorSize(hand);
    }

    @Test
    public void testConstructorSize2() {
        List<Card> hand = new ArrayList<Card>();
        hand.add(Card.C9);
        hand.add(Card.DK);
        hand.add(Card.SA);
        hand.add(Card.H7);
        testConstructorSize(hand);
    }

    public void testAdd(Hand hand, Card c) {
        // given
        int expected = hand.size() + 1;
        // Construct a hand object
        // when
        hand.addCard(c);
        int actual = hand.size();
        // then
        // Check to see if the dicePlayer's name matches the expected
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testAdd1() {
        List<Card> hand = new ArrayList<Card>();
        hand.add(Card.C9);
        hand.add(Card.DK);
        hand.add(Card.SA);
        Hand newHand = new Hand(hand);
        testAdd(newHand, Card.C2);
    }

    @Test
    public void testAdd2() {
        List<Card> hand = new ArrayList<Card>();
        hand.add(Card.C9);
        hand.add(Card.DK);
        hand.add(Card.SA);
        hand.add(Card.H7);
        Hand newHand = new Hand(hand);
        testAdd(newHand, Card.C2);
    }

    public void testRemove(Hand hand, Card c, boolean expected) {
        // given
        // Construct a hand object
        // when
        boolean actual = hand.removeCard(c);
        // then
        // Check to see if the dicePlayer's name matches the expected
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove1() {
        List<Card> hand = new ArrayList<Card>();
        hand.add(Card.C9);
        hand.add(Card.DK);
        hand.add(Card.SA);
        Hand newHand = new Hand(hand);
        testRemove(newHand, Card.C9, true);
    }

    @Test
    public void testRemove2() {
        List<Card> hand = new ArrayList<Card>();
        hand.add(Card.C9);
        hand.add(Card.DK);
        hand.add(Card.SA);
        Hand newHand = new Hand(hand);
        testRemove(newHand, Card.C2, false);
    }
}
