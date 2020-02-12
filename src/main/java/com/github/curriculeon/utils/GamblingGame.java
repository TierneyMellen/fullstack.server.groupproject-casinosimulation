package com.github.curriculeon.utils;

public interface GamblingGame extends Game{
    double wager(GamblingPlayer p);
    double getPot();
    void setPot(double pot);
}
