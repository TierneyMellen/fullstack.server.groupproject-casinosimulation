package com.github.curriculeon;

import java.util.List;
import java.util.Scanner;

public class CrownAndAnchor extends DiceGame implements GamblingGame {
    List<Dice> diceArray;

    void setupDiceArray(List<Dice> diceArray, int numberOfDice) {
        diceArray = null;
        for (int i = 0; i < numberOfDice; i++) {
            this.diceArray.add(new Dice(6)); //assuming regular 6 sided die
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

    List<Integer> rollAllDice(List<Dice> diceArray) {
        List<Integer> rolledArray = null;
        for (Dice d : diceArray) {
            rolledArray.add(d.roll());
        }
        return rolledArray;
    }

    public double wager(GamblingPlayer player) {
        return player.placeBet();
    }

    public void play(GamblingPlayer player) {
        setupDiceArray(diceArray, 3);
        double bet = wager(player);
        int chosenNumber = chooseNumber();
        List<Integer> rolledArray = rollAllDice(diceArray);
        int score = countOccurrences(chosenNumber, rolledArray);
        switch (score) {
            case 1:
                player.receiveWinnings(bet);
                System.out.println("You broke even");
                break;
            case 2:
                player.receiveWinnings(bet * 2);
                System.out.println("You doubled your bet");
                break;
            case 3:
                player.receiveWinnings(bet * 3);
                System.out.println("You tripled your bet");
                break;
            default:
                System.out.println("You won nothing");
        }
        return;
    }

    @Override
    public void play(Player player) {
        setupDiceArray(diceArray, 3);
        double bet = wager((GamblingPlayer) player);
        int chosenNumber = chooseNumber();
        List<Integer> rolledArray = rollAllDice(diceArray);
        int score = countOccurrences(chosenNumber, rolledArray);
        switch (score) {
            case 1:
                ((GamblingPlayer) player).receiveWinnings(bet);
                System.out.println("You broke even");
                break;
            case 2:
                ((GamblingPlayer) player).receiveWinnings(bet * 2);
                System.out.println("You doubled your bet");
                break;
            case 3:
                ((GamblingPlayer) player).receiveWinnings(bet * 3);
                System.out.println("You tripled your bet");
                break;
            default:
                System.out.println("You won nothing");
        }
        return;
    }
}
