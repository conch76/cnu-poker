package com.cnu.edu;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by schoi on 2017-04-16.
 */
public class Evaluator {

    public PokerHandType evaluate(List<Card> cardList) {

        if (isFlush(cardList)) {
            return PokerHandType.FLUSH;
        }

        return PokerHandType.NOTHING;
    }

    private boolean isFlush(List<Card> cardList) {
        Map<Suit, Integer> tempSpace = new HashMap<>();
        for (Card card : cardList) {
            if (tempSpace.containsKey(card.getSuit())) {
                Integer count = tempSpace.get(card.getSuit());
                count = new Integer(count.intValue() + 1);
                tempSpace.put(card.getSuit(), count);
            } else {
                tempSpace.put(card.getSuit(), new Integer(1));
            }
        }
        for (Suit key : tempSpace.keySet()) {
            if (tempSpace.get(key) >= 5) {
                return true;
            }
        }
        return false;
    }
}
