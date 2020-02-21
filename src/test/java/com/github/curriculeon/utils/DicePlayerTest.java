package com.github.curriculeon.utils;

import org.junit.Assert;
import org.junit.Test;

public class DicePlayerTest {

    /**
     * DicePlayer instances (constructor with name and balance parameters)
     * have the expected name
     */
    public void testNameConstructor(String name, double balance) {
        // given
        // Construct a DicePlayer object
        DicePlayer dicePlayer = new DicePlayer(name, balance);

        // when
        String actual = dicePlayer.getName();

        // then
        // Check to see if the dicePlayer's name matches the expected
        Assert.assertEquals(name, actual);
    }

    @Test
    public void testName1() {
        testNameConstructor("dave", 3.0);
    }

    @Test
    public void testName2() {
        testNameConstructor("louie", 135.6);
    }

    /**
     * DicePlayer instances (constructor with name and balance parameters)
     * have the expected balance
     */
    public void testBalance(String name, double balance) {
        // given
        // Construct a DicePlayer object
        DicePlayer dicePlayer = new DicePlayer(name, balance);

        // when
        double actual = dicePlayer.getBalance();

        // then
        // Check to see if the dicePlayer's balance matches the expected
        Assert.assertEquals(balance, actual);
    }

    @Test
    public void testBalance1() {
        testNameConstructor("dave", 3.0);
    }

    @Test
    public void testBalance2() {
        testNameConstructor("louie", 135.6);
    }

    /**
     * Test to ensure the setName() method alters the name
     */
    public void testSetName(String name, double balance, String newName)
    {
        // given
        // Construct a DicePlayer object
        DicePlayer dicePlayer = new DicePlayer(name, balance);

        // when
        dicePlayer.setName(newName);
        String actual = dicePlayer.getName();

        // then
        // Check to see if the dicePlayer's name matches the expected
        Assert.assertEquals(newName, actual);
    }

    @Test
    public void testSetName1() {
        testSetName("dave", 3.0, "john");
    }

    @Test
    public void testSetName2() {
        testSetName("louie", 135.6, "kumar");
    }

    /**
     * Test to ensure the setBalance() method alters the balance
     */
    public void testSetBalance(String name, double balance, double newBalance)
    {
        // given
        // Construct a DicePlayer object
        DicePlayer dicePlayer = new DicePlayer(name, balance);

        // when
        dicePlayer.setBalance(newBalance);
        double actual = dicePlayer.getBalance();

        // then
        // Check to see if the dicePlayer's name matches the expected
        Assert.assertEquals(newBalance, actual, 0);
    }

    @Test
    public void testSetBalance1() {
        testSetBalance("dave", 3.0, 5.7);
    }

    @Test
    public void testSetBalance2() {
        testSetBalance("louie", 135.6, 400.6);
    }

    /**
     * Test to ensure the sufficientFunds() method returns sufficient funds
     */
    public void testSufficientFunds(String name, double balance, double bet, boolean expected)
    {
        // given
        // Construct a DicePlayer object
        DicePlayer dicePlayer = new DicePlayer(name, balance);

        // when
        boolean actual = dicePlayer.sufficientFunds(bet);

        // then
        // Check to see if the dicePlayer's balance is greater than the bet
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSufficientFunds1() {
        testSufficientFunds("dave", 3.0, 1.0, true);
    }

    @Test
    public void testSufficientFunds2() {
        testSufficientFunds("louie", 135.6, 400.6, false);
    }

    /**
     * Test to ensure the setBalance() method alters the balance
     */
    public void testReceiveWinnings(String name, double balance, double winnings)
    {
        // given
        // Construct a DicePlayer object
        DicePlayer dicePlayer = new DicePlayer(name, balance);

        // when
        dicePlayer.receiveWinnings(winnings);
        double expected = balance + winnings;
        double actual = dicePlayer.getBalance();

        // then
        // Check to see if the dicePlayer's new balance matches the expected
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testReceiveWinnings1() {
        testReceiveWinnings("dave", 3.0, 5.7);
    }

    @Test
    public void testReceiveWinnings2() {
        testReceiveWinnings("louie", 135.6, 400.6);
    }
}