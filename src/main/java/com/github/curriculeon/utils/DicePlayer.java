package com.github.curriculeon.utils;

import java.util.Scanner;

public class DicePlayer implements GamblingPlayer {
    String name;
    double balance;

    DicePlayer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    @Override
    public double placeBet(){
        //ask for bet
        double bet = askBet();
        //check that bet is less than or equal to balance
        if (!sufficientFunds(bet)){
            System.out.println("Your balance is too low");
            placeBet();
        }
        balance -= bet;
        return bet;
    }

    @Override
    public double askBet(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your bet");
        return scanner.nextDouble();
    }

    @Override
    public boolean sufficientFunds(double bet){
        if (bet > balance) return false;
        return true;
    }

    @Override
    public void receiveWinnings(double winnings) {
        balance += winnings;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
