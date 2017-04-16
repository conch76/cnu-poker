package com.cnu.edu;

import com.cnu.edu.exception.NoSuchRankException;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


/**
 * Created by schoi on 2017-04-16.
 */
public class CardTest {

    @Test
    public void 카드_5_다이아몬드_생성_성공()  {
        Card card = new Card(5, Suit.DIAMONDS);
        assertThat(card.getRank(), is(5));
        assertThat(card.getSuit(), is(Suit.DIAMONDS));
    }

    @Test(expected = NoSuchRankException.class)
    public void 카드랭크_14는_생성_불가() {
        new Card(14, Suit.CLUBS);
    }
}
