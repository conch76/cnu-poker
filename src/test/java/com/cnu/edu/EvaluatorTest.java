package com.cnu.edu;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by schoi on 2017-04-16.
 */
public class EvaluatorTest {

    @Test
    public void SUIT_5장이_같으면_플러쉬() {
        Evaluator evaluator = new Evaluator();
        List<Card> cardList = Arrays.asList(
                new Card(1,Suit.CLUBS),
                new Card(2,Suit.CLUBS),
                new Card(5,Suit.CLUBS),
                new Card(6,Suit.CLUBS),
                new Card(11,Suit.CLUBS)
        );
        PokerHandType pokerHands = evaluator.evaluate(cardList);
        assertThat(pokerHands, is(PokerHandType.FLUSH));
    }
}
