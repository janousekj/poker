package com.company.logic;

/**
 * Created by Jakub Janoušek on 11.02.2016.
 */
public class Hand {

    PokerCard firstCardOnHand;
    PokerCard secondCardOnHand;

    public Hand(Deck deck) {
        this.firstCardOnHand = deck.draw();
        this.secondCardOnHand = deck.draw();
    }

}
