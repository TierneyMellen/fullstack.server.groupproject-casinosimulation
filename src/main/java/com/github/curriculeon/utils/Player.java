package com.github.curriculeon.utils;

/**
 * Created by leon on 2/3/2020.
 */
public abstract class Player {
    String name;

    Player(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
