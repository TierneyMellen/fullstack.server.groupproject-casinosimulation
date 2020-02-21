package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

/**
 * Chris Vo created on 11 Feb, 2020
 * project - casino
 * package - com.github.curriculeon
 */

public class DiceTest {

    /**
     * Die instances (empty constructor) have the default number of sides
     */
    @Test
    public void testEmptyConstructor() {
        // given
        // Construct an Die object
        Dice dice = new Dice();

        // when
        int expected = 0;
        int actual = dice.getTotal_side();

        // then
        // Check to see if the die has the default number of sides
        Assert.assertEquals(expected, actual);
    }

    /**
     * Die instances (constructor with the sides parameter)
     * have the expected number of sides.
     */
    public void testSidesConstructor(int sides) {
        // given
        // Construct an Die object
        Dice dice = new Dice(sides);

        // when
        int expected = sides;
        int actual = dice.getTotal_side();

        // then
        // Check to see if the die has the expected number of sides
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSidesConstructor1() {
        testSidesConstructor(8);
    }

    @Test
    public void testSidesConstructor2() {
        testSidesConstructor(24);
    }

    @Test
    public void testSidesConstructor3() {
        testSidesConstructor(2);
    }

    /**
     * Test to ensure the getFaceValue() method returns
     * the most recently roll() (rolled) value.
     */
    public void testRoll(int sides)
    {
        // given
        // Construct an Die object
        Dice dice = new Dice(sides);

        // when
        int expected = dice.roll();
        int actual = dice.getFaceValue();

        // then
        // Check to see if the method returns expected values for a few executions.
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRoll1() {
        testRoll(10);
    }

    @Test
    public void testRoll2() {
        testRoll(6);
    }

    @Test
    public void testRoll3() {
        testRoll(18);
    }

}
