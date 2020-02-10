package com.github.curriculeon;

import java.util.List;

public abstract class DiceGame implements Game {
    List<Dice> diceArray;

    public List<Integer> rollAllDice(Dice[] diceArray){
        List<Integer> rolledArray = null;
        for (Dice d : diceArray){
            rolledArray.add(d.roll());
        }
        return rolledArray;
    }
}
