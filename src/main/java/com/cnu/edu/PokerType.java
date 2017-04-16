package com.cnu.edu;

/**
 * Created by schoi on 2017-04-16.
 */
public enum PokerType {
    FIVE(5),
    SEVEN(7);

    private int numberOfDraw;

    PokerType(int numberOfDraw) {
        this.numberOfDraw = numberOfDraw;
    }

    public int getNumberOfDraw() {
        return this.numberOfDraw;
    }
}
