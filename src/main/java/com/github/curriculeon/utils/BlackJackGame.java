package com.github.curriculeon.utils;

public class BlackJackGame extends CardGame implements GamblingGame {
    double pot;

    @Override
    public void play(Player p) {

    }

    @Override
    public double wager(GamblingPlayer player) {
            return player.placeBet();
        }

    @Override
    public double getPot() {
        return pot;
    }

    @Override
    public void setPot(double pot) {
        this.pot = pot;
    }
}
}
