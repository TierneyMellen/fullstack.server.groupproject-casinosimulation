package com.github.curriculeon.utils;

import com.github.curriculeon.utils.Player;

/**
 * Created by leon on 2/3/2020.
 */
public interface Game <PlayerType extends Player>{
    public void play(Player p);
    void evaluateTurn(PlayerType player);
    void addPlayer(PlayerType player);
    void addPlayers(Iterable<? extends PlayerType> player);
    boolean isOver();
}
