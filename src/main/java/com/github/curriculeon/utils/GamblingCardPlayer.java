package com.github.curriculeon.utils;

import java.util.Scanner;

public class GamblingCardPlayer extends CardPlayer implements GamblingPlayer{
    private double balance;

    public GamblingCardPlayer(String name, double balance, Hand hand) {
        super(name, hand);
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
}
