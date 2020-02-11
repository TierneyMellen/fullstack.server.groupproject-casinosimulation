package com.github.curriculeon.utils;

import java.util.Scanner;

public class GamblingPlayer extends Player implements Gambler{
    String name;
    private double balance;

    GamblingPlayer(String name, double balance){
        super(name);
        this.balance = balance;
    }

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

    private double askBet(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your bet");
        return scanner.nextDouble();
    }

    private boolean sufficientFunds(double bet){
        if (bet > balance) return false;
        return true;
    }

    public void receiveWinnings(double winnings){
        balance += winnings;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
