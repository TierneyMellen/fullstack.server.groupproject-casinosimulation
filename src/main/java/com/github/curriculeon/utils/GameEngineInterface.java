package com.github.curriculeon.utils;

public interface GameEngineInterface<PlayerType extends Player, GameType extends Game<PlayerType>>{
    void start();
    GameType getGame();
    Iterable<PlayerType> getPlayers();
}
