package com.cnu.edu;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by schoi on 2017-04-16.
 */
public class Hand {

    private final Deck deck;
    private List<Card> handList;

    public Hand(Deck deck, PokerType type) {
        this.deck = deck;
        this.handList = new ArrayList<Card>();
        for (int i = 0; i < type.getNumberOfDraw(); i++) {
            handList.add(deck.drawCard());
        }
    }

    public List<Card> getCardList() {
        return handList;
    }
}
