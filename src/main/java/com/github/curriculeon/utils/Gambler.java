package com.github.curriculeon.utils;

public interface Gambler{
    public double placeBet();
    public void receiveWinnings(double winnings);
    public double getBalance();
    public void setBalance(double balance);
}
