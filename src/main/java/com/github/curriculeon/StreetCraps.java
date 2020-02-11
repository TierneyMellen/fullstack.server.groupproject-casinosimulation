package com.github.curriculeon;

import java.util.Scanner;

/**
 * Chris Vo created on 11 Feb, 2020
 * project - casino
 * package - com.github.curriculeon
 */

public class StreetCraps {
    private String str = "";
    Scanner sc = new Scanner(System.in);

    public void main (String[] arg) {
        alert("Welcome to 'Street Craps Dice Game'...");

        Player user = new Player();
        alert("Let's start");
        play();
    }

    public void play() {
        int sum = sum2Dices();
        notPointBet(sum);
    }

    public int sum2Dices() {
        Dice dice1 = new Dice(6);
        Dice dice2 = new Dice(6);

        int value1 = dice1.roll();
        int value2 = dice2.roll();

        str = "Dice 1: " + value1 + "\nDice 2: " + value2;
        alert(str);

        int sum = value1 + value2;
        str = "Sum 2 dices: " + sum;
        alert(str);

        return sum;
    }

    public boolean notPointBet(int x) {
        if (x == 7 || x == 11)
            return true;

        else if (x == 2 || x == 3 || x == 12)
            return false;

        else {
            alert("You are now in Point play");
            return pointBet(x);
        }
    }

    public void ptsPlay(int x) {

        prompt("Would you like to try your luck with Point again?");

    }

    public boolean pointBet(int x) {

        int newRoll = sum2Dices();

        if (x == newRoll)
            return true;
        else if (x == 7 || x == 11)
            return false;
        else
            return pointBet(x);

    }

    public void replay() {
        String response = prompt("Replay the game? Y or N");
        if(response.equalsIgnoreCase("Y"))
            play();
        else if(response.equalsIgnoreCase("N"))
            endGame();
        else
            System.out.println("Incorrect Response");
    }

    public void endGame() {

    }

    public void alert(String str) {
        System.out.println(str);
    }

    public String prompt(String str) {
        System.out.println(str);
        String response = sc.nextLine();
        return response;
    }
}
