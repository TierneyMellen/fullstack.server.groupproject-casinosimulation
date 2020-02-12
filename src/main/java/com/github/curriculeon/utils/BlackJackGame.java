package com.github.curriculeon.utils;

public class BlackJackGame extends CardGame implements GamblingGame {
    @Override
    public void play(Player p) {

    }

    @Override
    public double wager(GamblingPlayer player) {
            return player.placeBet();
        }
    }
}
