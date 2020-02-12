package com.github.curriculeon.utils;

import java.util.List;
import java.util.Scanner;

public class CrownAndAnchor extends DiceGame implements GamblingGame {
    double pot;
    boolean isOver = false;

    void setupDiceArray(int numberOfDice) {
        diceArray.clear();
        for (int i = 0; i < numberOfDice; i++) {
            diceArray.add(new Dice(6)); //assuming regular 6 sided die
        }
    }

    int chooseNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to bet on");
        return scanner.nextInt();
    }

    int countOccurrences(int chosenNumber, List<Integer> rolledArray) {
        int occurrences = 0;
        for (int i : rolledArray) {
            if (i == chosenNumber) {
                occurrences++;
            }
        }
        return occurrences;
    }

    public double wager(GamblingPlayer player) {
        return player.placeBet();
    }

    @Override
    public double getPot() {
        return 0;
    }

    @Override
    public void setPot(double pot) {
        this.pot = pot;
    }

    public void play(GamblingPlayer player) {
        setupDiceArray(3); //Crown & Anchor is traditionally played with 3 dice
        pot = wager(player);
        int chosenNumber = chooseNumber();
        List<Integer> rolledArray = rollAllDice(diceArray);
        int score = countOccurrences(chosenNumber, rolledArray);
        switch (score) {
            case 1:
                player.receiveWinnings(pot);
                System.out.println("You broke even");
                break;
            case 2:
                player.receiveWinnings(pot * 2);
                System.out.println("You doubled your bet");
                break;
            case 3:
                player.receiveWinnings(pot * 3);
                System.out.println("You tripled your bet");
                break;
            default:
                System.out.println("You won nothing");
        }
        return;
    }

    public void play(Player p) {
        setupDiceArray(3); //Crown & Anchor is traditionally played with 3 dice
        pot = wager((GamblingPlayer) p);
        int chosenNumber = chooseNumber();
        List<Integer> rolledArray = rollAllDice(diceArray);
        int score = countOccurrences(chosenNumber, rolledArray);
        switch (score) {
            case 1:
                ((GamblingPlayer) p).receiveWinnings(pot);
                System.out.println("You broke even");
                break;
            case 2:
                ((GamblingPlayer) p).receiveWinnings(pot * 2);
                System.out.println("You doubled your bet");
                break;
            case 3:
                ((GamblingPlayer) p).receiveWinnings(pot * 3);
                System.out.println("You tripled your bet");
                break;
            default:
                System.out.println("You won nothing");
        }
        return;
    }
}
