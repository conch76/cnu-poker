package com.cnu.edu;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by schoi on 2017-04-16.
 */
public class HandTest {

    @Test
    public void 파이브카드_핸드_카드숫자는_5() {
        Deck deck = new Deck(1);
        Hand hand = new Hand(deck, PokerType.FIVE);
        assertThat(hand.getCardList().size(), is(5));
    }
}
