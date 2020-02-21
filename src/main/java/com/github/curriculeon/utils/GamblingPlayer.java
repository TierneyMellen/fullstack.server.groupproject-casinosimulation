package com.github.curriculeon.utils;

public interface GamblingPlayer extends Gambler, Player {

    public double placeBet();

    double askBet();

    boolean sufficientFunds(double bet);

    public void receiveWinnings(double winnings);

    public String getName();

    public void setName(String name);
}
