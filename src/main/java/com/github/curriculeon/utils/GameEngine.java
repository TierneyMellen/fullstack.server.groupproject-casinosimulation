package com.github.curriculeon.utils;

import java.util.List;

public abstract class GameEngine <PlayerType extends Player,
        GameType extends Game<PlayerType>> implements GameEngineInterface<PlayerType, GameType>{
    private GameType game;
    private List<PlayerType> players;
    public GameEngine(GameType game, List<PlayerType> players){
        this.game = game;
        this.players = players;
    }

    public void start(){
        //tbd
    }
}
