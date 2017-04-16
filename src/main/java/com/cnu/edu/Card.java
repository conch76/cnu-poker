package com.cnu.edu;

import com.cnu.edu.exception.NoSuchRankException;
import lombok.Data;

/**
 * Created by schoi on 2017-04-16.
 */
@Data
public class Card {
    private final int rank;
    private final Suit suit;

    public Card(int rank, Suit suit) {
        if (rank > 13) {
            throw new NoSuchRankException();
        }
        this.rank = rank;
        this.suit = suit;
    }
}
